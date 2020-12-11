package com.psbc.datashare.cbrc.mapper;

import java.util.Date;
import java.util.List;
import com.psbc.datashare.cbrc.domain.CbrcMajorRegulatoryIndicators;
import com.psbc.datashare.kpi.domain.KpiShowCredit;

/**
 * 主要监管指标汇总Mapper接口
 * 
 * @author mql
 * @date 2020-12-09
 */
public interface CbrcMajorRegulatoryIndicatorsMapper
{
    /**
     * 查询主要监管指标汇总
     * 
     * @param id 主要监管指标汇总ID
     * @return 主要监管指标汇总
     */
    CbrcMajorRegulatoryIndicators selectCbrcMajorRegulatoryIndicatorsById(Long id);

    /**
     * 查询主要监管指标汇总列表
     * 
     * @param cbrcMajorRegulatoryIndicators 主要监管指标汇总
     * @return 主要监管指标汇总集合
     */
    List<CbrcMajorRegulatoryIndicators> selectCbrcMajorRegulatoryIndicatorsList(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators);

    /**
     * 新增主要监管指标汇总
     * 
     * @param cbrcMajorRegulatoryIndicators 主要监管指标汇总
     * @return 结果
     */
    int insertCbrcMajorRegulatoryIndicators(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators);

    /**
     * 修改主要监管指标汇总
     * 
     * @param cbrcMajorRegulatoryIndicators 主要监管指标汇总
     * @return 结果
     */
    int updateCbrcMajorRegulatoryIndicators(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators);

    /**
     * 删除主要监管指标汇总
     * 
     * @param id 主要监管指标汇总ID
     * @return 结果
     */
    int deleteCbrcMajorRegulatoryIndicatorsById(Long id);

    /**
     * 批量删除主要监管指标汇总
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcMajorRegulatoryIndicatorsByIds(String[] ids);

    /**
     * 查询
     *
     * @param dataDate 数据日期
     * @return 全行KPI指标（一）
     */
    List<CbrcMajorRegulatoryIndicators> selectByDataDate(Date dataDate);


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
    int insertBatch(List<CbrcMajorRegulatoryIndicators> list);
}
