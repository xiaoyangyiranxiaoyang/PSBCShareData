package com.psbc.datashare.kpi.mapper;

import java.util.Date;
import java.util.List;

import com.psbc.datashare.kpi.domain.KpiIncomeShow;
import com.psbc.datashare.kpi.domain.KpiSourceCreditScale;
import org.apache.ibatis.annotations.Param;

/**
 * 信贷规模Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiSourceCreditScaleMapper {
    /**
     * 查询信贷规模
     *
     * @param id 信贷规模ID
     * @return 信贷规模
     */
    KpiSourceCreditScale selectKpiSourceCreditScaleById(Long id);

    /**
     * 查询信贷规模列表
     *
     * @param kpiSourceCreditScale 信贷规模
     * @return 信贷规模集合
     */
    List<KpiSourceCreditScale> selectKpiSourceCreditScaleList(KpiSourceCreditScale kpiSourceCreditScale);

    /**
     * 新增信贷规模
     *
     * @param kpiSourceCreditScale 信贷规模
     * @return 结果
     */
    int insertKpiSourceCreditScale(KpiSourceCreditScale kpiSourceCreditScale);

    /**
     * 修改信贷规模
     *
     * @param kpiSourceCreditScale 信贷规模
     * @return 结果
     */
    int updateKpiSourceCreditScale(KpiSourceCreditScale kpiSourceCreditScale);

    /**
     * 删除信贷规模
     *
     * @param id 信贷规模ID
     * @return 结果
     */
    int deleteKpiSourceCreditScaleById(Long id);

    /**
     * 批量删除信贷规模
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiSourceCreditScaleByIds(String[] ids);


    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiSourceCreditScale> selectByDataDate(Date dataDate);


    /**
     * 删除
     *
     * @param dataDate 数据日期
     * @return
     */
    int deleteByDataDate(Date dataDate);


    /**
     * 批量插入数据
     *
     * @param list
     * @return
     */
    int insertBatch(List<KpiSourceCreditScale> list);
}
