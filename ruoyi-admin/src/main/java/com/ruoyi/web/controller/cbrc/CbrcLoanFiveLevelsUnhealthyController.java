package com.ruoyi.web.controller.cbrc;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsUnhealthy;
import com.psbc.datashare.cbrc.service.ICbrcLoanFiveLevelsUnhealthyService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 青海省银行业金融机构贷款五级分类不良情况Controller
 * 
 * @author mql
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/datashare/cbrc/five_levels_unhealthy")
public class CbrcLoanFiveLevelsUnhealthyController extends BaseController
{
    private String prefix = "datashare/cbrc/five_levels_unhealthy";

    @Autowired
    private ICbrcLoanFiveLevelsUnhealthyService cbrcLoanFiveLevelsUnhealthyService;

    @RequiresPermissions("datashare/cbrc:five_levels_unhealthy:view")
    @GetMapping()
    public String five_levels_unhealthy()
    {
        return prefix + "/five_levels_unhealthy";
    }

    /**
     * 查询青海省银行业金融机构贷款五级分类不良情况列表
     */
    @RequiresPermissions("datashare/cbrc:five_levels_unhealthy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy)
    {
        startPage();
        List<CbrcLoanFiveLevelsUnhealthy> list = cbrcLoanFiveLevelsUnhealthyService.selectCbrcLoanFiveLevelsUnhealthyList(cbrcLoanFiveLevelsUnhealthy);
        return getDataTable(list);
    }

    /**
     * 导出青海省银行业金融机构贷款五级分类不良情况列表
     */
    @RequiresPermissions("datashare/cbrc:five_levels_unhealthy:export")
    @Log(title = "青海省银行业金融机构贷款五级分类不良情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy)
    {
        List<CbrcLoanFiveLevelsUnhealthy> list = cbrcLoanFiveLevelsUnhealthyService.selectCbrcLoanFiveLevelsUnhealthyList(cbrcLoanFiveLevelsUnhealthy);
        ExcelUtil<CbrcLoanFiveLevelsUnhealthy> util = new ExcelUtil<CbrcLoanFiveLevelsUnhealthy>(CbrcLoanFiveLevelsUnhealthy.class);
        return util.exportExcel(list, "five_levels_unhealthy");
    }

    /**
     * 新增青海省银行业金融机构贷款五级分类不良情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存青海省银行业金融机构贷款五级分类不良情况
     */
    @RequiresPermissions("datashare/cbrc:five_levels_unhealthy:add")
    @Log(title = "青海省银行业金融机构贷款五级分类不良情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy)
    {
        return toAjax(cbrcLoanFiveLevelsUnhealthyService.insertCbrcLoanFiveLevelsUnhealthy(cbrcLoanFiveLevelsUnhealthy));
    }

    /**
     * 修改青海省银行业金融机构贷款五级分类不良情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy = cbrcLoanFiveLevelsUnhealthyService.selectCbrcLoanFiveLevelsUnhealthyById(id);
        mmap.put("cbrcLoanFiveLevelsUnhealthy", cbrcLoanFiveLevelsUnhealthy);
        return prefix + "/edit";
    }

    /**
     * 修改保存青海省银行业金融机构贷款五级分类不良情况
     */
    @RequiresPermissions("datashare/cbrc:five_levels_unhealthy:edit")
    @Log(title = "青海省银行业金融机构贷款五级分类不良情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CbrcLoanFiveLevelsUnhealthy cbrcLoanFiveLevelsUnhealthy)
    {
        return toAjax(cbrcLoanFiveLevelsUnhealthyService.updateCbrcLoanFiveLevelsUnhealthy(cbrcLoanFiveLevelsUnhealthy));
    }

    /**
     * 删除青海省银行业金融机构贷款五级分类不良情况
     */
    @RequiresPermissions("datashare/cbrc:five_levels_unhealthy:remove")
    @Log(title = "青海省银行业金融机构贷款五级分类不良情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cbrcLoanFiveLevelsUnhealthyService.deleteCbrcLoanFiveLevelsUnhealthyByIds(ids));
    }
}
