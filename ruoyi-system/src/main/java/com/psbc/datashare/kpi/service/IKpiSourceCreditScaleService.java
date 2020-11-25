package com.psbc.datashare.kpi.service;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiSourceCreditScale;

/**
 * 信贷规模Service接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface IKpiSourceCreditScaleService 
{
    /**
     * 查询信贷规模
     * 
     * @param id 信贷规模ID
     * @return 信贷规模
     */
    public KpiSourceCreditScale selectKpiSourceCreditScaleById(Long id);

    /**
     * 查询信贷规模列表
     * 
     * @param kpiSourceCreditScale 信贷规模
     * @return 信贷规模集合
     */
    public List<KpiSourceCreditScale> selectKpiSourceCreditScaleList(KpiSourceCreditScale kpiSourceCreditScale);

    /**
     * 新增信贷规模
     * 
     * @param kpiSourceCreditScale 信贷规模
     * @return 结果
     */
    public int insertKpiSourceCreditScale(KpiSourceCreditScale kpiSourceCreditScale);

    /**
     * 修改信贷规模
     * 
     * @param kpiSourceCreditScale 信贷规模
     * @return 结果
     */
    public int updateKpiSourceCreditScale(KpiSourceCreditScale kpiSourceCreditScale);

    /**
     * 批量删除信贷规模
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiSourceCreditScaleByIds(String ids);

    /**
     * 删除信贷规模信息
     * 
     * @param id 信贷规模ID
     * @return 结果
     */
    public int deleteKpiSourceCreditScaleById(Long id);
}
