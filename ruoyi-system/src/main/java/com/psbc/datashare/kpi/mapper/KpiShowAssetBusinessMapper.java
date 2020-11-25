package com.psbc.datashare.kpi.mapper;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiShowAssetBusiness;

/**
 * 全行资产业务情况表Mapper接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface KpiShowAssetBusinessMapper 
{
    /**
     * 查询全行资产业务情况表
     * 
     * @param id 全行资产业务情况表ID
     * @return 全行资产业务情况表
     */
    public KpiShowAssetBusiness selectKpiShowAssetBusinessById(Long id);

    /**
     * 查询全行资产业务情况表列表
     * 
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 全行资产业务情况表集合
     */
    public List<KpiShowAssetBusiness> selectKpiShowAssetBusinessList(KpiShowAssetBusiness kpiShowAssetBusiness);

    /**
     * 新增全行资产业务情况表
     * 
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 结果
     */
    public int insertKpiShowAssetBusiness(KpiShowAssetBusiness kpiShowAssetBusiness);

    /**
     * 修改全行资产业务情况表
     * 
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 结果
     */
    public int updateKpiShowAssetBusiness(KpiShowAssetBusiness kpiShowAssetBusiness);

    /**
     * 删除全行资产业务情况表
     * 
     * @param id 全行资产业务情况表ID
     * @return 结果
     */
    public int deleteKpiShowAssetBusinessById(Long id);

    /**
     * 批量删除全行资产业务情况表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiShowAssetBusinessByIds(String[] ids);
}
