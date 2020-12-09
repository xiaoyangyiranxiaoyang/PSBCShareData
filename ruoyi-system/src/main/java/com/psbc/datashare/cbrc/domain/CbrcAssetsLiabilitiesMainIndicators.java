package com.psbc.datashare.cbrc.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 金融机构资产负债主要指标对象 cbrc_assets_liabilities_main_indicators
 * 
 * @author mql
 * @date 2020-12-09
 */
public class CbrcAssetsLiabilitiesMainIndicators extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 机构 */
    @Excel(name = "机构")
    private String institution;

    /** 资产总额 */
    @Excel(name = "资产总额")
    private BigDecimal assetsTotal;

    /** 比年初 */
    @Excel(name = "比年初")
    private BigDecimal assetsCompateBeginYear;

    /** 负债总额 */
    @Excel(name = "负债总额")
    private BigDecimal liabilitiesTotal;

    /** 比年初 */
    @Excel(name = "比年初")
    private BigDecimal liabilitiesCompateBeginYear;

    /** 所有者权益 */
    @Excel(name = "所有者权益")
    private BigDecimal ownerEquity;

    /** 比年初 */
    @Excel(name = "比年初")
    private BigDecimal equityCompateBeginYear;

    /** 本年利润 */
    @Excel(name = "本年利润")
    private BigDecimal profitThisYear;

    /** 比去年同期 */
    @Excel(name = "比去年同期")
    private BigDecimal profitCompateLastYear;

    /** 数据日期 */
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
    public void setInstitution(String institution) 
    {
        this.institution = institution;
    }

    public String getInstitution() 
    {
        return institution;
    }
    public void setAssetsTotal(BigDecimal assetsTotal) 
    {
        this.assetsTotal = assetsTotal;
    }

    public BigDecimal getAssetsTotal() 
    {
        return assetsTotal;
    }
    public void setAssetsCompateBeginYear(BigDecimal assetsCompateBeginYear) 
    {
        this.assetsCompateBeginYear = assetsCompateBeginYear;
    }

    public BigDecimal getAssetsCompateBeginYear() 
    {
        return assetsCompateBeginYear;
    }
    public void setLiabilitiesTotal(BigDecimal liabilitiesTotal) 
    {
        this.liabilitiesTotal = liabilitiesTotal;
    }

    public BigDecimal getLiabilitiesTotal() 
    {
        return liabilitiesTotal;
    }
    public void setLiabilitiesCompateBeginYear(BigDecimal liabilitiesCompateBeginYear) 
    {
        this.liabilitiesCompateBeginYear = liabilitiesCompateBeginYear;
    }

    public BigDecimal getLiabilitiesCompateBeginYear() 
    {
        return liabilitiesCompateBeginYear;
    }
    public void setOwnerEquity(BigDecimal ownerEquity)
    {
        this.ownerEquity = ownerEquity;
    }

    public BigDecimal getOwnerEquity()
    {
        return ownerEquity;
    }
    public void setEquityCompateBeginYear(BigDecimal equityCompateBeginYear) 
    {
        this.equityCompateBeginYear = equityCompateBeginYear;
    }

    public BigDecimal getEquityCompateBeginYear() 
    {
        return equityCompateBeginYear;
    }
    public void setProfitThisYear(BigDecimal profitThisYear)
    {
        this.profitThisYear = profitThisYear;
    }

    public BigDecimal getProfitThisYear() 
    {
        return profitThisYear;
    }
    public void setProfitCompateLastYear(BigDecimal profitCompateLastYear) 
    {
        this.profitCompateLastYear = profitCompateLastYear;
    }

    public BigDecimal getProfitCompateLastYear() 
    {
        return profitCompateLastYear;
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
            .append("institution", getInstitution())
            .append("assetsTotal", getAssetsTotal())
            .append("assetsCompateBeginYear", getAssetsCompateBeginYear())
            .append("liabilitiesTotal", getLiabilitiesTotal())
            .append("liabilitiesCompateBeginYear", getLiabilitiesCompateBeginYear())
            .append("owner equity", getOwnerEquity())
            .append("equityCompateBeginYear", getEquityCompateBeginYear())
            .append("profitThisYear", getProfitThisYear())
            .append("profitCompateLastYear", getProfitCompateLastYear())
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
