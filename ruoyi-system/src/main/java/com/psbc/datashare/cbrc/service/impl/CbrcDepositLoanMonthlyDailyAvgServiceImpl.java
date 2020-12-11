package com.psbc.datashare.cbrc.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.cbrc.mapper.CbrcDepositLoanMonthlyDailyAvgMapper;
import com.psbc.datashare.cbrc.domain.CbrcDepositLoanMonthlyDailyAvg;
import com.psbc.datashare.cbrc.service.ICbrcDepositLoanMonthlyDailyAvgService;
import com.ruoyi.common.core.text.Convert;

/**
 * 分机构存贷款月日均情况Service业务层处理
 * 
 * @author mql
 * @date 2020-12-10
 */
@Service
public class CbrcDepositLoanMonthlyDailyAvgServiceImpl implements ICbrcDepositLoanMonthlyDailyAvgService 
{
    @Autowired
    private CbrcDepositLoanMonthlyDailyAvgMapper cbrcDepositLoanMonthlyDailyAvgMapper;

    /**
     * 查询分机构存贷款月日均情况
     * 
     * @param id 分机构存贷款月日均情况ID
     * @return 分机构存贷款月日均情况
     */
    @Override
    public CbrcDepositLoanMonthlyDailyAvg selectCbrcDepositLoanMonthlyDailyAvgById(Long id)
    {
        return cbrcDepositLoanMonthlyDailyAvgMapper.selectCbrcDepositLoanMonthlyDailyAvgById(id);
    }

    /**
     * 查询分机构存贷款月日均情况列表
     * 
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 分机构存贷款月日均情况
     */
    @Override
    public List<CbrcDepositLoanMonthlyDailyAvg> selectCbrcDepositLoanMonthlyDailyAvgList(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg)
    {
        return cbrcDepositLoanMonthlyDailyAvgMapper.selectCbrcDepositLoanMonthlyDailyAvgList(cbrcDepositLoanMonthlyDailyAvg);
    }

    /**
     * 新增分机构存贷款月日均情况
     * 
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 结果
     */
    @Override
    public int insertCbrcDepositLoanMonthlyDailyAvg(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg)
    {
        cbrcDepositLoanMonthlyDailyAvg.setCreateTime(DateUtils.getNowDate());
        return cbrcDepositLoanMonthlyDailyAvgMapper.insertCbrcDepositLoanMonthlyDailyAvg(cbrcDepositLoanMonthlyDailyAvg);
    }

    /**
     * 修改分机构存贷款月日均情况
     * 
     * @param cbrcDepositLoanMonthlyDailyAvg 分机构存贷款月日均情况
     * @return 结果
     */
    @Override
    public int updateCbrcDepositLoanMonthlyDailyAvg(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg)
    {
        cbrcDepositLoanMonthlyDailyAvg.setUpdateTime(DateUtils.getNowDate());
        return cbrcDepositLoanMonthlyDailyAvgMapper.updateCbrcDepositLoanMonthlyDailyAvg(cbrcDepositLoanMonthlyDailyAvg);
    }

    /**
     * 删除分机构存贷款月日均情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCbrcDepositLoanMonthlyDailyAvgByIds(String ids)
    {
        return cbrcDepositLoanMonthlyDailyAvgMapper.deleteCbrcDepositLoanMonthlyDailyAvgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除分机构存贷款月日均情况信息
     * 
     * @param id 分机构存贷款月日均情况ID
     * @return 结果
     */
    @Override
    public int deleteCbrcDepositLoanMonthlyDailyAvgById(Long id)
    {
        return cbrcDepositLoanMonthlyDailyAvgMapper.deleteCbrcDepositLoanMonthlyDailyAvgById(id);
    }
}
