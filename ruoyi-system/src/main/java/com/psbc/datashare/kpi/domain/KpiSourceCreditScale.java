package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 信贷规模对象 kpi_source_credit_scale
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiSourceCreditScale extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 地区 */
    @Excel(name = "地区")
    private String district;

    /** 个人贷款-小额贷款 */
    @Excel(name = "个人贷款-小额贷款")
    private BigDecimal microloans;

    /** 个人贷款-个商贷款 */
    @Excel(name = "个人贷款-个商贷款")
    private BigDecimal individualBusiness;

    /** 个人贷款-住房按揭贷款 */
    @Excel(name = "个人贷款-住房按揭贷款")
    private BigDecimal homeMortgage;

    /** 个人贷款-其他消费贷款 */
    @Excel(name = "个人贷款-其他消费贷款")
    private BigDecimal otherConsumer;

    /** 个人贷款-其他贷款 */
    @Excel(name = "个人贷款-其他贷款")
    private BigDecimal personalOther;

    /** 公司贷款-小企业 */
    @Excel(name = "公司贷款-小企业")
    private BigDecimal smallBusiness;

    /** 公司贷款-供应链 */
    @Excel(name = "公司贷款-供应链")
    private BigDecimal supplyChain;

    /** 公司贷款-国内贸易融资 */
    @Excel(name = "公司贷款-国内贸易融资")
    private BigDecimal domesticTradeFinance;

    /** 公司贷款-国际贸易融资 */
    @Excel(name = "公司贷款-国际贸易融资")
    private BigDecimal internationalTradeFinance;

    /** 公司贷款-其他公司贷款 */
    @Excel(name = "公司贷款-其他公司贷款")
    private BigDecimal otherCompany;

    /** 公司贷款-专项融资 */
    @Excel(name = "公司贷款-专项融资")
    private BigDecimal dedicatedFinancing;

    /** 公司贷款-小企业保理 */
    @Excel(name = "公司贷款-小企业保理")
    private BigDecimal smallBusinessFactoring;

    /** 公司贷款-其他 */
    @Excel(name = "公司贷款-其他")
    private BigDecimal corporateOther;

    /** 公司贷款-法人账户透支 */
    @Excel(name = "公司贷款-法人账户透支")
    private BigDecimal corporationOverdraft;

    /** 公司贷款-三农公司贷款 */
    @Excel(name = "公司贷款-三农公司贷款")
    private BigDecimal threeFarmersCompany;

    /** 公司贷款-国际公司贷款 */
    @Excel(name = "公司贷款-国际公司贷款")
    private BigDecimal internationalCompany;

    /** 公司贷款-并购贷款 */
    @Excel(name = "公司贷款-并购贷款")
    private BigDecimal mergersAcquisitions;

    /** 公司贷款-各项垫款 */
    @Excel(name = "公司贷款-各项垫款")
    private BigDecimal variousAdvances;

    /** 票据-转贴现 */
    @Excel(name = "票据-转贴现")
    private BigDecimal rediscount;

    /** 票据-直贴 */
    @Excel(name = "票据-直贴")
    private BigDecimal directPaste;

    /** 透支-个人透支 */
    @Excel(name = "透支-个人透支")
    private BigDecimal personalOverdraft;

    /** 透支-单位透支 */
    @Excel(name = "透支-单位透支")
    private BigDecimal unitOverdraft;

    /** 国际-外币贷款 */
    @Excel(name = "国际-外币贷款")
    private BigDecimal foreignCurrency;

    /** 国际-买入福费廷(人民币) */
    @Excel(name = "国际-买入福费廷(人民币)")
    private BigDecimal buyForfeitingRmb;

    /** 国际-买入福费廷(外币) */
    @Excel(name = "国际-买入福费廷(外币)")
    private BigDecimal buyForfeitingForeign;

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
    public void setMicroloans(BigDecimal microloans) 
    {
        this.microloans = microloans;
    }

    public BigDecimal getMicroloans() 
    {
        return microloans;
    }
    public void setIndividualBusiness(BigDecimal individualBusiness) 
    {
        this.individualBusiness = individualBusiness;
    }

    public BigDecimal getIndividualBusiness() 
    {
        return individualBusiness;
    }
    public void setHomeMortgage(BigDecimal homeMortgage) 
    {
        this.homeMortgage = homeMortgage;
    }

    public BigDecimal getHomeMortgage() 
    {
        return homeMortgage;
    }
    public void setOtherConsumer(BigDecimal otherConsumer) 
    {
        this.otherConsumer = otherConsumer;
    }

    public BigDecimal getOtherConsumer() 
    {
        return otherConsumer;
    }
    public void setPersonalOther(BigDecimal personalOther) 
    {
        this.personalOther = personalOther;
    }

    public BigDecimal getPersonalOther() 
    {
        return personalOther;
    }
    public void setSmallBusiness(BigDecimal smallBusiness) 
    {
        this.smallBusiness = smallBusiness;
    }

    public BigDecimal getSmallBusiness() 
    {
        return smallBusiness;
    }
    public void setSupplyChain(BigDecimal supplyChain) 
    {
        this.supplyChain = supplyChain;
    }

    public BigDecimal getSupplyChain() 
    {
        return supplyChain;
    }
    public void setDomesticTradeFinance(BigDecimal domesticTradeFinance) 
    {
        this.domesticTradeFinance = domesticTradeFinance;
    }

    public BigDecimal getDomesticTradeFinance() 
    {
        return domesticTradeFinance;
    }
    public void setInternationalTradeFinance(BigDecimal internationalTradeFinance) 
    {
        this.internationalTradeFinance = internationalTradeFinance;
    }

    public BigDecimal getInternationalTradeFinance() 
    {
        return internationalTradeFinance;
    }
    public void setOtherCompany(BigDecimal otherCompany) 
    {
        this.otherCompany = otherCompany;
    }

    public BigDecimal getOtherCompany() 
    {
        return otherCompany;
    }
    public void setDedicatedFinancing(BigDecimal dedicatedFinancing) 
    {
        this.dedicatedFinancing = dedicatedFinancing;
    }

    public BigDecimal getDedicatedFinancing() 
    {
        return dedicatedFinancing;
    }
    public void setSmallBusinessFactoring(BigDecimal smallBusinessFactoring) 
    {
        this.smallBusinessFactoring = smallBusinessFactoring;
    }

    public BigDecimal getSmallBusinessFactoring() 
    {
        return smallBusinessFactoring;
    }
    public void setCorporateOther(BigDecimal corporateOther) 
    {
        this.corporateOther = corporateOther;
    }

    public BigDecimal getCorporateOther() 
    {
        return corporateOther;
    }
    public void setCorporationOverdraft(BigDecimal corporationOverdraft) 
    {
        this.corporationOverdraft = corporationOverdraft;
    }

    public BigDecimal getCorporationOverdraft() 
    {
        return corporationOverdraft;
    }
    public void setThreeFarmersCompany(BigDecimal threeFarmersCompany) 
    {
        this.threeFarmersCompany = threeFarmersCompany;
    }

    public BigDecimal getThreeFarmersCompany() 
    {
        return threeFarmersCompany;
    }
    public void setInternationalCompany(BigDecimal internationalCompany) 
    {
        this.internationalCompany = internationalCompany;
    }

    public BigDecimal getInternationalCompany() 
    {
        return internationalCompany;
    }
    public void setMergersAcquisitions(BigDecimal mergersAcquisitions) 
    {
        this.mergersAcquisitions = mergersAcquisitions;
    }

    public BigDecimal getMergersAcquisitions() 
    {
        return mergersAcquisitions;
    }
    public void setVariousAdvances(BigDecimal variousAdvances) 
    {
        this.variousAdvances = variousAdvances;
    }

    public BigDecimal getVariousAdvances() 
    {
        return variousAdvances;
    }
    public void setRediscount(BigDecimal rediscount) 
    {
        this.rediscount = rediscount;
    }

    public BigDecimal getRediscount() 
    {
        return rediscount;
    }
    public void setDirectPaste(BigDecimal directPaste) 
    {
        this.directPaste = directPaste;
    }

    public BigDecimal getDirectPaste() 
    {
        return directPaste;
    }
    public void setPersonalOverdraft(BigDecimal personalOverdraft) 
    {
        this.personalOverdraft = personalOverdraft;
    }

    public BigDecimal getPersonalOverdraft() 
    {
        return personalOverdraft;
    }
    public void setUnitOverdraft(BigDecimal unitOverdraft) 
    {
        this.unitOverdraft = unitOverdraft;
    }

    public BigDecimal getUnitOverdraft() 
    {
        return unitOverdraft;
    }
    public void setForeignCurrency(BigDecimal foreignCurrency) 
    {
        this.foreignCurrency = foreignCurrency;
    }

    public BigDecimal getForeignCurrency() 
    {
        return foreignCurrency;
    }
    public void setBuyForfeitingRmb(BigDecimal buyForfeitingRmb) 
    {
        this.buyForfeitingRmb = buyForfeitingRmb;
    }

    public BigDecimal getBuyForfeitingRmb() 
    {
        return buyForfeitingRmb;
    }
    public void setBuyForfeitingForeign(BigDecimal buyForfeitingForeign) 
    {
        this.buyForfeitingForeign = buyForfeitingForeign;
    }

    public BigDecimal getBuyForfeitingForeign() 
    {
        return buyForfeitingForeign;
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
            .append("microloans", getMicroloans())
            .append("individualBusiness", getIndividualBusiness())
            .append("homeMortgage", getHomeMortgage())
            .append("otherConsumer", getOtherConsumer())
            .append("personalOther", getPersonalOther())
            .append("smallBusiness", getSmallBusiness())
            .append("supplyChain", getSupplyChain())
            .append("domesticTradeFinance", getDomesticTradeFinance())
            .append("internationalTradeFinance", getInternationalTradeFinance())
            .append("otherCompany", getOtherCompany())
            .append("dedicatedFinancing", getDedicatedFinancing())
            .append("smallBusinessFactoring", getSmallBusinessFactoring())
            .append("corporateOther", getCorporateOther())
            .append("corporationOverdraft", getCorporationOverdraft())
            .append("threeFarmersCompany", getThreeFarmersCompany())
            .append("internationalCompany", getInternationalCompany())
            .append("mergersAcquisitions", getMergersAcquisitions())
            .append("variousAdvances", getVariousAdvances())
            .append("rediscount", getRediscount())
            .append("directPaste", getDirectPaste())
            .append("personalOverdraft", getPersonalOverdraft())
            .append("unitOverdraft", getUnitOverdraft())
            .append("foreignCurrency", getForeignCurrency())
            .append("buyForfeitingRmb", getBuyForfeitingRmb())
            .append("buyForfeitingForeign", getBuyForfeitingForeign())
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
