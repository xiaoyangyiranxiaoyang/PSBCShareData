package com.psbc.credit.service;

import com.psbc.credit.domain.LoanExemption;

import java.util.List;

/**
 * 信贷免责记录表(LoanExemption)表服务接口
 *
 * @author wangLin
 * @since 2020-12-11 15:44:37
 */
public interface LoanExemptionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanExemption queryById(Object id);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanExemption 实例对象
     * @return 对象列表
     */
    List<LoanExemption> queryAll(LoanExemption loanExemption);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanExemption> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param loanExemption 实例对象
     * @return 实例对象
     */
    LoanExemption insert(LoanExemption loanExemption);

    /**
     * 修改数据
     *
     * @param loanExemption 实例对象
     * @return 实例对象
     */
    LoanExemption update(LoanExemption loanExemption);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}