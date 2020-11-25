package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 代理储蓄数据对象 kpi_source_saving_data
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiSourceSavingData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 地区 */
    @Excel(name = "地区")
    private String district;

    /** 本日余额-全省 */
    @Excel(name = "本日余额-全省")
    private BigDecimal dailyBalance;

    /** 本日余额-自营 */
    @Excel(name = "本日余额-自营")
    private BigDecimal dailyBalanceSelf;

    /** 本日余额-代理 */
    @Excel(name = "本日余额-代理")
    private BigDecimal dailyBalanceAgent;

    /** 本日新增-全省 */
    @Excel(name = "本日新增-全省")
    private BigDecimal dailyIncrease;

    /** 本日新增-自营 */
    @Excel(name = "本日新增-自营")
    private BigDecimal dailyIncreaseSelf;

    /** 本日新增-代理 */
    @Excel(name = "本日新增-代理")
    private BigDecimal dailyIncreaseAgent;

    /** 本月新增-全省 */
    @Excel(name = "本月新增-全省")
    private BigDecimal monthlyIncrease;

    /** 本月新增-自营 */
    @Excel(name = "本月新增-自营")
    private BigDecimal monthlyIncreaseSelf;

    /** 本月新增-代理 */
    @Excel(name = "本月新增-代理")
    private BigDecimal monthlyIncreaseAgent;

    /** 本年新增-全省 */
    @Excel(name = "本年新增-全省")
    private BigDecimal yearlyIncrease;

    /** 本年新增-自营 */
    @Excel(name = "本年新增-自营")
    private BigDecimal yearlyIncreaseSelf;

    /** 本年新增-代理 */
    @Excel(name = "本年新增-代理")
    private BigDecimal yearlyIncreaseAgent;

    /** 数据日期 */
    @Excel(name = "数据日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dataDate;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }
    public void setDailyBalance(BigDecimal dailyBalance) 
    {
        this.dailyBalance = dailyBalance;
    }

    public BigDecimal getDailyBalance() 
    {
        return dailyBalance;
    }
    public void setDailyBalanceSelf(BigDecimal dailyBalanceSelf) 
    {
        this.dailyBalanceSelf = dailyBalanceSelf;
    }

    public BigDecimal getDailyBalanceSelf() 
    {
        return dailyBalanceSelf;
    }
    public void setDailyBalanceAgent(BigDecimal dailyBalanceAgent) 
    {
        this.dailyBalanceAgent = dailyBalanceAgent;
    }

    public BigDecimal getDailyBalanceAgent() 
    {
        return dailyBalanceAgent;
    }
    public void setDailyIncrease(BigDecimal dailyIncrease) 
    {
        this.dailyIncrease = dailyIncrease;
    }

    public BigDecimal getDailyIncrease() 
    {
        return dailyIncrease;
    }
    public void setDailyIncreaseSelf(BigDecimal dailyIncreaseSelf) 
    {
        this.dailyIncreaseSelf = dailyIncreaseSelf;
    }

    public BigDecimal getDailyIncreaseSelf() 
    {
        return dailyIncreaseSelf;
    }
    public void setDailyIncreaseAgent(BigDecimal dailyIncreaseAgent) 
    {
        this.dailyIncreaseAgent = dailyIncreaseAgent;
    }

    public BigDecimal getDailyIncreaseAgent() 
    {
        return dailyIncreaseAgent;
    }
    public void setMonthlyIncrease(BigDecimal monthlyIncrease) 
    {
        this.monthlyIncrease = monthlyIncrease;
    }

    public BigDecimal getMonthlyIncrease() 
    {
        return monthlyIncrease;
    }
    public void setMonthlyIncreaseSelf(BigDecimal monthlyIncreaseSelf) 
    {
        this.monthlyIncreaseSelf = monthlyIncreaseSelf;
    }

    public BigDecimal getMonthlyIncreaseSelf() 
    {
        return monthlyIncreaseSelf;
    }
    public void setMonthlyIncreaseAgent(BigDecimal monthlyIncreaseAgent) 
    {
        this.monthlyIncreaseAgent = monthlyIncreaseAgent;
    }

    public BigDecimal getMonthlyIncreaseAgent() 
    {
        return monthlyIncreaseAgent;
    }
    public void setYearlyIncrease(BigDecimal yearlyIncrease) 
    {
        this.yearlyIncrease = yearlyIncrease;
    }

    public BigDecimal getYearlyIncrease() 
    {
        return yearlyIncrease;
    }
    public void setYearlyIncreaseSelf(BigDecimal yearlyIncreaseSelf) 
    {
        this.yearlyIncreaseSelf = yearlyIncreaseSelf;
    }

    public BigDecimal getYearlyIncreaseSelf() 
    {
        return yearlyIncreaseSelf;
    }
    public void setYearlyIncreaseAgent(BigDecimal yearlyIncreaseAgent) 
    {
        this.yearlyIncreaseAgent = yearlyIncreaseAgent;
    }

    public BigDecimal getYearlyIncreaseAgent() 
    {
        return yearlyIncreaseAgent;
    }
    public void setDataDate(Date dataDate) 
    {
        this.dataDate = dataDate;
    }

    public Date getDataDate() 
    {
        return dataDate;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("district", getDistrict())
            .append("dailyBalance", getDailyBalance())
            .append("dailyBalanceSelf", getDailyBalanceSelf())
            .append("dailyBalanceAgent", getDailyBalanceAgent())
            .append("dailyIncrease", getDailyIncrease())
            .append("dailyIncreaseSelf", getDailyIncreaseSelf())
            .append("dailyIncreaseAgent", getDailyIncreaseAgent())
            .append("monthlyIncrease", getMonthlyIncrease())
            .append("monthlyIncreaseSelf", getMonthlyIncreaseSelf())
            .append("monthlyIncreaseAgent", getMonthlyIncreaseAgent())
            .append("yearlyIncrease", getYearlyIncrease())
            .append("yearlyIncreaseSelf", getYearlyIncreaseSelf())
            .append("yearlyIncreaseAgent", getYearlyIncreaseAgent())
            .append("dataDate", getDataDate())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
