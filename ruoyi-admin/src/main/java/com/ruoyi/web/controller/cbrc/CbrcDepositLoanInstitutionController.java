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
import com.psbc.datashare.cbrc.domain.CbrcDepositLoanInstitution;
import com.psbc.datashare.cbrc.service.ICbrcDepositLoanInstitutionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 银行业金融机构存贷款分机构情况Controller
 *
 * @author mql
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/datashare/cbrc/deposit_loan_institution")
public class CbrcDepositLoanInstitutionController extends BaseController {
    private String prefix = "datashare/cbrc/deposit_loan_institution";

    @Autowired
    private ICbrcDepositLoanInstitutionService cbrcDepositLoanInstitutionService;

    @RequiresPermissions("datashare/cbrc:deposit_loan_institution:view")
    @GetMapping()
    public String deposit_loan_institution() {
        return prefix + "/deposit_loan_institution";
    }

    /**
     * 查询银行业金融机构存贷款分机构情况列表
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_institution:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CbrcDepositLoanInstitution cbrcDepositLoanInstitution) {
        //startPage();
        List<CbrcDepositLoanInstitution> list = cbrcDepositLoanInstitutionService.selectCbrcDepositLoanInstitutionList(cbrcDepositLoanInstitution);
        Optional.ofNullable(list).orElse(new ArrayList<>())
                .forEach(item -> {
                    item.setDepositBalance(Arith.round(item.getDepositBalance(), 2));
                    item.setDepositGrowthM(Arith.round(item.getDepositGrowthM(), 2));
                    item.setDepositGrowthY(Arith.round(item.getDepositGrowthY(), 2));
                    item.setLoanBalance(Arith.round(item.getLoanBalance(), 2));
                    item.setLoanGrowthM(Arith.round(item.getLoanGrowthM(), 2));
                    item.setLoanGrowthY(Arith.round(item.getLoanGrowthY(), 2));
                });
        return getDataTable(list);
    }

    /**
     * 导出银行业金融机构存贷款分机构情况列表
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_institution:export")
    @Log(title = "银行业金融机构存贷款分机构情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CbrcDepositLoanInstitution cbrcDepositLoanInstitution) {
        List<CbrcDepositLoanInstitution> list = cbrcDepositLoanInstitutionService.selectCbrcDepositLoanInstitutionList(cbrcDepositLoanInstitution);
        ExcelUtil<CbrcDepositLoanInstitution> util = new ExcelUtil<CbrcDepositLoanInstitution>(CbrcDepositLoanInstitution.class);
        return util.exportExcel(list, "deposit_loan_institution");
    }

    /**
     * 新增银行业金融机构存贷款分机构情况
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存银行业金融机构存贷款分机构情况
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_institution:add")
    @Log(title = "银行业金融机构存贷款分机构情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CbrcDepositLoanInstitution cbrcDepositLoanInstitution) {
        return toAjax(cbrcDepositLoanInstitutionService.insertCbrcDepositLoanInstitution(cbrcDepositLoanInstitution));
    }

    /**
     * 修改银行业金融机构存贷款分机构情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        CbrcDepositLoanInstitution cbrcDepositLoanInstitution = cbrcDepositLoanInstitutionService.selectCbrcDepositLoanInstitutionById(id);
        mmap.put("cbrcDepositLoanInstitution", cbrcDepositLoanInstitution);
        return prefix + "/edit";
    }

    /**
     * 修改保存银行业金融机构存贷款分机构情况
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_institution:edit")
    @Log(title = "银行业金融机构存贷款分机构情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CbrcDepositLoanInstitution cbrcDepositLoanInstitution) {
        return toAjax(cbrcDepositLoanInstitutionService.updateCbrcDepositLoanInstitution(cbrcDepositLoanInstitution));
    }

    /**
     * 删除银行业金融机构存贷款分机构情况
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_institution:remove")
    @Log(title = "银行业金融机构存贷款分机构情况", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(cbrcDepositLoanInstitutionService.deleteCbrcDepositLoanInstitutionByIds(ids));
    }
}
