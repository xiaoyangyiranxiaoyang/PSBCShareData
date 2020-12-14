package com.ruoyi.web.controller.credit;

import com.psbc.credit.domain.LoanNotice;
import com.psbc.credit.domain.LoanRewardLog;
import com.psbc.credit.service.LoanRewardLogService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/**
 * 信贷奖励发放记录表(LoanRewardLog)表控制层
 *
 * @author wangLin
 * @since 2020-12-11 16:29:29
 */
@Controller
@RequestMapping("credit/reward/log")
public class LoanRewardLogController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private LoanRewardLogService loanRewardLogService;

    private String prefix = "credit/rewardLog/";

    @RequiresPermissions("credit:reward:log:view")
    @GetMapping()
    public String loanRewardLogList()
    {
        return prefix + "list";
    }
    /**
     * 查询奖励记录列表数据
     * @param loanRewardLog 查询参数
     * @return 多条数据`
     */
    @PostMapping("/list")
    @RequiresPermissions("credit:reward:log:list")
    @ResponseBody
    public TableDataInfo list(LoanRewardLog loanRewardLog)
    {
        startPage();
        List<LoanRewardLog> list = loanRewardLogService.queryAll(loanRewardLog);
        return getDataTable(list);
    }

}