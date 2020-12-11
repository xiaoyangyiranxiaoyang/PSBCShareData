package com.psbc.datashare.kpi.mapper;

import com.psbc.datashare.kpi.domain.KpiShowCredit;

import java.util.Date;
import java.util.List;

/**
 * 全行KPI指标（二）Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiShowCreditMapper {
    /**
     * 查询全行KPI指标（二）
     *
     * @param id 全行KPI指标（二）ID
     * @return 全行KPI指标（二）
     */
    KpiShowCredit selectKpiShowCreditById(Long id);

    /**
     * 查询全行KPI指标（二）列表
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 全行KPI指标（二）集合
     */
    List<KpiShowCredit> selectKpiShowCreditList(KpiShowCredit kpiShowCredit);

    /**
     * 新增全行KPI指标（二）
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    int insertKpiShowCredit(KpiShowCredit kpiShowCredit);

    /**
     * 修改全行KPI指标（二）
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    int updateKpiShowCredit(KpiShowCredit kpiShowCredit);

    /**
     * 删除全行KPI指标（二）
     *
     * @param id 全行KPI指标（二）ID
     * @return 结果
     */
    int deleteKpiShowCreditById(Long id);

    /**
     * 批量删除全行KPI指标（二）
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiShowCreditByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiShowCredit> selectByDataDate(Date dataDate);


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
    int insertBatch(List<KpiShowCredit> list);
}
