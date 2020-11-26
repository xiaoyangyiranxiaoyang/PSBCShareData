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
import com.psbc.datashare.kpi.domain.KpiSourceUnhealthy;
import com.psbc.datashare.kpi.service.IKpiSourceUnhealthyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 零售信贷不良Controller
 * 
 * @author mql
 * @date 2020-11-26
 */
@Controller
@RequestMapping("/datashare/kpi/unhealthy")
public class KpiSourceUnhealthyController extends BaseController
{
    private String prefix = "datashare/kpi/unhealthy";

    @Autowired
    private IKpiSourceUnhealthyService kpiSourceUnhealthyService;

    @RequiresPermissions("datashare/kpi:unhealthy:view")
    @GetMapping()
    public String unhealthy()
    {
        return prefix + "/unhealthy";
    }

    /**
     * 查询零售信贷不良列表
     */
    @RequiresPermissions("datashare/kpi:unhealthy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiSourceUnhealthy kpiSourceUnhealthy)
    {
        startPage();
        List<KpiSourceUnhealthy> list = kpiSourceUnhealthyService.selectKpiSourceUnhealthyList(kpiSourceUnhealthy);
        return getDataTable(list);
    }

    /**
     * 导出零售信贷不良列表
     */
    @RequiresPermissions("datashare/kpi:unhealthy:export")
    @Log(title = "零售信贷不良", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiSourceUnhealthy kpiSourceUnhealthy)
    {
        List<KpiSourceUnhealthy> list = kpiSourceUnhealthyService.selectKpiSourceUnhealthyList(kpiSourceUnhealthy);
        ExcelUtil<KpiSourceUnhealthy> util = new ExcelUtil<KpiSourceUnhealthy>(KpiSourceUnhealthy.class);
        return util.exportExcel(list, "unhealthy");
    }

    /**
     * 新增零售信贷不良
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存零售信贷不良
     */
    @RequiresPermissions("datashare/kpi:unhealthy:add")
    @Log(title = "零售信贷不良", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiSourceUnhealthy kpiSourceUnhealthy)
    {
        return toAjax(kpiSourceUnhealthyService.insertKpiSourceUnhealthy(kpiSourceUnhealthy));
    }

    /**
     * 修改零售信贷不良
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiSourceUnhealthy kpiSourceUnhealthy = kpiSourceUnhealthyService.selectKpiSourceUnhealthyById(id);
        mmap.put("kpiSourceUnhealthy", kpiSourceUnhealthy);
        return prefix + "/edit";
    }

    /**
     * 修改保存零售信贷不良
     */
    @RequiresPermissions("datashare/kpi:unhealthy:edit")
    @Log(title = "零售信贷不良", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiSourceUnhealthy kpiSourceUnhealthy)
    {
        return toAjax(kpiSourceUnhealthyService.updateKpiSourceUnhealthy(kpiSourceUnhealthy));
    }

    /**
     * 删除零售信贷不良
     */
    @RequiresPermissions("datashare/kpi:unhealthy:remove")
    @Log(title = "零售信贷不良", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiSourceUnhealthyService.deleteKpiSourceUnhealthyByIds(ids));
    }
}
