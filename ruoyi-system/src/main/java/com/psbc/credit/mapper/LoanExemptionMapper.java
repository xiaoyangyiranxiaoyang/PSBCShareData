package com.psbc.credit.mapper;

import com.psbc.credit.domain.LoanExemption;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 信贷免责记录表(LoanExemption)表数据库访问层
 *
 * @author wangLin
 * @since 2020-12-11 15:44:42
 */
@Component
public interface LoanExemptionMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanExemption queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanExemption> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanExemption 实例对象
     * @return 对象列表
     */
    List<LoanExemption> queryAll(LoanExemption loanExemption);

    /**
     * 新增数据
     *
     * @param loanExemption 实例对象
     * @return 影响行数
     */
    int insert(LoanExemption loanExemption);

    /**
     * 修改数据
     *
     * @param loanExemption 实例对象
     * @return 影响行数
     */
    int update(LoanExemption loanExemption);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}