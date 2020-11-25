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
import com.psbc.datashare.kpi.domain.KpiSourceSavingData;
import com.psbc.datashare.kpi.service.IKpiSourceSavingDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 代理储蓄数据Controller
 * 
 * @author mql
 * @date 2020-11-25
 */
@Controller
@RequestMapping("/datashare/kpi/saving_data")
public class KpiSourceSavingDataController extends BaseController
{
    private String prefix = "datashare/kpi/saving_data";

    @Autowired
    private IKpiSourceSavingDataService kpiSourceSavingDataService;

    @RequiresPermissions("datashare/kpi:saving_data:view")
    @GetMapping()
    public String saving_data()
    {
        return prefix + "/saving_data";
    }

    /**
     * 查询代理储蓄数据列表
     */
    @RequiresPermissions("datashare/kpi:saving_data:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiSourceSavingData kpiSourceSavingData)
    {
        startPage();
        List<KpiSourceSavingData> list = kpiSourceSavingDataService.selectKpiSourceSavingDataList(kpiSourceSavingData);
        return getDataTable(list);
    }

    /**
     * 导出代理储蓄数据列表
     */
    @RequiresPermissions("datashare/kpi:saving_data:export")
    @Log(title = "代理储蓄数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiSourceSavingData kpiSourceSavingData)
    {
        List<KpiSourceSavingData> list = kpiSourceSavingDataService.selectKpiSourceSavingDataList(kpiSourceSavingData);
        ExcelUtil<KpiSourceSavingData> util = new ExcelUtil<KpiSourceSavingData>(KpiSourceSavingData.class);
        return util.exportExcel(list, "saving_data");
    }

    /**
     * 新增代理储蓄数据
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存代理储蓄数据
     */
    @RequiresPermissions("datashare/kpi:saving_data:add")
    @Log(title = "代理储蓄数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiSourceSavingData kpiSourceSavingData)
    {
        return toAjax(kpiSourceSavingDataService.insertKpiSourceSavingData(kpiSourceSavingData));
    }

    /**
     * 修改代理储蓄数据
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiSourceSavingData kpiSourceSavingData = kpiSourceSavingDataService.selectKpiSourceSavingDataById(id);
        mmap.put("kpiSourceSavingData", kpiSourceSavingData);
        return prefix + "/edit";
    }

    /**
     * 修改保存代理储蓄数据
     */
    @RequiresPermissions("datashare/kpi:saving_data:edit")
    @Log(title = "代理储蓄数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiSourceSavingData kpiSourceSavingData)
    {
        return toAjax(kpiSourceSavingDataService.updateKpiSourceSavingData(kpiSourceSavingData));
    }

    /**
     * 删除代理储蓄数据
     */
    @RequiresPermissions("datashare/kpi:saving_data:remove")
    @Log(title = "代理储蓄数据", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiSourceSavingDataService.deleteKpiSourceSavingDataByIds(ids));
    }
}
