package com.psbc.datashare.kpi.mapper;

import com.psbc.datashare.kpi.domain.KpiSourceOverdue;

import java.util.Date;
import java.util.List;

/**
 * 零售信贷逾期Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiSourceOverdueMapper {
    /**
     * 查询零售信贷逾期
     *
     * @param id 零售信贷逾期ID
     * @return 零售信贷逾期
     */
    KpiSourceOverdue selectKpiSourceOverdueById(Long id);

    /**
     * 查询零售信贷逾期列表
     *
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 零售信贷逾期集合
     */
    List<KpiSourceOverdue> selectKpiSourceOverdueList(KpiSourceOverdue kpiSourceOverdue);

    /**
     * 新增零售信贷逾期
     *
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 结果
     */
    int insertKpiSourceOverdue(KpiSourceOverdue kpiSourceOverdue);

    /**
     * 修改零售信贷逾期
     *
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 结果
     */
    int updateKpiSourceOverdue(KpiSourceOverdue kpiSourceOverdue);

    /**
     * 删除零售信贷逾期
     *
     * @param id 零售信贷逾期ID
     * @return 结果
     */
    int deleteKpiSourceOverdueById(Long id);

    /**
     * 批量删除零售信贷逾期
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiSourceOverdueByIds(String[] ids);


    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiSourceOverdue> selectByDataDate(Date dataDate);


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
    int insertBatch(List<KpiSourceOverdue> list);
}
