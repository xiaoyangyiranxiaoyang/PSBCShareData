package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiSourceOverdueMapper;
import com.psbc.datashare.kpi.domain.KpiSourceOverdue;
import com.psbc.datashare.kpi.service.IKpiSourceOverdueService;
import com.ruoyi.common.core.text.Convert;

/**
 * 零售信贷逾期Service业务层处理
 * 
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiSourceOverdueServiceImpl implements IKpiSourceOverdueService 
{
    @Autowired
    private KpiSourceOverdueMapper kpiSourceOverdueMapper;

    /**
     * 查询零售信贷逾期
     * 
     * @param id 零售信贷逾期ID
     * @return 零售信贷逾期
     */
    @Override
    public KpiSourceOverdue selectKpiSourceOverdueById(Long id)
    {
        return kpiSourceOverdueMapper.selectKpiSourceOverdueById(id);
    }

    /**
     * 查询零售信贷逾期列表
     * 
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 零售信贷逾期
     */
    @Override
    public List<KpiSourceOverdue> selectKpiSourceOverdueList(KpiSourceOverdue kpiSourceOverdue)
    {
        return kpiSourceOverdueMapper.selectKpiSourceOverdueList(kpiSourceOverdue);
    }

    /**
     * 新增零售信贷逾期
     * 
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 结果
     */
    @Override
    public int insertKpiSourceOverdue(KpiSourceOverdue kpiSourceOverdue)
    {
        kpiSourceOverdue.setCreateTime(DateUtils.getNowDate());
        return kpiSourceOverdueMapper.insertKpiSourceOverdue(kpiSourceOverdue);
    }

    /**
     * 修改零售信贷逾期
     * 
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 结果
     */
    @Override
    public int updateKpiSourceOverdue(KpiSourceOverdue kpiSourceOverdue)
    {
        kpiSourceOverdue.setUpdateTime(DateUtils.getNowDate());
        return kpiSourceOverdueMapper.updateKpiSourceOverdue(kpiSourceOverdue);
    }

    /**
     * 删除零售信贷逾期对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceOverdueByIds(String ids)
    {
        return kpiSourceOverdueMapper.deleteKpiSourceOverdueByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除零售信贷逾期信息
     * 
     * @param id 零售信贷逾期ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceOverdueById(Long id)
    {
        return kpiSourceOverdueMapper.deleteKpiSourceOverdueById(id);
    }
}
