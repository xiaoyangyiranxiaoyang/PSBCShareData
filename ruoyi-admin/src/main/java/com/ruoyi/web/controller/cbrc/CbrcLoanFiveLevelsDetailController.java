package com.ruoyi.web.controller.cbrc;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsDetail;
import com.psbc.datashare.cbrc.service.ICbrcLoanFiveLevelsDetailService;
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
 * 青海省银行业金融机构贷款五级分类明细Controller
 *
 * @author mql
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/datashare/cbrc/five_levels_detail")
public class CbrcLoanFiveLevelsDetailController extends BaseController {
    private String prefix = "datashare/cbrc/five_levels_detail";

    @Autowired
    private ICbrcLoanFiveLevelsDetailService cbrcLoanFiveLevelsDetailService;

    @RequiresPermissions("datashare/cbrc:five_levels_detail:view")
    @GetMapping()
    public String five_levels_detail() {
        return prefix + "/five_levels_detail";
    }

    /**
     * 查询青海省银行业金融机构贷款五级分类明细列表
     */
    @RequiresPermissions("datashare/cbrc:five_levels_detail:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail) {
        startPage();
        List<CbrcLoanFiveLevelsDetail> list = cbrcLoanFiveLevelsDetailService.selectCbrcLoanFiveLevelsDetailList(cbrcLoanFiveLevelsDetail);
        return getDataTable(list);
    }

    /**
     * 导出青海省银行业金融机构贷款五级分类明细列表
     */
    @RequiresPermissions("datashare/cbrc:five_levels_detail:export")
    @Log(title = "青海省银行业金融机构贷款五级分类明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail) {
        List<CbrcLoanFiveLevelsDetail> list = cbrcLoanFiveLevelsDetailService.selectCbrcLoanFiveLevelsDetailList(cbrcLoanFiveLevelsDetail);
        ExcelUtil<CbrcLoanFiveLevelsDetail> util = new ExcelUtil<CbrcLoanFiveLevelsDetail>(CbrcLoanFiveLevelsDetail.class);
        return util.exportExcel(list, "five_levels_detail");
    }

    /**
     * 新增青海省银行业金融机构贷款五级分类明细
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存青海省银行业金融机构贷款五级分类明细
     */
    @RequiresPermissions("datashare/cbrc:five_levels_detail:add")
    @Log(title = "青海省银行业金融机构贷款五级分类明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail) {
        return toAjax(cbrcLoanFiveLevelsDetailService.insertCbrcLoanFiveLevelsDetail(cbrcLoanFiveLevelsDetail));
    }

    /**
     * 修改青海省银行业金融机构贷款五级分类明细
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail = cbrcLoanFiveLevelsDetailService.selectCbrcLoanFiveLevelsDetailById(id);
        mmap.put("cbrcLoanFiveLevelsDetail", cbrcLoanFiveLevelsDetail);
        return prefix + "/edit";
    }

    /**
     * 修改保存青海省银行业金融机构贷款五级分类明细
     */
    @RequiresPermissions("datashare/cbrc:five_levels_detail:edit")
    @Log(title = "青海省银行业金融机构贷款五级分类明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail) {
        return toAjax(cbrcLoanFiveLevelsDetailService.updateCbrcLoanFiveLevelsDetail(cbrcLoanFiveLevelsDetail));
    }

    /**
     * 删除青海省银行业金融机构贷款五级分类明细
     */
    @RequiresPermissions("datashare/cbrc:five_levels_detail:remove")
    @Log(title = "青海省银行业金融机构贷款五级分类明细", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(cbrcLoanFiveLevelsDetailService.deleteCbrcLoanFiveLevelsDetailByIds(ids));
    }
}
