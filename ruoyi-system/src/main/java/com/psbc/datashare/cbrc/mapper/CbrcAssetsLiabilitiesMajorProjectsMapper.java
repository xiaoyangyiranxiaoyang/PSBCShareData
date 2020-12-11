package com.psbc.datashare.cbrc.mapper;

import java.util.Date;
import java.util.List;
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMajorProjects;

/**
 * 银行业机构资产负债主要项目统计Mapper接口
 * 
 * @author mql
 * @date 2020-12-09
 */
public interface CbrcAssetsLiabilitiesMajorProjectsMapper
{
    /**
     * 查询银行业机构资产负债主要项目统计
     * 
     * @param id 银行业机构资产负债主要项目统计ID
     * @return 银行业机构资产负债主要项目统计
     */
    CbrcAssetsLiabilitiesMajorProjects selectCbrcAssetsLiabilitiesMajorProjectsById(Long id);

    /**
     * 查询银行业机构资产负债主要项目统计列表
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 银行业机构资产负债主要项目统计集合
     */
    List<CbrcAssetsLiabilitiesMajorProjects> selectCbrcAssetsLiabilitiesMajorProjectsList(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects);

    /**
     * 新增银行业机构资产负债主要项目统计
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 结果
     */
    int insertCbrcAssetsLiabilitiesMajorProjects(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects);

    /**
     * 修改银行业机构资产负债主要项目统计
     * 
     * @param cbrcAssetsLiabilitiesMajorProjects 银行业机构资产负债主要项目统计
     * @return 结果
     */
    int updateCbrcAssetsLiabilitiesMajorProjects(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects);

    /**
     * 删除银行业机构资产负债主要项目统计
     * 
     * @param id 银行业机构资产负债主要项目统计ID
     * @return 结果
     */
    int deleteCbrcAssetsLiabilitiesMajorProjectsById(Long id);

    /**
     * 批量删除银行业机构资产负债主要项目统计
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcAssetsLiabilitiesMajorProjectsByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<CbrcAssetsLiabilitiesMajorProjects> selectByDataDate(Date dataDate);


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
    int insertBatch(List<CbrcAssetsLiabilitiesMajorProjects> list);
}
