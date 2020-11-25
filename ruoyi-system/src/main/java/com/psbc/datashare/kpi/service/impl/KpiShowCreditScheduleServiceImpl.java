package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiShowCreditScheduleMapper;
import com.psbc.datashare.kpi.domain.KpiShowCreditSchedule;
import com.psbc.datashare.kpi.service.IKpiShowCreditScheduleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 全行KPI指标（二）-附表Service业务层处理
 * 
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiShowCreditScheduleServiceImpl implements IKpiShowCreditScheduleService 
{
    @Autowired
    private KpiShowCreditScheduleMapper kpiShowCreditScheduleMapper;

    /**
     * 查询全行KPI指标（二）-附表
     * 
     * @param id 全行KPI指标（二）-附表ID
     * @return 全行KPI指标（二）-附表
     */
    @Override
    public KpiShowCreditSchedule selectKpiShowCreditScheduleById(Long id)
    {
        return kpiShowCreditScheduleMapper.selectKpiShowCreditScheduleById(id);
    }

    /**
     * 查询全行KPI指标（二）-附表列表
     * 
     * @param kpiShowCreditSchedule 全行KPI指标（二）-附表
     * @return 全行KPI指标（二）-附表
     */
    @Override
    public List<KpiShowCreditSchedule> selectKpiShowCreditScheduleList(KpiShowCreditSchedule kpiShowCreditSchedule)
    {
        return kpiShowCreditScheduleMapper.selectKpiShowCreditScheduleList(kpiShowCreditSchedule);
    }

    /**
     * 新增全行KPI指标（二）-附表
     * 
     * @param kpiShowCreditSchedule 全行KPI指标（二）-附表
     * @return 结果
     */
    @Override
    public int insertKpiShowCreditSchedule(KpiShowCreditSchedule kpiShowCreditSchedule)
    {
        kpiShowCreditSchedule.setCreateTime(DateUtils.getNowDate());
        return kpiShowCreditScheduleMapper.insertKpiShowCreditSchedule(kpiShowCreditSchedule);
    }

    /**
     * 修改全行KPI指标（二）-附表
     * 
     * @param kpiShowCreditSchedule 全行KPI指标（二）-附表
     * @return 结果
     */
    @Override
    public int updateKpiShowCreditSchedule(KpiShowCreditSchedule kpiShowCreditSchedule)
    {
        kpiShowCreditSchedule.setUpdateTime(DateUtils.getNowDate());
        return kpiShowCreditScheduleMapper.updateKpiShowCreditSchedule(kpiShowCreditSchedule);
    }

    /**
     * 删除全行KPI指标（二）-附表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowCreditScheduleByIds(String ids)
    {
        return kpiShowCreditScheduleMapper.deleteKpiShowCreditScheduleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除全行KPI指标（二）-附表信息
     * 
     * @param id 全行KPI指标（二）-附表ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowCreditScheduleById(Long id)
    {
        return kpiShowCreditScheduleMapper.deleteKpiShowCreditScheduleById(id);
    }
}
