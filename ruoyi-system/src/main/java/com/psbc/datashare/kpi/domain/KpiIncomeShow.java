package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 全行KPI指标（一）对象 kpi_show_income
 * 
 * @author mql
 * @date 2020-11-18
 */
public class KpiIncomeShow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 地区 */
    @Excel(name = "地区")
    private String district;

    /** 从业人数 */
    @Excel(name = "从业人数")
    private Long peopleNum;

    /** 总收入-本月 */
    @Excel(name = "总收入-本月")
    private BigDecimal incomeTotalMonth;

    /** 总收入-本年 */
    @Excel(name = "总收入-本年")
    private BigDecimal incomeTotalYear;

    /** 自营收入-本月 */
    @Excel(name = "自营收入-本月")
    private BigDecimal incomeSelfMonth;

    /** 自营收入-本年 */
    @Excel(name = "自营收入-本年")
    private BigDecimal incomeSelfYear;

    /** 自营收入-增幅 */
    @Excel(name = "自营收入-增幅")
    private BigDecimal incomeSelfRise;

    /** 自营收入-完成年度预算进度 */
    @Excel(name = "自营收入-完成年度预算进度")
    private BigDecimal incomeSelfProgress;

    /** 自营收入-人均收入 */
    @Excel(name = "自营收入-人均收入")
    private BigDecimal incomeSelfPercapita;

    /** 净利润-本月 */
    @Excel(name = "净利润-本月")
    private BigDecimal netProfitMonth;

    /** 净利润-本年 */
    @Excel(name = "净利润-本年")
    private BigDecimal netProfitYear;

    /** 净利润-增幅 */
    @Excel(name = "净利润-增幅")
    private BigDecimal netProfitRise;

    /** 净利润-完成年度预算进度 */
    @Excel(name = "净利润-完成年度预算进度")
    private BigDecimal netProfitProgress;

    /** 净利润-人均收入 */
    @Excel(name = "净利润-人均收入")
    private BigDecimal netProfitPercapita;

    /** 收入利润率 */
    @Excel(name = "收入利润率")
    private BigDecimal incomeProfitRate;

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
    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }
    public void setPeopleNum(Long peopleNum) 
    {
        this.peopleNum = peopleNum;
    }

    public Long getPeopleNum() 
    {
        return peopleNum;
    }
    public void setIncomeTotalMonth(BigDecimal incomeTotalMonth) 
    {
        this.incomeTotalMonth = incomeTotalMonth;
    }

    public BigDecimal getIncomeTotalMonth() 
    {
        return incomeTotalMonth;
    }
    public void setIncomeTotalYear(BigDecimal incomeTotalYear) 
    {
        this.incomeTotalYear = incomeTotalYear;
    }

    public BigDecimal getIncomeTotalYear() 
    {
        return incomeTotalYear;
    }
    public void setIncomeSelfMonth(BigDecimal incomeSelfMonth) 
    {
        this.incomeSelfMonth = incomeSelfMonth;
    }

    public BigDecimal getIncomeSelfMonth() 
    {
        return incomeSelfMonth;
    }
    public void setIncomeSelfYear(BigDecimal incomeSelfYear) 
    {
        this.incomeSelfYear = incomeSelfYear;
    }

    public BigDecimal getIncomeSelfYear() 
    {
        return incomeSelfYear;
    }
    public void setIncomeSelfRise(BigDecimal incomeSelfRise) 
    {
        this.incomeSelfRise = incomeSelfRise;
    }

    public BigDecimal getIncomeSelfRise() 
    {
        return incomeSelfRise;
    }
    public void setIncomeSelfProgress(BigDecimal incomeSelfProgress) 
    {
        this.incomeSelfProgress = incomeSelfProgress;
    }

    public BigDecimal getIncomeSelfProgress() 
    {
        return incomeSelfProgress;
    }
    public void setIncomeSelfPercapita(BigDecimal incomeSelfPercapita) 
    {
        this.incomeSelfPercapita = incomeSelfPercapita;
    }

    public BigDecimal getIncomeSelfPercapita() 
    {
        return incomeSelfPercapita;
    }
    public void setNetProfitMonth(BigDecimal netProfitMonth) 
    {
        this.netProfitMonth = netProfitMonth;
    }

    public BigDecimal getNetProfitMonth() 
    {
        return netProfitMonth;
    }
    public void setNetProfitYear(BigDecimal netProfitYear) 
    {
        this.netProfitYear = netProfitYear;
    }

    public BigDecimal getNetProfitYear() 
    {
        return netProfitYear;
    }
    public void setNetProfitRise(BigDecimal netProfitRise) 
    {
        this.netProfitRise = netProfitRise;
    }

    public BigDecimal getNetProfitRise() 
    {
        return netProfitRise;
    }
    public void setNetProfitProgress(BigDecimal netProfitProgress) 
    {
        this.netProfitProgress = netProfitProgress;
    }

    public BigDecimal getNetProfitProgress() 
    {
        return netProfitProgress;
    }
    public void setNetProfitPercapita(BigDecimal netProfitPercapita) 
    {
        this.netProfitPercapita = netProfitPercapita;
    }

    public BigDecimal getNetProfitPercapita() 
    {
        return netProfitPercapita;
    }
    public void setIncomeProfitRate(BigDecimal incomeProfitRate) 
    {
        this.incomeProfitRate = incomeProfitRate;
    }

    public BigDecimal getIncomeProfitRate() 
    {
        return incomeProfitRate;
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
            .append("peopleNum", getPeopleNum())
            .append("incomeTotalMonth", getIncomeTotalMonth())
            .append("incomeTotalYear", getIncomeTotalYear())
            .append("incomeSelfMonth", getIncomeSelfMonth())
            .append("incomeSelfYear", getIncomeSelfYear())
            .append("incomeSelfRise", getIncomeSelfRise())
            .append("incomeSelfProgress", getIncomeSelfProgress())
            .append("incomeSelfPercapita", getIncomeSelfPercapita())
            .append("netProfitMonth", getNetProfitMonth())
            .append("netProfitYear", getNetProfitYear())
            .append("netProfitRise", getNetProfitRise())
            .append("netProfitProgress", getNetProfitProgress())
            .append("netProfitPercapita", getNetProfitPercapita())
            .append("incomeProfitRate", getIncomeProfitRate())
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
