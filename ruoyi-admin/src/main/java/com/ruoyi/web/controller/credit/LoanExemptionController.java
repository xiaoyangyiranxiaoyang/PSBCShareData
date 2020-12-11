package com.ruoyi.web.controller.credit;

import com.psbc.credit.domain.LoanAccountability;
import com.psbc.credit.domain.LoanExemption;
import com.psbc.credit.service.LoanAccountabilityService;
import com.psbc.credit.service.LoanExemptionService;
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
 * 信贷免责记录表(LoanExemption)表控制层
 *
 * @author wangLin
 * @since 2020-12-11 15:44:39
 */
@RestController
@RequestMapping("loan/exemption/")
public class LoanExemptionController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private LoanExemptionService loanExemptionService;
    private String prefix = "credit/exemption/";

    @RequiresPermissions("credit:exemption:view")
    @GetMapping()
    public String loanExemptionList()
    {
        return prefix + "list";
    }

    /**
     * 查询免责列表数据
     * @param loanExemption 查询参数
     * @return 多条数据`
     */
    @PostMapping("list")
    @RequiresPermissions("credit:exemption:list")
    @ResponseBody
    public TableDataInfo list(LoanExemption loanExemption)
    {
        startPage();
        List<LoanExemption> list = loanExemptionService.queryAll(loanExemption);
        return getDataTable(list);
    }

}