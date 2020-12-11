package com.ruoyi.web.controller.cbrc;

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
import com.psbc.datashare.cbrc.domain.CbrcDepositLoanMonthlyDailyAvg;
import com.psbc.datashare.cbrc.service.ICbrcDepositLoanMonthlyDailyAvgService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分机构存贷款月日均情况Controller
 * 
 * @author mql
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/datashare/cbrc/deposit_loan_m_d_avg")
public class CbrcDepositLoanMonthlyDailyAvgController extends BaseController
{
    private String prefix = "datashare/cbrc/deposit_loan_m_d_avg";

    @Autowired
    private ICbrcDepositLoanMonthlyDailyAvgService cbrcDepositLoanMonthlyDailyAvgService;

    @RequiresPermissions("datashare/cbrc:deposit_loan_m_d_avg:view")
    @GetMapping()
    public String deposit_loan_m_d_avg()
    {
        return prefix + "/deposit_loan_m_d_avg";
    }

    /**
     * 查询分机构存贷款月日均情况列表
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_m_d_avg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg)
    {
        startPage();
        List<CbrcDepositLoanMonthlyDailyAvg> list = cbrcDepositLoanMonthlyDailyAvgService.selectCbrcDepositLoanMonthlyDailyAvgList(cbrcDepositLoanMonthlyDailyAvg);
        return getDataTable(list);
    }

    /**
     * 导出分机构存贷款月日均情况列表
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_m_d_avg:export")
    @Log(title = "分机构存贷款月日均情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg)
    {
        List<CbrcDepositLoanMonthlyDailyAvg> list = cbrcDepositLoanMonthlyDailyAvgService.selectCbrcDepositLoanMonthlyDailyAvgList(cbrcDepositLoanMonthlyDailyAvg);
        ExcelUtil<CbrcDepositLoanMonthlyDailyAvg> util = new ExcelUtil<CbrcDepositLoanMonthlyDailyAvg>(CbrcDepositLoanMonthlyDailyAvg.class);
        return util.exportExcel(list, "deposit_loan_m_d_avg");
    }

    /**
     * 新增分机构存贷款月日均情况
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存分机构存贷款月日均情况
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_m_d_avg:add")
    @Log(title = "分机构存贷款月日均情况", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg)
    {
        return toAjax(cbrcDepositLoanMonthlyDailyAvgService.insertCbrcDepositLoanMonthlyDailyAvg(cbrcDepositLoanMonthlyDailyAvg));
    }

    /**
     * 修改分机构存贷款月日均情况
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg = cbrcDepositLoanMonthlyDailyAvgService.selectCbrcDepositLoanMonthlyDailyAvgById(id);
        mmap.put("cbrcDepositLoanMonthlyDailyAvg", cbrcDepositLoanMonthlyDailyAvg);
        return prefix + "/edit";
    }

    /**
     * 修改保存分机构存贷款月日均情况
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_m_d_avg:edit")
    @Log(title = "分机构存贷款月日均情况", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CbrcDepositLoanMonthlyDailyAvg cbrcDepositLoanMonthlyDailyAvg)
    {
        return toAjax(cbrcDepositLoanMonthlyDailyAvgService.updateCbrcDepositLoanMonthlyDailyAvg(cbrcDepositLoanMonthlyDailyAvg));
    }

    /**
     * 删除分机构存贷款月日均情况
     */
    @RequiresPermissions("datashare/cbrc:deposit_loan_m_d_avg:remove")
    @Log(title = "分机构存贷款月日均情况", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cbrcDepositLoanMonthlyDailyAvgService.deleteCbrcDepositLoanMonthlyDailyAvgByIds(ids));
    }
}
