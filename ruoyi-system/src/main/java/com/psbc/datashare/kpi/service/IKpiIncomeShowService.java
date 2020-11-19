package com.psbc.datashare.kpi.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import com.psbc.datashare.kpi.domain.KpiIncomeShow;

/**
 * 全行KPI指标（一）Service接口
 * 
 * @author mql
 * @date 2020-11-18
 */
public interface IKpiIncomeShowService
{
    /**
     * 查询全行KPI指标（一）
     * 
     * @param id 全行KPI指标（一）ID
     * @return 全行KPI指标（一）
     */
    KpiIncomeShow selectKpiIncomeShowById(Long id);

    /**
     * 查询全行KPI指标（一）列表
     * 
     * @param kpiIncomeShow 全行KPI指标（一）
     * @return 全行KPI指标（一）集合
     */
    List<KpiIncomeShow> selectKpiIncomeShowList(KpiIncomeShow kpiIncomeShow);

    /**
     * 新增全行KPI指标（一）
     * 
     * @param kpiIncomeShow 全行KPI指标（一）
     * @return 结果
     */
    int insertKpiIncomeShow(KpiIncomeShow kpiIncomeShow);

    /**
     * 修改全行KPI指标（一）
     * 
     * @param kpiIncomeShow 全行KPI指标（一）
     * @return 结果
     */
    int updateKpiIncomeShow(KpiIncomeShow kpiIncomeShow);

    /**
     * 批量删除全行KPI指标（一）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiIncomeShowByIds(String ids);

    /**
     * 删除全行KPI指标（一）信息
     * 
     * @param id 全行KPI指标（一）ID
     * @return 结果
     */
    int deleteKpiIncomeShowById(Long id);

    /**
     * 导入全行KPI指标（一）信息
     * @param is               文件输入流对象
     * @param dataMonth        数据时间(月)
     * @param operName         操作用户
     * @return
     */
    String importKpiIncomeShow(InputStream is, String dataMonth, String operName);
}
