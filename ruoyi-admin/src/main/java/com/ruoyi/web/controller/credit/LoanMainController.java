package com.ruoyi.web.controller.credit;

import com.psbc.credit.dto.LoanMainDto;
import com.psbc.credit.dto.LoanMainResponseDto;
import com.psbc.credit.service.LoanMainService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    @RequiresPermissions("system:dict:view")
    @GetMapping()
    public String loanMainList()
    {
        return prefix + "list";
    }
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
     * 通过主键查询单条数据
     *
     * @param loadRctId 主键
     * @return 单条数据
     */
    @RequiresPermissions("credit:loanMain:detail")
    @GetMapping("/selectOne")
    public LoanMainResponseDto selectOne(String loadRctId) {
        return this.loanMainService.queryById(loadRctId);
    }
}