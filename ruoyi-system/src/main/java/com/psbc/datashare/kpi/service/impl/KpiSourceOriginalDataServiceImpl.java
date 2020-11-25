package com.psbc.datashare.kpi.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.datashare.kpi.mapper.KpiSourceOriginalDataMapper;
import com.psbc.datashare.kpi.domain.KpiSourceOriginalData;
import com.psbc.datashare.kpi.service.IKpiSourceOriginalDataService;
import com.ruoyi.common.core.text.Convert;

/**
 * 数据原（商业银行日报）Service业务层处理
 * 
 * @author mql
 * @date 2020-11-25
 */
@Service
public class KpiSourceOriginalDataServiceImpl implements IKpiSourceOriginalDataService 
{
    @Autowired
    private KpiSourceOriginalDataMapper kpiSourceOriginalDataMapper;

    /**
     * 查询数据原（商业银行日报）
     * 
     * @param id 数据原（商业银行日报）ID
     * @return 数据原（商业银行日报）
     */
    @Override
    public KpiSourceOriginalData selectKpiSourceOriginalDataById(Long id)
    {
        return kpiSourceOriginalDataMapper.selectKpiSourceOriginalDataById(id);
    }

    /**
     * 查询数据原（商业银行日报）列表
     * 
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 数据原（商业银行日报）
     */
    @Override
    public List<KpiSourceOriginalData> selectKpiSourceOriginalDataList(KpiSourceOriginalData kpiSourceOriginalData)
    {
        return kpiSourceOriginalDataMapper.selectKpiSourceOriginalDataList(kpiSourceOriginalData);
    }

    /**
     * 新增数据原（商业银行日报）
     * 
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 结果
     */
    @Override
    public int insertKpiSourceOriginalData(KpiSourceOriginalData kpiSourceOriginalData)
    {
        kpiSourceOriginalData.setCreateTime(DateUtils.getNowDate());
        return kpiSourceOriginalDataMapper.insertKpiSourceOriginalData(kpiSourceOriginalData);
    }

    /**
     * 修改数据原（商业银行日报）
     * 
     * @param kpiSourceOriginalData 数据原（商业银行日报）
     * @return 结果
     */
    @Override
    public int updateKpiSourceOriginalData(KpiSourceOriginalData kpiSourceOriginalData)
    {
        kpiSourceOriginalData.setUpdateTime(DateUtils.getNowDate());
        return kpiSourceOriginalDataMapper.updateKpiSourceOriginalData(kpiSourceOriginalData);
    }

    /**
     * 删除数据原（商业银行日报）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceOriginalDataByIds(String ids)
    {
        return kpiSourceOriginalDataMapper.deleteKpiSourceOriginalDataByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除数据原（商业银行日报）信息
     * 
     * @param id 数据原（商业银行日报）ID
     * @return 结果
     */
    @Override
    public int deleteKpiSourceOriginalDataById(Long id)
    {
        return kpiSourceOriginalDataMapper.deleteKpiSourceOriginalDataById(id);
    }
}
