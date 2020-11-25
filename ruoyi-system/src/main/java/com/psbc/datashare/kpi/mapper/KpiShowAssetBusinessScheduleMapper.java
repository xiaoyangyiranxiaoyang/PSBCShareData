package com.psbc.datashare.kpi.mapper;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiShowAssetBusinessSchedule;

/**
 * 全行资产业务情况-附表Mapper接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface KpiShowAssetBusinessScheduleMapper 
{
    /**
     * 查询全行资产业务情况-附表
     * 
     * @param id 全行资产业务情况-附表ID
     * @return 全行资产业务情况-附表
     */
    public KpiShowAssetBusinessSchedule selectKpiShowAssetBusinessScheduleById(Long id);

    /**
     * 查询全行资产业务情况-附表列表
     * 
     * @param kpiShowAssetBusinessSchedule 全行资产业务情况-附表
     * @return 全行资产业务情况-附表集合
     */
    public List<KpiShowAssetBusinessSchedule> selectKpiShowAssetBusinessScheduleList(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule);

    /**
     * 新增全行资产业务情况-附表
     * 
     * @param kpiShowAssetBusinessSchedule 全行资产业务情况-附表
     * @return 结果
     */
    public int insertKpiShowAssetBusinessSchedule(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule);

    /**
     * 修改全行资产业务情况-附表
     * 
     * @param kpiShowAssetBusinessSchedule 全行资产业务情况-附表
     * @return 结果
     */
    public int updateKpiShowAssetBusinessSchedule(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule);

    /**
     * 删除全行资产业务情况-附表
     * 
     * @param id 全行资产业务情况-附表ID
     * @return 结果
     */
    public int deleteKpiShowAssetBusinessScheduleById(Long id);

    /**
     * 批量删除全行资产业务情况-附表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiShowAssetBusinessScheduleByIds(String[] ids);
}
