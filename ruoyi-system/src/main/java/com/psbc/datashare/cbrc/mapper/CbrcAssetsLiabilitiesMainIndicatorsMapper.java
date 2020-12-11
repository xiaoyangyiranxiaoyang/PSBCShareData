package com.psbc.datashare.cbrc.mapper;

import java.util.Date;
import java.util.List;
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMainIndicators;
import com.psbc.datashare.cbrc.domain.CbrcMajorRegulatoryIndicators;

/**
 * 金融机构资产负债主要指标Mapper接口
 * 
 * @author mql
 * @date 2020-12-09
 */
public interface CbrcAssetsLiabilitiesMainIndicatorsMapper
{
    /**
     * 查询金融机构资产负债主要指标
     * 
     * @param id 金融机构资产负债主要指标ID
     * @return 金融机构资产负债主要指标
     */
    CbrcAssetsLiabilitiesMainIndicators selectCbrcAssetsLiabilitiesMainIndicatorsById(Long id);

    /**
     * 查询金融机构资产负债主要指标列表
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 金融机构资产负债主要指标集合
     */
    List<CbrcAssetsLiabilitiesMainIndicators> selectCbrcAssetsLiabilitiesMainIndicatorsList(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators);

    /**
     * 新增金融机构资产负债主要指标
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 结果
     */
    int insertCbrcAssetsLiabilitiesMainIndicators(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators);

    /**
     * 修改金融机构资产负债主要指标
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 结果
     */
    int updateCbrcAssetsLiabilitiesMainIndicators(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators);

    /**
     * 删除金融机构资产负债主要指标
     * 
     * @param id 金融机构资产负债主要指标ID
     * @return 结果
     */
    int deleteCbrcAssetsLiabilitiesMainIndicatorsById(Long id);

    /**
     * 批量删除金融机构资产负债主要指标
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcAssetsLiabilitiesMainIndicatorsByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<CbrcAssetsLiabilitiesMainIndicators> selectByDataDate(Date dataDate);


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
    int insertBatch(List<CbrcAssetsLiabilitiesMainIndicators> list);
}
