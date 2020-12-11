package com.psbc.datashare.cbrc.service;

import java.io.InputStream;
import java.util.List;

import com.psbc.datashare.cbrc.domain.CbrcMajorRegulatoryIndicators;

/**
 * 主要监管指标汇总Service接口
 *
 * @author mql
 * @date 2020-12-09
 */
public interface ICbrcMajorRegulatoryIndicatorsService {
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
     * 批量删除主要监管指标汇总
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteCbrcMajorRegulatoryIndicatorsByIds(String ids);

    /**
     * 删除主要监管指标汇总信息
     *
     * @param id 主要监管指标汇总ID
     * @return 结果
     */
    int deleteCbrcMajorRegulatoryIndicatorsById(Long id);

    /**
     * 导入 银监局共享数据
     *
     * @param is        文件输入流对象
     * @param dataMonth 数据时间(月)
     * @param operName  操作用户
     * @return
     */
    String importKpiSourceData(InputStream is, String dataMonth, String operName);
}
