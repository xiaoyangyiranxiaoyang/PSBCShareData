package com.psbc.datashare.cbrc.service;

import java.util.List;
import com.psbc.datashare.cbrc.domain.CbrcDepositLoanMonthlyDailyAvg;

/**
 * 分机构存贷款月日均情况Service接口
 * 
 * @author mql
 * @date 2020-12-10
 */
public interface ICbrcDepositLoanMonthlyDailyAvgService 
{
    /**
     * 查询分机构存贷款月日均情况
     * 
     * @param id 分机构存贷款月日均情况ID
     * @return 分机构存贷款月日均情况
     */
    public CbrcDepositLoanMonthlyDailyAvg selectCbrcDepositLoanMonthlyDailyAvgById(Long id);

    /**
     * 查询分机构存贷款月日均情况列表
     * 
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 分机构存贷款月日均情况集合
     */
    public List<CbrcDepositLoanMonthlyDailyAvg> selectCbrcDepositLoanMonthlyDailyAvgList(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg);

    /**
     * 新增分机构存贷款月日均情况
     * 
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 结果
     */
    public int insertCbrcDepositLoanMonthlyDailyAvg(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg);

    /**
     * 修改分机构存贷款月日均情况
     * 
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 结果
     */
    public int updateCbrcDepositLoanMonthlyDailyAvg(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg);

    /**
     * 批量删除分机构存贷款月日均情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCbrcDepositLoanMonthlyDailyAvgByIds(String ids);

    /**
     * 删除分机构存贷款月日均情况信息
     * 
     * @param id 分机构存贷款月日均情况ID
     * @return 结果
     */
    public int deleteCbrcDepositLoanMonthlyDailyAvgById(Long id);
}
