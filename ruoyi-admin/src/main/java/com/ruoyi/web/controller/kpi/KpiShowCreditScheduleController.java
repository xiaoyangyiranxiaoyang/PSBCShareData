package com.ruoyi.web.controller.kpi;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.psbc.datashare.kpi.domain.KpiShowCreditSchedule;
import com.psbc.datashare.kpi.service.IKpiShowCreditScheduleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 全行KPI指标（二）-附表Controller
 * 
 * @author mql
 * @date 2020-11-25
 */
@Controller
@RequestMapping("/datashare/kpi/credit_schedule")
public class KpiShowCreditScheduleController extends BaseController
{
    private String prefix = "datashare/kpi/credit_schedule";

    @Autowired
    private IKpiShowCreditScheduleService kpiShowCreditScheduleService;

    @RequiresPermissions("datashare/kpi:credit_schedule:view")
    @GetMapping()
    public String credit_schedule()
    {
        return prefix + "/credit_schedule";
    }

    /**
     * 查询全行KPI指标（二）-附表列表
     */
    @RequiresPermissions("datashare/kpi:credit_schedule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiShowCreditSchedule kpiShowCreditSchedule)
    {
        startPage();
        List<KpiShowCreditSchedule> list = kpiShowCreditScheduleService.selectKpiShowCreditScheduleList(kpiShowCreditSchedule);
        return getDataTable(list);
    }

    /**
     * 导出全行KPI指标（二）-附表列表
     */
    @RequiresPermissions("datashare/kpi:credit_schedule:export")
    @Log(title = "全行KPI指标（二）-附表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiShowCreditSchedule kpiShowCreditSchedule)
    {
        List<KpiShowCreditSchedule> list = kpiShowCreditScheduleService.selectKpiShowCreditScheduleList(kpiShowCreditSchedule);
        ExcelUtil<KpiShowCreditSchedule> util = new ExcelUtil<KpiShowCreditSchedule>(KpiShowCreditSchedule.class);
        return util.exportExcel(list, "credit_schedule");
    }

    /**
     * 新增全行KPI指标（二）-附表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存全行KPI指标（二）-附表
     */
    @RequiresPermissions("datashare/kpi:credit_schedule:add")
    @Log(title = "全行KPI指标（二）-附表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiShowCreditSchedule kpiShowCreditSchedule)
    {
        return toAjax(kpiShowCreditScheduleService.insertKpiShowCreditSchedule(kpiShowCreditSchedule));
    }

    /**
     * 修改全行KPI指标（二）-附表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiShowCreditSchedule kpiShowCreditSchedule = kpiShowCreditScheduleService.selectKpiShowCreditScheduleById(id);
        mmap.put("kpiShowCreditSchedule", kpiShowCreditSchedule);
        return prefix + "/edit";
    }

    /**
     * 修改保存全行KPI指标（二）-附表
     */
    @RequiresPermissions("datashare/kpi:credit_schedule:edit")
    @Log(title = "全行KPI指标（二）-附表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiShowCreditSchedule kpiShowCreditSchedule)
    {
        return toAjax(kpiShowCreditScheduleService.updateKpiShowCreditSchedule(kpiShowCreditSchedule));
    }

    /**
     * 删除全行KPI指标（二）-附表
     */
    @RequiresPermissions("datashare/kpi:credit_schedule:remove")
    @Log(title = "全行KPI指标（二）-附表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiShowCreditScheduleService.deleteKpiShowCreditScheduleByIds(ids));
    }
}
