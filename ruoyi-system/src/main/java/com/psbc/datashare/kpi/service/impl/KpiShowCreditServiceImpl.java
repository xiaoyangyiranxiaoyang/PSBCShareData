package com.psbc.datashare.kpi.service.impl;

import com.psbc.datashare.kpi.domain.KpiIncomeShow;
import com.psbc.datashare.kpi.domain.KpiShowCredit;
import com.psbc.datashare.kpi.domain.KpiSourceCreditScale;
import com.psbc.datashare.kpi.mapper.*;
import com.psbc.datashare.kpi.service.IKpiShowCreditService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 全行KPI指标（二）Service业务层处理
 *
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiShowCreditServiceImpl implements IKpiShowCreditService {
    @Autowired
    private KpiShowCreditMapper kpiShowCreditMapper;
    @Autowired
    private KpiSourceCreditScaleMapper kpiSourceCreditScaleMapper;
    @Autowired
    private KpiSourceUnhealthyMapper kpiSourceUnhealthyMapper;
    @Autowired
    private KpiSourceOverdueMapper kpiSourceOverdueMapper;
    @Autowired
    private KpiSourceOriginalDataMapper kpiSourceOriginalDataMapper;
    @Autowired
    private KpiSourceSavingDataMapper kpiSourceSavingDataMapper;

    /**
     * 查询全行KPI指标（二）
     *
     * @param id 全行KPI指标（二）ID
     * @return 全行KPI指标（二）
     */
    @Override
    public KpiShowCredit selectKpiShowCreditById(Long id) {
        return kpiShowCreditMapper.selectKpiShowCreditById(id);
    }

    /**
     * 查询全行KPI指标（二）列表
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 全行KPI指标（二）
     */
    @Override
    public List<KpiShowCredit> selectKpiShowCreditList(KpiShowCredit kpiShowCredit) {
        return kpiShowCreditMapper.selectKpiShowCreditList(kpiShowCredit);
    }

    /**
     * 新增全行KPI指标（二）
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    @Override
    public int insertKpiShowCredit(KpiShowCredit kpiShowCredit) {
        kpiShowCredit.setCreateTime(DateUtils.getNowDate());
        return kpiShowCreditMapper.insertKpiShowCredit(kpiShowCredit);
    }

    /**
     * 修改全行KPI指标（二）
     *
     * @param kpiShowCredit 全行KPI指标（二）
     * @return 结果
     */
    @Override
    public int updateKpiShowCredit(KpiShowCredit kpiShowCredit) {
        kpiShowCredit.setUpdateTime(DateUtils.getNowDate());
        return kpiShowCreditMapper.updateKpiShowCredit(kpiShowCredit);
    }

    /**
     * 删除全行KPI指标（二）对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowCreditByIds(String ids) {
        return kpiShowCreditMapper.deleteKpiShowCreditByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除全行KPI指标（二）信息
     *
     * @param id 全行KPI指标（二）ID
     * @return 结果
     */
    @Override
    public int deleteKpiShowCreditById(Long id) {
        return kpiShowCreditMapper.deleteKpiShowCreditById(id);
    }

    @Override
    public String importKpiIncomeShow(InputStream is, String dataMonth, String operName) {
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


            Map<Integer, Map<Integer, Object>> excelDataMap_creditScale = allSheetDataMap.get("信贷规模日报表");
            Map<Integer, Map<Integer, Object>> excelDataMap_unhealthy = allSheetDataMap.get("不良");
            Map<Integer, Map<Integer, Object>> excelDataMap_overdue = allSheetDataMap.get("逾期");
            Map<Integer, Map<Integer, Object>> excelDataMap_originalData = allSheetDataMap.get("数据原表");
            Map<Integer, Map<Integer, Object>> excelDataMap_savingData = allSheetDataMap.get("代理储蓄数据");

            /**
             * 数据提取入库
             */

            // 1. 信贷规模日报表
            List<KpiSourceCreditScale> datasToInsert_creditScale = new LinkedList<>();
            // 获取7~21行，1~26列数据并组装入库
            for (int rowNum = 7; rowNum <= 21; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_creditScale.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    KpiSourceCreditScale one = new KpiSourceCreditScale();
                    // 地区
                    String district = Convert.toStr(columnDataMap.get(1));
                    district = district.replaceAll("\\s*", "");
                    one.setDistrict(district); // 替换空白字符（空格、制表符、换页符等）
                    // 个人贷款
                    one.setMicroloans(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setIndividualBusiness(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setHomeMortgage(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setOtherConsumer(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setPersonalOther(Convert.toBigDecimal(columnDataMap.get(6)));
                    // 公司贷款
                    one.setSmallBusiness(Convert.toBigDecimal(columnDataMap.get(7)));
                    one.setSupplyChain(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setDomesticTradeFinance(Convert.toBigDecimal(columnDataMap.get(9)));
                    one.setInternationalTradeFinance(Convert.toBigDecimal(columnDataMap.get(10)));
                    one.setOtherCompany(Convert.toBigDecimal(columnDataMap.get(11)));
                    one.setDedicatedFinancing(Convert.toBigDecimal(columnDataMap.get(12)));
                    one.setSmallBusinessFactoring(Convert.toBigDecimal(columnDataMap.get(13)));
                    one.setCorporateOther(Convert.toBigDecimal(columnDataMap.get(14)));
                    one.setCorporationOverdraft(Convert.toBigDecimal(columnDataMap.get(15)));
                    one.setThreeFarmersCompany(Convert.toBigDecimal(columnDataMap.get(16)));
                    one.setInternationalCompany(Convert.toBigDecimal(columnDataMap.get(17)));
                    one.setMergersAcquisitions(Convert.toBigDecimal(columnDataMap.get(18)));
                    one.setVariousAdvances(Convert.toBigDecimal(columnDataMap.get(19)));
                    // 票据
                    one.setRediscount(Convert.toBigDecimal(columnDataMap.get(20)));
                    one.setDirectPaste(Convert.toBigDecimal(columnDataMap.get(21)));
                    // 透支
                    one.setPersonalOverdraft(Convert.toBigDecimal(columnDataMap.get(22)));
                    one.setUnitOverdraft(Convert.toBigDecimal(columnDataMap.get(23)));
                    // 国际
                    one.setForeignCurrency(Convert.toBigDecimal(columnDataMap.get(24)));
                    one.setBuyForfeitingRmb(Convert.toBigDecimal(columnDataMap.get(25)));
                    one.setBuyForfeitingForeign(Convert.toBigDecimal(columnDataMap.get(26)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_creditScale.add(one);
                }
            }
            if (!datasToInsert_creditScale.isEmpty()) {
                // 先删除当月数据
                List<KpiSourceCreditScale> kpiIncomeShows = kpiSourceCreditScaleMapper.selectByDataDate(dataDate);
                if (kpiIncomeShows != null && !kpiIncomeShows.isEmpty()) {
                    kpiSourceCreditScaleMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                kpiSourceCreditScaleMapper.insertBatch(datasToInsert_creditScale);
            }
            rrMsg = "导入数据成功!";
        } catch (Exception e) {
            throw new BusinessException("导入数据失败", e);
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
