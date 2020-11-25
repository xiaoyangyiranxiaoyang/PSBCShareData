package com.psbc.datashare.kpi.mapper;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiShowCredit;

/**
 * 全行KPI指标（二）Mapper接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface KpiShowCreditMapper 
{
    /**
     * 查询全行KPI指标（二）
     * 
     * @param id 全行KPI指标（二）ID
     * @return 全行KPI指标（二）
     */
    public KpiShowCredit selectKpiShowCreditById(Long id);

    /**
     * 查询全行KPI指标（二）列表
     * 
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 全行KPI指标（二）集合
     */
    public List<KpiShowCredit> selectKpiShowCreditList(KpiShowCredit kpiShowCredit);

    /**
     * 新增全行KPI指标（二）
     * 
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    public int insertKpiShowCredit(KpiShowCredit kpiShowCredit);

    /**
     * 修改全行KPI指标（二）
     * 
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    public int updateKpiShowCredit(KpiShowCredit kpiShowCredit);

    /**
     * 删除全行KPI指标（二）
     * 
     * @param id 全行KPI指标（二）ID
     * @return 结果
     */
    public int deleteKpiShowCreditById(Long id);

    /**
     * 批量删除全行KPI指标（二）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiShowCreditByIds(String[] ids);
}
