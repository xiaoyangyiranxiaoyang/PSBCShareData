package com.psbc.datashare.cbrc.mapper;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsUnhealthy;

import java.util.Date;
import java.util.List;

/**
 * 青海省银行业金融机构贷款五级分类不良情况Mapper接口
 *
 * @author mql
 * @date 2020-12-11
 */
public interface CbrcLoanFiveLevelsUnhealthyMapper {
    /**
     * 查询青海省银行业金融机构贷款五级分类不良情况
     *
     * @param id 青海省银行业金融机构贷款五级分类不良情况ID
     * @return 青海省银行业金融机构贷款五级分类不良情况
     */
    CbrcLoanFiveLevelsUnhealthy selectCbrcLoanFiveLevelsUnhealthyById(Long id);

    /**
     * 查询青海省银行业金融机构贷款五级分类不良情况列表
     *
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 青海省银行业金融机构贷款五级分类不良情况集合
     */
    List<CbrcLoanFiveLevelsUnhealthy> selectCbrcLoanFiveLevelsUnhealthyList(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy);

    /**
     * 新增青海省银行业金融机构贷款五级分类不良情况
     *
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 结果
     */
    int insertCbrcLoanFiveLevelsUnhealthy(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy);

    /**
     * 修改青海省银行业金融机构贷款五级分类不良情况
     *
     * @param cbrcLoanFiveLevelsUnhealthy 青海省银行业金融机构贷款五级分类不良情况
     * @return 结果
     */
    int updateCbrcLoanFiveLevelsUnhealthy(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy);

    /**
     * 删除青海省银行业金融机构贷款五级分类不良情况
     *
     * @param id 青海省银行业金融机构贷款五级分类不良情况ID
     * @return 结果
     */
    int deleteCbrcLoanFiveLevelsUnhealthyById(Long id);

    /**
     * 批量删除青海省银行业金融机构贷款五级分类不良情况
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcLoanFiveLevelsUnhealthyByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<CbrcLoanFiveLevelsUnhealthy> selectByDataDate(Date dataDate);


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
    int insertBatch(List<CbrcLoanFiveLevelsUnhealthy> list);
}
