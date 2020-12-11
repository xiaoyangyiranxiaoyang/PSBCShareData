package com.psbc.credit.service;

import com.psbc.credit.domain.LoanNotice;

import java.util.List;

/**
 * 信贷提醒记录表(LoanNotice)表服务接口
 *
 * @author wangLin
 * @since 2020-12-11 15:45:19
 */
public interface LoanNoticeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanNotice queryById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanNotice 实例对象
     * @return 对象列表
     */
    List<LoanNotice> queryAll(LoanNotice loanNotice);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanNotice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param loanNotice 实例对象
     * @return 实例对象
     */
    LoanNotice insert(LoanNotice loanNotice);

    /**
     * 修改数据
     *
     * @param loanNotice 实例对象
     * @return 实例对象
     */
    LoanNotice update(LoanNotice loanNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}