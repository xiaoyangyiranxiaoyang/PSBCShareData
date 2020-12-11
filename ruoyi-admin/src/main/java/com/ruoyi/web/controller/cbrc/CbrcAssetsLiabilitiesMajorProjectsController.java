package com.ruoyi.web.controller.cbrc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.psbc.datashare.cbrc.common.CbrcConstant;
import com.ruoyi.common.json.JSONObject;
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
import com.psbc.datashare.cbrc.domain.CbrcAssetsLiabilitiesMajorProjects;
import com.psbc.datashare.cbrc.service.ICbrcAssetsLiabilitiesMajorProjectsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 银行业机构资产负债主要项目统计Controller
 *
 * @author mql
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/datashare/cbrc/assets_liabilities_projects")
public class CbrcAssetsLiabilitiesMajorProjectsController extends BaseController {
    private String prefix = "datashare/cbrc/assets_liabilities_projects";

    @Autowired
    private ICbrcAssetsLiabilitiesMajorProjectsService cbrcAssetsLiabilitiesMajorProjectsService;

    @RequiresPermissions("datashare/cbrc:assets_liabilities_projects:view")
    @GetMapping()
    public String assets_liabilities_projects() {
        return prefix + "/assets_liabilities_projects";
    }

    /**
     * 查询银行业机构资产负债主要项目统计列表
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_projects:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects) {
        startPage();
        List<CbrcAssetsLiabilitiesMajorProjects> list = cbrcAssetsLiabilitiesMajorProjectsService.selectCbrcAssetsLiabilitiesMajorProjectsList(cbrcAssetsLiabilitiesMajorProjects);
        return getDataTable(list);
    }

    /**
     * 查询银行业机构资产负债主要项目统计列表
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_projects:list")
    @PostMapping("/listShow")
    @ResponseBody
    public TableDataInfo listShow(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects) {
        List<CbrcAssetsLiabilitiesMajorProjects> list = cbrcAssetsLiabilitiesMajorProjectsService.selectCbrcAssetsLiabilitiesMajorProjectsList(cbrcAssetsLiabilitiesMajorProjects);
        List<JSONObject> rrr = new LinkedList<>();

        JSONObject oner = new JSONObject();
        for (CbrcAssetsLiabilitiesMajorProjects item : list) {
            if (CbrcConstant.TYPE_ASSETS_PROJECTS.equals(item.getType())) {
                oner = new JSONObject();
                oner.put("assets_item", item.getItem());
                oner.put("assets_currentIssue", Arith.round(item.getCurrentIssue(), 2));
                oner.put("assets_compareBeginYear", Arith.round(item.getCompareBeginYear(), 2));
                oner.put("assets_compareLastMonth", Arith.round(item.getCompareLastMonth(), 2));
                oner.put("assets_compateLastYearPct", Arith.round(Arith.mul(item.getCompateLastYearPct(), new BigDecimal(100)), 2));
            } else {
                oner.put("liabilities_item", item.getItem());
                oner.put("liabilities_currentIssue", Arith.round(item.getCurrentIssue(), 2));
                oner.put("liabilities_compareBeginYear", Arith.round(item.getCompareBeginYear(), 2));
                oner.put("liabilities_compareLastMonth", Arith.round(item.getCompareLastMonth(), 2));
                oner.put("liabilities_compateLastYearPct", Arith.round(Arith.mul(item.getCompateLastYearPct(), new BigDecimal(100)), 2));
                rrr.add(oner);
            }
        }

        return getDataTable(rrr);
    }

    /**
     * 导出银行业机构资产负债主要项目统计列表
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_projects:export")
    @Log(title = "银行业机构资产负债主要项目统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects) {
        List<CbrcAssetsLiabilitiesMajorProjects> list = cbrcAssetsLiabilitiesMajorProjectsService.selectCbrcAssetsLiabilitiesMajorProjectsList(cbrcAssetsLiabilitiesMajorProjects);
        ExcelUtil<CbrcAssetsLiabilitiesMajorProjects> util = new ExcelUtil<CbrcAssetsLiabilitiesMajorProjects>(CbrcAssetsLiabilitiesMajorProjects.class);
        return util.exportExcel(list, "assets_liabilities_projects");
    }

    /**
     * 新增银行业机构资产负债主要项目统计
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存银行业机构资产负债主要项目统计
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_projects:add")
    @Log(title = "银行业机构资产负债主要项目统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects) {
        return toAjax(cbrcAssetsLiabilitiesMajorProjectsService.insertCbrcAssetsLiabilitiesMajorProjects(cbrcAssetsLiabilitiesMajorProjects));
    }

    /**
     * 修改银行业机构资产负债主要项目统计
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects = cbrcAssetsLiabilitiesMajorProjectsService.selectCbrcAssetsLiabilitiesMajorProjectsById(id);
        mmap.put("cbrcAssetsLiabilitiesMajorProjects", cbrcAssetsLiabilitiesMajorProjects);
        return prefix + "/edit";
    }

    /**
     * 修改保存银行业机构资产负债主要项目统计
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_projects:edit")
    @Log(title = "银行业机构资产负债主要项目统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CbrcAssetsLiabilitiesMajorProjects cbrcAssetsLiabilitiesMajorProjects) {
        return toAjax(cbrcAssetsLiabilitiesMajorProjectsService.updateCbrcAssetsLiabilitiesMajorProjects(cbrcAssetsLiabilitiesMajorProjects));
    }

    /**
     * 删除银行业机构资产负债主要项目统计
     */
    @RequiresPermissions("datashare/cbrc:assets_liabilities_projects:remove")
    @Log(title = "银行业机构资产负债主要项目统计", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(cbrcAssetsLiabilitiesMajorProjectsService.deleteCbrcAssetsLiabilitiesMajorProjectsByIds(ids));
    }
}
