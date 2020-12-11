package com.psbc.credit.service.impl;

import com.psbc.credit.domain.LoanRewardConfig;
import com.psbc.credit.dto.LoanRewardConfigDto;
import com.psbc.credit.mapper.LoanRewardConfigMapper;
import com.psbc.credit.service.LoanRewardConfigService;
import com.ruoyi.common.core.domain.entity.SysDictType;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.BusinessException;
import com.ruoyi.common.utils.DictUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LoanRewardConfig)表服务实现类
 *
 * @author wangLin
 * @since 2020-12-09 09:00:09
 */
@Service
public class LoanRewardConfigServiceImpl implements LoanRewardConfigService {
    @Resource
    private LoanRewardConfigMapper loanRewardConfigMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LoanRewardConfig queryById(Object id) {
        return this.loanRewardConfigMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LoanRewardConfig> queryAllByLimit(int offset, int limit) {
        return this.loanRewardConfigMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param loanRewardConfig 实例对象
     * @return 实例对象
     */
    @Override
    public LoanRewardConfig insert(LoanRewardConfig loanRewardConfig) {
        this.loanRewardConfigMapper.insert(loanRewardConfig);
        return loanRewardConfig;
    }

    /**
     * 修改数据
     *
     * @param loanRewardConfig 实例对象
     * @return 实例对象
     */
    @Override
    public LoanRewardConfig update(LoanRewardConfig loanRewardConfig) {
        this.loanRewardConfigMapper.update(loanRewardConfig);
        return this.queryById(loanRewardConfig.getId());
    }

    @Override
    public List<LoanRewardConfig> queryAll(LoanRewardConfigDto loanRewardConfigDto) {
        return this.loanRewardConfigMapper.queryAll(loanRewardConfigDto);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.loanRewardConfigMapper.deleteById(id) > 0;
    }
    /**
     * 清空缓存数据
     */
    @Override
    public void clearCache()
    {
        DictUtils.clearDictCache();
    }
    /**
     * 批量删除字典类型
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    @Override
    public int deleteByIds(String ids)
    {
        Long[] idArray = Convert.toLongArray(ids);
        int count = loanRewardConfigMapper.deleteByIds(idArray);
        if (count > 0)
        {
            DictUtils.clearDictCache();
        }
        return count;
    }
}