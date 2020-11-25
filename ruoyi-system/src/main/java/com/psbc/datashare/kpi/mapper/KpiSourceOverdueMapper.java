package com.psbc.datashare.kpi.mapper;

import java.util.List;
import com.psbc.datashare.kpi.domain.KpiSourceOverdue;

/**
 * 零售信贷逾期Mapper接口
 * 
 * @author mql
 * @date 2020-11-25
 */
public interface KpiSourceOverdueMapper 
{
    /**
     * 查询零售信贷逾期
     * 
     * @param id 零售信贷逾期ID
     * @return 零售信贷逾期
     */
    public KpiSourceOverdue selectKpiSourceOverdueById(Long id);

    /**
     * 查询零售信贷逾期列表
     * 
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 零售信贷逾期集合
     */
    public List<KpiSourceOverdue> selectKpiSourceOverdueList(KpiSourceOverdue kpiSourceOverdue);

    /**
     * 新增零售信贷逾期
     * 
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 结果
     */
    public int insertKpiSourceOverdue(KpiSourceOverdue kpiSourceOverdue);

    /**
     * 修改零售信贷逾期
     * 
     * @param kpiSourceOverdue 零售信贷逾期
     * @return 结果
     */
    public int updateKpiSourceOverdue(KpiSourceOverdue kpiSourceOverdue);

    /**
     * 删除零售信贷逾期
     * 
     * @param id 零售信贷逾期ID
     * @return 结果
     */
    public int deleteKpiSourceOverdueById(Long id);

    /**
     * 批量删除零售信贷逾期
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteKpiSourceOverdueByIds(String[] ids);
}
