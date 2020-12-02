package com.psbc.credit.service;

import com.psbc.credit.domain.LoanMain;
import com.psbc.credit.dto.LoanMainDto;
import com.psbc.credit.dto.LoanMainResponseDto;

import java.util.List;


/**
 * 贷款记录表(LoanMain)表服务接口
 *
 * @author wangLin
 * @since 2020-11-30 11:40:32
 */
public interface LoanMainService {

    /**
     * 通过ID查询单条数据
     *
     * @param loadRctId 主键
     * @return 实例对象
     */
    LoanMainResponseDto queryById(String loadRctId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanMainResponseDto> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param loanMain 实例对象
     * @return 实例对象
     */
    LoanMain insert(LoanMain loanMain);

    /**
     * 根据条件查询所有数据
     * @param loanMainDto 实例对象
     * @return 实例对象
     */
    List<LoanMainResponseDto> queryAll(LoanMainDto loanMainDto);
    /**
     * 修改数据
     *
     * @param loanMain 实例对象
     * @return 实例对象
     */
    LoanMain update(LoanMain loanMain);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}