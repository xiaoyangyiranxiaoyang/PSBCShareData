package com.psbc.datashare.kpi.service;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiSourceSavingData;

/**
 * 代理储蓄数据Service接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface IKpiSourceSavingDataService 
{
    /**
     * 查询代理储蓄数据
     * 
     * @param id 代理储蓄数据ID
     * @return 代理储蓄数据
     */
    public KpiSourceSavingData selectKpiSourceSavingDataById(Long id);

    /**
     * 查询代理储蓄数据列表
     * 
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 代理储蓄数据集合
     */
    public List<KpiSourceSavingData> selectKpiSourceSavingDataList(KpiSourceSavingData kpiSourceSavingData);

    /**
     * 新增代理储蓄数据
     * 
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 结果
     */
    public int insertKpiSourceSavingData(KpiSourceSavingData kpiSourceSavingData);

    /**
     * 修改代理储蓄数据
     * 
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 结果
     */
    public int updateKpiSourceSavingData(KpiSourceSavingData kpiSourceSavingData);

    /**
     * 批量删除代理储蓄数据
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiSourceSavingDataByIds(String ids);

    /**
     * 删除代理储蓄数据信息
     * 
     * @param id 代理储蓄数据ID
     * @return 结果
     */
    public int deleteKpiSourceSavingDataById(Long id);
}
