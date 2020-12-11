package com.psbc.credit.service.impl;

import com.psbc.credit.domain.LoanAccountability;
import com.psbc.credit.mapper.LoanAccountabilityMapper;
import com.psbc.credit.service.LoanAccountabilityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 信贷问责记录表(LoanAccountability)表服务实现类
 *
 * @author wangLin
 * @since 2020-12-11 14:37:51
 */
@Service("loanAccountabilityService")
public class LoanAccountabilityServiceImpl implements LoanAccountabilityService {
    @Resource
    private LoanAccountabilityMapper loanAccountabilityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LoanAccountability queryById(Object id) {
        return this.loanAccountabilityDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LoanAccountability> queryAllByLimit(int offset, int limit) {
        return this.loanAccountabilityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param loanAccountability 实例对象
     * @return 实例对象
     */
    @Override
    public LoanAccountability insert(LoanAccountability loanAccountability) {
        this.loanAccountabilityDao.insert(loanAccountability);
        return loanAccountability;
    }

    /**
     * 修改数据
     *
     * @param loanAccountability 实例对象
     * @return 实例对象
     */
    @Override
    public LoanAccountability update(LoanAccountability loanAccountability) {
        this.loanAccountabilityDao.update(loanAccountability);
        return this.queryById(loanAccountability.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.loanAccountabilityDao.deleteById(id) > 0;
    }

    @Override
    public List<LoanAccountability> queryAll(LoanAccountability loanAccountability) {
        return this.loanAccountabilityDao.queryAll(loanAccountability);
    }
}