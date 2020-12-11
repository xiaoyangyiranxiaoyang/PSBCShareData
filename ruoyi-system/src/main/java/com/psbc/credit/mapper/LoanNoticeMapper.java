package com.psbc.credit.mapper;

import com.psbc.credit.domain.LoanNotice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 信贷提醒记录表(LoanNotice)表数据库访问层
 *
 * @author wangLin
 * @since 2020-12-11 15:45:19
 */
@Component
public interface LoanNoticeMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanNotice queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanNotice> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanNotice 实例对象
     * @return 对象列表
     */
    List<LoanNotice> queryAll(LoanNotice loanNotice);

    /**
     * 新增数据
     *
     * @param loanNotice 实例对象
     * @return 影响行数
     */
    int insert(LoanNotice loanNotice);

    /**
     * 修改数据
     *
     * @param loanNotice 实例对象
     * @return 影响行数
     */
    int update(LoanNotice loanNotice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}