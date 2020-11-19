package com.ruoyi.web.controller.kpi;

import com.psbc.datashare.kpi.domain.KpiIncomeShow;
import com.psbc.datashare.kpi.service.IKpiIncomeShowService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 全行KPI指标（一）Controller
 *
 * @author mql
 * @date 2020-11-18
 */
@Controller
@RequestMapping("/datashare/kpi/incomeshow")
public class KpiIncomeShowController extends BaseController
{
    private String prefix = "datashare/kpi/incomeshow";

    @Autowired
    private IKpiIncomeShowService kpiIncomeShowService;

    @RequiresPermissions("datashare/kpi:incomeshow:view")
    @GetMapping()
    public String incomeshow()
    {
        return prefix + "/incomeshow";
    }

    /**
     * 查询全行KPI指标（一）列表
     */
    @RequiresPermissions("datashare/kpi:incomeshow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(KpiIncomeShow kpiIncomeShow)
    {
        startPage();
        List<KpiIncomeShow> list = kpiIncomeShowService.selectKpiIncomeShowList(kpiIncomeShow);
        return getDataTable(list);
    }

    /**
     * 导出全行KPI指标（一）列表
     */
    @RequiresPermissions("datashare/kpi:incomeshow:export")
    @Log(title = "全行KPI指标（一）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(KpiIncomeShow kpiIncomeShow)
    {
        List<KpiIncomeShow> list = kpiIncomeShowService.selectKpiIncomeShowList(kpiIncomeShow);
        ExcelUtil<KpiIncomeShow> util = new ExcelUtil<KpiIncomeShow>(KpiIncomeShow.class);
        return util.exportExcel(list, "incomeshow");
    }

    @Log(title = "全行KPI指标（一）", businessType = BusinessType.IMPORT)
    @RequiresPermissions("datashare/kpi:incomeshow:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, String dataMonth) throws Exception
    {
        String operName = ShiroUtils.getSysUser().getLoginName();
        String message = kpiIncomeShowService.importKpiIncomeShow(file.getInputStream(), dataMonth, operName);
        return AjaxResult.success(message);
    }

    @RequiresPermissions("datashare/kpi:incomeshow:view")
    @GetMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        try {
            File f = new DefaultResourceLoader().getResource("classpath:templates/datashare/kpi/importtemplate/Template-KPI1.xls").getFile();

            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            FileUtils.setAttachmentResponseHeader(response, "Template-KPI1.xls");
            FileUtils.writeBytes(f, response.getOutputStream());
        } catch (Exception e) {
            logger.error("下载文件（Template-KPI1.xls ）异常{}", e.getMessage());
            throw new BusinessException("下载文件（Template-KPI1.xls ），请联系网站管理员！");
        }
    }

    /**
     * 新增全行KPI指标（一）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存全行KPI指标（一）
     */
    @RequiresPermissions("datashare/kpi:incomeshow:add")
    @Log(title = "全行KPI指标（一）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(KpiIncomeShow kpiIncomeShow)
    {
        return toAjax(kpiIncomeShowService.insertKpiIncomeShow(kpiIncomeShow));
    }

    /**
     * 修改全行KPI指标（一）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        KpiIncomeShow kpiIncomeShow = kpiIncomeShowService.selectKpiIncomeShowById(id);
        mmap.put("kpiIncomeShow", kpiIncomeShow);
        return prefix + "/edit";
    }

    /**
     * 修改保存全行KPI指标（一）
     */
    @RequiresPermissions("datashare/kpi:incomeshow:edit")
    @Log(title = "全行KPI指标（一）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(KpiIncomeShow kpiIncomeShow)
    {
        return toAjax(kpiIncomeShowService.updateKpiIncomeShow(kpiIncomeShow));
    }

    /**
     * 删除全行KPI指标（一）
     */
    @RequiresPermissions("datashare/kpi:incomeshow:remove")
    @Log(title = "全行KPI指标（一）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(kpiIncomeShowService.deleteKpiIncomeShowByIds(ids));
    }
}
