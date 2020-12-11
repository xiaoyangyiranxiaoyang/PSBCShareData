package com.psbc.datashare.cbrc.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 银行业机构资产负债主要项目统计对象 cbrc_assets_liabilities_major_projects
 * 
 * @author mql
 * @date 2020-12-09
 */
public class CbrcAssetsLiabilitiesMajorProjects extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 资产(assets)或负债(liabilities) */
    @Excel(name = "资产(assets)或负债(liabilities)")
    private String type;

    /** 项目 */
    @Excel(name = "项目")
    private String item;

    /** 本期 */
    @Excel(name = "本期")
    private BigDecimal currentIssue;

    /** 比年初 */
    @Excel(name = "比年初")
    private BigDecimal compareBeginYear;

    /** 比上月 */
    @Excel(name = "比上月")
    private BigDecimal compareLastMonth;

    /** 比去年同期增减% */
    @Excel(name = "比去年同期增减%")
    private BigDecimal compateLastYearPct;

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
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setItem(String item) 
    {
        this.item = item;
    }

    public String getItem() 
    {
        return item;
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
    public void setCompareLastMonth(BigDecimal compareLastMonth) 
    {
        this.compareLastMonth = compareLastMonth;
    }

    public BigDecimal getCompareLastMonth() 
    {
        return compareLastMonth;
    }
    public void setCompateLastYearPct(BigDecimal compateLastYearPct) 
    {
        this.compateLastYearPct = compateLastYearPct;
    }

    public BigDecimal getCompateLastYearPct() 
    {
        return compateLastYearPct;
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
            .append("type", getType())
            .append("item", getItem())
            .append("currentIssue", getCurrentIssue())
            .append("compareBeginYear", getCompareBeginYear())
            .append("compareLastMonth", getCompareLastMonth())
            .append("compateLastYearPct", getCompateLastYearPct())
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
