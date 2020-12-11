package com.psbc.datashare.cbrc.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.cbrc.mapper.CbrcDepositLoanInstitutionMapper;
import com.psbc.datashare.cbrc.domain.CbrcDepositLoanInstitution;
import com.psbc.datashare.cbrc.service.ICbrcDepositLoanInstitutionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 银行业金融机构存贷款分机构情况Service业务层处理
 * 
 * @author mql
 * @date 2020-12-10
 */
@Service
public class CbrcDepositLoanInstitutionServiceImpl implements ICbrcDepositLoanInstitutionService 
{
    @Autowired
    private CbrcDepositLoanInstitutionMapper cbrcDepositLoanInstitutionMapper;

    /**
     * 查询银行业金融机构存贷款分机构情况
     * 
     * @param id 银行业金融机构存贷款分机构情况ID
     * @return 银行业金融机构存贷款分机构情况
     */
    @Override
    public CbrcDepositLoanInstitution selectCbrcDepositLoanInstitutionById(Long id)
    {
        return cbrcDepositLoanInstitutionMapper.selectCbrcDepositLoanInstitutionById(id);
    }

    /**
     * 查询银行业金融机构存贷款分机构情况列表
     * 
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 银行业金融机构存贷款分机构情况
     */
    @Override
    public List<CbrcDepositLoanInstitution> selectCbrcDepositLoanInstitutionList(CbrcDepositLoanInstitution cbrcDepositLoanInstitution)
    {
        return cbrcDepositLoanInstitutionMapper.selectCbrcDepositLoanInstitutionList(cbrcDepositLoanInstitution);
    }

    /**
     * 新增银行业金融机构存贷款分机构情况
     * 
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 结果
     */
    @Override
    public int insertCbrcDepositLoanInstitution(CbrcDepositLoanInstitution cbrcDepositLoanInstitution)
    {
        cbrcDepositLoanInstitution.setCreateTime(DateUtils.getNowDate());
        return cbrcDepositLoanInstitutionMapper.insertCbrcDepositLoanInstitution(cbrcDepositLoanInstitution);
    }

    /**
     * 修改银行业金融机构存贷款分机构情况
     * 
     * @param cbrcDepositLoanInstitution 银行业金融机构存贷款分机构情况
     * @return 结果
     */
    @Override
    public int updateCbrcDepositLoanInstitution(CbrcDepositLoanInstitution cbrcDepositLoanInstitution)
    {
        cbrcDepositLoanInstitution.setUpdateTime(DateUtils.getNowDate());
        return cbrcDepositLoanInstitutionMapper.updateCbrcDepositLoanInstitution(cbrcDepositLoanInstitution);
    }

    /**
     * 删除银行业金融机构存贷款分机构情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCbrcDepositLoanInstitutionByIds(String ids)
    {
        return cbrcDepositLoanInstitutionMapper.deleteCbrcDepositLoanInstitutionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除银行业金融机构存贷款分机构情况信息
     * 
     * @param id 银行业金融机构存贷款分机构情况ID
     * @return 结果
     */
    @Override
    public int deleteCbrcDepositLoanInstitutionById(Long id)
    {
        return cbrcDepositLoanInstitutionMapper.deleteCbrcDepositLoanInstitutionById(id);
    }
}
