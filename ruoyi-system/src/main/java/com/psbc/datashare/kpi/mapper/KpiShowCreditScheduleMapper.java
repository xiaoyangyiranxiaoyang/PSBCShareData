package com.psbc.datashare.kpi.mapper;

import java.util.Date;
import java.util.List;

import com.psbc.datashare.kpi.domain.KpiShowCredit;
import com.psbc.datashare.kpi.domain.KpiShowCreditSchedule;

/**
 * 全行KPI指标（二）-附表Mapper接口
 *
 * @author mql
 * @date 2020-11-25
 */
public interface KpiShowCreditScheduleMapper {
    /**
     * 查询全行KPI指标（二）-附表
     *
     * @param id 全行KPI指标（二）-附表ID
     * @return 全行KPI指标（二）-附表
     */
    KpiShowCreditSchedule selectKpiShowCreditScheduleById(Long id);

    /**
     * 查询全行KPI指标（二）-附表列表
     *
     * @param kpiShowCreditSchedule 全行KPI指标（二）-附表
     * @return 全行KPI指标（二）-附表集合
     */
    List<KpiShowCreditSchedule> selectKpiShowCreditScheduleList(KpiShowCreditSchedule kpiShowCreditSchedule);

    /**
     * 新增全行KPI指标（二）-附表
     *
     * @param kpiShowCreditSchedule 全行KPI指标（二）-附表
     * @return 结果
     */
    int insertKpiShowCreditSchedule(KpiShowCreditSchedule kpiShowCreditSchedule);

    /**
     * 修改全行KPI指标（二）-附表
     *
     * @param kpiShowCreditSchedule 全行KPI指标（二）-附表
     * @return 结果
     */
    int updateKpiShowCreditSchedule(KpiShowCreditSchedule kpiShowCreditSchedule);

    /**
     * 删除全行KPI指标（二）-附表
     *
     * @param id 全行KPI指标（二）-附表ID
     * @return 结果
     */
    int deleteKpiShowCreditScheduleById(Long id);

    /**
     * 批量删除全行KPI指标（二）-附表
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiShowCreditScheduleByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiShowCreditSchedule> selectByDataDate(Date dataDate);


    /**
     * 删除
     *
     * @param dataDate 数据日期
     * @return
     */
    int deleteByDataDate(Date dataDate);
}
