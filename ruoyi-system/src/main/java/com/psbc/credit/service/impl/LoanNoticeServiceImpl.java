package com.psbc.credit.service.impl;

import com.psbc.credit.domain.LoanNotice;
import com.psbc.credit.mapper.LoanNoticeMapper;
import com.psbc.credit.service.LoanNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 信贷提醒记录表(LoanNotice)表服务实现类
 *
 * @author wangLin
 * @since 2020-12-11 15:45:19
 */
@Service("loanNoticeService")
public class LoanNoticeServiceImpl implements LoanNoticeService {
    @Resource
    private LoanNoticeMapper loanNoticeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LoanNotice queryById(Long id) {
        return this.loanNoticeDao.queryById(id);
    }

    @Override
    public List<LoanNotice> queryAll(LoanNotice loanNotice) {
        return this.loanNoticeDao.queryAll(loanNotice);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LoanNotice> queryAllByLimit(int offset, int limit) {
        return this.loanNoticeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param loanNotice 实例对象
     * @return 实例对象
     */
    @Override
    public LoanNotice insert(LoanNotice loanNotice) {
        this.loanNoticeDao.insert(loanNotice);
        return loanNotice;
    }

    /**
     * 修改数据
     *
     * @param loanNotice 实例对象
     * @return 实例对象
     */
    @Override
    public LoanNotice update(LoanNotice loanNotice) {
        this.loanNoticeDao.update(loanNotice);
        return this.queryById(loanNotice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.loanNoticeDao.deleteById(id) > 0;
    }
}