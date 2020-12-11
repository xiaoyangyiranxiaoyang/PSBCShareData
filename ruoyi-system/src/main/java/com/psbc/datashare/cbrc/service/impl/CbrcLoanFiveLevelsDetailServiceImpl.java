package com.psbc.datashare.cbrc.service.impl;

import com.psbc.datashare.cbrc.domain.CbrcLoanFiveLevelsDetail;
import com.psbc.datashare.cbrc.mapper.CbrcLoanFiveLevelsDetailMapper;
import com.psbc.datashare.cbrc.service.ICbrcLoanFiveLevelsDetailService;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 青海省银行业金融机构贷款五级分类明细Service业务层处理
 * 
 * @author mql
 * @date 2020-12-11
 */
@Service
public class CbrcLoanFiveLevelsDetailServiceImpl implements ICbrcLoanFiveLevelsDetailService
{
    @Autowired
    private CbrcLoanFiveLevelsDetailMapper cbrcLoanFiveLevelsDetailMapper;

    /**
     * 查询青海省银行业金融机构贷款五级分类明细
     * 
     * @param id 青海省银行业金融机构贷款五级分类明细ID
     * @return 青海省银行业金融机构贷款五级分类明细
     */
    @Override
    public CbrcLoanFiveLevelsDetail selectCbrcLoanFiveLevelsDetailById(Long id)
    {
        return cbrcLoanFiveLevelsDetailMapper.selectCbrcLoanFiveLevelsDetailById(id);
    }

    /**
     * 查询青海省银行业金融机构贷款五级分类明细列表
     * 
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 青海省银行业金融机构贷款五级分类明细
     */
    @Override
    public List<CbrcLoanFiveLevelsDetail> selectCbrcLoanFiveLevelsDetailList(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail)
    {
        return cbrcLoanFiveLevelsDetailMapper.selectCbrcLoanFiveLevelsDetailList(cbrcLoanFiveLevelsDetail);
    }

    /**
     * 新增青海省银行业金融机构贷款五级分类明细
     * 
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 结果
     */
    @Override
    public int insertCbrcLoanFiveLevelsDetail(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail)
    {
        cbrcLoanFiveLevelsDetail.setCreateTime(DateUtils.getNowDate());
        return cbrcLoanFiveLevelsDetailMapper.insertCbrcLoanFiveLevelsDetail(cbrcLoanFiveLevelsDetail);
    }

    /**
     * 修改青海省银行业金融机构贷款五级分类明细
     * 
     * @param cbrcLoanFiveLevelsDetail 青海省银行业金融机构贷款五级分类明细
     * @return 结果
     */
    @Override
    public int updateCbrcLoanFiveLevelsDetail(CbrcLoanFiveLevelsDetail cbrcLoanFiveLevelsDetail)
    {
        cbrcLoanFiveLevelsDetail.setUpdateTime(DateUtils.getNowDate());
        return cbrcLoanFiveLevelsDetailMapper.updateCbrcLoanFiveLevelsDetail(cbrcLoanFiveLevelsDetail);
    }

    /**
     * 删除青海省银行业金融机构贷款五级分类明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCbrcLoanFiveLevelsDetailByIds(String ids)
    {
        return cbrcLoanFiveLevelsDetailMapper.deleteCbrcLoanFiveLevelsDetailByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除青海省银行业金融机构贷款五级分类明细信息
     * 
     * @param id 青海省银行业金融机构贷款五级分类明细ID
     * @return 结果
     */
    @Override
    public int deleteCbrcLoanFiveLevelsDetailById(Long id)
    {
        return cbrcLoanFiveLevelsDetailMapper.deleteCbrcLoanFiveLevelsDetailById(id);
    }
}
