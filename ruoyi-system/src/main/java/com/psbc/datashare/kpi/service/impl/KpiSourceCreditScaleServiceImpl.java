package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiSourceCreditScaleMapper;
import com.psbc.datashare.kpi.domain.KpiSourceCreditScale;
import com.psbc.datashare.kpi.service.IKpiSourceCreditScaleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 信贷规模Service业务层处理
 * 
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiSourceCreditScaleServiceImpl implements IKpiSourceCreditScaleService 
{
    @Autowired
    private KpiSourceCreditScaleMapper kpiSourceCreditScaleMapper;

    /**
     * 查询信贷规模
     * 
     * @param id 信贷规模ID
     * @return 信贷规模
     */
    @Override
    public KpiSourceCreditScale selectKpiSourceCreditScaleById(Long id)
    {
        return kpiSourceCreditScaleMapper.selectKpiSourceCreditScaleById(id);
    }

    /**
     * 查询信贷规模列表
     * 
     * @param kpiSourceCreditScale 信贷规模
     * @return 信贷规模
     */
    @Override
    public List<KpiSourceCreditScale> selectKpiSourceCreditScaleList(KpiSourceCreditScale kpiSourceCreditScale)
    {
        return kpiSourceCreditScaleMapper.selectKpiSourceCreditScaleList(kpiSourceCreditScale);
    }

    /**
     * 新增信贷规模
     * 
     * @param kpiSourceCreditScale 信贷规模
     * @return 结果
     */
    @Override
    public int insertKpiSourceCreditScale(KpiSourceCreditScale kpiSourceCreditScale)
    {
        kpiSourceCreditScale.setCreateTime(DateUtils.getNowDate());
        return kpiSourceCreditScaleMapper.insertKpiSourceCreditScale(kpiSourceCreditScale);
    }

    /**
     * 修改信贷规模
     * 
     * @param kpiSourceCreditScale 信贷规模
     * @return 结果
     */
    @Override
    public int updateKpiSourceCreditScale(KpiSourceCreditScale kpiSourceCreditScale)
    {
        kpiSourceCreditScale.setUpdateTime(DateUtils.getNowDate());
        return kpiSourceCreditScaleMapper.updateKpiSourceCreditScale(kpiSourceCreditScale);
    }

    /**
     * 删除信贷规模对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceCreditScaleByIds(String ids)
    {
        return kpiSourceCreditScaleMapper.deleteKpiSourceCreditScaleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除信贷规模信息
     * 
     * @param id 信贷规模ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceCreditScaleById(Long id)
    {
        return kpiSourceCreditScaleMapper.deleteKpiSourceCreditScaleById(id);
    }
}
