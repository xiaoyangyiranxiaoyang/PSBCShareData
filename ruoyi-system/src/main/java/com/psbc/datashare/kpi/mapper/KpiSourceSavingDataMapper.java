package com.psbc.datashare.kpi.mapper;

import com.psbc.datashare.kpi.domain.KpiSourceSavingData;

import java.util.Date;
import java.util.List;

/**
 * 代理储蓄数据Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiSourceSavingDataMapper {
    /**
     * 查询代理储蓄数据
     *
     * @param id 代理储蓄数据ID
     * @return 代理储蓄数据
     */
    KpiSourceSavingData selectKpiSourceSavingDataById(Long id);

    /**
     * 查询代理储蓄数据列表
     *
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 代理储蓄数据集合
     */
    List<KpiSourceSavingData> selectKpiSourceSavingDataList(KpiSourceSavingData kpiSourceSavingData);

    /**
     * 新增代理储蓄数据
     *
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 结果
     */
    int insertKpiSourceSavingData(KpiSourceSavingData kpiSourceSavingData);

    /**
     * 修改代理储蓄数据
     *
     * @param kpiSourceSavingData 代理储蓄数据
     * @return 结果
     */
    int updateKpiSourceSavingData(KpiSourceSavingData kpiSourceSavingData);

    /**
     * 删除代理储蓄数据
     *
     * @param id 代理储蓄数据ID
     * @return 结果
     */
    int deleteKpiSourceSavingDataById(Long id);

    /**
     * 批量删除代理储蓄数据
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiSourceSavingDataByIds(String[] ids);


    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiSourceSavingData> selectByDataDate(Date dataDate);


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
    int insertBatch(List<KpiSourceSavingData> list);
}
