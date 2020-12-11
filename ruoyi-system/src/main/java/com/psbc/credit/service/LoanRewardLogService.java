package com.psbc.credit.service;

import com.psbc.credit.domain.LoanRewardLog;

import java.util.List;

/**
 * 信贷奖励发放记录表(LoanRewardLog)表服务接口
 *
 * @author wangLin
 * @since 2020-12-11 16:29:27
 */
public interface LoanRewardLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanRewardLog queryById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanRewardLog 实例对象
     * @return 对象列表
     */
    List<LoanRewardLog> queryAll(LoanRewardLog loanRewardLog);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanRewardLog> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param loanRewardLog 实例对象
     * @return 实例对象
     */
    LoanRewardLog insert(LoanRewardLog loanRewardLog);

    /**
     * 修改数据
     *
     * @param loanRewardLog 实例对象
     * @return 实例对象
     */
    LoanRewardLog update(LoanRewardLog loanRewardLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}