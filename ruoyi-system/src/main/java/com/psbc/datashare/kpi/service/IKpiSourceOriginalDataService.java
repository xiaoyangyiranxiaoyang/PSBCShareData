package com.psbc.datashare.kpi.service;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiSourceOriginalData;

/**
 * 数据原（商业银行日报）Service接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface IKpiSourceOriginalDataService 
{
    /**
     * 查询数据原（商业银行日报）
     * 
     * @param id 数据原（商业银行日报）ID
     * @return 数据原（商业银行日报）
     */
    public KpiSourceOriginalData selectKpiSourceOriginalDataById(Long id);

    /**
     * 查询数据原（商业银行日报）列表
     * 
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 数据原（商业银行日报）集合
     */
    public List<KpiSourceOriginalData> selectKpiSourceOriginalDataList(KpiSourceOriginalData kpiSourceOriginalData);

    /**
     * 新增数据原（商业银行日报）
     * 
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 结果
     */
    public int insertKpiSourceOriginalData(KpiSourceOriginalData kpiSourceOriginalData);

    /**
     * 修改数据原（商业银行日报）
     * 
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 结果
     */
    public int updateKpiSourceOriginalData(KpiSourceOriginalData kpiSourceOriginalData);

    /**
     * 批量删除数据原（商业银行日报）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiSourceOriginalDataByIds(String ids);

    /**
     * 删除数据原（商业银行日报）信息
     * 
     * @param id 数据原（商业银行日报）ID
     * @return 结果
     */
    public int deleteKpiSourceOriginalDataById(Long id);
}
