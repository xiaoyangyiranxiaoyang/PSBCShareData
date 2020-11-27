package com.psbc.datashare.kpi.mapper;

import java.util.Date;
import java.util.List;

import com.psbc.datashare.kpi.domain.KpiShowAssetBusiness;
import com.psbc.datashare.kpi.domain.KpiSourceCreditScale;

/**
 * 全行资产业务情况表Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiShowAssetBusinessMapper {
    /**
     * 查询全行资产业务情况表
     *
     * @param id 全行资产业务情况表ID
     * @return 全行资产业务情况表
     */
    KpiShowAssetBusiness selectKpiShowAssetBusinessById(Long id);

    /**
     * 查询全行资产业务情况表列表
     *
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 全行资产业务情况表集合
     */
    List<KpiShowAssetBusiness> selectKpiShowAssetBusinessList(KpiShowAssetBusiness kpiShowAssetBusiness);

    /**
     * 新增全行资产业务情况表
     *
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 结果
     */
    int insertKpiShowAssetBusiness(KpiShowAssetBusiness kpiShowAssetBusiness);

    /**
     * 修改全行资产业务情况表
     *
     * @param kpiShowAssetBusiness 全行资产业务情况表
     * @return 结果
     */
    int updateKpiShowAssetBusiness(KpiShowAssetBusiness kpiShowAssetBusiness);

    /**
     * 删除全行资产业务情况表
     *
     * @param id 全行资产业务情况表ID
     * @return 结果
     */
    int deleteKpiShowAssetBusinessById(Long id);

    /**
     * 批量删除全行资产业务情况表
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiShowAssetBusinessByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiShowAssetBusiness> selectByDataDate(Date dataDate);


    /**
     * 删除
     *
     * @param dataDate 数据日期
     * @return
     */
    int deleteByDataDate(Date dataDate);


    /**
     * 批量插入数据
     *
     * @param list
     * @return
     */
    int insertBatch(List<KpiShowAssetBusiness> list);
}
