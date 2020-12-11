package com.psbc.datashare.cbrc.service;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsDetail;

import java.util.List;

/**
 * 青海省银行业金融机构贷款五级分类明细Service接口
 * 
 * @author mql
 * @date 2020-12-11
 */
public interface ICbrcLoanFiveLevelsDetailService 
{
    /**
     * 查询青海省银行业金融机构贷款五级分类明细
     * 
     * @param id 青海省银行业金融机构贷款五级分类明细ID
     * @return 青海省银行业金融机构贷款五级分类明细
     */
    public CbrcLoanFiveLevelsDetail selectCbrcLoanFiveLevelsDetailById(Long id);

    /**
     * 查询青海省银行业金融机构贷款五级分类明细列表
     * 
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 青海省银行业金融机构贷款五级分类明细集合
     */
    public List<CbrcLoanFiveLevelsDetail> selectCbrcLoanFiveLevelsDetailList(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail);

    /**
     * 新增青海省银行业金融机构贷款五级分类明细
     * 
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 结果
     */
    public int insertCbrcLoanFiveLevelsDetail(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail);

    /**
     * 修改青海省银行业金融机构贷款五级分类明细
     * 
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 结果
     */
    public int updateCbrcLoanFiveLevelsDetail(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail);

    /**
     * 批量删除青海省银行业金融机构贷款五级分类明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCbrcLoanFiveLevelsDetailByIds(String ids);

    /**
     * 删除青海省银行业金融机构贷款五级分类明细信息
     * 
     * @param id 青海省银行业金融机构贷款五级分类明细ID
     * @return 结果
     */
    public int deleteCbrcLoanFiveLevelsDetailById(Long id);
}
