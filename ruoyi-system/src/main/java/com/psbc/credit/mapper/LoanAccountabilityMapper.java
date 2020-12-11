package com.psbc.credit.mapper;

import com.psbc.credit.domain.LoanAccountability;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 信贷问责记录表(LoanAccountability)表数据库访问层
 *
 * @author wangLin
 * @since 2020-12-11 14:37:55
 */
@Component
public interface LoanAccountabilityMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanAccountability queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanAccountability> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanAccountability 实例对象
     * @return 对象列表
     */
    List<LoanAccountability> queryAll(LoanAccountability loanAccountability);

    /**
     * 新增数据
     *
     * @param loanAccountability 实例对象
     * @return 影响行数
     */
    int insert(LoanAccountability loanAccountability);

    /**
     * 修改数据
     *
     * @param loanAccountability 实例对象
     * @return 影响行数
     */
    int update(LoanAccountability loanAccountability);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}