package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiShowAssetBusinessScheduleMapper;
import com.psbc.datashare.kpi.domain.KpiShowAssetBusinessSchedule;
import com.psbc.datashare.kpi.service.IKpiShowAssetBusinessScheduleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 全行资产业务情况-附表Service业务层处理
 * 
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiShowAssetBusinessScheduleServiceImpl implements IKpiShowAssetBusinessScheduleService 
{
    @Autowired
    private KpiShowAssetBusinessScheduleMapper kpiShowAssetBusinessScheduleMapper;

    /**
     * 查询全行资产业务情况-附表
     * 
     * @param id 全行资产业务情况-附表ID
     * @return 全行资产业务情况-附表
     */
    @Override
    public KpiShowAssetBusinessSchedule selectKpiShowAssetBusinessScheduleById(Long id)
    {
        return kpiShowAssetBusinessScheduleMapper.selectKpiShowAssetBusinessScheduleById(id);
    }

    /**
     * 查询全行资产业务情况-附表列表
     * 
     * @param kpiShowAssetBusinessSchedule 全行资产业务情况-附表
     * @return 全行资产业务情况-附表
     */
    @Override
    public List<KpiShowAssetBusinessSchedule> selectKpiShowAssetBusinessScheduleList(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule)
    {
        return kpiShowAssetBusinessScheduleMapper.selectKpiShowAssetBusinessScheduleList(kpiShowAssetBusinessSchedule);
    }

    /**
     * 新增全行资产业务情况-附表
     * 
     * @param kpiShowAssetBusinessSchedule 全行资产业务情况-附表
     * @return 结果
     */
    @Override
    public int insertKpiShowAssetBusinessSchedule(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule)
    {
        kpiShowAssetBusinessSchedule.setCreateTime(DateUtils.getNowDate());
        return kpiShowAssetBusinessScheduleMapper.insertKpiShowAssetBusinessSchedule(kpiShowAssetBusinessSchedule);
    }

    /**
     * 修改全行资产业务情况-附表
     * 
     * @param kpiShowAssetBusinessSchedule 全行资产业务情况-附表
     * @return 结果
     */
    @Override
    public int updateKpiShowAssetBusinessSchedule(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule)
    {
        kpiShowAssetBusinessSchedule.setUpdateTime(DateUtils.getNowDate());
        return kpiShowAssetBusinessScheduleMapper.updateKpiShowAssetBusinessSchedule(kpiShowAssetBusinessSchedule);
    }

    /**
     * 删除全行资产业务情况-附表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowAssetBusinessScheduleByIds(String ids)
    {
        return kpiShowAssetBusinessScheduleMapper.deleteKpiShowAssetBusinessScheduleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除全行资产业务情况-附表信息
     * 
     * @param id 全行资产业务情况-附表ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowAssetBusinessScheduleById(Long id)
    {
        return kpiShowAssetBusinessScheduleMapper.deleteKpiShowAssetBusinessScheduleById(id);
    }
}
