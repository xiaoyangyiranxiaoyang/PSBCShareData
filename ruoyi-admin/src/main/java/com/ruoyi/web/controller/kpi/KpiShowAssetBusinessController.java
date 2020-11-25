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
import com.psbc.datashare.kpi.domain.KpiShowAssetBusiness;
import com.psbc.datashare.kpi.service.IKpiShowAssetBusinessService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 全行资产业务情况表Controller
 * 
 * @author mql
 * @date 2020-11-25
 */
@Controller
@RequestMapping("/datashare/kpi/assetbusiness")
public class KpiShowAssetBusinessController extends BaseController
{
    private String prefix = "datashare/kpi/assetbusiness";

    @Autowired
    private IKpiShowAssetBusinessService kpiShowAssetBusinessService;

    @RequiresPermissions("datashare/kpi:assetbusiness:view")
    @GetMapping()
    public String assetbusiness()
    {
        return prefix + "/assetbusiness";
    }

    /**
     * 查询全行资产业务情况表列表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiShowAssetBusiness kpiShowAssetBusiness)
    {
        startPage();
        List<KpiShowAssetBusiness> list = kpiShowAssetBusinessService.selectKpiShowAssetBusinessList(kpiShowAssetBusiness);
        return getDataTable(list);
    }

    /**
     * 导出全行资产业务情况表列表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness:export")
    @Log(title = "全行资产业务情况表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiShowAssetBusiness kpiShowAssetBusiness)
    {
        List<KpiShowAssetBusiness> list = kpiShowAssetBusinessService.selectKpiShowAssetBusinessList(kpiShowAssetBusiness);
        ExcelUtil<KpiShowAssetBusiness> util = new ExcelUtil<KpiShowAssetBusiness>(KpiShowAssetBusiness.class);
        return util.exportExcel(list, "assetbusiness");
    }

    /**
     * 新增全行资产业务情况表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存全行资产业务情况表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness:add")
    @Log(title = "全行资产业务情况表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiShowAssetBusiness kpiShowAssetBusiness)
    {
        return toAjax(kpiShowAssetBusinessService.insertKpiShowAssetBusiness(kpiShowAssetBusiness));
    }

    /**
     * 修改全行资产业务情况表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiShowAssetBusiness kpiShowAssetBusiness = kpiShowAssetBusinessService.selectKpiShowAssetBusinessById(id);
        mmap.put("kpiShowAssetBusiness", kpiShowAssetBusiness);
        return prefix + "/edit";
    }

    /**
     * 修改保存全行资产业务情况表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness:edit")
    @Log(title = "全行资产业务情况表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiShowAssetBusiness kpiShowAssetBusiness)
    {
        return toAjax(kpiShowAssetBusinessService.updateKpiShowAssetBusiness(kpiShowAssetBusiness));
    }

    /**
     * 删除全行资产业务情况表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness:remove")
    @Log(title = "全行资产业务情况表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiShowAssetBusinessService.deleteKpiShowAssetBusinessByIds(ids));
    }
}
