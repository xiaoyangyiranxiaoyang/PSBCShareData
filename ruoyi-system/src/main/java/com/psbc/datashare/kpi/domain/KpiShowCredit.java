package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 全行KPI指标（二）对象 kpi_show_credit
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiShowCredit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 地区 */
    @Excel(name = "地区")
    private String district;

    /** 存款合计-余额 */
    @Excel(name = "存款合计-余额")
    private BigDecimal depositBalance;

    /** 存款合计-月增 */
    @Excel(name = "存款合计-月增")
    private BigDecimal depositGrowthM;

    /** 存款合计-年增 */
    @Excel(name = "存款合计-年增")
    private BigDecimal depositGrowthY;

    /** 邮储自营-余额 */
    @Excel(name = "邮储自营-余额")
    private BigDecimal selfBalance;

    /** 邮储自营-月增 */
    @Excel(name = "邮储自营-月增")
    private BigDecimal selfGrowthM;

    /** 邮储自营-年增 */
    @Excel(name = "邮储自营-年增")
    private BigDecimal selfGrowthY;

    /** 邮储代理-余额 */
    @Excel(name = "邮储代理-余额")
    private BigDecimal agentBalance;

    /** 邮储代理-月增 */
    @Excel(name = "邮储代理-月增")
    private BigDecimal agentGrowthM;

    /** 邮储代理-年增 */
    @Excel(name = "邮储代理-年增")
    private BigDecimal agentGrowthY;

    /** 公司存款-余额 */
    @Excel(name = "公司存款-余额")
    private BigDecimal companyBalance;

    /** 公司存款-月增 */
    @Excel(name = "公司存款-月增")
    private BigDecimal companyGrowthM;

    /** 公司存款-年增 */
    @Excel(name = "公司存款-年增")
    private BigDecimal companyGrowthY;

    /** 不良率 */
    @Excel(name = "不良率")
    private BigDecimal unhealthyRate;

    /** 逾期率 */
    @Excel(name = "逾期率")
    private BigDecimal overdueRate;

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
    public void setDepositBalance(BigDecimal depositBalance) 
    {
        this.depositBalance = depositBalance;
    }

    public BigDecimal getDepositBalance() 
    {
        return depositBalance;
    }
    public void setDepositGrowthM(BigDecimal depositGrowthM) 
    {
        this.depositGrowthM = depositGrowthM;
    }

    public BigDecimal getDepositGrowthM() 
    {
        return depositGrowthM;
    }
    public void setDepositGrowthY(BigDecimal depositGrowthY) 
    {
        this.depositGrowthY = depositGrowthY;
    }

    public BigDecimal getDepositGrowthY() 
    {
        return depositGrowthY;
    }
    public void setSelfBalance(BigDecimal selfBalance) 
    {
        this.selfBalance = selfBalance;
    }

    public BigDecimal getSelfBalance() 
    {
        return selfBalance;
    }
    public void setSelfGrowthM(BigDecimal selfGrowthM) 
    {
        this.selfGrowthM = selfGrowthM;
    }

    public BigDecimal getSelfGrowthM() 
    {
        return selfGrowthM;
    }
    public void setSelfGrowthY(BigDecimal selfGrowthY) 
    {
        this.selfGrowthY = selfGrowthY;
    }

    public BigDecimal getSelfGrowthY() 
    {
        return selfGrowthY;
    }
    public void setAgentBalance(BigDecimal agentBalance) 
    {
        this.agentBalance = agentBalance;
    }

    public BigDecimal getAgentBalance() 
    {
        return agentBalance;
    }
    public void setAgentGrowthM(BigDecimal agentGrowthM) 
    {
        this.agentGrowthM = agentGrowthM;
    }

    public BigDecimal getAgentGrowthM() 
    {
        return agentGrowthM;
    }
    public void setAgentGrowthY(BigDecimal agentGrowthY) 
    {
        this.agentGrowthY = agentGrowthY;
    }

    public BigDecimal getAgentGrowthY() 
    {
        return agentGrowthY;
    }
    public void setCompanyBalance(BigDecimal companyBalance) 
    {
        this.companyBalance = companyBalance;
    }

    public BigDecimal getCompanyBalance() 
    {
        return companyBalance;
    }
    public void setCompanyGrowthM(BigDecimal companyGrowthM) 
    {
        this.companyGrowthM = companyGrowthM;
    }

    public BigDecimal getCompanyGrowthM() 
    {
        return companyGrowthM;
    }
    public void setCompanyGrowthY(BigDecimal companyGrowthY) 
    {
        this.companyGrowthY = companyGrowthY;
    }

    public BigDecimal getCompanyGrowthY() 
    {
        return companyGrowthY;
    }
    public void setUnhealthyRate(BigDecimal unhealthyRate) 
    {
        this.unhealthyRate = unhealthyRate;
    }

    public BigDecimal getUnhealthyRate() 
    {
        return unhealthyRate;
    }
    public void setOverdueRate(BigDecimal overdueRate) 
    {
        this.overdueRate = overdueRate;
    }

    public BigDecimal getOverdueRate() 
    {
        return overdueRate;
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
            .append("depositBalance", getDepositBalance())
            .append("depositGrowthM", getDepositGrowthM())
            .append("depositGrowthY", getDepositGrowthY())
            .append("selfBalance", getSelfBalance())
            .append("selfGrowthM", getSelfGrowthM())
            .append("selfGrowthY", getSelfGrowthY())
            .append("agentBalance", getAgentBalance())
            .append("agentGrowthM", getAgentGrowthM())
            .append("agentGrowthY", getAgentGrowthY())
            .append("companyBalance", getCompanyBalance())
            .append("companyGrowthM", getCompanyGrowthM())
            .append("companyGrowthY", getCompanyGrowthY())
            .append("unhealthyRate", getUnhealthyRate())
            .append("overdueRate", getOverdueRate())
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
