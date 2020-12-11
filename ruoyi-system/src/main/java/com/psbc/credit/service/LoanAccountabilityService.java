package com.psbc.credit.service;

import com.psbc.credit.domain.LoanAccountability;

import java.util.List;
/**
 * 信贷问责记录表(LoanAccountability)表服务接口
 *
 * @author wangLin
 * @since 2020-12-11 14:37:50
 */
public interface LoanAccountabilityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanAccountability queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanAccountability> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param loanAccountability 实例对象
     * @return 实例对象
     */
    LoanAccountability insert(LoanAccountability loanAccountability);

    /**
     * 修改数据
     *
     * @param loanAccountability 实例对象
     * @return 实例对象
     */
    LoanAccountability update(LoanAccountability loanAccountability);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);
    /**
     * 通过主键删除数据
     *
     * @param loanAccountability 参数
     * @return 集合对象
     */
    List<LoanAccountability> queryAll(LoanAccountability loanAccountability);

}