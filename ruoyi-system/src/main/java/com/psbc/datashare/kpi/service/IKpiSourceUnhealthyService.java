package com.psbc.datashare.kpi.service;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiSourceUnhealthy;

/**
 * 零售信贷不良Service接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface IKpiSourceUnhealthyService 
{
    /**
     * 查询零售信贷不良
     * 
     * @param id 零售信贷不良ID
     * @return 零售信贷不良
     */
    public KpiSourceUnhealthy selectKpiSourceUnhealthyById(Long id);

    /**
     * 查询零售信贷不良列表
     * 
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 零售信贷不良集合
     */
    public List<KpiSourceUnhealthy> selectKpiSourceUnhealthyList(KpiSourceUnhealthy kpiSourceUnhealthy);

    /**
     * 新增零售信贷不良
     * 
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 结果
     */
    public int insertKpiSourceUnhealthy(KpiSourceUnhealthy kpiSourceUnhealthy);

    /**
     * 修改零售信贷不良
     * 
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 结果
     */
    public int updateKpiSourceUnhealthy(KpiSourceUnhealthy kpiSourceUnhealthy);

    /**
     * 批量删除零售信贷不良
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiSourceUnhealthyByIds(String ids);

    /**
     * 删除零售信贷不良信息
     * 
     * @param id 零售信贷不良ID
     * @return 结果
     */
    public int deleteKpiSourceUnhealthyById(Long id);
}
