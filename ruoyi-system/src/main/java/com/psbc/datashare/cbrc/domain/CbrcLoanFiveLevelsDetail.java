package com.psbc.datashare.cbrc.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 青海省银行业金融机构贷款五级分类明细对象 cbrc_loan_five_levels_detail
 * 
 * @author mql
 * @date 2020-12-11
 */
public class CbrcLoanFiveLevelsDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 机构 */
    private String institution;

    /** 正常类-本期 */
    private BigDecimal normalBalance;

    /** 正常类-比年初 */
    private BigDecimal normalGrowthY;

    /** 关注类-本期 */
    private BigDecimal interestBalance;

    /** 关注类-比年初 */
    private BigDecimal interestGrowthY;

    /** 次级类-本期 */
    private BigDecimal secondaryBalance;

    /** 次级类-比年初 */
    private BigDecimal secondaryGrowthY;

    /** 可疑类-本期 */
    private BigDecimal doubtBalance;

    /** 可疑类-比年初 */
    private BigDecimal doubtGrowthY;

    /** 损失类-本期 */
    private BigDecimal lossBalance;

    /** 损失类-比年初 */
    private BigDecimal lossGrowthY;

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
    public void setInstitution(String institution) 
    {
        this.institution = institution;
    }

    public String getInstitution() 
    {
        return institution;
    }
    public void setNormalBalance(BigDecimal normalBalance) 
    {
        this.normalBalance = normalBalance;
    }

    public BigDecimal getNormalBalance() 
    {
        return normalBalance;
    }
    public void setNormalGrowthY(BigDecimal normalGrowthY) 
    {
        this.normalGrowthY = normalGrowthY;
    }

    public BigDecimal getNormalGrowthY() 
    {
        return normalGrowthY;
    }
    public void setInterestBalance(BigDecimal interestBalance) 
    {
        this.interestBalance = interestBalance;
    }

    public BigDecimal getInterestBalance() 
    {
        return interestBalance;
    }
    public void setInterestGrowthY(BigDecimal interestGrowthY) 
    {
        this.interestGrowthY = interestGrowthY;
    }

    public BigDecimal getInterestGrowthY() 
    {
        return interestGrowthY;
    }
    public void setSecondaryBalance(BigDecimal secondaryBalance) 
    {
        this.secondaryBalance = secondaryBalance;
    }

    public BigDecimal getSecondaryBalance() 
    {
        return secondaryBalance;
    }
    public void setSecondaryGrowthY(BigDecimal secondaryGrowthY) 
    {
        this.secondaryGrowthY = secondaryGrowthY;
    }

    public BigDecimal getSecondaryGrowthY() 
    {
        return secondaryGrowthY;
    }
    public void setDoubtBalance(BigDecimal doubtBalance) 
    {
        this.doubtBalance = doubtBalance;
    }

    public BigDecimal getDoubtBalance() 
    {
        return doubtBalance;
    }
    public void setDoubtGrowthY(BigDecimal doubtGrowthY) 
    {
        this.doubtGrowthY = doubtGrowthY;
    }

    public BigDecimal getDoubtGrowthY() 
    {
        return doubtGrowthY;
    }
    public void setLossBalance(BigDecimal lossBalance) 
    {
        this.lossBalance = lossBalance;
    }

    public BigDecimal getLossBalance() 
    {
        return lossBalance;
    }
    public void setLossGrowthY(BigDecimal lossGrowthY) 
    {
        this.lossGrowthY = lossGrowthY;
    }

    public BigDecimal getLossGrowthY() 
    {
        return lossGrowthY;
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
            .append("normalBalance", getNormalBalance())
            .append("normalGrowthY", getNormalGrowthY())
            .append("interestBalance", getInterestBalance())
            .append("interestGrowthY", getInterestGrowthY())
            .append("secondaryBalance", getSecondaryBalance())
            .append("secondaryGrowthY", getSecondaryGrowthY())
            .append("doubtBalance", getDoubtBalance())
            .append("doubtGrowthY", getDoubtGrowthY())
            .append("lossBalance", getLossBalance())
            .append("lossGrowthY", getLossGrowthY())
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
