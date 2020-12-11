package com.ruoyi.web.controller.cbrc;

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
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMainIndicators;
import com.psbc.datashare.cbrc.service.ICbrcAssetsLiabilitiesMainIndicatorsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 金融机构资产负债主要指标Controller
 *
 * @author mql
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/datashare/cbrc/assets_liabilities_indicators")
public class CbrcAssetsLiabilitiesMainIndicatorsController extends BaseController {
    private String prefix = "datashare/cbrc/assets_liabilities_indicators";

    @Autowired
    private ICbrcAssetsLiabilitiesMainIndicatorsService cbrcAssetsLiabilitiesMainIndicatorsService;

    @RequiresPermissions("datashare/cbrc:assets_liabilities_indicators:view")
    @GetMapping()
    public String assets_liabilities_indicators() {
        return prefix + "/assets_liabilities_indicators";
    }

    /**
     * 查询金融机构资产负债主要指标列表
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_indicators:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators) {
        //startPage();
        List<CbrcAssetsLiabilitiesMainIndicators> list = cbrcAssetsLiabilitiesMainIndicatorsService.selectCbrcAssetsLiabilitiesMainIndicatorsList(cbrcAssetsLiabilitiesMainIndicators);
        Optional.ofNullable(list).orElse(new ArrayList<>())
                .forEach(item -> {
                    item.setAssetsTotal(Arith.round(item.getAssetsTotal(), 2));
                    item.setAssetsCompateBeginYear(Arith.round(item.getAssetsCompateBeginYear(), 2));
                    item.setLiabilitiesTotal(Arith.round(item.getLiabilitiesTotal(), 2));
                    item.setLiabilitiesCompateBeginYear(Arith.round(item.getLiabilitiesCompateBeginYear(), 2));
                    item.setOwnerEquity(Arith.round(item.getOwnerEquity(), 2));
                    item.setEquityCompateBeginYear(Arith.round(item.getEquityCompateBeginYear(), 2));
                    item.setProfitThisYear(Arith.round(item.getProfitThisYear(), 2));
                    item.setProfitCompateLastYear(Arith.round(item.getProfitCompateLastYear(), 2));
                });
        return getDataTable(list);
    }

    /**
     * 导出金融机构资产负债主要指标列表
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_indicators:export")
    @Log(title = "金融机构资产负债主要指标", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators) {
        List<CbrcAssetsLiabilitiesMainIndicators> list = cbrcAssetsLiabilitiesMainIndicatorsService.selectCbrcAssetsLiabilitiesMainIndicatorsList(cbrcAssetsLiabilitiesMainIndicators);
        ExcelUtil<CbrcAssetsLiabilitiesMainIndicators> util = new ExcelUtil<CbrcAssetsLiabilitiesMainIndicators>(CbrcAssetsLiabilitiesMainIndicators.class);
        return util.exportExcel(list, "assets_liabilities_indicators");
    }

    /**
     * 新增金融机构资产负债主要指标
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存金融机构资产负债主要指标
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_indicators:add")
    @Log(title = "金融机构资产负债主要指标", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators) {
        return toAjax(cbrcAssetsLiabilitiesMainIndicatorsService.insertCbrcAssetsLiabilitiesMainIndicators(cbrcAssetsLiabilitiesMainIndicators));
    }

    /**
     * 修改金融机构资产负债主要指标
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators = cbrcAssetsLiabilitiesMainIndicatorsService.selectCbrcAssetsLiabilitiesMainIndicatorsById(id);
        mmap.put("cbrcAssetsLiabilitiesMainIndicators", cbrcAssetsLiabilitiesMainIndicators);
        return prefix + "/edit";
    }

    /**
     * 修改保存金融机构资产负债主要指标
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_indicators:edit")
    @Log(title = "金融机构资产负债主要指标", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CbrcAssetsLiabilitiesMainIndicators cbrcAssetsLiabilitiesMainIndicators) {
        return toAjax(cbrcAssetsLiabilitiesMainIndicatorsService.updateCbrcAssetsLiabilitiesMainIndicators(cbrcAssetsLiabilitiesMainIndicators));
    }

    /**
     * 删除金融机构资产负债主要指标
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_indicators:remove")
    @Log(title = "金融机构资产负债主要指标", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(cbrcAssetsLiabilitiesMainIndicatorsService.deleteCbrcAssetsLiabilitiesMainIndicatorsByIds(ids));
    }
}
