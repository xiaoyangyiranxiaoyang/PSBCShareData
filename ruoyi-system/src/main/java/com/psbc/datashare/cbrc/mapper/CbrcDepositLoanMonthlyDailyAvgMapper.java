package com.psbc.datashare.cbrc.mapper;

import com.psbc.datashare.cbrc.domain.CbrcDepositLoanMonthlyDailyAvg;

import java.util.Date;
import java.util.List;

/**
 * 分机构存贷款月日均情况Mapper接口
 *
 * @author mql
 * @date 2020-12-10
 */
public interface CbrcDepositLoanMonthlyDailyAvgMapper {
    /**
     * 查询分机构存贷款月日均情况
     *
     * @param id 分机构存贷款月日均情况ID
     * @return 分机构存贷款月日均情况
     */
    CbrcDepositLoanMonthlyDailyAvg selectCbrcDepositLoanMonthlyDailyAvgById(Long id);

    /**
     * 查询分机构存贷款月日均情况列表
     *
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 分机构存贷款月日均情况集合
     */
    List<CbrcDepositLoanMonthlyDailyAvg> selectCbrcDepositLoanMonthlyDailyAvgList(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg);

    /**
     * 新增分机构存贷款月日均情况
     *
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 结果
     */
    int insertCbrcDepositLoanMonthlyDailyAvg(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg);

    /**
     * 修改分机构存贷款月日均情况
     *
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 结果
     */
    int updateCbrcDepositLoanMonthlyDailyAvg(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg);

    /**
     * 删除分机构存贷款月日均情况
     *
     * @param id 分机构存贷款月日均情况ID
     * @return 结果
     */
    int deleteCbrcDepositLoanMonthlyDailyAvgById(Long id);

    /**
     * 批量删除分机构存贷款月日均情况
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcDepositLoanMonthlyDailyAvgByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<CbrcDepositLoanMonthlyDailyAvg> selectByDataDate(Date dataDate);


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
    int insertBatch(List<CbrcDepositLoanMonthlyDailyAvg> list);
}
