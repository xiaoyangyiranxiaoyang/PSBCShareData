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
import com.psbc.datashare.kpi.domain.KpiSourceOriginalData;
import com.psbc.datashare.kpi.service.IKpiSourceOriginalDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据原（商业银行日报）Controller
 * 
 * @author mql
 * @date 2020-11-25
 */
@Controller
@RequestMapping("/datashare/kpi/original_data")
public class KpiSourceOriginalDataController extends BaseController
{
    private String prefix = "datashare/kpi/original_data";

    @Autowired
    private IKpiSourceOriginalDataService kpiSourceOriginalDataService;

    @RequiresPermissions("datashare/kpi:original_data:view")
    @GetMapping()
    public String original_data()
    {
        return prefix + "/original_data";
    }

    /**
     * 查询数据原（商业银行日报）列表
     */
    @RequiresPermissions("datashare/kpi:original_data:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiSourceOriginalData kpiSourceOriginalData)
    {
        startPage();
        List<KpiSourceOriginalData> list = kpiSourceOriginalDataService.selectKpiSourceOriginalDataList(kpiSourceOriginalData);
        return getDataTable(list);
    }

    /**
     * 导出数据原（商业银行日报）列表
     */
    @RequiresPermissions("datashare/kpi:original_data:export")
    @Log(title = "数据原（商业银行日报）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiSourceOriginalData kpiSourceOriginalData)
    {
        List<KpiSourceOriginalData> list = kpiSourceOriginalDataService.selectKpiSourceOriginalDataList(kpiSourceOriginalData);
        ExcelUtil<KpiSourceOriginalData> util = new ExcelUtil<KpiSourceOriginalData>(KpiSourceOriginalData.class);
        return util.exportExcel(list, "original_data");
    }

    /**
     * 新增数据原（商业银行日报）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存数据原（商业银行日报）
     */
    @RequiresPermissions("datashare/kpi:original_data:add")
    @Log(title = "数据原（商业银行日报）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiSourceOriginalData kpiSourceOriginalData)
    {
        return toAjax(kpiSourceOriginalDataService.insertKpiSourceOriginalData(kpiSourceOriginalData));
    }

    /**
     * 修改数据原（商业银行日报）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiSourceOriginalData kpiSourceOriginalData = kpiSourceOriginalDataService.selectKpiSourceOriginalDataById(id);
        mmap.put("kpiSourceOriginalData", kpiSourceOriginalData);
        return prefix + "/edit";
    }

    /**
     * 修改保存数据原（商业银行日报）
     */
    @RequiresPermissions("datashare/kpi:original_data:edit")
    @Log(title = "数据原（商业银行日报）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiSourceOriginalData kpiSourceOriginalData)
    {
        return toAjax(kpiSourceOriginalDataService.updateKpiSourceOriginalData(kpiSourceOriginalData));
    }

    /**
     * 删除数据原（商业银行日报）
     */
    @RequiresPermissions("datashare/kpi:original_data:remove")
    @Log(title = "数据原（商业银行日报）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiSourceOriginalDataService.deleteKpiSourceOriginalDataByIds(ids));
    }
}
