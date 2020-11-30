package com.psbc.datashare.kpi.service.impl;

import com.psbc.datashare.kpi.common.KpiShowConstant;
import com.psbc.datashare.kpi.domain.*;
import com.psbc.datashare.kpi.mapper.*;
import com.psbc.datashare.kpi.service.IKpiShowCreditService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.Arith;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.sun.corba.se.impl.oa.toa.TOA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

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
    @Autowired
    private KpiShowAssetBusinessMapper kpiShowAssetBusinessMapper;
    @Autowired
    private KpiShowAssetBusinessScheduleMapper kpiShowAssetBusinessScheduleMapper;

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

    /**
     * KPI 源数据导入, 并执行当月数据计算入库到结果表
     *
     * @param is        文件输入流对象
     * @param dataMonth 数据时间(月)
     * @param operName  操作用户
     * @return
     */
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


            Map<Integer, Map<Integer, Object>> excelDataMap_creditScale = allSheetDataMap.get("信贷规模日报表");
            Map<Integer, Map<Integer, Object>> excelDataMap_unhealthy = allSheetDataMap.get("不良");
            Map<Integer, Map<Integer, Object>> excelDataMap_overdue = allSheetDataMap.get("逾期");
            Map<Integer, Map<Integer, Object>> excelDataMap_originalData = allSheetDataMap.get("数据原表");
            Map<Integer, Map<Integer, Object>> excelDataMap_savingData = allSheetDataMap.get("代理储蓄数据");

            if (null == excelDataMap_creditScale || null == excelDataMap_unhealthy ||
                    null == excelDataMap_overdue || null == excelDataMap_originalData || null == excelDataMap_savingData) {
                rrMsg = "导入数据失败，请查看是否按模板导入！";
                new RuntimeException(rrMsg);
            }

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

            // 2. 不良
            List<KpiSourceUnhealthy> datasToInsert_unhealthy = new LinkedList<>();
            // 获取 5~17 行，1~31 列数据并组装入库
            for (int rowNum = 5; rowNum <= 17; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_unhealthy.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    KpiSourceUnhealthy one = new KpiSourceUnhealthy();
                    // 地区
                    String district = Convert.toStr(columnDataMap.get(1));
                    district = district.replaceAll("\\s*", "");
                    one.setDistrict(district); // 替换空白字符（空格、制表符、换页符等）
                    // 个人经营性贷款
                    one.setPersonalBusinessBalance(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setPersonalBusinessBalanceLast(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setPersonalBusinessBalanceBy(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setPersonalBusinessRate(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setPersonalBusinessRateLast(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setPersonalBusinessRateBy(Convert.toBigDecimal(columnDataMap.get(7)));
                    // 个人消费贷款
                    one.setPersonalConsumerBalance(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setPersonalConsumerBalanceLast(Convert.toBigDecimal(columnDataMap.get(9)));
                    one.setPersonalConsumerBalanceBy(Convert.toBigDecimal(columnDataMap.get(10)));
                    one.setPersonalConsumerRate(Convert.toBigDecimal(columnDataMap.get(11)));
                    one.setPersonalConsumerRateLast(Convert.toBigDecimal(columnDataMap.get(12)));
                    one.setPersonalConsumerRateBy(Convert.toBigDecimal(columnDataMap.get(13)));
                    // 小企业贷款
                    one.setSmallBusinessBalance(Convert.toBigDecimal(columnDataMap.get(14)));
                    one.setSmallBusinessBalanceLast(Convert.toBigDecimal(columnDataMap.get(15)));
                    one.setSmallBusinessBalanceBy(Convert.toBigDecimal(columnDataMap.get(16)));
                    one.setSmallBusinessRate(Convert.toBigDecimal(columnDataMap.get(17)));
                    one.setSmallBusinessRateLast(Convert.toBigDecimal(columnDataMap.get(18)));
                    one.setSmallBusinessRateBy(Convert.toBigDecimal(columnDataMap.get(19)));
                    // 信用卡业务
                    one.setCreditCardBalance(Convert.toBigDecimal(columnDataMap.get(20)));
                    one.setCreditCardBalanceLast(Convert.toBigDecimal(columnDataMap.get(21)));
                    one.setCreditCardBalanceBy(Convert.toBigDecimal(columnDataMap.get(22)));
                    one.setCreditCardRate(Convert.toBigDecimal(columnDataMap.get(23)));
                    one.setCreditCardRateLast(Convert.toBigDecimal(columnDataMap.get(24)));
                    one.setCreditCardRateBy(Convert.toBigDecimal(columnDataMap.get(25)));
                    // 零售不良
                    one.setRetailBalance(Convert.toBigDecimal(columnDataMap.get(26)));
                    one.setRetailBalanceLast(Convert.toBigDecimal(columnDataMap.get(27)));
                    one.setRetailBalanceBy(Convert.toBigDecimal(columnDataMap.get(28)));
                    one.setRetailRate(Convert.toBigDecimal(columnDataMap.get(29)));
                    one.setRetailRateLast(Convert.toBigDecimal(columnDataMap.get(30)));
                    one.setRetailRateBy(Convert.toBigDecimal(columnDataMap.get(31)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_unhealthy.add(one);
                }
            }
            if (!datasToInsert_unhealthy.isEmpty()) {
                // 先删除当月数据
                List<KpiSourceUnhealthy> kpiIncomeShows = kpiSourceUnhealthyMapper.selectByDataDate(dataDate);
                if (kpiIncomeShows != null && !kpiIncomeShows.isEmpty()) {
                    kpiSourceUnhealthyMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                kpiSourceUnhealthyMapper.insertBatch(datasToInsert_unhealthy);
            }

            // 3. 逾期
            List<KpiSourceOverdue> datasToInsert_overdue = new LinkedList<>();
            // 获取 5~17 行，1~31 列数据并组装入库
            for (int rowNum = 5; rowNum <= 17; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_overdue.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    KpiSourceOverdue one = new KpiSourceOverdue();
                    // 地区
                    String district = Convert.toStr(columnDataMap.get(1));
                    district = district.replaceAll("\\s*", "");
                    one.setDistrict(district); // 替换空白字符（空格、制表符、换页符等）
                    // 个人经营性贷款
                    one.setPersonalBusinessBalance(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setPersonalBusinessBalanceLast(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setPersonalBusinessBalanceBy(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setPersonalBusinessRate(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setPersonalBusinessRateLast(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setPersonalBusinessRateBy(Convert.toBigDecimal(columnDataMap.get(7)));
                    // 个人消费贷款
                    one.setPersonalConsumerBalance(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setPersonalConsumerBalanceLast(Convert.toBigDecimal(columnDataMap.get(9)));
                    one.setPersonalConsumerBalanceBy(Convert.toBigDecimal(columnDataMap.get(10)));
                    one.setPersonalConsumerRate(Convert.toBigDecimal(columnDataMap.get(11)));
                    one.setPersonalConsumerRateLast(Convert.toBigDecimal(columnDataMap.get(12)));
                    one.setPersonalConsumerRateBy(Convert.toBigDecimal(columnDataMap.get(13)));
                    // 小企业贷款
                    one.setSmallBusinessBalance(Convert.toBigDecimal(columnDataMap.get(14)));
                    one.setSmallBusinessBalanceLast(Convert.toBigDecimal(columnDataMap.get(15)));
                    one.setSmallBusinessBalanceBy(Convert.toBigDecimal(columnDataMap.get(16)));
                    one.setSmallBusinessRate(Convert.toBigDecimal(columnDataMap.get(17)));
                    one.setSmallBusinessRateLast(Convert.toBigDecimal(columnDataMap.get(18)));
                    one.setSmallBusinessRateBy(Convert.toBigDecimal(columnDataMap.get(19)));
                    // 信用卡业务
                    one.setCreditCardBalance(Convert.toBigDecimal(columnDataMap.get(20)));
                    one.setCreditCardBalanceLast(Convert.toBigDecimal(columnDataMap.get(21)));
                    one.setCreditCardBalanceBy(Convert.toBigDecimal(columnDataMap.get(22)));
                    one.setCreditCardRate(Convert.toBigDecimal(columnDataMap.get(23)));
                    one.setCreditCardRateLast(Convert.toBigDecimal(columnDataMap.get(24)));
                    one.setCreditCardRateBy(Convert.toBigDecimal(columnDataMap.get(25)));
                    // 零售逾期
                    one.setRetailBalance(Convert.toBigDecimal(columnDataMap.get(26)));
                    one.setRetailBalanceLast(Convert.toBigDecimal(columnDataMap.get(27)));
                    one.setRetailBalanceBy(Convert.toBigDecimal(columnDataMap.get(28)));
                    one.setRetailRate(Convert.toBigDecimal(columnDataMap.get(29)));
                    one.setRetailRateLast(Convert.toBigDecimal(columnDataMap.get(30)));
                    one.setRetailRateBy(Convert.toBigDecimal(columnDataMap.get(31)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_overdue.add(one);
                }
            }
            if (!datasToInsert_overdue.isEmpty()) {
                // 先删除当月数据
                List<KpiSourceOverdue> kpiIncomeShows = kpiSourceOverdueMapper.selectByDataDate(dataDate);
                if (kpiIncomeShows != null && !kpiIncomeShows.isEmpty()) {
                    kpiSourceOverdueMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                kpiSourceOverdueMapper.insertBatch(datasToInsert_overdue);
            }

            // 4. 数据原表
            List<KpiSourceOriginalData> datasToInsert_originalData = new LinkedList<>();
            // 获取 4~82 行，2~18 列数据并组装入库
            for (int rowNum = 4; rowNum <= 82; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_originalData.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    KpiSourceOriginalData one = new KpiSourceOriginalData();
                    // 指标号
                    String indicatorNum = Convert.toStr(columnDataMap.get(2));
                    one.setIndicatorNum(indicatorNum.replaceAll("\\s*", ""));
                    // 指标名称
                    String indicatorName = Convert.toStr(columnDataMap.get(3));
                    one.setIndicatorName(indicatorName.replaceAll("\\s*", ""));

                    one.setQuanSheng(Convert.toBigDecimal(columnDataMap.get(4)));
                    one.setBenBu(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setJiGuan(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setChengXi(Convert.toBigDecimal(columnDataMap.get(7)));
                    one.setDaTong(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setHaiDong(Convert.toBigDecimal(columnDataMap.get(9)));
                    one.setChengZhong(Convert.toBigDecimal(columnDataMap.get(10)));
                    one.setHaiNan(Convert.toBigDecimal(columnDataMap.get(11)));
                    one.setYuShu(Convert.toBigDecimal(columnDataMap.get(12)));
                    one.setHaiXi(Convert.toBigDecimal(columnDataMap.get(13)));
                    one.setHaiBei(Convert.toBigDecimal(columnDataMap.get(14)));
                    one.setHuangNan(Convert.toBigDecimal(columnDataMap.get(15)));
                    one.setGuoLuo(Convert.toBigDecimal(columnDataMap.get(16)));
                    one.setGeErMu(Convert.toBigDecimal(columnDataMap.get(17)));
                    one.setYingYiBu(Convert.toBigDecimal(columnDataMap.get(18)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_originalData.add(one);
                }
            }
            if (!datasToInsert_originalData.isEmpty()) {
                // 先删除当月数据
                List<KpiSourceOriginalData> kpiIncomeShows = kpiSourceOriginalDataMapper.selectByDataDate(dataDate);
                if (kpiIncomeShows != null && !kpiIncomeShows.isEmpty()) {
                    kpiSourceOriginalDataMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                kpiSourceOriginalDataMapper.insertBatch(datasToInsert_originalData);
            }

            // 5. 代理储蓄数据
            List<KpiSourceSavingData> datasToInsert_savingData = new LinkedList<>();
            // 获取 6~18 行，1~16 列数据并组装入库
            for (int rowNum = 6; rowNum <= 18; rowNum++) {
                Map<Integer, Object> columnDataMap = excelDataMap_savingData.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()) {
                    KpiSourceSavingData one = new KpiSourceSavingData();
                    // 地区
                    String district = Convert.toStr(columnDataMap.get(1));
                    district = district.replaceAll("\\s*", "");
                    one.setDistrict(district); // 替换空白字符（空格、制表符、换页符等）
                    // 本日余额
                    one.setDailyBalance(Convert.toBigDecimal(columnDataMap.get(2)));
                    one.setDailyBalanceSelf(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setDailyBalanceAgent(Convert.toBigDecimal(columnDataMap.get(4)));
                    // 本日新增
                    one.setDailyIncrease(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setDailyIncreaseSelf(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setDailyIncreaseAgent(Convert.toBigDecimal(columnDataMap.get(7)));
                    // 本月新增
                    one.setMonthlyIncrease(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setMonthlyIncreaseSelf(Convert.toBigDecimal(columnDataMap.get(9)));
                    one.setMonthlyIncreaseAgent(Convert.toBigDecimal(columnDataMap.get(10)));
                    // 本年新增
                    one.setYearlyIncrease(Convert.toBigDecimal(columnDataMap.get(11)));
                    one.setYearlyIncreaseSelf(Convert.toBigDecimal(columnDataMap.get(12)));
                    one.setYearlyIncreaseAgent(Convert.toBigDecimal(columnDataMap.get(13)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert_savingData.add(one);
                }
            }
            if (!datasToInsert_savingData.isEmpty()) {
                // 先删除当月数据
                List<KpiSourceSavingData> kpiIncomeShows = kpiSourceSavingDataMapper.selectByDataDate(dataDate);
                if (kpiIncomeShows != null && !kpiIncomeShows.isEmpty()) {
                    kpiSourceSavingDataMapper.deleteByDataDate(dataDate);
                }
                // 导入当月的数据
                kpiSourceSavingDataMapper.insertBatch(datasToInsert_savingData);
            }

            // 6. 计算全行资产业务情况表-主表 并入库
            List<KpiShowAssetBusiness> assetBusinesses = calculateAssetBusinessMaster(dataDate, operName);
            kpiShowAssetBusinessMapper.deleteByDataDate(dataDate);
            kpiShowAssetBusinessMapper.insertBatch(assetBusinesses);

            // 7. 计算全行资产业务情况表-附表 并入库
            KpiShowAssetBusinessSchedule assetBusinessSchedule = calculateAssetBusnessSchedule(dataDate, operName);
            kpiShowAssetBusinessScheduleMapper.deleteByDataDate(dataDate);
            kpiShowAssetBusinessScheduleMapper.insertKpiShowAssetBusinessSchedule(assetBusinessSchedule);

            rrMsg = "导入数据成功!";
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


    /**
     * 计算 全行资产业务情况表 主表
     * @param dataDate
     * @param operName
     * @return
     */
    private List<KpiShowAssetBusiness> calculateAssetBusinessMaster(Date dataDate, String operName) {
        List<KpiShowAssetBusiness> rrr = new LinkedList<>();
        // 查询上月和年初(上年12月)的资产业务情况
        Date lastMonth = DateUtils.addMonths(dataDate, -1);
        Date beginYear = DateUtils.addYears(dataDate, -1);
        beginYear = DateUtils.setMonths(beginYear, 11);
        // 上月
        List<KpiShowAssetBusiness> lastMonthDatas = kpiShowAssetBusinessMapper.selectByDataDate(lastMonth);
        Map<String, KpiShowAssetBusiness> lastMonthDataMap = Optional.ofNullable(lastMonthDatas)
                .orElse(new ArrayList<>()).stream().collect(Collectors.toMap(item -> item.getDistrict().replaceAll("\\s*", ""), item -> item, (k1, k2) -> k1));
        // 年初
        List<KpiShowAssetBusiness> beginYearDatas = kpiShowAssetBusinessMapper.selectByDataDate(beginYear);
        Map<String, KpiShowAssetBusiness> beginYearDataMap = Optional.ofNullable(beginYearDatas)
                .orElse(new ArrayList<>()).stream().collect(Collectors.toMap(item -> item.getDistrict().replaceAll("\\s*", ""), i -> i, (k1, k2) -> k1));

        // 查询当月的信贷规模数据
        List<KpiSourceCreditScale> creditScales = kpiSourceCreditScaleMapper.selectByDataDate(dataDate);
        Map<String, KpiSourceCreditScale> creditScaleMap = Optional.ofNullable(creditScales)
                .orElse(new ArrayList<>()).stream().collect(Collectors.toMap(KpiSourceCreditScale::getDistrict, i -> i, (k1, k2) -> k1));

        Date dateNow = new Date();

        for (String district : KpiShowConstant.DISTRICT_LIST_ASSET_BUSINESS) {

            KpiShowAssetBusiness lst = lastMonthDataMap.get(district) == null ? new KpiShowAssetBusiness() : lastMonthDataMap.get(district);
            KpiShowAssetBusiness by = beginYearDataMap.get(district) == null ? new KpiShowAssetBusiness() : beginYearDataMap.get(district);
            KpiSourceCreditScale cs = creditScaleMap.get(district) == null ? new KpiSourceCreditScale() : creditScaleMap.get(district);

            KpiShowAssetBusiness oneR = new KpiShowAssetBusiness();
            oneR.setDistrict(district);
            oneR.setDataDate(dataDate);
            oneR.setDelFlag("0");
            oneR.setCreateBy(operName);
            oneR.setCreateTime(dateNow);

            // 三农 余额 = 小额贷款 + 个商贷款 + 其他贷款
            BigDecimal balance_sn = Arith.add(Arith.add(cs.getMicroloans(), cs.getIndividualBusiness()), cs.getPersonalOther());
            oneR.setSmallAmountBalance(balance_sn);
            oneR.setSmallAmountGrowthM(Arith.sub(balance_sn, lst.getSmallAmountBalance()));
            oneR.setSmallAmountGrowthY(Arith.sub(balance_sn, by.getSmallAmountBalance()));

            // 消费 余额 = 住房按揭贷款	+ 其他消费贷款
            BigDecimal balance_xf = Arith.add(cs.getHomeMortgage(), cs.getOtherConsumer());
            oneR.setConsumptionBalance(balance_xf);
            oneR.setConsumptionGrowthM(Arith.sub(balance_xf, lst.getConsumptionBalance()));
            oneR.setConsumptionGrowthY(Arith.sub(balance_xf, by.getConsumptionBalance()));

            // 小企业
            BigDecimal balance_xqy = cs.getSmallBusiness();
            oneR.setSmallBusinessBalance(balance_xqy);
            oneR.setSmallBusinessGrowthM(Arith.sub(balance_xqy, lst.getSmallBusinessBalance()));
            oneR.setSmallBusinessGrowthY(Arith.sub(balance_xqy, by.getSmallBusinessBalance()));

            // 公司贷款
            BigDecimal balance_gs = cs.getOtherCompany();
            oneR.setCompanyBalance(balance_gs);
            oneR.setCompanyGrowthM(Arith.sub(balance_gs, lst.getCompanyBalance()));
            oneR.setCompanyGrowthY(Arith.sub(balance_gs, by.getCompanyBalance()));

            // 合计
            BigDecimal balance_total = Arith.add(Arith.add(Arith.add(balance_sn, balance_xf), balance_xqy), balance_gs);
            oneR.setTotalBalance(balance_total);
            oneR.setTotalGrowthM(Arith.add(Arith.add(Arith.add(oneR.getSmallAmountGrowthM(), oneR.getConsumptionGrowthM()), oneR.getSmallBusinessGrowthM()), oneR.getCompanyGrowthM()));
            oneR.setTotalGrowthY(Arith.add(Arith.add(Arith.add(oneR.getSmallAmountGrowthY(), oneR.getConsumptionGrowthY()), oneR.getSmallBusinessGrowthY()), oneR.getCompanyGrowthY()));

            rrr.add(oneR);
        }

        // 公司贷款 在主表 全省的数据得从下面加
        KpiShowAssetBusiness total = rrr.get(0);
        BigDecimal company_balance_total = new BigDecimal(0);
        BigDecimal company_growthM_total = new BigDecimal(0);
        BigDecimal company_growthY_total = new BigDecimal(0);
        for (int i = 1; i < rrr.size(); i++ ){
            company_balance_total = Arith.add(company_balance_total, rrr.get(i).getCompanyBalance());
            company_growthM_total = Arith.add(company_growthM_total, rrr.get(i).getCompanyGrowthM());
            company_growthY_total = Arith.add(company_growthY_total, rrr.get(i).getCompanyGrowthY());
        }
        total.setCompanyBalance(company_balance_total);
        total.setCompanyGrowthM(company_growthM_total);
        total.setCompanyGrowthY(company_growthY_total);
        // 同时引起 全省 总计的重新计算
        total.setTotalBalance(Arith.add(Arith.add(Arith.add(total.getSmallAmountBalance(), total.getConsumptionBalance()), total.getSmallBusinessBalance()), company_balance_total));
        total.setTotalGrowthM(Arith.add(Arith.add(Arith.add(total.getSmallAmountGrowthM(), total.getConsumptionGrowthM()), total.getSmallBusinessGrowthM()), company_growthM_total));
        total.setTotalGrowthY(Arith.add(Arith.add(Arith.add(total.getSmallAmountGrowthY(), total.getConsumptionGrowthY()), total.getSmallBusinessGrowthY()), company_growthY_total));

        rrr.remove(0);
        rrr.add(0, total);

        return rrr;
    }


    /**
     * 计算 全行资产业务情况表 主表（本部）
     * @param dataDate
     * @param operName
     * @return
     */
    private KpiShowAssetBusinessSchedule calculateAssetBusnessSchedule(Date dataDate, String operName){
        KpiShowAssetBusinessSchedule rrr = new KpiShowAssetBusinessSchedule();

        // 查询上月和年初(上年12月)的资产业务情况
        Date lastMonth = DateUtils.addMonths(dataDate, -1);
        Date beginYear = DateUtils.addYears(dataDate, -1);
        beginYear = DateUtils.setMonths(beginYear, 11);
        // 上月
        List<KpiShowAssetBusinessSchedule> lastMonthDatas = kpiShowAssetBusinessScheduleMapper.selectByDataDate(lastMonth);
        Map<String, KpiShowAssetBusinessSchedule> lastMonthDataMap = Optional.ofNullable(lastMonthDatas)
                .orElse(new ArrayList<>()).stream().collect(Collectors.toMap(item -> item.getDistrict().replaceAll("\\s*", ""), item -> item, (k1, k2) -> k1));

//        // 年初
//        List<KpiShowAssetBusinessSchedule> beginYearDatas = kpiShowAssetBusinessScheduleMapper.selectByDataDate(beginYear);
//        Map<String, KpiShowAssetBusinessSchedule> beginYearDataMap = Optional.ofNullable(beginYearDatas)
//                .orElse(new ArrayList<>()).stream().collect(Collectors.toMap(item -> item.getDistrict().replaceAll("\\s*", ""), i -> i, (k1, k2) -> k1));

        // 查询当月的信贷规模数据
        List<KpiSourceCreditScale> creditScales = kpiSourceCreditScaleMapper.selectByDataDate(dataDate);
        Map<String, KpiSourceCreditScale> creditScaleMap = Optional.ofNullable(creditScales)
                .orElse(new ArrayList<>()).stream().collect(Collectors.toMap(KpiSourceCreditScale::getDistrict, i -> i, (k1, k2) -> k1));


        KpiShowAssetBusinessSchedule lastMonthData = lastMonthDataMap.get(KpiShowConstant.DISTRICT_BEN_BU) == null ? new KpiShowAssetBusinessSchedule() : lastMonthDataMap.get(KpiShowConstant.DISTRICT_BEN_BU);
//        KpiShowAssetBusinessSchedule beginYearData = beginYearDataMap.get(KpiShowConstant.DISTRICT_BEN_BU) == null ? new KpiShowAssetBusinessSchedule() : beginYearDataMap.get(KpiShowConstant.DISTRICT_BEN_BU);
        KpiSourceCreditScale creditScale = creditScaleMap.get(KpiShowConstant.DISTRICT_BEN_BU) == null ? new KpiSourceCreditScale() : creditScaleMap.get(KpiShowConstant.DISTRICT_BEN_BU);

        rrr.setDistrict(KpiShowConstant.DISTRICT_BEN_BU);
        rrr.setDataDate(dataDate);
        rrr.setDelFlag("0");
        rrr.setCreateBy(operName);
        rrr.setCreateTime(new Date());
        // 公司贷款
        rrr.setCompanyBalance(creditScale.getOtherCompany());
        rrr.setCompanyGrowthM(Arith.sub(creditScale.getOtherCompany(), lastMonthData.getCompanyBalance()));
        rrr.setCompanyGrowthY(Arith.add(rrr.getCompanyGrowthM(), lastMonthData.getCompanyGrowthY()));
        // 直贴
        rrr.setDirectPasteBalance(creditScale.getDirectPaste());
        rrr.setDirectPasteGrowthM(Arith.sub(creditScale.getDirectPaste(), lastMonthData.getDirectPasteBalance()));
        rrr.setDirectPasteGrowthY(Arith.add(rrr.getDirectPasteGrowthM(), lastMonthData.getDirectPasteGrowthY()));
        // 转贴现
        rrr.setRediscountBalance(creditScale.getRediscount());
        rrr.setRediscountGrowthM(Arith.sub(creditScale.getRediscount(), lastMonthData.getRediscountBalance()));
        rrr.setRediscountGrowthY(Arith.add(rrr.getRediscountGrowthM(), lastMonthData.getRediscountGrowthY()));
        // 供应链
        rrr.setSupplyChainBalance(creditScale.getSupplyChain());
        rrr.setSupplyChainGrowthM(Arith.sub(creditScale.getSupplyChain(), lastMonthData.getSupplyChainBalance()));
        rrr.setSupplyChainGrowthY(Arith.add(rrr.getSupplyChainGrowthM(), lastMonthData.getSupplyChainGrowthY()));
        // 存放同业
        rrr.setInterbankBalance(new BigDecimal(0));
        rrr.setInterbankGrowthM(new BigDecimal(0));
        rrr.setInterbankGrowthY(new BigDecimal(0));
        // 合计
        rrr.setTotalBalance(Arith.add(Arith.add(Arith.add(rrr.getCompanyBalance(), rrr.getDirectPasteBalance()), rrr.getRediscountBalance()), rrr.getSupplyChainBalance()));
        rrr.setTotalGrowthM(Arith.add(Arith.add(Arith.add(rrr.getCompanyGrowthM(), rrr.getDirectPasteGrowthM()), rrr.getRediscountGrowthM()), rrr.getSupplyChainGrowthM()));
        rrr.setTotalGrowthY(Arith.add(Arith.add(Arith.add(rrr.getCompanyGrowthY(), rrr.getDirectPasteGrowthY()), rrr.getRediscountGrowthY()), rrr.getSupplyChainGrowthY()));

        return rrr;
    }

}
