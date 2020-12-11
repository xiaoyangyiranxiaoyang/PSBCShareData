package com.ruoyi.web.controller.credit;

import com.psbc.credit.dto.LoanMainDto;
import com.psbc.credit.dto.LoanMainResponseDto;
import com.psbc.credit.service.LoanMainService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.AddressUtils;
import com.ruoyi.common.utils.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * 贷款记录表(LoanMain)表控制层
 *
 * @author wangLin
 * @since 2020-11-30 11:40:39
 */
@Controller
@RequestMapping("/credit/loanMain")
public class LoanMainController extends BaseController {

    private String prefix = "credit/list/";
    /**
     * 服务对象
     */
    @Resource
    private final LoanMainService loanMainService;

    public LoanMainController(LoanMainService loanMainService) {
        this.loanMainService = loanMainService;
    }
    @RequiresPermissions("credit:loanMain:view")
    @GetMapping()
    public String loanMainList()
    {
        return prefix + "list";
    }
    /**
     * 查询信贷列表数据
     * @param loanMainDto 查询参数
     * @return 多条数据`
     */
    @PostMapping("/list")
    @RequiresPermissions("credit:loanMain:list")
    @ResponseBody
    public TableDataInfo list(LoanMainDto loanMainDto)
    {
        startPage();
        List<LoanMainResponseDto> list = loanMainService.queryAll(loanMainDto);
        return getDataTable(list);
    }
    /**
     * 查询信贷详情
     * @param loadRctId 借据号
     * @return 单条数据`
     */
    @RequiresPermissions("credit:loanMain:detail")
    @GetMapping("/detail/{loadRctId}")
    public String detail(@PathVariable("loadRctId") String loadRctId, ModelMap mmap)
    {
        mmap.put("loanMain", loanMainService.queryById(loadRctId));
        return prefix+"detail";
    }
    /**
     * 修改信贷详细
     * @param loadRctId 借据号
     * @return 单条数据`
     */
    @RequiresPermissions("credit:loanMain:edit")
    @GetMapping("/edit/{loadRctId}")
    public String edit(@PathVariable("loadRctId") String loadRctId, ModelMap mmap)
    {
        mmap.put("loanMain", loanMainService.queryById(loadRctId));
        return prefix+"edit";
    }
    /**
     * 信贷问责操作
     * @param loadRctId 借据号
     * @return 单条数据`
     */
    @RequiresPermissions("credit:loanMain:accountability")
    @GetMapping("/accountability/{loadRctId}")
    public String accountability(@PathVariable("loadRctId") String loadRctId, ModelMap mmap)
    {
        mmap.put("loanMain", loanMainService.queryById(loadRctId));
        return prefix+"accountability";
    }
    /**
     * 信贷免责操作
     * @param loadRctId 借据号
     * @return 单条数据`
     */
    @RequiresPermissions("credit:loanMain:exemption")
    @GetMapping("/exemption/{loadRctId}")
    public String exemption(@PathVariable("loadRctId") String loadRctId, ModelMap mmap)
    {
        mmap.put("loanMain", loanMainService.queryById(loadRctId));
        return prefix+"exemption";
    }
    /**
     * 信贷问责保存
     * @param loanMainDto 传入数据
     * @return 单条数据`
     */
    @RequiresPermissions("credit:loanMain:accountability")
    @PostMapping("/accountability/save")
    @ResponseBody
    public AjaxResult accountabilitySave(LoanMainDto loanMainDto)
    {
        //修改信贷记录表
        //查询奖励是否发放,修改奖励发放信息
        //生成问责记录
        String operName = ShiroUtils.getSysUser().getLoginName();
        String address = AddressUtils.getRealAddressByIP(ShiroUtils.getIp());
        return loanMainService.accountabilitySave(loanMainDto);
    }
    /**
     * 信贷免责操作
     * @param loanMainDto 传入参数
     * @return 单条数据`
     */
    @RequiresPermissions("credit:loanMain:exemption")
    @PostMapping("/exemption/save")
    @ResponseBody
    public AjaxResult exemptionSave(LoanMainDto loanMainDto)
    {
        return loanMainService.exemptionSave(loanMainDto);
    }

    /**
     * 清空缓存
     */
    @RequiresPermissions("credit:loanMain:remove")
    @Log(title = "参数管理", businessType = BusinessType.CLEAN)
    @GetMapping("/clearCache")
    @ResponseBody
    public AjaxResult clearCache()
    {
        loanMainService.clearCache();
        return success();
    }
}