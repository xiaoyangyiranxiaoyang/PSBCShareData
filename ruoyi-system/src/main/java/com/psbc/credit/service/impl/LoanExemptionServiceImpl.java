package com.psbc.credit.service.impl;

import com.psbc.credit.domain.LoanExemption;
import com.psbc.credit.mapper.LoanExemptionMapper;
import com.psbc.credit.service.LoanExemptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 信贷免责记录表(LoanExemption)表服务实现类
 *
 * @author wangLin
 * @since 2020-12-11 15:44:38
 */
@Service("loanExemptionService")
public class LoanExemptionServiceImpl implements LoanExemptionService {
    @Resource
    private LoanExemptionMapper loanExemptionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LoanExemption queryById(Object id) {
        return this.loanExemptionDao.queryById(id);
    }

    @Override
    public List<LoanExemption> queryAll(LoanExemption loanExemption) {
        return this.loanExemptionDao.queryAll(loanExemption);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LoanExemption> queryAllByLimit(int offset, int limit) {
        return this.loanExemptionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param loanExemption 实例对象
     * @return 实例对象
     */
    @Override
    public LoanExemption insert(LoanExemption loanExemption) {
        this.loanExemptionDao.insert(loanExemption);
        return loanExemption;
    }

    /**
     * 修改数据
     *
     * @param loanExemption 实例对象
     * @return 实例对象
     */
    @Override
    public LoanExemption update(LoanExemption loanExemption) {
        this.loanExemptionDao.update(loanExemption);
        return this.queryById(loanExemption.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.loanExemptionDao.deleteById(id) > 0;
    }
}