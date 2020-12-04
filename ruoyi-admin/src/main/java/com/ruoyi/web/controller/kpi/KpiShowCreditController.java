package com.ruoyi.web.controller.kpi;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.Arith;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.file.FileUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.psbc.datashare.kpi.domain.KpiShowCredit;
import com.psbc.datashare.kpi.service.IKpiShowCreditService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * 全行KPI指标（二）Controller
 * 
 * @author mql
 * @date 2020-11-25
 */
@Controller
@RequestMapping("/datashare/kpi/credit")
public class KpiShowCreditController extends BaseController
{
    private String prefix = "datashare/kpi/credit";

    @Autowired
    private IKpiShowCreditService kpiShowCreditService;

    @RequiresPermissions("datashare/kpi:credit:view")
    @GetMapping()
    public String credit()
    {
        return prefix + "/credit";
    }

    /**
     * 查询全行KPI指标（二）列表
     */
    @RequiresPermissions("datashare/kpi:credit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiShowCredit kpiShowCredit)
    {
        //startPage();
        List<KpiShowCredit> list = kpiShowCreditService.selectKpiShowCreditList(kpiShowCredit);
        Optional.ofNullable(list).orElse(new ArrayList<>()).stream()
                .forEach(item -> {
                    item.setDepositBalance(Arith.round(item.getDepositBalance(), 0));
                    item.setDepositGrowthM(Arith.round(item.getDepositGrowthM(), 0));
                    item.setDepositGrowthY(Arith.round(item.getDepositGrowthY(), 0));

                    item.setSelfBalance(Arith.round(item.getSelfBalance(), 0));
                    item.setSelfGrowthM(Arith.round(item.getSelfGrowthM(), 0));
                    item.setSelfGrowthY(Arith.round(item.getSelfGrowthY(), 0));

                    item.setAgentBalance(Arith.round(item.getAgentBalance(), 0));
                    item.setAgentGrowthM(Arith.round(item.getAgentGrowthM(), 0));
                    item.setAgentGrowthY(Arith.round(item.getAgentGrowthY(), 0));

                    item.setCompanyBalance(Arith.round(item.getCompanyBalance(), 0));
                    item.setCompanyGrowthM(Arith.round(item.getCompanyGrowthM(), 0));
                    item.setCompanyGrowthY(Arith.round(item.getCompanyGrowthY(), 0));

                    item.setLoanBalance(Arith.round(item.getLoanBalance(), 0));
                    item.setLoanGrowthM(Arith.round(item.getLoanGrowthM(), 0));
                    item.setLoanGrowthY(Arith.round(item.getLoanGrowthY(), 0));

                    item.setUnhealthyRate(Arith.round(Arith.mul(item.getUnhealthyRate(),new BigDecimal(100)), 2));
                    item.setOverdueRate(Arith.round(Arith.mul(item.getOverdueRate(),new BigDecimal(100)), 2));
                });
        return getDataTable(list);
    }

    /**
     * 导出全行KPI指标（二）列表
     */
    @RequiresPermissions("datashare/kpi:credit:export")
    @Log(title = "全行KPI指标（二）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiShowCredit kpiShowCredit)
    {
        List<KpiShowCredit> list = kpiShowCreditService.selectKpiShowCreditList(kpiShowCredit);
        ExcelUtil<KpiShowCredit> util = new ExcelUtil<KpiShowCredit>(KpiShowCredit.class);
        return util.exportExcel(list, "credit");
    }

    /**
     * KPI 源数据导入
     * @param file
     * @param dataMonth
     * @return
     * @throws Exception
     */
    @Log(title = "KPI指标源数据", businessType = BusinessType.IMPORT)
    @RequiresPermissions("datashare/kpi:credit:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, String dataMonth) throws Exception
    {
        String operName = ShiroUtils.getSysUser().getLoginName();
        String message = kpiShowCreditService.importKpiSourceData(file.getInputStream(), dataMonth, operName);
        return AjaxResult.success(message);
    }

    /**
     * KPI 源数据导入模板下载
     * @param response
     */
    @RequiresPermissions("datashare/kpi:credit:view")
    @GetMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        try {
            File f = new DefaultResourceLoader().getResource("classpath:templates/datashare/kpi/importtemplate/Template-KPI-data_source.xls").getFile();

            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileUtils.setAttachmentResponseHeader(response, "Template-KPI-data_source.xls");
            FileUtils.writeBytes(f, response.getOutputStream());
        } catch (Exception e) {
            logger.error("下载文件（Template-KPI-data_source.xls ）异常{}", e.getMessage());
            throw new BusinessException("下载文件（Template-KPI-data_source.xls）异常，请联系网站管理员！");
        }
    }

    /**
     * 新增全行KPI指标（二）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存全行KPI指标（二）
     */
    @RequiresPermissions("datashare/kpi:credit:add")
    @Log(title = "全行KPI指标（二）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiShowCredit kpiShowCredit)
    {
        return toAjax(kpiShowCreditService.insertKpiShowCredit(kpiShowCredit));
    }

    /**
     * 修改全行KPI指标（二）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiShowCredit kpiShowCredit = kpiShowCreditService.selectKpiShowCreditById(id);
        mmap.put("kpiShowCredit", kpiShowCredit);
        return prefix + "/edit";
    }

    /**
     * 修改保存全行KPI指标（二）
     */
    @RequiresPermissions("datashare/kpi:credit:edit")
    @Log(title = "全行KPI指标（二）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiShowCredit kpiShowCredit)
    {
        return toAjax(kpiShowCreditService.updateKpiShowCredit(kpiShowCredit));
    }

    /**
     * 删除全行KPI指标（二）
     */
    @RequiresPermissions("datashare/kpi:credit:remove")
    @Log(title = "全行KPI指标（二）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiShowCreditService.deleteKpiShowCreditByIds(ids));
    }
}
