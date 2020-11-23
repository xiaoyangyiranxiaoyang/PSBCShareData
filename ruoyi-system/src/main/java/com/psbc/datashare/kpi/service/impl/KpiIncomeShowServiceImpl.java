package com.psbc.datashare.kpi.service.impl;

import com.psbc.datashare.kpi.domain.KpiIncomeShow;
import com.psbc.datashare.kpi.mapper.KpiIncomeShowMapper;
import com.psbc.datashare.kpi.service.IKpiIncomeShowService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import jdk.internal.org.objectweb.asm.TypeReference;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 全行KPI指标（一）Service业务层处理
 *
 * @author mql
 * @date 2020-11-18
 */
@Service
public class KpiIncomeShowServiceImpl implements IKpiIncomeShowService
{
    @Autowired
    private KpiIncomeShowMapper kpiIncomeShowMapper;

    /**
     * 查询全行KPI指标（一）
     *
     * @param id 全行KPI指标（一）ID
     * @return 全行KPI指标（一）
     */
    @Override
    public KpiIncomeShow selectKpiIncomeShowById(Long id)
    {
        return kpiIncomeShowMapper.selectKpiIncomeShowById(id);
    }

    /**
     * 查询全行KPI指标（一）列表
     *
     * @param kpiIncomeShow 全行KPI指标（一）
     * @return 全行KPI指标（一）
     */
    @Override
    public List<KpiIncomeShow> selectKpiIncomeShowList(KpiIncomeShow kpiIncomeShow)
    {
        return kpiIncomeShowMapper.selectKpiIncomeShowList(kpiIncomeShow);
    }

    /**
     * 新增全行KPI指标（一）
     *
     * @param kpiIncomeShow 全行KPI指标（一）
     * @return 结果
     */
    @Override
    public int insertKpiIncomeShow(KpiIncomeShow kpiIncomeShow)
    {
        kpiIncomeShow.setCreateTime(DateUtils.getNowDate());
        return kpiIncomeShowMapper.insertKpiIncomeShow(kpiIncomeShow);
    }

    /**
     * 修改全行KPI指标（一）
     *
     * @param kpiIncomeShow 全行KPI指标（一）
     * @return 结果
     */
    @Override
    public int updateKpiIncomeShow(KpiIncomeShow kpiIncomeShow)
    {
        kpiIncomeShow.setUpdateTime(DateUtils.getNowDate());
        return kpiIncomeShowMapper.updateKpiIncomeShow(kpiIncomeShow);
    }

    /**
     * 删除全行KPI指标（一）对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiIncomeShowByIds(String ids)
    {
        return kpiIncomeShowMapper.deleteKpiIncomeShowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除全行KPI指标（一）信息
     *
     * @param id 全行KPI指标（一）ID
     * @return 结果
     */
    @Override
    public int deleteKpiIncomeShowById(Long id)
    {
        return kpiIncomeShowMapper.deleteKpiIncomeShowById(id);
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public String importKpiIncomeShow(InputStream is, String dataMonth, String operName) {
        String rrMsg = "导入数据失败";
        try {
            String dataDateStr =  LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM")) + "-01";
            if (StringUtils.isNotBlank(dataMonth)){
                dataDateStr = dataMonth + "-01";
            }

            Date dateNow = new Date();
            Date dataDate = DateUtils.dateTime("yyyy-MM-dd", dataDateStr);

            ExcelUtil excelUtil = new ExcelUtil(KpiIncomeShow.class);
            Map<Integer, Map<Integer, Object>> excelDataMap = excelUtil.readExcelWithRowBySheetName(is, null);

            List<KpiIncomeShow> datasToInsert = new LinkedList<>();
            // 获取5~19行，1~15列数据并组装入库
            for (int rowNum = 5; rowNum <= 19; rowNum++){
                Map<Integer, Object> columnDataMap = excelDataMap.get(rowNum);
                if (columnDataMap != null && !columnDataMap.isEmpty()){
                    KpiIncomeShow one = new KpiIncomeShow();
                    // 地区
                    String district = Convert.toStr(columnDataMap.get(1));
                    district = district.replaceAll("\\s*", "");
                    one.setDistrict(district); // 替换空白字符（空格、制表符、换页符等）
                    // 从业人数
                    one.setPeopleNum(Convert.toLong(columnDataMap.get(2)));
                    // 总收入
                    one.setIncomeTotalMonth(Convert.toBigDecimal(columnDataMap.get(3)));
                    one.setIncomeTotalYear(Convert.toBigDecimal(columnDataMap.get(4)));
                    // 自营收入
                    one.setIncomeSelfMonth(Convert.toBigDecimal(columnDataMap.get(5)));
                    one.setIncomeSelfYear(Convert.toBigDecimal(columnDataMap.get(6)));
                    one.setIncomeSelfRise(Convert.toBigDecimal(columnDataMap.get(7)));
                    one.setIncomeSelfProgress(Convert.toBigDecimal(columnDataMap.get(8)));
                    one.setIncomeSelfPercapita(Convert.toBigDecimal(columnDataMap.get(9)));
                    // 净利润
                    one.setNetProfitMonth(Convert.toBigDecimal(columnDataMap.get(10)));
                    one.setNetProfitYear(Convert.toBigDecimal(columnDataMap.get(11)));
                    one.setNetProfitRise(Convert.toBigDecimal(columnDataMap.get(12)));
                    one.setNetProfitProgress(Convert.toBigDecimal(columnDataMap.get(13)));
                    one.setNetProfitPercapita(Convert.toBigDecimal(columnDataMap.get(14)));
                    // 收入利润率
                    one.setIncomeProfitRate(Convert.toBigDecimal(columnDataMap.get(15)));

                    one.setDataDate(dataDate);
                    one.setDelFlag("0");
                    one.setCreateBy(operName);
                    one.setCreateTime(dateNow);

                    datasToInsert.add(one);
                }
            }
            if (!datasToInsert.isEmpty()){
                // 先删除当月数据
                List<KpiIncomeShow> kpiIncomeShows = kpiIncomeShowMapper.selectKpiIncomeShowByDataDate(dataDate);
                if (kpiIncomeShows !=null && !kpiIncomeShows.isEmpty()){
                    kpiIncomeShowMapper.deleteKpiIncomeShowByDataDate(dataDate);
                }
                // 导入当月的数据
                kpiIncomeShowMapper.insertKpiIncomeShowBatch(datasToInsert);
            }
            rrMsg = "导入数据成功!";
        } catch (Exception e){
            throw new BusinessException("导入数据失败", e);
        }
        return rrMsg;
    }
}
