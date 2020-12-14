package com.psbc.datashare.cbrc.service;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsUnhealthy;

import java.util.List;

/**
 * 青海省银行业金融机构贷款五级分类不良情况Service接口
 * 
 * @author mql
 * @date 2020-12-11
 */
public interface ICbrcLoanFiveLevelsUnhealthyService 
{
    /**
     * 查询青海省银行业金融机构贷款五级分类不良情况
     * 
     * @param id 青海省银行业金融机构贷款五级分类不良情况ID
     * @return 青海省银行业金融机构贷款五级分类不良情况
     */
    public CbrcLoanFiveLevelsUnhealthy selectCbrcLoanFiveLevelsUnhealthyById(Long id);

    /**
     * 查询青海省银行业金融机构贷款五级分类不良情况列表
     * 
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 青海省银行业金融机构贷款五级分类不良情况集合
     */
    public List<CbrcLoanFiveLevelsUnhealthy> selectCbrcLoanFiveLevelsUnhealthyList(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy);

    /**
     * 新增青海省银行业金融机构贷款五级分类不良情况
     * 
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 结果
     */
    public int insertCbrcLoanFiveLevelsUnhealthy(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy);

    /**
     * 修改青海省银行业金融机构贷款五级分类不良情况
     * 
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 结果
     */
    public int updateCbrcLoanFiveLevelsUnhealthy(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy);

    /**
     * 批量删除青海省银行业金融机构贷款五级分类不良情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCbrcLoanFiveLevelsUnhealthyByIds(String ids);

    /**
     * 删除青海省银行业金融机构贷款五级分类不良情况信息
     * 
     * @param id 青海省银行业金融机构贷款五级分类不良情况ID
     * @return 结果
     */
    public int deleteCbrcLoanFiveLevelsUnhealthyById(Long id);
}
