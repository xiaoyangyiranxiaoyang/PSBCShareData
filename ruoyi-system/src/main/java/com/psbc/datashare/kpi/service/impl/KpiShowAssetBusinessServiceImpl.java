package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiShowAssetBusinessMapper;
import com.psbc.datashare.kpi.domain.KpiShowAssetBusiness;
import com.psbc.datashare.kpi.service.IKpiShowAssetBusinessService;
import com.ruoyi.common.core.text.Convert;

/**
 * 全行资产业务情况表Service业务层处理
 * 
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiShowAssetBusinessServiceImpl implements IKpiShowAssetBusinessService 
{
    @Autowired
    private KpiShowAssetBusinessMapper kpiShowAssetBusinessMapper;

    /**
     * 查询全行资产业务情况表
     * 
     * @param id 全行资产业务情况表ID
     * @return 全行资产业务情况表
     */
    @Override
    public KpiShowAssetBusiness selectKpiShowAssetBusinessById(Long id)
    {
        return kpiShowAssetBusinessMapper.selectKpiShowAssetBusinessById(id);
    }

    /**
     * 查询全行资产业务情况表列表
     * 
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 全行资产业务情况表
     */
    @Override
    public List<KpiShowAssetBusiness> selectKpiShowAssetBusinessList(KpiShowAssetBusiness kpiShowAssetBusiness)
    {
        return kpiShowAssetBusinessMapper.selectKpiShowAssetBusinessList(kpiShowAssetBusiness);
    }

    /**
     * 新增全行资产业务情况表
     * 
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 结果
     */
    @Override
    public int insertKpiShowAssetBusiness(KpiShowAssetBusiness kpiShowAssetBusiness)
    {
        kpiShowAssetBusiness.setCreateTime(DateUtils.getNowDate());
        return kpiShowAssetBusinessMapper.insertKpiShowAssetBusiness(kpiShowAssetBusiness);
    }

    /**
     * 修改全行资产业务情况表
     * 
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 结果
     */
    @Override
    public int updateKpiShowAssetBusiness(KpiShowAssetBusiness kpiShowAssetBusiness)
    {
        kpiShowAssetBusiness.setUpdateTime(DateUtils.getNowDate());
        return kpiShowAssetBusinessMapper.updateKpiShowAssetBusiness(kpiShowAssetBusiness);
    }

    /**
     * 删除全行资产业务情况表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowAssetBusinessByIds(String ids)
    {
        return kpiShowAssetBusinessMapper.deleteKpiShowAssetBusinessByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除全行资产业务情况表信息
     * 
     * @param id 全行资产业务情况表ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowAssetBusinessById(Long id)
    {
        return kpiShowAssetBusinessMapper.deleteKpiShowAssetBusinessById(id);
    }
}
