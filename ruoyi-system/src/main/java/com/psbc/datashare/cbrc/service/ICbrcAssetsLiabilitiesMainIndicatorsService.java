package com.psbc.datashare.cbrc.service;

import java.util.List;
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMainIndicators;

/**
 * 金融机构资产负债主要指标Service接口
 * 
 * @author mql
 * @date 2020-12-09
 */
public interface ICbrcAssetsLiabilitiesMainIndicatorsService 
{
    /**
     * 查询金融机构资产负债主要指标
     * 
     * @param id 金融机构资产负债主要指标ID
     * @return 金融机构资产负债主要指标
     */
    public CbrcAssetsLiabilitiesMainIndicators selectCbrcAssetsLiabilitiesMainIndicatorsById(Long id);

    /**
     * 查询金融机构资产负债主要指标列表
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 金融机构资产负债主要指标集合
     */
    public List<CbrcAssetsLiabilitiesMainIndicators> selectCbrcAssetsLiabilitiesMainIndicatorsList(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators);

    /**
     * 新增金融机构资产负债主要指标
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 结果
     */
    public int insertCbrcAssetsLiabilitiesMainIndicators(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators);

    /**
     * 修改金融机构资产负债主要指标
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 结果
     */
    public int updateCbrcAssetsLiabilitiesMainIndicators(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators);

    /**
     * 批量删除金融机构资产负债主要指标
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCbrcAssetsLiabilitiesMainIndicatorsByIds(String ids);

    /**
     * 删除金融机构资产负债主要指标信息
     * 
     * @param id 金融机构资产负债主要指标ID
     * @return 结果
     */
    public int deleteCbrcAssetsLiabilitiesMainIndicatorsById(Long id);
}
