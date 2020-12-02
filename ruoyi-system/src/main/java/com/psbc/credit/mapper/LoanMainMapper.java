package com.psbc.credit.mapper;

import com.psbc.credit.domain.LoanMain;
import com.psbc.credit.dto.LoanMainResponseDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 贷款记录表(LoanMain)表数据库访问层
 *
 * @author wangLin
 * @since 2020-11-30 11:40:41
 */
@Component
public interface LoanMainMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param loadRctId 借据号
     * @return 实例对象
     */
    LoanMainResponseDto queryById(String loadRctId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanMainResponseDto> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanMain 实例对象
     * @return 对象列表
     */
    List<LoanMainResponseDto> queryAll(LoanMain loanMain);

    /**
     * 新增数据
     *
     * @param loanMain 实例对象
     * @return 影响行数
     */
    int insert(LoanMain loanMain);

    /**
     * 修改数据
     *
     * @param loanMain 实例对象
     * @return 影响行数
     */
    int update(LoanMain loanMain);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}