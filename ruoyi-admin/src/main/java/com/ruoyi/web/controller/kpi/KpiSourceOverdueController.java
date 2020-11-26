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
import com.psbc.datashare.kpi.domain.KpiSourceOverdue;
import com.psbc.datashare.kpi.service.IKpiSourceOverdueService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 零售信贷逾期Controller
 * 
 * @author mql
 * @date 2020-11-26
 */
@Controller
@RequestMapping("/datashare/kpi/overdue")
public class KpiSourceOverdueController extends BaseController
{
    private String prefix = "datashare/kpi/overdue";

    @Autowired
    private IKpiSourceOverdueService kpiSourceOverdueService;

    @RequiresPermissions("datashare/kpi:overdue:view")
    @GetMapping()
    public String overdue()
    {
        return prefix + "/overdue";
    }

    /**
     * 查询零售信贷逾期列表
     */
    @RequiresPermissions("datashare/kpi:overdue:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiSourceOverdue kpiSourceOverdue)
    {
        startPage();
        List<KpiSourceOverdue> list = kpiSourceOverdueService.selectKpiSourceOverdueList(kpiSourceOverdue);
        return getDataTable(list);
    }

    /**
     * 导出零售信贷逾期列表
     */
    @RequiresPermissions("datashare/kpi:overdue:export")
    @Log(title = "零售信贷逾期", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiSourceOverdue kpiSourceOverdue)
    {
        List<KpiSourceOverdue> list = kpiSourceOverdueService.selectKpiSourceOverdueList(kpiSourceOverdue);
        ExcelUtil<KpiSourceOverdue> util = new ExcelUtil<KpiSourceOverdue>(KpiSourceOverdue.class);
        return util.exportExcel(list, "overdue");
    }

    /**
     * 新增零售信贷逾期
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存零售信贷逾期
     */
    @RequiresPermissions("datashare/kpi:overdue:add")
    @Log(title = "零售信贷逾期", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiSourceOverdue kpiSourceOverdue)
    {
        return toAjax(kpiSourceOverdueService.insertKpiSourceOverdue(kpiSourceOverdue));
    }

    /**
     * 修改零售信贷逾期
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiSourceOverdue kpiSourceOverdue = kpiSourceOverdueService.selectKpiSourceOverdueById(id);
        mmap.put("kpiSourceOverdue", kpiSourceOverdue);
        return prefix + "/edit";
    }

    /**
     * 修改保存零售信贷逾期
     */
    @RequiresPermissions("datashare/kpi:overdue:edit")
    @Log(title = "零售信贷逾期", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiSourceOverdue kpiSourceOverdue)
    {
        return toAjax(kpiSourceOverdueService.updateKpiSourceOverdue(kpiSourceOverdue));
    }

    /**
     * 删除零售信贷逾期
     */
    @RequiresPermissions("datashare/kpi:overdue:remove")
    @Log(title = "零售信贷逾期", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiSourceOverdueService.deleteKpiSourceOverdueByIds(ids));
    }
}
