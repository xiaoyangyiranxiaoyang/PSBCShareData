package com.psbc.datashare.cbrc.mapper;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsDetail;

import java.util.Date;
import java.util.List;

/**
 * 青海省银行业金融机构贷款五级分类明细Mapper接口
 *
 * @author mql
 * @date 2020-12-11
 */
public interface CbrcLoanFiveLevelsDetailMapper {
    /**
     * 查询青海省银行业金融机构贷款五级分类明细
     *
     * @param id 青海省银行业金融机构贷款五级分类明细ID
     * @return 青海省银行业金融机构贷款五级分类明细
     */
    CbrcLoanFiveLevelsDetail selectCbrcLoanFiveLevelsDetailById(Long id);

    /**
     * 查询青海省银行业金融机构贷款五级分类明细列表
     *
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 青海省银行业金融机构贷款五级分类明细集合
     */
    List<CbrcLoanFiveLevelsDetail> selectCbrcLoanFiveLevelsDetailList(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail);

    /**
     * 新增青海省银行业金融机构贷款五级分类明细
     *
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 结果
     */
    int insertCbrcLoanFiveLevelsDetail(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail);

    /**
     * 修改青海省银行业金融机构贷款五级分类明细
     *
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 结果
     */
    int updateCbrcLoanFiveLevelsDetail(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail);

    /**
     * 删除青海省银行业金融机构贷款五级分类明细
     *
     * @param id 青海省银行业金融机构贷款五级分类明细ID
     * @return 结果
     */
    int deleteCbrcLoanFiveLevelsDetailById(Long id);

    /**
     * 批量删除青海省银行业金融机构贷款五级分类明细
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcLoanFiveLevelsDetailByIds(String[] ids);


    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<CbrcLoanFiveLevelsDetail> selectByDataDate(Date dataDate);


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
    int insertBatch(List<CbrcLoanFiveLevelsDetail> list);
}
