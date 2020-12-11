package com.psbc.credit.service;

import com.psbc.credit.domain.LoanRewardConfig;
import com.psbc.credit.dto.LoanRewardConfigDto;

import java.util.List;

/**
 * (LoanRewardConfig)表服务接口
 *
 * @author wangLin
 * @since 2020-12-09 09:00:06
 */
public interface LoanRewardConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoanRewardConfig queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LoanRewardConfig> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param loanRewardConfig 实例对象
     * @return 实例对象
     */
    LoanRewardConfig insert(LoanRewardConfig loanRewardConfig);

    /**
     * 修改数据
     *
     * @param loanRewardConfig 实例对象
     * @return 实例对象
     */
    LoanRewardConfig update(LoanRewardConfig loanRewardConfig);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param loanRewardConfigDto 实例对象
     * @return 对象列表
     */
    List<LoanRewardConfig> queryAll(LoanRewardConfigDto loanRewardConfigDto);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);
    /**
     * 清空缓存数据
     */
    public void clearCache();
    /**
     * 批量删除
     * @param ids 需要删除的数据
     * @return 结果
     * @throws Exception 异常
     */
    int deleteByIds(String ids);
}