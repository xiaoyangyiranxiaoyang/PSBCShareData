package com.psbc.datashare.kpi.mapper;

import java.util.Date;
import java.util.List;
import com.psbc.datashare.kpi.domain.KpiIncomeShow;
import org.apache.ibatis.annotations.Param;

/**
 * 全行KPI指标（一）Mapper接口
 * 
 * @author mql
 * @date 2020-11-18
 */
public interface KpiIncomeShowMapper
{
    /**
     * 查询全行KPI指标（一）
     * 
     * @param id 全行KPI指标（一）ID
     * @return 全行KPI指标（一）
     */
    KpiIncomeShow selectKpiIncomeShowById(Long id);

    /**
     * 查询全行KPI指标（一）
     *
     * @param dataDate 全行KPI指标（一）数据日期
     * @return 全行KPI指标（一）
     */
    List<KpiIncomeShow> selectKpiIncomeShowByDataDate(Date dataDate);

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
     * 批量插入数据
     * @param kpiIncomeShows
     * @return
     */
    int insertKpiIncomeShowBatch(@Param("kpiIncomeShows") List<KpiIncomeShow> kpiIncomeShows);

    /**
     * 修改全行KPI指标（一）
     * 
     * @param kpiIncomeShow 全行KPI指标（一）
     * @return 结果
     */
    int updateKpiIncomeShow(KpiIncomeShow kpiIncomeShow);

    /**
     * 删除全行KPI指标（一）
     * 
     * @param id 全行KPI指标（一）ID
     * @return 结果
     */
    int deleteKpiIncomeShowById(Long id);

    /**
     * 删除全行KPI指标（一）
     * @param dataDate 数据日期
     * @return
     */
    int deleteKpiIncomeShowByDataDate(Date dataDate);

    /**
     * 批量删除全行KPI指标（一）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteKpiIncomeShowByIds(String[] ids);
}
