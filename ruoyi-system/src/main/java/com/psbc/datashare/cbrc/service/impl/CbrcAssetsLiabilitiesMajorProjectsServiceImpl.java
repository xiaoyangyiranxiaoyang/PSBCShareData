package com.psbc.datashare.cbrc.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.cbrc.mapper.CbrcAssetsLiabilitiesMajorProjectsMapper;
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMajorProjects;
import com.psbc.datashare.cbrc.service.ICbrcAssetsLiabilitiesMajorProjectsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 银行业机构资产负债主要项目统计Service业务层处理
 * 
 * @author mql
 * @date 2020-12-09
 */
@Service
public class CbrcAssetsLiabilitiesMajorProjectsServiceImpl implements ICbrcAssetsLiabilitiesMajorProjectsService 
{
    @Autowired
    private CbrcAssetsLiabilitiesMajorProjectsMapper cbrcAssetsLiabilitiesMajorProjectsMapper;

    /**
     * 查询银行业机构资产负债主要项目统计
     * 
     * @param id 银行业机构资产负债主要项目统计ID
     * @return 银行业机构资产负债主要项目统计
     */
    @Override
    public CbrcAssetsLiabilitiesMajorProjects selectCbrcAssetsLiabilitiesMajorProjectsById(Long id)
    {
        return cbrcAssetsLiabilitiesMajorProjectsMapper.selectCbrcAssetsLiabilitiesMajorProjectsById(id);
    }

    /**
     * 查询银行业机构资产负债主要项目统计列表
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 银行业机构资产负债主要项目统计
     */
    @Override
    public List<CbrcAssetsLiabilitiesMajorProjects> selectCbrcAssetsLiabilitiesMajorProjectsList(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects)
    {
        return cbrcAssetsLiabilitiesMajorProjectsMapper.selectCbrcAssetsLiabilitiesMajorProjectsList(cbrcAssetsLiabilitiesMajorProjects);
    }

    /**
     * 新增银行业机构资产负债主要项目统计
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 结果
     */
    @Override
    public int insertCbrcAssetsLiabilitiesMajorProjects(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects)
    {
        cbrcAssetsLiabilitiesMajorProjects.setCreateTime(DateUtils.getNowDate());
        return cbrcAssetsLiabilitiesMajorProjectsMapper.insertCbrcAssetsLiabilitiesMajorProjects(cbrcAssetsLiabilitiesMajorProjects);
    }

    /**
     * 修改银行业机构资产负债主要项目统计
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 结果
     */
    @Override
    public int updateCbrcAssetsLiabilitiesMajorProjects(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects)
    {
        cbrcAssetsLiabilitiesMajorProjects.setUpdateTime(DateUtils.getNowDate());
        return cbrcAssetsLiabilitiesMajorProjectsMapper.updateCbrcAssetsLiabilitiesMajorProjects(cbrcAssetsLiabilitiesMajorProjects);
    }

    /**
     * 删除银行业机构资产负债主要项目统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCbrcAssetsLiabilitiesMajorProjectsByIds(String ids)
    {
        return cbrcAssetsLiabilitiesMajorProjectsMapper.deleteCbrcAssetsLiabilitiesMajorProjectsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除银行业机构资产负债主要项目统计信息
     * 
     * @param id 银行业机构资产负债主要项目统计ID
     * @return 结果
     */
    @Override
    public int deleteCbrcAssetsLiabilitiesMajorProjectsById(Long id)
    {
        return cbrcAssetsLiabilitiesMajorProjectsMapper.deleteCbrcAssetsLiabilitiesMajorProjectsById(id);
    }
}
