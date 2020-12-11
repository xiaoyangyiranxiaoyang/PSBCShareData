package com.psbc.datashare.cbrc.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 青海省银行业金融机构贷款五级分类不良情况对象 cbrc_loan_five_levels_unhealthy
 * 
 * @author mql
 * @date 2020-12-11
 */
public class CbrcLoanFiveLevelsUnhealthy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 机构 */
    @Excel(name = "机构")
    private String institution;

    /** 贷款合计-本期 */
    @Excel(name = "贷款合计-本期")
    private BigDecimal loanBalance;

    /** 贷款合计-比年初 */
    @Excel(name = "贷款合计-比年初")
    private BigDecimal loanGrowthY;

    /** 不良贷款合计-本期 */
    @Excel(name = "不良贷款合计-本期")
    private BigDecimal loanUnhealthyBalance;

    /** 不良贷款合计-比年初 */
    @Excel(name = "不良贷款合计-比年初")
    private BigDecimal loanUnhealthyGrowthY;

    /** 不良贷款率-本期 */
    @Excel(name = "不良贷款率-本期")
    private BigDecimal loanUnhealthyPct;

    /** 不良贷款率-比年初 */
    @Excel(name = "不良贷款率-比年初")
    private BigDecimal loanUnhealthyPctGrowthY;

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
    public void setLoanBalance(BigDecimal loanBalance) 
    {
        this.loanBalance = loanBalance;
    }

    public BigDecimal getLoanBalance() 
    {
        return loanBalance;
    }
    public void setLoanGrowthY(BigDecimal loanGrowthY) 
    {
        this.loanGrowthY = loanGrowthY;
    }

    public BigDecimal getLoanGrowthY() 
    {
        return loanGrowthY;
    }
    public void setLoanUnhealthyBalance(BigDecimal loanUnhealthyBalance) 
    {
        this.loanUnhealthyBalance = loanUnhealthyBalance;
    }

    public BigDecimal getLoanUnhealthyBalance() 
    {
        return loanUnhealthyBalance;
    }
    public void setLoanUnhealthyGrowthY(BigDecimal loanUnhealthyGrowthY) 
    {
        this.loanUnhealthyGrowthY = loanUnhealthyGrowthY;
    }

    public BigDecimal getLoanUnhealthyGrowthY() 
    {
        return loanUnhealthyGrowthY;
    }
    public void setLoanUnhealthyPct(BigDecimal loanUnhealthyPct) 
    {
        this.loanUnhealthyPct = loanUnhealthyPct;
    }

    public BigDecimal getLoanUnhealthyPct() 
    {
        return loanUnhealthyPct;
    }
    public void setLoanUnhealthyPctGrowthY(BigDecimal loanUnhealthyPctGrowthY) 
    {
        this.loanUnhealthyPctGrowthY = loanUnhealthyPctGrowthY;
    }

    public BigDecimal getLoanUnhealthyPctGrowthY() 
    {
        return loanUnhealthyPctGrowthY;
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
            .append("loanBalance", getLoanBalance())
            .append("loanGrowthY", getLoanGrowthY())
            .append("loanUnhealthyBalance", getLoanUnhealthyBalance())
            .append("loanUnhealthyGrowthY", getLoanUnhealthyGrowthY())
            .append("loanUnhealthyPct", getLoanUnhealthyPct())
            .append("loanUnhealthyPctGrowthY", getLoanUnhealthyPctGrowthY())
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
