package com.psbc.credit.mapper;

import com.psbc.credit.domain.LoanRewardConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * (LoanRewardConfig)表数据库访问层
 *
 * @author wangLin
 * @since 2020-12-09 09:06:58
 */
@Component
public interface LoanRewardConfigMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanRewardConfig queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanRewardConfig> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanRewardConfig 实例对象
     * @return 对象列表
     */
    List<LoanRewardConfig> queryAll(LoanRewardConfig loanRewardConfig);

    /**
     * 新增数据
     *
     * @param loanRewardConfig 实例对象
     * @return 影响行数
     */
    int insert(LoanRewardConfig loanRewardConfig);

    /**
     * 修改数据
     *
     * @param loanRewardConfig 实例对象
     * @return 影响行数
     */
    int update(LoanRewardConfig loanRewardConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
    /**
     * 批量删除数据
     * @param idArray 主键
     * @return 影响行数
     */
    int deleteByIds(Long[] idArray);
}