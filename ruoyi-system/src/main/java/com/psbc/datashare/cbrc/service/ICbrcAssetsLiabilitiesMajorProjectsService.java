package com.psbc.datashare.cbrc.service;

import java.util.List;
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMajorProjects;

/**
 * 银行业机构资产负债主要项目统计Service接口
 * 
 * @author mql
 * @date 2020-12-09
 */
public interface ICbrcAssetsLiabilitiesMajorProjectsService 
{
    /**
     * 查询银行业机构资产负债主要项目统计
     * 
     * @param id 银行业机构资产负债主要项目统计ID
     * @return 银行业机构资产负债主要项目统计
     */
    public CbrcAssetsLiabilitiesMajorProjects selectCbrcAssetsLiabilitiesMajorProjectsById(Long id);

    /**
     * 查询银行业机构资产负债主要项目统计列表
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 银行业机构资产负债主要项目统计集合
     */
    public List<CbrcAssetsLiabilitiesMajorProjects> selectCbrcAssetsLiabilitiesMajorProjectsList(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects);

    /**
     * 新增银行业机构资产负债主要项目统计
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 结果
     */
    public int insertCbrcAssetsLiabilitiesMajorProjects(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects);

    /**
     * 修改银行业机构资产负债主要项目统计
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 结果
     */
    public int updateCbrcAssetsLiabilitiesMajorProjects(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects);

    /**
     * 批量删除银行业机构资产负债主要项目统计
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCbrcAssetsLiabilitiesMajorProjectsByIds(String ids);

    /**
     * 删除银行业机构资产负债主要项目统计信息
     * 
     * @param id 银行业机构资产负债主要项目统计ID
     * @return 结果
     */
    public int deleteCbrcAssetsLiabilitiesMajorProjectsById(Long id);
}
