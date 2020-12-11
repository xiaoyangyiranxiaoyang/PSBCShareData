package com.psbc.datashare.cbrc.service.impl;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsUnhealthy;
import com.psbc.datashare.cbrc.mapper.CbrcLoanFiveLevelsUnhealthyMapper;
import com.psbc.datashare.cbrc.service.ICbrcLoanFiveLevelsUnhealthyService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 青海省银行业金融机构贷款五级分类不良情况Service业务层处理
 * 
 * @author mql
 * @date 2020-12-11
 */
@Service
public class CbrcLoanFiveLevelsUnhealthyServiceImpl implements ICbrcLoanFiveLevelsUnhealthyService
{
    @Autowired
    private CbrcLoanFiveLevelsUnhealthyMapper cbrcLoanFiveLevelsUnhealthyMapper;

    /**
     * 查询青海省银行业金融机构贷款五级分类不良情况
     * 
     * @param id 青海省银行业金融机构贷款五级分类不良情况ID
     * @return 青海省银行业金融机构贷款五级分类不良情况
     */
    @Override
    public CbrcLoanFiveLevelsUnhealthy selectCbrcLoanFiveLevelsUnhealthyById(Long id)
    {
        return cbrcLoanFiveLevelsUnhealthyMapper.selectCbrcLoanFiveLevelsUnhealthyById(id);
    }

    /**
     * 查询青海省银行业金融机构贷款五级分类不良情况列表
     * 
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 青海省银行业金融机构贷款五级分类不良情况
     */
    @Override
    public List<CbrcLoanFiveLevelsUnhealthy> selectCbrcLoanFiveLevelsUnhealthyList(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy)
    {
        return cbrcLoanFiveLevelsUnhealthyMapper.selectCbrcLoanFiveLevelsUnhealthyList(cbrcLoanFiveLevelsUnhealthy);
    }

    /**
     * 新增青海省银行业金融机构贷款五级分类不良情况
     * 
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 结果
     */
    @Override
    public int insertCbrcLoanFiveLevelsUnhealthy(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy)
    {
        cbrcLoanFiveLevelsUnhealthy.setCreateTime(DateUtils.getNowDate());
        return cbrcLoanFiveLevelsUnhealthyMapper.insertCbrcLoanFiveLevelsUnhealthy(cbrcLoanFiveLevelsUnhealthy);
    }

    /**
     * 修改青海省银行业金融机构贷款五级分类不良情况
     * 
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 结果
     */
    @Override
    public int updateCbrcLoanFiveLevelsUnhealthy(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy)
    {
        cbrcLoanFiveLevelsUnhealthy.setUpdateTime(DateUtils.getNowDate());
        return cbrcLoanFiveLevelsUnhealthyMapper.updateCbrcLoanFiveLevelsUnhealthy(cbrcLoanFiveLevelsUnhealthy);
    }

    /**
     * 删除青海省银行业金融机构贷款五级分类不良情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCbrcLoanFiveLevelsUnhealthyByIds(String ids)
    {
        return cbrcLoanFiveLevelsUnhealthyMapper.deleteCbrcLoanFiveLevelsUnhealthyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除青海省银行业金融机构贷款五级分类不良情况信息
     * 
     * @param id 青海省银行业金融机构贷款五级分类不良情况ID
     * @return 结果
     */
    @Override
    public int deleteCbrcLoanFiveLevelsUnhealthyById(Long id)
    {
        return cbrcLoanFiveLevelsUnhealthyMapper.deleteCbrcLoanFiveLevelsUnhealthyById(id);
    }
}
