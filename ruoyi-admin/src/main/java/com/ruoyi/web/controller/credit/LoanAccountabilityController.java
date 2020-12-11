package com.ruoyi.web.controller.credit;

import com.psbc.credit.domain.LoanAccountability;
import com.psbc.credit.domain.LoanRewardConfig;
import com.psbc.credit.dto.LoanRewardConfigDto;
import com.psbc.credit.service.LoanAccountabilityService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 信贷问责记录表(LoanAccountability)表控制层
 *
 * @author wangLin
 * @since 2020-12-11 14:37:53
 */
@RestController
@RequestMapping("/credit/accountability/")
public class LoanAccountabilityController extends BaseController {
    private String prefix = "credit/accountability/";
    /**
     * 服务对象
     */
    @Resource
    private LoanAccountabilityService loanAccountabilityService;

    @RequiresPermissions("credit:accountability:view")
    @GetMapping()
    public String loanAccountabilityList()
    {
        return prefix + "list";
    }

    /**
     * 查询问责列表数据
     * @param loanAccountability 查询参数
     * @return 多条数据`
     */
    @PostMapping("list")
    @RequiresPermissions("credit:accountability:list")
    @ResponseBody
    public TableDataInfo list(LoanAccountability loanAccountability)
    {
        startPage();
        List<LoanAccountability> list = loanAccountabilityService.queryAll(loanAccountability);
        return getDataTable(list);
    }

}