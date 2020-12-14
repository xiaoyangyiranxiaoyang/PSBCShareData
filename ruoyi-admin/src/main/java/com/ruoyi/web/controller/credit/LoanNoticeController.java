package com.ruoyi.web.controller.credit;

import com.psbc.credit.domain.LoanExemption;
import com.psbc.credit.domain.LoanNotice;
import com.psbc.credit.dto.LoanMainDto;
import com.psbc.credit.service.LoanNoticeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 信贷提醒记录表(LoanNotice)表控制层
 *
 * @author wangLin
 * @since 2020-12-11 15:45:19
 */
@RestController
@RequestMapping("credit/notice")
public class LoanNoticeController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private LoanNoticeService loanNoticeService;
    private String prefix = "credit/notice/";

    @RequiresPermissions("credit:notice:view")
    @GetMapping()
    public String loanNoticeList()
    {
        return prefix + "list";
    }
    /**
     * 查询提醒列表数据
     * @param loanNotice 查询参数
     * @return 多条数据`
     */
    @PostMapping("/list")
    @RequiresPermissions("credit:notice:list")
    @ResponseBody
    public TableDataInfo list(LoanNotice loanNotice)
    {
        startPage();
        List<LoanNotice> list = loanNoticeService.queryAll(loanNotice);
        return getDataTable(list);
    }
    /**
     * 修改异常提醒详细
     * @param id 逐渐
     * @return 单条数据`
     */
    @RequiresPermissions("credit:notice:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        mmap.put("notice", loanNoticeService.queryById(id));
        return prefix+"edit";
    }
    /**
     * 信贷免责操作
     * @param loanMainDto 传入参数
     * @return 单条数据`
     */
    @RequiresPermissions("credit:notice:save")
    @PostMapping("/save")
    @ResponseBody
    public AjaxResult exemptionSave(LoanNotice loanMainDto)
    {
        LoanNotice loanNotice =  loanNoticeService.queryById(loanMainDto.getId());
        loanNotice.setRemark(loanMainDto.getRemark());
        loanNotice.setIsHandle(1);
        loanNoticeService.update(loanNotice);
        return AjaxResult.success();
    }

}