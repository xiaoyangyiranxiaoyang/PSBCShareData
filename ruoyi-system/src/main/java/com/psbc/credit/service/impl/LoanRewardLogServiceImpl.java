package com.psbc.credit.service.impl;

import com.psbc.credit.domain.LoanRewardLog;
import com.psbc.credit.mapper.LoanRewardLogMapper;
import com.psbc.credit.service.LoanRewardLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 信贷奖励发放记录表(LoanRewardLog)表服务实现类
 *
 * @author wangLin
 * @since 2020-12-11 16:29:28
 */
@Service("loanRewardLogService")
public class LoanRewardLogServiceImpl implements LoanRewardLogService {
    @Resource
    private LoanRewardLogMapper loanRewardLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LoanRewardLog queryById(Long id) {
        return this.loanRewardLogDao.queryById(id);
    }

    @Override
    public List<LoanRewardLog> queryAll(LoanRewardLog loanRewardLog) {
        return this.loanRewardLogDao.queryAll(loanRewardLog);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LoanRewardLog> queryAllByLimit(int offset, int limit) {
        return this.loanRewardLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param loanRewardLog 实例对象
     * @return 实例对象
     */
    @Override
    public LoanRewardLog insert(LoanRewardLog loanRewardLog) {
        this.loanRewardLogDao.insert(loanRewardLog);
        return loanRewardLog;
    }

    /**
     * 修改数据
     *
     * @param loanRewardLog 实例对象
     * @return 实例对象
     */
    @Override
    public LoanRewardLog update(LoanRewardLog loanRewardLog) {
        this.loanRewardLogDao.update(loanRewardLog);
        return this.queryById(loanRewardLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.loanRewardLogDao.deleteById(id) > 0;
    }
}