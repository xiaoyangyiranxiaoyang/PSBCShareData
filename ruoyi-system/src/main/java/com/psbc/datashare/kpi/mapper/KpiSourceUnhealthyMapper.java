package com.psbc.datashare.kpi.mapper;

import com.psbc.datashare.kpi.domain.KpiSourceUnhealthy;

import java.util.Date;
import java.util.List;

/**
 * 零售信贷不良Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiSourceUnhealthyMapper {
    /**
     * 查询零售信贷不良
     *
     * @param id 零售信贷不良ID
     * @return 零售信贷不良
     */
    KpiSourceUnhealthy selectKpiSourceUnhealthyById(Long id);

    /**
     * 查询零售信贷不良列表
     *
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 零售信贷不良集合
     */
    List<KpiSourceUnhealthy> selectKpiSourceUnhealthyList(KpiSourceUnhealthy kpiSourceUnhealthy);

    /**
     * 新增零售信贷不良
     *
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 结果
     */
    int insertKpiSourceUnhealthy(KpiSourceUnhealthy kpiSourceUnhealthy);

    /**
     * 修改零售信贷不良
     *
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 结果
     */
    int updateKpiSourceUnhealthy(KpiSourceUnhealthy kpiSourceUnhealthy);

    /**
     * 删除零售信贷不良
     *
     * @param id 零售信贷不良ID
     * @return 结果
     */
    int deleteKpiSourceUnhealthyById(Long id);

    /**
     * 批量删除零售信贷不良
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiSourceUnhealthyByIds(String[] ids);


    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiSourceUnhealthy> selectByDataDate(Date dataDate);


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
    int insertBatch(List<KpiSourceUnhealthy> list);
}
