package com.psbc.datashare.cbrc.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 银行业金融机构存贷款分机构情况对象 cbrc_deposit_loan_institution
 * 
 * @author mql
 * @date 2020-12-10
 */
public class CbrcDepositLoanInstitution extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 机构 */
    @Excel(name = "机构")
    private String institution;

    /** 存款-月末余额 */
    @Excel(name = "存款-月末余额")
    private BigDecimal depositBalance;

    /** 存款-比上月增减 */
    @Excel(name = "存款-比上月增减")
    private BigDecimal depositGrowthM;

    /** 存款-比年初增减 */
    @Excel(name = "存款-比年初增减")
    private BigDecimal depositGrowthY;

    /** 贷款-月末余额 */
    @Excel(name = "贷款-月末余额")
    private BigDecimal loanBalance;

    /** 贷款-比上月增减 */
    @Excel(name = "贷款-比上月增减")
    private BigDecimal loanGrowthM;

    /** 贷款-比年初增减 */
    @Excel(name = "贷款-比年初增减")
    private BigDecimal loanGrowthY;

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
    public void setLoanBalance(BigDecimal loanBalance) 
    {
        this.loanBalance = loanBalance;
    }

    public BigDecimal getLoanBalance() 
    {
        return loanBalance;
    }
    public void setLoanGrowthM(BigDecimal loanGrowthM) 
    {
        this.loanGrowthM = loanGrowthM;
    }

    public BigDecimal getLoanGrowthM() 
    {
        return loanGrowthM;
    }
    public void setLoanGrowthY(BigDecimal loanGrowthY) 
    {
        this.loanGrowthY = loanGrowthY;
    }

    public BigDecimal getLoanGrowthY() 
    {
        return loanGrowthY;
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
            .append("depositBalance", getDepositBalance())
            .append("depositGrowthM", getDepositGrowthM())
            .append("depositGrowthY", getDepositGrowthY())
            .append("loanBalance", getLoanBalance())
            .append("loanGrowthM", getLoanGrowthM())
            .append("loanGrowthY", getLoanGrowthY())
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
