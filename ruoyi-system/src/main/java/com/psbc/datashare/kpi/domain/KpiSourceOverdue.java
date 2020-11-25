package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 零售信贷逾期对象 kpi_source_overdue
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiSourceOverdue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 地区 */
    @Excel(name = "地区")
    private String district;

    /** 个人经营性贷款-逾期余额 */
    @Excel(name = "个人经营性贷款-逾期余额")
    private BigDecimal personalBusinessBalance;

    /** 个人经营性贷款-逾期余额较上期 */
    @Excel(name = "个人经营性贷款-逾期余额较上期")
    private BigDecimal personalBusinessBalanceLast;

    /** 个人经营性贷款-逾期余额较年初 */
    @Excel(name = "个人经营性贷款-逾期余额较年初")
    private BigDecimal personalBusinessBalanceBy;

    /** 个人经营性贷款-逾期率 */
    @Excel(name = "个人经营性贷款-逾期率")
    private BigDecimal personalBusinessRate;

    /** 个人经营性贷款-逾期率较上期 */
    @Excel(name = "个人经营性贷款-逾期率较上期")
    private BigDecimal personalBusinessRateLast;

    /** 个人经营性贷款-逾期率较年初 */
    @Excel(name = "个人经营性贷款-逾期率较年初")
    private BigDecimal personalBusinessRateBy;

    /** 个人消费贷款-逾期余额 */
    @Excel(name = "个人消费贷款-逾期余额")
    private BigDecimal personalConsumerBalance;

    /** 个人消费贷款-逾期余额较上期 */
    @Excel(name = "个人消费贷款-逾期余额较上期")
    private BigDecimal personalConsumerBalanceLast;

    /** 个人消费贷款-逾期余额较年初 */
    @Excel(name = "个人消费贷款-逾期余额较年初")
    private BigDecimal personalConsumerBalanceBy;

    /** 个人消费贷款-逾期率 */
    @Excel(name = "个人消费贷款-逾期率")
    private BigDecimal personalConsumerRate;

    /** 个人消费贷款-逾期率较上期 */
    @Excel(name = "个人消费贷款-逾期率较上期")
    private BigDecimal personalConsumerRateLast;

    /** 个人消费贷款-逾期率较年初 */
    @Excel(name = "个人消费贷款-逾期率较年初")
    private BigDecimal personalConsumerRateBy;

    /** 小企业贷款-逾期余额 */
    @Excel(name = "小企业贷款-逾期余额")
    private BigDecimal smallBusinessbalance;

    /** 小企业贷款-逾期余额较上期 */
    @Excel(name = "小企业贷款-逾期余额较上期")
    private BigDecimal smallBusinessbalanceLast;

    /** 小企业贷款-逾期余额较年初 */
    @Excel(name = "小企业贷款-逾期余额较年初")
    private BigDecimal smallBusinessbalanceBy;

    /** 小企业贷款-逾期率 */
    @Excel(name = "小企业贷款-逾期率")
    private BigDecimal smallBusinessrate;

    /** 小企业贷款-逾期率较上期 */
    @Excel(name = "小企业贷款-逾期率较上期")
    private BigDecimal smallBusinessrateLast;

    /** 小企业贷款-逾期率较年初 */
    @Excel(name = "小企业贷款-逾期率较年初")
    private BigDecimal smallBusinessrateBy;

    /** 信用卡业务-逾期余额 */
    @Excel(name = "信用卡业务-逾期余额")
    private BigDecimal creditCardBalance;

    /** 信用卡业务-逾期余额较上期 */
    @Excel(name = "信用卡业务-逾期余额较上期")
    private BigDecimal creditCardBalanceLast;

    /** 信用卡业务-逾期余额较年初 */
    @Excel(name = "信用卡业务-逾期余额较年初")
    private BigDecimal creditCardBalanceBy;

    /** 信用卡业务-逾期率 */
    @Excel(name = "信用卡业务-逾期率")
    private BigDecimal creditCardRate;

    /** 信用卡业务-逾期率较上期 */
    @Excel(name = "信用卡业务-逾期率较上期")
    private BigDecimal creditCardRateLast;

    /** 信用卡业务-逾期率较年初 */
    @Excel(name = "信用卡业务-逾期率较年初")
    private BigDecimal creditCardRateBy;

    /** 零售-逾期余额 */
    @Excel(name = "零售-逾期余额")
    private BigDecimal retailBalance;

    /** 零售-逾期余额较上期 */
    @Excel(name = "零售-逾期余额较上期")
    private BigDecimal retailBalanceLast;

    /** 零售-逾期余额较年初 */
    @Excel(name = "零售-逾期余额较年初")
    private BigDecimal retailBalanceBy;

    /** 零售-逾期率 */
    @Excel(name = "零售-逾期率")
    private BigDecimal retailRate;

    /** 零售-逾期率较上期 */
    @Excel(name = "零售-逾期率较上期")
    private BigDecimal retailRateLast;

    /** 零售-逾期率较年初 */
    @Excel(name = "零售-逾期率较年初")
    private BigDecimal retailRateBy;

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
    public void setPersonalBusinessBalance(BigDecimal personalBusinessBalance) 
    {
        this.personalBusinessBalance = personalBusinessBalance;
    }

    public BigDecimal getPersonalBusinessBalance() 
    {
        return personalBusinessBalance;
    }
    public void setPersonalBusinessBalanceLast(BigDecimal personalBusinessBalanceLast) 
    {
        this.personalBusinessBalanceLast = personalBusinessBalanceLast;
    }

    public BigDecimal getPersonalBusinessBalanceLast() 
    {
        return personalBusinessBalanceLast;
    }
    public void setPersonalBusinessBalanceBy(BigDecimal personalBusinessBalanceBy) 
    {
        this.personalBusinessBalanceBy = personalBusinessBalanceBy;
    }

    public BigDecimal getPersonalBusinessBalanceBy() 
    {
        return personalBusinessBalanceBy;
    }
    public void setPersonalBusinessRate(BigDecimal personalBusinessRate) 
    {
        this.personalBusinessRate = personalBusinessRate;
    }

    public BigDecimal getPersonalBusinessRate() 
    {
        return personalBusinessRate;
    }
    public void setPersonalBusinessRateLast(BigDecimal personalBusinessRateLast) 
    {
        this.personalBusinessRateLast = personalBusinessRateLast;
    }

    public BigDecimal getPersonalBusinessRateLast() 
    {
        return personalBusinessRateLast;
    }
    public void setPersonalBusinessRateBy(BigDecimal personalBusinessRateBy) 
    {
        this.personalBusinessRateBy = personalBusinessRateBy;
    }

    public BigDecimal getPersonalBusinessRateBy() 
    {
        return personalBusinessRateBy;
    }
    public void setPersonalConsumerBalance(BigDecimal personalConsumerBalance) 
    {
        this.personalConsumerBalance = personalConsumerBalance;
    }

    public BigDecimal getPersonalConsumerBalance() 
    {
        return personalConsumerBalance;
    }
    public void setPersonalConsumerBalanceLast(BigDecimal personalConsumerBalanceLast) 
    {
        this.personalConsumerBalanceLast = personalConsumerBalanceLast;
    }

    public BigDecimal getPersonalConsumerBalanceLast() 
    {
        return personalConsumerBalanceLast;
    }
    public void setPersonalConsumerBalanceBy(BigDecimal personalConsumerBalanceBy) 
    {
        this.personalConsumerBalanceBy = personalConsumerBalanceBy;
    }

    public BigDecimal getPersonalConsumerBalanceBy() 
    {
        return personalConsumerBalanceBy;
    }
    public void setPersonalConsumerRate(BigDecimal personalConsumerRate) 
    {
        this.personalConsumerRate = personalConsumerRate;
    }

    public BigDecimal getPersonalConsumerRate() 
    {
        return personalConsumerRate;
    }
    public void setPersonalConsumerRateLast(BigDecimal personalConsumerRateLast) 
    {
        this.personalConsumerRateLast = personalConsumerRateLast;
    }

    public BigDecimal getPersonalConsumerRateLast() 
    {
        return personalConsumerRateLast;
    }
    public void setPersonalConsumerRateBy(BigDecimal personalConsumerRateBy) 
    {
        this.personalConsumerRateBy = personalConsumerRateBy;
    }

    public BigDecimal getPersonalConsumerRateBy() 
    {
        return personalConsumerRateBy;
    }
    public void setSmallBusinessbalance(BigDecimal smallBusinessbalance) 
    {
        this.smallBusinessbalance = smallBusinessbalance;
    }

    public BigDecimal getSmallBusinessbalance() 
    {
        return smallBusinessbalance;
    }
    public void setSmallBusinessbalanceLast(BigDecimal smallBusinessbalanceLast) 
    {
        this.smallBusinessbalanceLast = smallBusinessbalanceLast;
    }

    public BigDecimal getSmallBusinessbalanceLast() 
    {
        return smallBusinessbalanceLast;
    }
    public void setSmallBusinessbalanceBy(BigDecimal smallBusinessbalanceBy) 
    {
        this.smallBusinessbalanceBy = smallBusinessbalanceBy;
    }

    public BigDecimal getSmallBusinessbalanceBy() 
    {
        return smallBusinessbalanceBy;
    }
    public void setSmallBusinessrate(BigDecimal smallBusinessrate) 
    {
        this.smallBusinessrate = smallBusinessrate;
    }

    public BigDecimal getSmallBusinessrate() 
    {
        return smallBusinessrate;
    }
    public void setSmallBusinessrateLast(BigDecimal smallBusinessrateLast) 
    {
        this.smallBusinessrateLast = smallBusinessrateLast;
    }

    public BigDecimal getSmallBusinessrateLast() 
    {
        return smallBusinessrateLast;
    }
    public void setSmallBusinessrateBy(BigDecimal smallBusinessrateBy) 
    {
        this.smallBusinessrateBy = smallBusinessrateBy;
    }

    public BigDecimal getSmallBusinessrateBy() 
    {
        return smallBusinessrateBy;
    }
    public void setCreditCardBalance(BigDecimal creditCardBalance) 
    {
        this.creditCardBalance = creditCardBalance;
    }

    public BigDecimal getCreditCardBalance() 
    {
        return creditCardBalance;
    }
    public void setCreditCardBalanceLast(BigDecimal creditCardBalanceLast) 
    {
        this.creditCardBalanceLast = creditCardBalanceLast;
    }

    public BigDecimal getCreditCardBalanceLast() 
    {
        return creditCardBalanceLast;
    }
    public void setCreditCardBalanceBy(BigDecimal creditCardBalanceBy) 
    {
        this.creditCardBalanceBy = creditCardBalanceBy;
    }

    public BigDecimal getCreditCardBalanceBy() 
    {
        return creditCardBalanceBy;
    }
    public void setCreditCardRate(BigDecimal creditCardRate) 
    {
        this.creditCardRate = creditCardRate;
    }

    public BigDecimal getCreditCardRate() 
    {
        return creditCardRate;
    }
    public void setCreditCardRateLast(BigDecimal creditCardRateLast) 
    {
        this.creditCardRateLast = creditCardRateLast;
    }

    public BigDecimal getCreditCardRateLast() 
    {
        return creditCardRateLast;
    }
    public void setCreditCardRateBy(BigDecimal creditCardRateBy) 
    {
        this.creditCardRateBy = creditCardRateBy;
    }

    public BigDecimal getCreditCardRateBy() 
    {
        return creditCardRateBy;
    }
    public void setRetailBalance(BigDecimal retailBalance) 
    {
        this.retailBalance = retailBalance;
    }

    public BigDecimal getRetailBalance() 
    {
        return retailBalance;
    }
    public void setRetailBalanceLast(BigDecimal retailBalanceLast) 
    {
        this.retailBalanceLast = retailBalanceLast;
    }

    public BigDecimal getRetailBalanceLast() 
    {
        return retailBalanceLast;
    }
    public void setRetailBalanceBy(BigDecimal retailBalanceBy) 
    {
        this.retailBalanceBy = retailBalanceBy;
    }

    public BigDecimal getRetailBalanceBy() 
    {
        return retailBalanceBy;
    }
    public void setRetailRate(BigDecimal retailRate) 
    {
        this.retailRate = retailRate;
    }

    public BigDecimal getRetailRate() 
    {
        return retailRate;
    }
    public void setRetailRateLast(BigDecimal retailRateLast) 
    {
        this.retailRateLast = retailRateLast;
    }

    public BigDecimal getRetailRateLast() 
    {
        return retailRateLast;
    }
    public void setRetailRateBy(BigDecimal retailRateBy) 
    {
        this.retailRateBy = retailRateBy;
    }

    public BigDecimal getRetailRateBy() 
    {
        return retailRateBy;
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
            .append("personalBusinessBalance", getPersonalBusinessBalance())
            .append("personalBusinessBalanceLast", getPersonalBusinessBalanceLast())
            .append("personalBusinessBalanceBy", getPersonalBusinessBalanceBy())
            .append("personalBusinessRate", getPersonalBusinessRate())
            .append("personalBusinessRateLast", getPersonalBusinessRateLast())
            .append("personalBusinessRateBy", getPersonalBusinessRateBy())
            .append("personalConsumerBalance", getPersonalConsumerBalance())
            .append("personalConsumerBalanceLast", getPersonalConsumerBalanceLast())
            .append("personalConsumerBalanceBy", getPersonalConsumerBalanceBy())
            .append("personalConsumerRate", getPersonalConsumerRate())
            .append("personalConsumerRateLast", getPersonalConsumerRateLast())
            .append("personalConsumerRateBy", getPersonalConsumerRateBy())
            .append("smallBusinessbalance", getSmallBusinessbalance())
            .append("smallBusinessbalanceLast", getSmallBusinessbalanceLast())
            .append("smallBusinessbalanceBy", getSmallBusinessbalanceBy())
            .append("smallBusinessrate", getSmallBusinessrate())
            .append("smallBusinessrateLast", getSmallBusinessrateLast())
            .append("smallBusinessrateBy", getSmallBusinessrateBy())
            .append("creditCardBalance", getCreditCardBalance())
            .append("creditCardBalanceLast", getCreditCardBalanceLast())
            .append("creditCardBalanceBy", getCreditCardBalanceBy())
            .append("creditCardRate", getCreditCardRate())
            .append("creditCardRateLast", getCreditCardRateLast())
            .append("creditCardRateBy", getCreditCardRateBy())
            .append("retailBalance", getRetailBalance())
            .append("retailBalanceLast", getRetailBalanceLast())
            .append("retailBalanceBy", getRetailBalanceBy())
            .append("retailRate", getRetailRate())
            .append("retailRateLast", getRetailRateLast())
            .append("retailRateBy", getRetailRateBy())
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
