package com.psbc.credit.service.impl;

import com.psbc.credit.domain.LoanMain;
import com.psbc.credit.dto.LoanMainDto;
import com.psbc.credit.dto.LoanMainResponseDto;
import com.psbc.credit.mapper.LoanMainMapper;
import com.psbc.credit.service.LoanMainService;
import com.ruoyi.common.core.domain.entity.SysDictType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 贷款记录表(LoanMain)表服务实现类
 *
 * @author wangLin
 * @since 2020-11-30 11:40:38
 */
@Service
public class LoanMainServiceImpl implements LoanMainService {
    @Resource
    private LoanMainMapper loanMainMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param loadRctId 主键
     * @return 实例对象
     */
    @Override
    public LoanMainResponseDto queryById(String loadRctId) {
        return this.loanMainMapper.queryById(loadRctId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LoanMainResponseDto> queryAllByLimit(int offset, int limit) {
        return this.loanMainMapper.queryAllByLimit(offset, limit);
    }
    /**
     * 新增数据
     *
     * @param loanMain 实例对象
     * @return 实例对象
     */
    @Override
    public LoanMain insert(LoanMain loanMain) {
        this.loanMainMapper.insert(loanMain);
        return loanMain;
    }

    @Override
    public List<LoanMainResponseDto> queryAll(LoanMainDto loanMainDto) {
        return this.loanMainMapper.queryAll(loanMainDto);
    }
    /**
     * 修改数据
     *
     * @param loanMain 实例对象
     * @return 实例对象
     */
    @Override
    public LoanMain update(LoanMain loanMain) {
        this.loanMainMapper.update(loanMain);
        return this.queryById(loanMain.getLoadRctId());
    }
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.loanMainMapper.deleteById(id) > 0;
    }
}