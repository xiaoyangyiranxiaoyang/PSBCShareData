package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiSourceUnhealthyMapper;
import com.psbc.datashare.kpi.domain.KpiSourceUnhealthy;
import com.psbc.datashare.kpi.service.IKpiSourceUnhealthyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 零售信贷不良Service业务层处理
 * 
 * @author mql
 * @date 2020-11-26
 */
@Service
public class KpiSourceUnhealthyServiceImpl implements IKpiSourceUnhealthyService 
{
    @Autowired
    private KpiSourceUnhealthyMapper kpiSourceUnhealthyMapper;

    /**
     * 查询零售信贷不良
     * 
     * @param id 零售信贷不良ID
     * @return 零售信贷不良
     */
    @Override
    public KpiSourceUnhealthy selectKpiSourceUnhealthyById(Long id)
    {
        return kpiSourceUnhealthyMapper.selectKpiSourceUnhealthyById(id);
    }

    /**
     * 查询零售信贷不良列表
     * 
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 零售信贷不良
     */
    @Override
    public List<KpiSourceUnhealthy> selectKpiSourceUnhealthyList(KpiSourceUnhealthy kpiSourceUnhealthy)
    {
        return kpiSourceUnhealthyMapper.selectKpiSourceUnhealthyList(kpiSourceUnhealthy);
    }

    /**
     * 新增零售信贷不良
     * 
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 结果
     */
    @Override
    public int insertKpiSourceUnhealthy(KpiSourceUnhealthy kpiSourceUnhealthy)
    {
        kpiSourceUnhealthy.setCreateTime(DateUtils.getNowDate());
        return kpiSourceUnhealthyMapper.insertKpiSourceUnhealthy(kpiSourceUnhealthy);
    }

    /**
     * 修改零售信贷不良
     * 
     * @param kpiSourceUnhealthy 零售信贷不良
     * @return 结果
     */
    @Override
    public int updateKpiSourceUnhealthy(KpiSourceUnhealthy kpiSourceUnhealthy)
    {
        kpiSourceUnhealthy.setUpdateTime(DateUtils.getNowDate());
        return kpiSourceUnhealthyMapper.updateKpiSourceUnhealthy(kpiSourceUnhealthy);
    }

    /**
     * 删除零售信贷不良对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceUnhealthyByIds(String ids)
    {
        return kpiSourceUnhealthyMapper.deleteKpiSourceUnhealthyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除零售信贷不良信息
     * 
     * @param id 零售信贷不良ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceUnhealthyById(Long id)
    {
        return kpiSourceUnhealthyMapper.deleteKpiSourceUnhealthyById(id);
    }
}
