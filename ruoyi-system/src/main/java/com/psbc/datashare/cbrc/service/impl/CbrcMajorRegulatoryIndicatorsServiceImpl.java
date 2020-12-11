package com.psbc.datashare.cbrc.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.psbc.datashare.cbrc.common.CbrcConstant;
import com.psbc.datashare.cbrc.domain.*;
import com.psbc.datashare.cbrc.mapper.*;
import com.psbc.datashare.kpi.domain.KpiIncomeShow;
import com.psbc.datashare.kpi.domain.KpiSourceCreditScale;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.cbrc.service.ICbrcMajorRegulatoryIndicatorsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 主要监管指标汇总Service业务层处理
 *
 * @author mql
 * @date 2020-12-09
 */
@Service
public class CbrcMajorRegulatoryIndicatorsServiceImpl implements ICbrcMajorRegulatoryIndicatorsService {
    @Autowired
    private CbrcMajorRegulatoryIndicatorsMapper cbrcMajorRegulatoryIndicatorsMapper;
    @Autowired
    private CbrcAssetsLiabilitiesMajorProjectsMapper cbrcAssetsLiabilitiesMajorProjectsMapper;
    @Autowired
    private CbrcAssetsLiabilitiesMainIndicatorsMapper cbrcAssetsLiabilitiesMainIndicatorsMapper;
    @Autowired
    private CbrcDepositLoanInstitutionMapper cbrcDepositLoanInstitutionMapper;
    @Autowired
    private CbrcDepositLoanMonthlyDailyAvgMapper cbrcDepositLoanMonthlyDailyAvgMapper;
    @Autowired
    private CbrcLoanFiveLevelsUnhealthyMapper cbrcLoanFiveLevelsUnhealthyMapper;
    @Autowired
    private CbrcLoanFiveLevelsDetailMapper cbrcLoanFiveLevelsDetailMapper;

    /**
     * 查询主要监管指标汇总
     *
     * @param id 主要监管指标汇总ID
     * @return 主要监管指标汇总
     */
    @Override
    public CbrcMajorRegulatoryIndicators selectCbrcMajorRegulatoryIndicatorsById(Long id) {
        return cbrcMajorRegulatoryIndicatorsMapper.selectCbrcMajorRegulatoryIndicatorsById(id);
    }

    /**
     * 查询主要监管指标汇总列表
     *
     * @param cbrcMajorRegulatoryIndicators 主要监管指标汇总
     * @return 主要监管指标汇总
     */
    @Override
    public List<CbrcMajorRegulatoryIndicators> selectCbrcMajorRegulatoryIndicatorsList(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators) {
        return cbrcMajorRegulatoryIndicatorsMapper.selectCbrcMajorRegulatoryIndicatorsList(cbrcMajorRegulatoryIndicators);
    }

    /**
     * 新增主要监管指标汇总
     *
     * @param cbrcMajorRegulatoryIndicators 主要监管指标汇总
     * @return 结果
     */
    @Override
    public int insertCbrcMajorRegulatoryIndicators(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators) {
        cbrcMajorRegulatoryIndicators.setCreateTime(DateUtils.getNowDate());
        return cbrcMajorRegulatoryIndicatorsMapper.insertCbrcMajorRegulatoryIndicators(cbrcMajorRegulatoryIndicators);
    }

    /**
     * 修改主要监管指标汇总
     *
     * @param cbrcMajorRegulatoryIndicators 主要监管指标汇总
     * @return 结果
     */
    @Override
    public int updateCbrcMajorRegulatoryIndicators(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators) {
        cbrcMajorRegulatoryIndicators.setUpdateTime(DateUtils.getNowDate());
        return cbrcMajorRegulatoryIndicatorsMapper.updateCbrcMajorRegulatoryIndicators(cbrcMajorRegulatoryIndicators);
    }

    /**
     * 删除主要监管指标汇总对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCbrcMajorRegulatoryIndicatorsByIds(String ids) {
        return cbrcMajorRegulatoryIndicatorsMapper.deleteCbrcMajorRegulatoryIndicatorsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除主要监管指标汇总信息
     *
     * @param id 主要监管指标汇总ID
     * @return 结果
     */
    @Override
    public int deleteCbrcMajorRegulatoryIndicatorsById(Long id) {
        return cbrcMajorRegulatoryIndicatorsMapper.deleteCbrcMajorRegulatoryIndicatorsById(id);
    }

    @Override
    public String importKpiSourceData(InputStream is, String dataMonth, String operName) {
        String rrMsg = "导入数据失败";
        try {
            String dataDateStr = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM")) + "-01";
            if (StringUtils.isNotBlank(dataMonth)) {
                dataDateStr = dataMonth + "-01";
            }

            Date dateNow = new Date();
            Date dataDate = DateUtils.dateTime("yyyy-MM-dd", dataDateStr);

            ExcelUtil excelUtil = new ExcelUtil(KpiIncomeShow.class);
            Map<String, Map<Integer, Map<Integer, Object>>> allSheetDataMap = excelUtil.readExcelWithRowForAllSheet(is);


            Map<Integer, Map<Integer, Object>> excelDataMap_majorRegulatoryIndicators = allSheetDataMap.get("青海主要监管指标汇总");
            if (null == excelDataMap_majorRegulatoryIndicators) {
                rrMsg = "导入数据失败，无法获取“青海主要监管指标汇总”数据！";
                new RuntimeException(rrMsg);
            }
            Map<Integer, Map<Integer, Object>> excelDataMap_assetsLiabilitiesMajorProjects = allSheetDataMap.get("青海银行业机构资产负债主要项目统计月表");
            if (null == excelDataMap_assetsLiabilitiesMajorProjects) {
                rrMsg = "导入数据失败，无法获取“青海银行业机构资产负债主要项目统计月表”数据！";
                new RuntimeException(rrMsg);
            }
            Map<Integer, Map<Integer, Object>> excelDataMap_assetsLiabilitiesMajorIndicator = allSheetDataMap.get("青海省银行业金融机构资产负债主要指标");
            if (null == excelDataMap_assetsLiabilitiesMajorIndicator) {
                rrMsg = "导入数据失败，无法获取“青海省银行业金融机构资产负债主要指标”数据！";
                new RuntimeException(rrMsg);
            }
            Map<Integer, Map<Integer, Object>> excelDataMap_depositLoanInstitution = allSheetDataMap.get("青海省银行业金融机构存贷款分机构情况表");
            if (null == excelDataMap_assetsLiabilitiesMajorIndicator) {
                rrMsg = "导入数据失败，无法获取“青海省银行业金融机构存贷款分机构情况表”数据！";
                new RuntimeException(rrMsg);
            }
            Map<Integer, Map<Integer, Object>> excelDataMap_depositLoanMDavg = allSheetDataMap.get("青海省分机构存贷款月日均情况表");
            if (null == excelDataMap_assetsLiabilitiesMajorIndicator) {
                rrMsg = "导入数据失败，无法获取“青海省分机构存贷款月日均情况表”数据！";
                new RuntimeException(rrMsg);
            }
            Map<Integer, Map<Integer, Object>> excelDataMap_fiveLevelsUnhealthy = allSheetDataMap.get("青海省银行业金融机构贷款五级分类不良情况表");
            if (null == excelDataMap_assetsLiabilitiesMajorIndicator) {
                rrMsg = "导入数据失败，无法获取“青海省银行业金融机构贷款五级分类不良情况表”数据！";
                new RuntimeException(rrMsg);
            }
            Map<Integer, Map<Integer, Object>> excelDataMap_fiveLevelsDetail = allSheetDataMap.get("青海省银行业金融机构贷款五级分类明细表");
            if (null == excelDataMap_assetsLiabilitiesMajorIndicator) {
                rrMsg = "导入数据失败，无法获取“青海省银行业金融机构贷款五级分类明细表”数据！";
                new RuntimeException(rrMsg);
            }



            /**
             * 数据提取入库
             */

            // 1. 青海主要监管指标汇总
            List<CbrcMajorRegulatoryIndicators> datasToInsert_regulatoryIndicators = new LinkedList<>();
            // 获取3~23行，1~6列数据并组装入库
            for (int rowNum = 3; rowNum <= 23; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_majorRegulatoryIndicators.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    CbrcMajorRegulatoryIndicators one = new CbrcMajorRegulatoryIndicators();

                    one.setCategories(Convert.toStr(columnDataMap.get(1)));
                    one.setItem(Convert.toStr(columnDataMap.get(2)));
                    one.setRegulatoryStandards(Convert.toStr(columnDataMap.get(3), ""));
                    one.setCurrentIssue(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setCompareBeginYear(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setCompateLastYear(Convert.toBigDecimal(columnDataMap.get(6)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_regulatoryIndicators.add(one);
                }
            }
            if (!datasToInsert_regulatoryIndicators.isEmpty()) {
                // 先删除当月数据
                List<CbrcMajorRegulatoryIndicators> oldDatas = cbrcMajorRegulatoryIndicatorsMapper.selectByDataDate(dataDate);
                if (oldDatas != null && !oldDatas.isEmpty()) {
                    cbrcMajorRegulatoryIndicatorsMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                cbrcMajorRegulatoryIndicatorsMapper.insertBatch(datasToInsert_regulatoryIndicators);
            }

            // 2. 青海银行业机构资产负债主要项目统计月表
            List<CbrcAssetsLiabilitiesMajorProjects> datasToInsert_assetsLiabilitiesProjects = new LinkedList<>();
            // 获取3~28行，1~10列数据并组装入库
            for (int rowNum = 3; rowNum <= 28; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_assetsLiabilitiesMajorProjects.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {

                    // 资产
                    CbrcAssetsLiabilitiesMajorProjects one = new CbrcAssetsLiabilitiesMajorProjects();
                    one.setType(CbrcConstant.TYPE_ASSETS_PROJECTS);
                    one.setItem(Convert.toStr(columnDataMap.get(1)));
                    one.setCurrentIssue(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setCompareLastMonth(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setCompareBeginYear(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setCompateLastYearPct(Convert.toBigDecimal(columnDataMap.get(5)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_assetsLiabilitiesProjects.add(one);

                    // 负债及所有者权益
                    CbrcAssetsLiabilitiesMajorProjects two = new CbrcAssetsLiabilitiesMajorProjects();
                    two.setType(CbrcConstant.TYPE_LIABILITIES_PROJECTS);
                    two.setItem(Convert.toStr(columnDataMap.get(6)));
                    two.setCurrentIssue(Convert.toBigDecimal(columnDataMap.get(7)));
                    two.setCompareLastMonth(Convert.toBigDecimal(columnDataMap.get(8)));
                    two.setCompareBeginYear(Convert.toBigDecimal(columnDataMap.get(9)));
                    two.setCompateLastYearPct(Convert.toBigDecimal(columnDataMap.get(10)));

                    two.setDataDate(dataDate);
                    two.setDelFlag("0");
                    two.setCreateBy(operName);
                    two.setCreateTime(dateNow);

                    datasToInsert_assetsLiabilitiesProjects.add(two);
                }
            }
            if (!datasToInsert_assetsLiabilitiesProjects.isEmpty()) {
                // 先删除当月数据
                List<CbrcAssetsLiabilitiesMajorProjects> oldDatas = cbrcAssetsLiabilitiesMajorProjectsMapper.selectByDataDate(dataDate);
                if (oldDatas != null && !oldDatas.isEmpty()) {
                    cbrcAssetsLiabilitiesMajorProjectsMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                cbrcAssetsLiabilitiesMajorProjectsMapper.insertBatch(datasToInsert_assetsLiabilitiesProjects);
            }

            // 3. 青海省银行业金融机构资产负债主要指标
            List<CbrcAssetsLiabilitiesMainIndicators> datasToInsert_assetsLiabilitiesIndicator = new LinkedList<>();
            // 获取2~28行，1~9列数据并组装入库
            for (int rowNum = 2; rowNum <= 28; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_assetsLiabilitiesMajorIndicator.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    CbrcAssetsLiabilitiesMainIndicators one = new CbrcAssetsLiabilitiesMainIndicators();

                    one.setInstitution(Convert.toStr(columnDataMap.get(1)));
                    one.setAssetsTotal(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setAssetsCompateBeginYear(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setLiabilitiesTotal(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setLiabilitiesCompateBeginYear(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setOwnerEquity(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setEquityCompateBeginYear(Convert.toBigDecimal(columnDataMap.get(7)));
                    one.setProfitThisYear(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setProfitCompateLastYear(Convert.toBigDecimal(columnDataMap.get(9)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_assetsLiabilitiesIndicator.add(one);
                }
            }
            if (!datasToInsert_assetsLiabilitiesIndicator.isEmpty()) {
                // 先删除当月数据
                List<CbrcAssetsLiabilitiesMainIndicators> oldDatas = cbrcAssetsLiabilitiesMainIndicatorsMapper.selectByDataDate(dataDate);
                if (oldDatas != null && !oldDatas.isEmpty()) {
                    cbrcAssetsLiabilitiesMainIndicatorsMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                cbrcAssetsLiabilitiesMainIndicatorsMapper.insertBatch(datasToInsert_assetsLiabilitiesIndicator);
            }

            // 4. 青海省银行业金融机构存贷款分机构情况表
            List<CbrcDepositLoanInstitution> datasToInsert_depositLoanInstitution = new LinkedList<>();
            // 获取3~29行，1、3~8列数据并组装入库
            for (int rowNum = 3; rowNum <= 29; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_depositLoanInstitution.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    CbrcDepositLoanInstitution one = new CbrcDepositLoanInstitution();

                    one.setInstitution(Convert.toStr(columnDataMap.get(1)));
                    one.setDepositBalance(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setDepositGrowthM(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setDepositGrowthY(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setLoanBalance(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setLoanGrowthM(Convert.toBigDecimal(columnDataMap.get(7)));
                    one.setLoanGrowthY(Convert.toBigDecimal(columnDataMap.get(8)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_depositLoanInstitution.add(one);
                }
            }
            if (!datasToInsert_depositLoanInstitution.isEmpty()) {
                // 先删除当月数据
                List<CbrcDepositLoanInstitution> oldDatas = cbrcDepositLoanInstitutionMapper.selectByDataDate(dataDate);
                if (oldDatas != null && !oldDatas.isEmpty()) {
                    cbrcDepositLoanInstitutionMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                cbrcDepositLoanInstitutionMapper.insertBatch(datasToInsert_depositLoanInstitution);
            }


            // 5. 青海省分机构存贷款月日均情况表
            List<CbrcDepositLoanMonthlyDailyAvg> datasToInsert_depositLoanMDavg = new LinkedList<>();
            // 获取5~26行，1~13列数据并组装入库
            for (int rowNum = 5; rowNum <= 26; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_depositLoanMDavg.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    CbrcDepositLoanMonthlyDailyAvg one = new CbrcDepositLoanMonthlyDailyAvg();

                    one.setInstitution(Convert.toStr(columnDataMap.get(1)));

                    one.setLoanBalance(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setLoanGrowthM(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setLoanGrowthY(Convert.toBigDecimal(columnDataMap.get(4)));

                    one.setLoanAvgBalance(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setLoanAvgGrowthM(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setLoanAvgGrowthY(Convert.toBigDecimal(columnDataMap.get(7)));

                    one.setDepositBalance(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setDepositGrowthM(Convert.toBigDecimal(columnDataMap.get(9)));
                    one.setDepositGrowthY(Convert.toBigDecimal(columnDataMap.get(10)));

                    one.setDepositAvgBalance(Convert.toBigDecimal(columnDataMap.get(11)));
                    one.setDepositAvgGrowthM(Convert.toBigDecimal(columnDataMap.get(12)));
                    one.setDepositAvgGrowthY(Convert.toBigDecimal(columnDataMap.get(13)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_depositLoanMDavg.add(one);
                }
            }
            if (!datasToInsert_depositLoanMDavg.isEmpty()) {
                // 先删除当月数据
                List<CbrcDepositLoanMonthlyDailyAvg> oldDatas = cbrcDepositLoanMonthlyDailyAvgMapper.selectByDataDate(dataDate);
                if (oldDatas != null && !oldDatas.isEmpty()) {
                    cbrcDepositLoanMonthlyDailyAvgMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                cbrcDepositLoanMonthlyDailyAvgMapper.insertBatch(datasToInsert_depositLoanMDavg);
            }

            // 6. 青海省银行业金融机构贷款五级分类不良情况表
            List<CbrcLoanFiveLevelsUnhealthy> datasToInsert_fiveLevelsUnhealthy = new LinkedList<>();
            // 获取3~29行，1~7列数据并组装入库
            for (int rowNum = 3; rowNum <= 29; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_fiveLevelsUnhealthy.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    CbrcLoanFiveLevelsUnhealthy one = new CbrcLoanFiveLevelsUnhealthy();

                    one.setInstitution(Convert.toStr(columnDataMap.get(1)));

                    one.setLoanBalance(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setLoanGrowthY(Convert.toBigDecimal(columnDataMap.get(3)));

                    one.setLoanUnhealthyBalance(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setLoanUnhealthyGrowthY(Convert.toBigDecimal(columnDataMap.get(5)));

                    one.setLoanUnhealthyPct(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setLoanUnhealthyPctGrowthY(Convert.toBigDecimal(columnDataMap.get(7)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_fiveLevelsUnhealthy.add(one);
                }
            }
            if (!datasToInsert_fiveLevelsUnhealthy.isEmpty()) {
                // 先删除当月数据
                List<CbrcLoanFiveLevelsUnhealthy> oldDatas = cbrcLoanFiveLevelsUnhealthyMapper.selectByDataDate(dataDate);
                if (oldDatas != null && !oldDatas.isEmpty()) {
                    cbrcLoanFiveLevelsUnhealthyMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                cbrcLoanFiveLevelsUnhealthyMapper.insertBatch(datasToInsert_fiveLevelsUnhealthy);
            }

            // 7. 青海省银行业金融机构贷款五级分类明细表
            List<CbrcLoanFiveLevelsDetail> datasToInsert_fiveLevelsDetail = new LinkedList<>();
            // 获取 4~30 行，1~13 列数据并组装入库
            for (int rowNum = 4; rowNum <= 30; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_fiveLevelsDetail.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    CbrcLoanFiveLevelsDetail one = new CbrcLoanFiveLevelsDetail();

                    one.setInstitution(Convert.toStr(columnDataMap.get(1)));
                    one.setNormalBalance(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setNormalGrowthY(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setInterestBalance(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setInterestGrowthY(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setSecondaryBalance(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setSecondaryGrowthY(Convert.toBigDecimal(columnDataMap.get(7)));
                    one.setDoubtBalance(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setDoubtGrowthY(Convert.toBigDecimal(columnDataMap.get(9)));
                    one.setLossBalance(Convert.toBigDecimal(columnDataMap.get(10)));
                    one.setLossGrowthY(Convert.toBigDecimal(columnDataMap.get(11)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_fiveLevelsDetail.add(one);
                }
            }
            if (!datasToInsert_fiveLevelsDetail.isEmpty()) {
                // 先删除当月数据
                List<CbrcLoanFiveLevelsDetail> oldDatas = cbrcLoanFiveLevelsDetailMapper.selectByDataDate(dataDate);
                if (oldDatas != null && !oldDatas.isEmpty()) {
                    cbrcLoanFiveLevelsDetailMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                cbrcLoanFiveLevelsDetailMapper.insertBatch(datasToInsert_fiveLevelsDetail);
            }

        rrMsg = "数据导入成功!";
    } catch (Exception e) {
        throw new BusinessException(rrMsg, e);
    } finally {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
    }
        return rrMsg;
    }
}
