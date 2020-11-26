package com.psbc.datashare.kpi.mapper;

import com.psbc.datashare.kpi.domain.KpiSourceOriginalData;

import java.util.Date;
import java.util.List;

/**
 * 数据原（商业银行日报）Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiSourceOriginalDataMapper {
    /**
     * 查询数据原（商业银行日报）
     *
     * @param id 数据原（商业银行日报）ID
     * @return 数据原（商业银行日报）
     */
    KpiSourceOriginalData selectKpiSourceOriginalDataById(Long id);

    /**
     * 查询数据原（商业银行日报）列表
     *
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 数据原（商业银行日报）集合
     */
    List<KpiSourceOriginalData> selectKpiSourceOriginalDataList(KpiSourceOriginalData kpiSourceOriginalData);

    /**
     * 新增数据原（商业银行日报）
     *
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 结果
     */
    int insertKpiSourceOriginalData(KpiSourceOriginalData kpiSourceOriginalData);

    /**
     * 修改数据原（商业银行日报）
     *
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 结果
     */
    int updateKpiSourceOriginalData(KpiSourceOriginalData kpiSourceOriginalData);

    /**
     * 删除数据原（商业银行日报）
     *
     * @param id 数据原（商业银行日报）ID
     * @return 结果
     */
    int deleteKpiSourceOriginalDataById(Long id);

    /**
     * 批量删除数据原（商业银行日报）
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiSourceOriginalDataByIds(String[] ids);


    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiSourceOriginalData> selectByDataDate(Date dataDate);


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
    int insertBatch(List<KpiSourceOriginalData> list);
}
