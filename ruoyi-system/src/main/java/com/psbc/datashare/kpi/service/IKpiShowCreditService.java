package com.psbc.datashare.kpi.service;

import java.io.InputStream;
import java.util.List;

import com.psbc.datashare.kpi.domain.KpiShowCredit;

/**
 * 全行KPI指标（二）Service接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface IKpiShowCreditService {
    /**
     * 查询全行KPI指标（二）
     *
     * @param id 全行KPI指标（二）ID
     * @return 全行KPI指标（二）
     */
    KpiShowCredit selectKpiShowCreditById(Long id);

    /**
     * 查询全行KPI指标（二）列表
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 全行KPI指标（二）集合
     */
    List<KpiShowCredit> selectKpiShowCreditList(KpiShowCredit kpiShowCredit);

    /**
     * 新增全行KPI指标（二）
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    int insertKpiShowCredit(KpiShowCredit kpiShowCredit);

    /**
     * 修改全行KPI指标（二）
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    int updateKpiShowCredit(KpiShowCredit kpiShowCredit);

    /**
     * 批量删除全行KPI指标（二）
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiShowCreditByIds(String ids);

    /**
     * 删除全行KPI指标（二）信息
     *
     * @param id 全行KPI指标（二）ID
     * @return 结果
     */
    int deleteKpiShowCreditById(Long id);

    /**
     * KPI 源数据导入
     *
     * @param is        文件输入流对象
     * @param dataMonth 数据时间(月)
     * @param operName  操作用户
     * @return
     */
    String importKpiSourceData(InputStream is, String dataMonth, String operName);
}
