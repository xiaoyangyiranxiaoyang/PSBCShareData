package com.psbc.datashare.cbrc.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分机构存贷款月日均情况对象 cbrc_deposit_loan_monthly_daily_avg
 * 
 * @author mql
 * @date 2020-12-10
 */
public class CbrcDepositLoanMonthlyDailyAvg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String institution;

    /** 贷款-本期 */
    @Excel(name = "贷款-本期")
    private BigDecimal loanBalance;

    /** 贷款-比上期 */
    @Excel(name = "贷款-比上期")
    private BigDecimal loanGrowthM;

    /** 贷款-比年初 */
    @Excel(name = "贷款-比年初")
    private BigDecimal loanGrowthY;

    /** 月日均贷款余额-本期 */
    @Excel(name = "月日均贷款余额-本期")
    private BigDecimal loanAvgBalance;

    /** 月日均贷款余额-比上期 */
    @Excel(name = "月日均贷款余额-比上期")
    private BigDecimal loanAvgGrowthM;

    /** 月日均贷款余额-比年初 */
    @Excel(name = "月日均贷款余额-比年初")
    private BigDecimal loanAvgGrowthY;

    /** 存款-本期 */
    @Excel(name = "存款-本期")
    private BigDecimal depositBalance;

    /** 存款-比上月 */
    @Excel(name = "存款-比上月")
    private BigDecimal depositGrowthM;

    /** 存款-比年初 */
    @Excel(name = "存款-比年初")
    private BigDecimal depositGrowthY;

    /** 月日均存款余额-本期 */
    @Excel(name = "月日均存款余额-本期")
    private BigDecimal depositAvgBalance;

    /** 月日均存款余额-比上月 */
    @Excel(name = "月日均存款余额-比上月")
    private BigDecimal depositAvgGrowthM;

    /** 月日均存款余额-比年初 */
    @Excel(name = "月日均存款余额-比年初")
    private BigDecimal depositAvgGrowthY;

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
    public void setLoanAvgBalance(BigDecimal loanAvgBalance) 
    {
        this.loanAvgBalance = loanAvgBalance;
    }

    public BigDecimal getLoanAvgBalance() 
    {
        return loanAvgBalance;
    }
    public void setLoanAvgGrowthM(BigDecimal loanAvgGrowthM) 
    {
        this.loanAvgGrowthM = loanAvgGrowthM;
    }

    public BigDecimal getLoanAvgGrowthM() 
    {
        return loanAvgGrowthM;
    }
    public void setLoanAvgGrowthY(BigDecimal loanAvgGrowthY) 
    {
        this.loanAvgGrowthY = loanAvgGrowthY;
    }

    public BigDecimal getLoanAvgGrowthY() 
    {
        return loanAvgGrowthY;
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
    public void setDepositAvgBalance(BigDecimal depositAvgBalance) 
    {
        this.depositAvgBalance = depositAvgBalance;
    }

    public BigDecimal getDepositAvgBalance() 
    {
        return depositAvgBalance;
    }
    public void setDepositAvgGrowthM(BigDecimal depositAvgGrowthM) 
    {
        this.depositAvgGrowthM = depositAvgGrowthM;
    }

    public BigDecimal getDepositAvgGrowthM() 
    {
        return depositAvgGrowthM;
    }
    public void setDepositAvgGrowthY(BigDecimal depositAvgGrowthY) 
    {
        this.depositAvgGrowthY = depositAvgGrowthY;
    }

    public BigDecimal getDepositAvgGrowthY() 
    {
        return depositAvgGrowthY;
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
            .append("loanGrowthM", getLoanGrowthM())
            .append("loanGrowthY", getLoanGrowthY())
            .append("loanAvgBalance", getLoanAvgBalance())
            .append("loanAvgGrowthM", getLoanAvgGrowthM())
            .append("loanAvgGrowthY", getLoanAvgGrowthY())
            .append("depositBalance", getDepositBalance())
            .append("depositGrowthM", getDepositGrowthM())
            .append("depositGrowthY", getDepositGrowthY())
            .append("depositAvgBalance", getDepositAvgBalance())
            .append("depositAvgGrowthM", getDepositAvgGrowthM())
            .append("depositAvgGrowthY", getDepositAvgGrowthY())
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
