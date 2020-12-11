package com.ruoyi.web.controller.credit;

import com.psbc.credit.domain.LoanRewardConfig;
import com.psbc.credit.dto.LoanMainDto;
import com.psbc.credit.dto.LoanMainResponseDto;
import com.psbc.credit.dto.LoanRewardConfigDto;
import com.psbc.credit.service.LoanMainService;
import com.psbc.credit.service.LoanRewardConfigService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysDept;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.AddressUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.system.service.ISysDeptService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


/**
 * 贷款奖励配置(LoanMain)表控制层
 *
 * @author wangLin
 * @since 2020-11-30 11:40:39
 */
@Controller
@RequestMapping("/credit/reward/config")
public class LoanMainRewardConfigController extends BaseController {

    private String prefix = "credit/config/";
    /**
     * 服务对象
     */
    @Resource
    private final LoanRewardConfigService loanRewardConfigService;
    @Resource
    private final ISysDeptService deptService;

    public LoanMainRewardConfigController(LoanRewardConfigService loanRewardConfigService, ISysDeptService deptService) {
        this.loanRewardConfigService = loanRewardConfigService;
        this.deptService = deptService;
    }
    @RequiresPermissions("credit:reward:config:view")
    @GetMapping()
    public String loanMainList()
    {
        return prefix + "list";
    }
    /**
     * 查询信贷奖励配置列表数据
     * @param loanRewardConfigDto 查询参数
     * @return 多条数据`
     */
    @PostMapping("/list")
    @RequiresPermissions("credit:reward:config:list")
    @ResponseBody
    public TableDataInfo list(LoanRewardConfigDto loanRewardConfigDto)
    {
        startPage();
        List<LoanRewardConfig> list = loanRewardConfigService.queryAll(loanRewardConfigDto);
        return getDataTable(list);
    }
    /**
     * 查询信贷奖励配置详情
     * @param loadRctId 借据号
     * @return 单条数据`
     */
    @RequiresPermissions("credit:reward:Config:detail")
    @GetMapping("/detail/{loadRctId}")
    public String detail(@PathVariable("loadRctId") String loadRctId, ModelMap mmap)
    {
        mmap.put("loanMain", loanRewardConfigService.queryById(loadRctId));
        return prefix+"detail";
    }
    /**
     * 新增信贷奖励配置
     */
    @RequiresPermissions("credit:reward:config:add")
    @GetMapping("/add/{id}")
    public String add(@PathVariable("id") String id, ModelMap mmap)
    {
        Long deptId  = ShiroUtils.getSysUser().getParentId();
        if (Objects.isNull(deptId)){
            deptId = ShiroUtils.getSysUser().getDeptId();
        }
        mmap.put("dept", deptService.selectDeptById(deptId));
        return prefix + "add";
    }

    /**
     * 修改信贷奖励配置
     * @param id 主键
     * @return 单条数据`
     */
    @RequiresPermissions("credit:reward:config:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        mmap.put("rewardConfig", loanRewardConfigService.queryById(id));
        return prefix+"edit";
    }
    /**
     * 保存
     * @param loanRewardConfig 传入参数
     * @return 单条数据`
     */
    @RequiresPermissions("credit:reward:config:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult save(LoanRewardConfig loanRewardConfig)
    {
        SysDept sysDept = deptService.selectDeptById(loanRewardConfig.getDeptId());
        if (Objects.nonNull(sysDept.getParentId())){
            loanRewardConfig.setParentId(sysDept.getParentId());
        }else{
            loanRewardConfig.setParentId(sysDept.getDeptId());
        }
        loanRewardConfig.setDeptName(sysDept.getDeptName());
        loanRewardConfig.setCreateBy(ShiroUtils.getSysUser().getLoginName());
        loanRewardConfig.setServerIp(ShiroUtils.getIp());
        loanRewardConfigService.insert(loanRewardConfig);
        return AjaxResult.success();
    }
    /**
     * 保存
     * @param loanRewardConfig 传入参数
     * @return 单条数据`
     */
    @RequiresPermissions("credit:reward:config:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LoanRewardConfig loanRewardConfig)
    {
        loanRewardConfig.setUpdateBy(ShiroUtils.getSysUser().getLoginName());
        loanRewardConfig.setServerIp(ShiroUtils.getIp());
        loanRewardConfigService.update(loanRewardConfig);
        return AjaxResult.success();
    }
    /**
     * 删除
     * @param id 传入参数
     * @return 单条数据`
     */
    @RequiresPermissions("credit:reward:config:remove")
    @PostMapping("/remove/{id}")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id )
    {
        LoanRewardConfig loanRewardConfig = new LoanRewardConfig();
        loanRewardConfig.setId(id);
        loanRewardConfig.setUpdateBy(ShiroUtils.getSysUser().getLoginName());
        loanRewardConfig.setServerIp(ShiroUtils.getIp());
        loanRewardConfig.setDelFlag(1);
        loanRewardConfigService.update(loanRewardConfig);
        return AjaxResult.success();
    }
    @RequiresPermissions("credit:reward:config:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(loanRewardConfigService.deleteByIds(ids));
    }
    /**
     * 清空缓存
     */
    @RequiresPermissions("credit:reward:config:clear")
    @Log(title = "参数管理", businessType = BusinessType.CLEAN)
    @GetMapping("/clearCache")
    @ResponseBody
    public AjaxResult clearCache()
    {
        loanRewardConfigService.clearCache();
        return success();
    }
}