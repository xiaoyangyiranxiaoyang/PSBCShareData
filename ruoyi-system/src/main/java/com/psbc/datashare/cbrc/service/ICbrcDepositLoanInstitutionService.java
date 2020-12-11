package com.psbc.datashare.cbrc.service;

import java.util.List;
import com.psbc.datashare.cbrc.domain.CbrcDepositLoanInstitution;

/**
 * 银行业金融机构存贷款分机构情况Service接口
 * 
 * @author mql
 * @date 2020-12-10
 */
public interface ICbrcDepositLoanInstitutionService 
{
    /**
     * 查询银行业金融机构存贷款分机构情况
     * 
     * @param id 银行业金融机构存贷款分机构情况ID
     * @return 银行业金融机构存贷款分机构情况
     */
    public CbrcDepositLoanInstitution selectCbrcDepositLoanInstitutionById(Long id);

    /**
     * 查询银行业金融机构存贷款分机构情况列表
     * 
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 银行业金融机构存贷款分机构情况集合
     */
    public List<CbrcDepositLoanInstitution> selectCbrcDepositLoanInstitutionList(CbrcDepositLoanInstitution cbrcDepositLoanInstitution);

    /**
     * 新增银行业金融机构存贷款分机构情况
     * 
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 结果
     */
    public int insertCbrcDepositLoanInstitution(CbrcDepositLoanInstitution cbrcDepositLoanInstitution);

    /**
     * 修改银行业金融机构存贷款分机构情况
     * 
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 结果
     */
    public int updateCbrcDepositLoanInstitution(CbrcDepositLoanInstitution cbrcDepositLoanInstitution);

    /**
     * 批量删除银行业金融机构存贷款分机构情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCbrcDepositLoanInstitutionByIds(String ids);

    /**
     * 删除银行业金融机构存贷款分机构情况信息
     * 
     * @param id 银行业金融机构存贷款分机构情况ID
     * @return 结果
     */
    public int deleteCbrcDepositLoanInstitutionById(Long id);
}
