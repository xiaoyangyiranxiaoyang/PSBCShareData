package com.ruoyi.web.controller.cbrc;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.Arith;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.file.FileUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.psbc.datashare.cbrc.domain.CbrcMajorRegulatoryIndicators;
import com.psbc.datashare.cbrc.service.ICbrcMajorRegulatoryIndicatorsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * 主要监管指标汇总Controller
 *
 * @author mql
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/datashare/cbrc/major_regulatory_indicators")
public class CbrcMajorRegulatoryIndicatorsController extends BaseController {
    private String prefix = "datashare/cbrc/major_regulatory_indicators";

    @Autowired
    private ICbrcMajorRegulatoryIndicatorsService cbrcMajorRegulatoryIndicatorsService;

    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:view")
    @GetMapping()
    public String major_regulatory_indicators() {
        return prefix + "/major_regulatory_indicators";
    }

    /**
     * 查询主要监管指标汇总列表
     */
    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators) {
        //startPage();
        List<CbrcMajorRegulatoryIndicators> list = cbrcMajorRegulatoryIndicatorsService.selectCbrcMajorRegulatoryIndicatorsList(cbrcMajorRegulatoryIndicators);
        Optional.ofNullable(list).orElse(new ArrayList<>()).stream()
                .forEach(item -> {
                    if(item.getItem().indexOf("率") > 0){
                        item.setCurrentIssue(Arith.round(Arith.mul(item.getCurrentIssue(), new BigDecimal(100)), 2));
                    } else {
                        item.setCurrentIssue(Arith.round(item.getCurrentIssue(), 2));
                    }
                    item.setCompareBeginYear(Arith.round(item.getCompareBeginYear(), 2));
                    item.setCompateLastYear(Arith.round(item.getCompateLastYear(), 2));
                });

        return getDataTable(list);
    }

    /**
     * 导入 银监局共享数据
     *
     * @param file
     * @param dataMonth
     * @return
     * @throws Exception
     */
    @Log(title = "导入银监局共享数据", businessType = BusinessType.IMPORT)
    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, String dataMonth) throws Exception {
        String operName = ShiroUtils.getSysUser().getLoginName();
        String message = cbrcMajorRegulatoryIndicatorsService.importKpiSourceData(file.getInputStream(), dataMonth, operName);
        return AjaxResult.success(message);
    }

    /**
     * KPI 源数据导入模板下载
     *
     * @param response
     */
    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:view")
    @GetMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response) {
        try {
            File f = new DefaultResourceLoader().getResource("classpath:templates/datashare/kpi/importtemplate/Template-KPI-data_source.xls").getFile();

            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileUtils.setAttachmentResponseHeader(response, "Template-KPI-data_source.xls");
            FileUtils.writeBytes(f, response.getOutputStream());
        } catch (Exception e) {
            logger.error("下载文件（Template-KPI-data_source.xls ）异常{}", e.getMessage());
            throw new BusinessException("下载文件（Template-KPI-data_source.xls）异常，请联系网站管理员！");
        }
    }

    /**
     * 导出主要监管指标汇总列表
     */
    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:export")
    @Log(title = "主要监管指标汇总", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators) {
        List<CbrcMajorRegulatoryIndicators> list = cbrcMajorRegulatoryIndicatorsService.selectCbrcMajorRegulatoryIndicatorsList(cbrcMajorRegulatoryIndicators);
        ExcelUtil<CbrcMajorRegulatoryIndicators> util = new ExcelUtil<CbrcMajorRegulatoryIndicators>(CbrcMajorRegulatoryIndicators.class);
        return util.exportExcel(list, "major_regulatory_indicators");
    }

    /**
     * 新增主要监管指标汇总
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存主要监管指标汇总
     */
    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:add")
    @Log(title = "主要监管指标汇总", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators) {
        return toAjax(cbrcMajorRegulatoryIndicatorsService.insertCbrcMajorRegulatoryIndicators(cbrcMajorRegulatoryIndicators));
    }

    /**
     * 修改主要监管指标汇总
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators = cbrcMajorRegulatoryIndicatorsService.selectCbrcMajorRegulatoryIndicatorsById(id);
        mmap.put("cbrcMajorRegulatoryIndicators", cbrcMajorRegulatoryIndicators);
        return prefix + "/edit";
    }

    /**
     * 修改保存主要监管指标汇总
     */
    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:edit")
    @Log(title = "主要监管指标汇总", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CbrcMajorRegulatoryIndicators cbrcMajorRegulatoryIndicators) {
        return toAjax(cbrcMajorRegulatoryIndicatorsService.updateCbrcMajorRegulatoryIndicators(cbrcMajorRegulatoryIndicators));
    }

    /**
     * 删除主要监管指标汇总
     */
    @RequiresPermissions("datashare/cbrc:major_regulatory_indicators:remove")
    @Log(title = "主要监管指标汇总", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(cbrcMajorRegulatoryIndicatorsService.deleteCbrcMajorRegulatoryIndicatorsByIds(ids));
    }
}
