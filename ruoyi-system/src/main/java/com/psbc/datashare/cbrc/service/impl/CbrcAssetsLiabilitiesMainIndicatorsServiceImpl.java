package com.psbc.datashare.cbrc.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.cbrc.mapper.CbrcAssetsLiabilitiesMainIndicatorsMapper;
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMainIndicators;
import com.psbc.datashare.cbrc.service.ICbrcAssetsLiabilitiesMainIndicatorsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 金融机构资产负债主要指标Service业务层处理
 * 
 * @author mql
 * @date 2020-12-09
 */
@Service
public class CbrcAssetsLiabilitiesMainIndicatorsServiceImpl implements ICbrcAssetsLiabilitiesMainIndicatorsService 
{
    @Autowired
    private CbrcAssetsLiabilitiesMainIndicatorsMapper cbrcAssetsLiabilitiesMainIndicatorsMapper;

    /**
     * 查询金融机构资产负债主要指标
     * 
     * @param id 金融机构资产负债主要指标ID
     * @return 金融机构资产负债主要指标
     */
    @Override
    public CbrcAssetsLiabilitiesMainIndicators selectCbrcAssetsLiabilitiesMainIndicatorsById(Long id)
    {
        return cbrcAssetsLiabilitiesMainIndicatorsMapper.selectCbrcAssetsLiabilitiesMainIndicatorsById(id);
    }

    /**
     * 查询金融机构资产负债主要指标列表
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 金融机构资产负债主要指标
     */
    @Override
    public List<CbrcAssetsLiabilitiesMainIndicators> selectCbrcAssetsLiabilitiesMainIndicatorsList(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators)
    {
        return cbrcAssetsLiabilitiesMainIndicatorsMapper.selectCbrcAssetsLiabilitiesMainIndicatorsList(cbrcAssetsLiabilitiesMainIndicators);
    }

    /**
     * 新增金融机构资产负债主要指标
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 结果
     */
    @Override
    public int insertCbrcAssetsLiabilitiesMainIndicators(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators)
    {
        cbrcAssetsLiabilitiesMainIndicators.setCreateTime(DateUtils.getNowDate());
        return cbrcAssetsLiabilitiesMainIndicatorsMapper.insertCbrcAssetsLiabilitiesMainIndicators(cbrcAssetsLiabilitiesMainIndicators);
    }

    /**
     * 修改金融机构资产负债主要指标
     * 
     * @param cbrcAssetsLiabilitiesMainIndicators 金融机构资产负债主要指标
     * @return 结果
     */
    @Override
    public int updateCbrcAssetsLiabilitiesMainIndicators(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators)
    {
        cbrcAssetsLiabilitiesMainIndicators.setUpdateTime(DateUtils.getNowDate());
        return cbrcAssetsLiabilitiesMainIndicatorsMapper.updateCbrcAssetsLiabilitiesMainIndicators(cbrcAssetsLiabilitiesMainIndicators);
    }

    /**
     * 删除金融机构资产负债主要指标对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCbrcAssetsLiabilitiesMainIndicatorsByIds(String ids)
    {
        return cbrcAssetsLiabilitiesMainIndicatorsMapper.deleteCbrcAssetsLiabilitiesMainIndicatorsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除金融机构资产负债主要指标信息
     * 
     * @param id 金融机构资产负债主要指标ID
     * @return 结果
     */
    @Override
    public int deleteCbrcAssetsLiabilitiesMainIndicatorsById(Long id)
    {
        return cbrcAssetsLiabilitiesMainIndicatorsMapper.deleteCbrcAssetsLiabilitiesMainIndicatorsById(id);
    }
}
