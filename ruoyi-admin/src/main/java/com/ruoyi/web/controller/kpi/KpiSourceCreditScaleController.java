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
import com.psbc.datashare.kpi.domain.KpiSourceCreditScale;
import com.psbc.datashare.kpi.service.IKpiSourceCreditScaleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 信贷规模Controller
 * 
 * @author mql
 * @date 2020-11-25
 */
@Controller
@RequestMapping("/datashare/kpi/credit_scale")
public class KpiSourceCreditScaleController extends BaseController
{
    private String prefix = "datashare/kpi/credit_scale";

    @Autowired
    private IKpiSourceCreditScaleService kpiSourceCreditScaleService;

    @RequiresPermissions("datashare/kpi:credit_scale:view")
    @GetMapping()
    public String credit_scale()
    {
        return prefix + "/credit_scale";
    }

    /**
     * 查询信贷规模列表
     */
    @RequiresPermissions("datashare/kpi:credit_scale:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiSourceCreditScale kpiSourceCreditScale)
    {
        startPage();
        List<KpiSourceCreditScale> list = kpiSourceCreditScaleService.selectKpiSourceCreditScaleList(kpiSourceCreditScale);
        return getDataTable(list);
    }

    /**
     * 导出信贷规模列表
     */
    @RequiresPermissions("datashare/kpi:credit_scale:export")
    @Log(title = "信贷规模", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiSourceCreditScale kpiSourceCreditScale)
    {
        List<KpiSourceCreditScale> list = kpiSourceCreditScaleService.selectKpiSourceCreditScaleList(kpiSourceCreditScale);
        ExcelUtil<KpiSourceCreditScale> util = new ExcelUtil<KpiSourceCreditScale>(KpiSourceCreditScale.class);
        return util.exportExcel(list, "credit_scale");
    }

    /**
     * 新增信贷规模
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存信贷规模
     */
    @RequiresPermissions("datashare/kpi:credit_scale:add")
    @Log(title = "信贷规模", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiSourceCreditScale kpiSourceCreditScale)
    {
        return toAjax(kpiSourceCreditScaleService.insertKpiSourceCreditScale(kpiSourceCreditScale));
    }

    /**
     * 修改信贷规模
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiSourceCreditScale kpiSourceCreditScale = kpiSourceCreditScaleService.selectKpiSourceCreditScaleById(id);
        mmap.put("kpiSourceCreditScale", kpiSourceCreditScale);
        return prefix + "/edit";
    }

    /**
     * 修改保存信贷规模
     */
    @RequiresPermissions("datashare/kpi:credit_scale:edit")
    @Log(title = "信贷规模", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiSourceCreditScale kpiSourceCreditScale)
    {
        return toAjax(kpiSourceCreditScaleService.updateKpiSourceCreditScale(kpiSourceCreditScale));
    }

    /**
     * 删除信贷规模
     */
    @RequiresPermissions("datashare/kpi:credit_scale:remove")
    @Log(title = "信贷规模", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiSourceCreditScaleService.deleteKpiSourceCreditScaleByIds(ids));
    }
}
