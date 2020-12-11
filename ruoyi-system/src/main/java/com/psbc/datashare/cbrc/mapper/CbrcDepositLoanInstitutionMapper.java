package com.psbc.datashare.cbrc.mapper;

import com.psbc.datashare.cbrc.domain.CbrcDepositLoanInstitution;

import java.util.Date;
import java.util.List;

/**
 * 银行业金融机构存贷款分机构情况Mapper接口
 *
 * @author mql
 * @date 2020-12-10
 */
public interface CbrcDepositLoanInstitutionMapper {
    /**
     * 查询银行业金融机构存贷款分机构情况
     *
     * @param id 银行业金融机构存贷款分机构情况ID
     * @return 银行业金融机构存贷款分机构情况
     */
    CbrcDepositLoanInstitution selectCbrcDepositLoanInstitutionById(Long id);

    /**
     * 查询银行业金融机构存贷款分机构情况列表
     *
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 银行业金融机构存贷款分机构情况集合
     */
    List<CbrcDepositLoanInstitution> selectCbrcDepositLoanInstitutionList(CbrcDepositLoanInstitution cbrcDepositLoanInstitution);

    /**
     * 新增银行业金融机构存贷款分机构情况
     *
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 结果
     */
    int insertCbrcDepositLoanInstitution(CbrcDepositLoanInstitution cbrcDepositLoanInstitution);

    /**
     * 修改银行业金融机构存贷款分机构情况
     *
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 结果
     */
    int updateCbrcDepositLoanInstitution(CbrcDepositLoanInstitution cbrcDepositLoanInstitution);

    /**
     * 删除银行业金融机构存贷款分机构情况
     *
     * @param id 银行业金融机构存贷款分机构情况ID
     * @return 结果
     */
    int deleteCbrcDepositLoanInstitutionById(Long id);

    /**
     * 批量删除银行业金融机构存贷款分机构情况
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcDepositLoanInstitutionByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<CbrcDepositLoanInstitution> selectByDataDate(Date dataDate);


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
    int insertBatch(List<CbrcDepositLoanInstitution> list);
}
