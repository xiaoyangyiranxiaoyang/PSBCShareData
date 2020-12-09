package com.psbc.datashare.cbrc.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 主要监管指标汇总对象 cbrc_major_regulatory_indicators
 * 
 * @author mql
 * @date 2020-12-09
 */
public class CbrcMajorRegulatoryIndicators extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 项目 */
    @Excel(name = "项目")
    private String item;

    /** 监管标准 */
    @Excel(name = "监管标准")
    private String regulatoryStandards;

    /** 本期 */
    @Excel(name = "本期")
    private BigDecimal currentIssue;

    /** 比年初 */
    @Excel(name = "比年初")
    private BigDecimal compareBeginYear;

    /** 比去年同期 */
    @Excel(name = "比去年同期")
    private BigDecimal compateLastYear;

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
    public void setItem(String item) 
    {
        this.item = item;
    }

    public String getItem() 
    {
        return item;
    }
    public void setRegulatoryStandards(String regulatoryStandards) 
    {
        this.regulatoryStandards = regulatoryStandards;
    }

    public String getRegulatoryStandards() 
    {
        return regulatoryStandards;
    }
    public void setCurrentIssue(BigDecimal currentIssue) 
    {
        this.currentIssue = currentIssue;
    }

    public BigDecimal getCurrentIssue() 
    {
        return currentIssue;
    }
    public void setCompareBeginYear(BigDecimal compareBeginYear) 
    {
        this.compareBeginYear = compareBeginYear;
    }

    public BigDecimal getCompareBeginYear() 
    {
        return compareBeginYear;
    }
    public void setCompateLastYear(BigDecimal compateLastYear) 
    {
        this.compateLastYear = compateLastYear;
    }

    public BigDecimal getCompateLastYear() 
    {
        return compateLastYear;
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
            .append("item", getItem())
            .append("regulatoryStandards", getRegulatoryStandards())
            .append("currentIssue", getCurrentIssue())
            .append("compareBeginYear", getCompareBeginYear())
            .append("compateLastYear", getCompateLastYear())
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
