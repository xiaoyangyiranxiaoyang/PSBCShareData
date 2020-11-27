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
        // 去小数位
        Optional.ofNullable(list).orElse(new ArrayList<>()).stream()
                .forEach(item -> {
                    item.setTotalBalance(Arith.round(item.getTotalBalance(), 0));
                    item.setTotalGrowthM(Arith.round(item.getTotalGrowthM(), 0));
                    item.setTotalGrowthY(Arith.round(item.getTotalGrowthY(), 0));
                    item.setTotalDaily(Arith.round(item.getTotalDaily(), 0));

                    item.setSmallAmountBalance(Arith.round(item.getSmallAmountBalance(), 0));
                    item.setSmallAmountGrowthM(Arith.round(item.getSmallAmountGrowthM(), 0));
                    item.setSmallAmountGrowthY(Arith.round(item.getSmallAmountGrowthY(), 0));
                    item.setSmallAmountDaily(Arith.round(item.getSmallAmountDaily(), 0));

                    item.setConsumptionBalance(Arith.round(item.getConsumptionBalance(), 0));
                    item.setConsumptionGrowthM(Arith.round(item.getConsumptionGrowthM(), 0));
                    item.setConsumptionGrowthY(Arith.round(item.getConsumptionGrowthY(), 0));
                    item.setConsumptionDaily(Arith.round(item.getConsumptionDaily(), 0));

                    item.setSmallBusinessBalance(Arith.round(item.getSmallBusinessBalance(), 0));
                    item.setSmallBusinessGrowthM(Arith.round(item.getSmallBusinessGrowthM(), 0));
                    item.setSmallBusinessGrowthY(Arith.round(item.getSmallBusinessGrowthY(), 0));
                    item.setSmallBusinessDaily(Arith.round(item.getSmallBusinessDaily(), 0));

                    item.setCompanyBalance(Arith.round(item.getCompanyBalance(), 0));
                    item.setCompanyGrowthM(Arith.round(item.getCompanyGrowthM(), 0));
                    item.setCompanyGrowthY(Arith.round(item.getCompanyGrowthY(), 0));
                });
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
