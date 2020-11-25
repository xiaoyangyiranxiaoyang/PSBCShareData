package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiSourceSavingDataMapper;
import com.psbc.datashare.kpi.domain.KpiSourceSavingData;
import com.psbc.datashare.kpi.service.IKpiSourceSavingDataService;
import com.ruoyi.common.core.text.Convert;

/**
 * 代理储蓄数据Service业务层处理
 * 
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiSourceSavingDataServiceImpl implements IKpiSourceSavingDataService 
{
    @Autowired
    private KpiSourceSavingDataMapper kpiSourceSavingDataMapper;

    /**
     * 查询代理储蓄数据
     * 
     * @param id 代理储蓄数据ID
     * @return 代理储蓄数据
     */
    @Override
    public KpiSourceSavingData selectKpiSourceSavingDataById(Long id)
    {
        return kpiSourceSavingDataMapper.selectKpiSourceSavingDataById(id);
    }

    /**
     * 查询代理储蓄数据列表
     * 
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 代理储蓄数据
     */
    @Override
    public List<KpiSourceSavingData> selectKpiSourceSavingDataList(KpiSourceSavingData kpiSourceSavingData)
    {
        return kpiSourceSavingDataMapper.selectKpiSourceSavingDataList(kpiSourceSavingData);
    }

    /**
     * 新增代理储蓄数据
     * 
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 结果
     */
    @Override
    public int insertKpiSourceSavingData(KpiSourceSavingData kpiSourceSavingData)
    {
        kpiSourceSavingData.setCreateTime(DateUtils.getNowDate());
        return kpiSourceSavingDataMapper.insertKpiSourceSavingData(kpiSourceSavingData);
    }

    /**
     * 修改代理储蓄数据
     * 
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 结果
     */
    @Override
    public int updateKpiSourceSavingData(KpiSourceSavingData kpiSourceSavingData)
    {
        kpiSourceSavingData.setUpdateTime(DateUtils.getNowDate());
        return kpiSourceSavingDataMapper.updateKpiSourceSavingData(kpiSourceSavingData);
    }

    /**
     * 删除代理储蓄数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceSavingDataByIds(String ids)
    {
        return kpiSourceSavingDataMapper.deleteKpiSourceSavingDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除代理储蓄数据信息
     * 
     * @param id 代理储蓄数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceSavingDataById(Long id)
    {
        return kpiSourceSavingDataMapper.deleteKpiSourceSavingDataById(id);
    }
}
