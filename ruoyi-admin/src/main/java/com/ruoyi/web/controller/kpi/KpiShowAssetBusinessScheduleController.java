package com.ruoyi.web.controller.kpi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ruoyi.common.utils.Arith;
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
import com.psbc.datashare.kpi.domain.KpiShowAssetBusinessSchedule;
import com.psbc.datashare.kpi.service.IKpiShowAssetBusinessScheduleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 全行资产业务情况-附表Controller
 * 
 * @author mql
 * @date 2020-11-25
 */
@Controller
@RequestMapping("/datashare/kpi/assetbusiness_schedule")
public class KpiShowAssetBusinessScheduleController extends BaseController
{
    private String prefix = "datashare/kpi/assetbusiness_schedule";

    @Autowired
    private IKpiShowAssetBusinessScheduleService kpiShowAssetBusinessScheduleService;

    @RequiresPermissions("datashare/kpi:assetbusiness_schedule:view")
    @GetMapping()
    public String assetbusiness_schedule()
    {
        return prefix + "/assetbusiness_schedule";
    }

    /**
     * 查询全行资产业务情况-附表列表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness_schedule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule)
    {
        startPage();
        List<KpiShowAssetBusinessSchedule> list = kpiShowAssetBusinessScheduleService.selectKpiShowAssetBusinessScheduleList(kpiShowAssetBusinessSchedule);
        // 去小数位
        Optional.ofNullable(list).orElse(new ArrayList<>()).stream()
                .forEach(item -> {
                    item.setTotalBalance(Arith.round(item.getTotalBalance(), 0));
                    item.setTotalGrowthM(Arith.round(item.getTotalGrowthM(), 0));
                    item.setTotalGrowthY(Arith.round(item.getTotalGrowthY(), 0));

                    item.setCompanyBalance(Arith.round(item.getCompanyBalance(), 0));
                    item.setCompanyGrowthM(Arith.round(item.getCompanyGrowthM(), 0));
                    item.setCompanyGrowthY(Arith.round(item.getCompanyGrowthY(), 0));

                    item.setDirectPasteBalance(Arith.round(item.getDirectPasteBalance(), 0));
                    item.setDirectPasteGrowthM(Arith.round(item.getDirectPasteGrowthM(), 0));
                    item.setDirectPasteGrowthY(Arith.round(item.getDirectPasteGrowthY(), 0));

                    item.setRediscountBalance(Arith.round(item.getRediscountBalance(), 0));
                    item.setRediscountGrowthM(Arith.round(item.getRediscountGrowthM(), 0));
                    item.setRediscountGrowthY(Arith.round(item.getRediscountGrowthY(), 0));

                    item.setSupplyChainBalance(Arith.round(item.getSupplyChainBalance(), 0));
                    item.setSupplyChainGrowthM(Arith.round(item.getSupplyChainGrowthM(), 0));
                    item.setSupplyChainGrowthY(Arith.round(item.getSupplyChainGrowthY(), 0));

                    item.setInterbankBalance(Arith.round(item.getInterbankBalance(), 0));
                    item.setInterbankGrowthM(Arith.round(item.getInterbankGrowthM(), 0));
                    item.setInterbankGrowthY(Arith.round(item.getInterbankGrowthY(), 0));

                });
        return getDataTable(list);
    }

    /**
     * 导出全行资产业务情况-附表列表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness_schedule:export")
    @Log(title = "全行资产业务情况-附表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule)
    {
        List<KpiShowAssetBusinessSchedule> list = kpiShowAssetBusinessScheduleService.selectKpiShowAssetBusinessScheduleList(kpiShowAssetBusinessSchedule);
        ExcelUtil<KpiShowAssetBusinessSchedule> util = new ExcelUtil<KpiShowAssetBusinessSchedule>(KpiShowAssetBusinessSchedule.class);
        return util.exportExcel(list, "assetbusiness_schedule");
    }

    /**
     * 新增全行资产业务情况-附表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存全行资产业务情况-附表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness_schedule:add")
    @Log(title = "全行资产业务情况-附表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule)
    {
        return toAjax(kpiShowAssetBusinessScheduleService.insertKpiShowAssetBusinessSchedule(kpiShowAssetBusinessSchedule));
    }

    /**
     * 修改全行资产业务情况-附表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule = kpiShowAssetBusinessScheduleService.selectKpiShowAssetBusinessScheduleById(id);
        mmap.put("kpiShowAssetBusinessSchedule", kpiShowAssetBusinessSchedule);
        return prefix + "/edit";
    }

    /**
     * 修改保存全行资产业务情况-附表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness_schedule:edit")
    @Log(title = "全行资产业务情况-附表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiShowAssetBusinessSchedule kpiShowAssetBusinessSchedule)
    {
        return toAjax(kpiShowAssetBusinessScheduleService.updateKpiShowAssetBusinessSchedule(kpiShowAssetBusinessSchedule));
    }

    /**
     * 删除全行资产业务情况-附表
     */
    @RequiresPermissions("datashare/kpi:assetbusiness_schedule:remove")
    @Log(title = "全行资产业务情况-附表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiShowAssetBusinessScheduleService.deleteKpiShowAssetBusinessScheduleByIds(ids));
    }
}
