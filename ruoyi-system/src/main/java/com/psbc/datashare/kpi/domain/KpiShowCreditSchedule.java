package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 全行KPI指标（二）-附表对象 kpi_show_credit_schedule
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiShowCreditSchedule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 地区 */
    @Excel(name = "地区")
    private String district;

    /** 合计-余额 */
    @Excel(name = "合计-余额")
    private BigDecimal totalBalance;

    /** 合计-月增 */
    @Excel(name = "合计-月增")
    private BigDecimal totalGrowthM;

    /** 合计-年增 */
    @Excel(name = "合计-年增")
    private BigDecimal totalGrowthY;

    /** 个人零售贷款-余额 */
    @Excel(name = "个人零售贷款-余额")
    private BigDecimal retailBalance;

    /** 个人零售贷款-月增 */
    @Excel(name = "个人零售贷款-月增")
    private BigDecimal retailGrowthM;

    /** 个人零售贷款-年增 */
    @Excel(name = "个人零售贷款-年增")
    private BigDecimal retailGrowthY;

    /** 小企业贷款-余额 */
    @Excel(name = "小企业贷款-余额")
    private BigDecimal smallBusinessBalance;

    /** 小企业贷款-月增 */
    @Excel(name = "小企业贷款-月增")
    private BigDecimal smallBusinessGrowthM;

    /** 小企业贷款-年增 */
    @Excel(name = "小企业贷款-年增")
    private BigDecimal smallBusinessGrowthY;

    /** 公司贷款-余额 */
    @Excel(name = "公司贷款-余额")
    private BigDecimal companyBalance;

    /** 公司贷款-月增 */
    @Excel(name = "公司贷款-月增")
    private BigDecimal companyGrowthM;

    /** 公司贷款-年增 */
    @Excel(name = "公司贷款-年增")
    private BigDecimal companyGrowthY;

    /** 供应链-余额 */
    @Excel(name = "供应链-余额")
    private BigDecimal supplyChainBalance;

    /** 供应链-月增 */
    @Excel(name = "供应链-月增")
    private BigDecimal supplyChainGrowthM;

    /** 供应链-年增 */
    @Excel(name = "供应链-年增")
    private BigDecimal supplyChainGrowthY;

    /** 票据融资-余额 */
    @Excel(name = "票据融资-余额")
    private BigDecimal billFinancingBalance;

    /** 票据融资-月增 */
    @Excel(name = "票据融资-月增")
    private BigDecimal billFinancingGrowthM;

    /** 数据日期 */
    private Date dataDate;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 票据融资-年增 */
    @Excel(name = "票据融资-年增")
    private BigDecimal billFinancingGrowthY;

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
    public void setTotalBalance(BigDecimal totalBalance) 
    {
        this.totalBalance = totalBalance;
    }

    public BigDecimal getTotalBalance() 
    {
        return totalBalance;
    }
    public void setTotalGrowthM(BigDecimal totalGrowthM) 
    {
        this.totalGrowthM = totalGrowthM;
    }

    public BigDecimal getTotalGrowthM() 
    {
        return totalGrowthM;
    }
    public void setTotalGrowthY(BigDecimal totalGrowthY) 
    {
        this.totalGrowthY = totalGrowthY;
    }

    public BigDecimal getTotalGrowthY() 
    {
        return totalGrowthY;
    }
    public void setRetailBalance(BigDecimal retailBalance) 
    {
        this.retailBalance = retailBalance;
    }

    public BigDecimal getRetailBalance() 
    {
        return retailBalance;
    }
    public void setRetailGrowthM(BigDecimal retailGrowthM) 
    {
        this.retailGrowthM = retailGrowthM;
    }

    public BigDecimal getRetailGrowthM() 
    {
        return retailGrowthM;
    }
    public void setRetailGrowthY(BigDecimal retailGrowthY) 
    {
        this.retailGrowthY = retailGrowthY;
    }

    public BigDecimal getRetailGrowthY() 
    {
        return retailGrowthY;
    }
    public void setSmallBusinessBalance(BigDecimal smallBusinessBalance) 
    {
        this.smallBusinessBalance = smallBusinessBalance;
    }

    public BigDecimal getSmallBusinessBalance() 
    {
        return smallBusinessBalance;
    }
    public void setSmallBusinessGrowthM(BigDecimal smallBusinessGrowthM) 
    {
        this.smallBusinessGrowthM = smallBusinessGrowthM;
    }

    public BigDecimal getSmallBusinessGrowthM() 
    {
        return smallBusinessGrowthM;
    }
    public void setSmallBusinessGrowthY(BigDecimal smallBusinessGrowthY) 
    {
        this.smallBusinessGrowthY = smallBusinessGrowthY;
    }

    public BigDecimal getSmallBusinessGrowthY() 
    {
        return smallBusinessGrowthY;
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
    public void setSupplyChainBalance(BigDecimal supplyChainBalance) 
    {
        this.supplyChainBalance = supplyChainBalance;
    }

    public BigDecimal getSupplyChainBalance() 
    {
        return supplyChainBalance;
    }
    public void setSupplyChainGrowthM(BigDecimal supplyChainGrowthM) 
    {
        this.supplyChainGrowthM = supplyChainGrowthM;
    }

    public BigDecimal getSupplyChainGrowthM() 
    {
        return supplyChainGrowthM;
    }
    public void setSupplyChainGrowthY(BigDecimal supplyChainGrowthY) 
    {
        this.supplyChainGrowthY = supplyChainGrowthY;
    }

    public BigDecimal getSupplyChainGrowthY() 
    {
        return supplyChainGrowthY;
    }
    public void setBillFinancingBalance(BigDecimal billFinancingBalance) 
    {
        this.billFinancingBalance = billFinancingBalance;
    }

    public BigDecimal getBillFinancingBalance() 
    {
        return billFinancingBalance;
    }
    public void setBillFinancingGrowthM(BigDecimal billFinancingGrowthM) 
    {
        this.billFinancingGrowthM = billFinancingGrowthM;
    }

    public BigDecimal getBillFinancingGrowthM() 
    {
        return billFinancingGrowthM;
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
    public void setBillFinancingGrowthY(BigDecimal billFinancingGrowthY) 
    {
        this.billFinancingGrowthY = billFinancingGrowthY;
    }

    public BigDecimal getBillFinancingGrowthY() 
    {
        return billFinancingGrowthY;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("district", getDistrict())
            .append("totalBalance", getTotalBalance())
            .append("totalGrowthM", getTotalGrowthM())
            .append("totalGrowthY", getTotalGrowthY())
            .append("retailBalance", getRetailBalance())
            .append("retailGrowthM", getRetailGrowthM())
            .append("retailGrowthY", getRetailGrowthY())
            .append("smallBusinessBalance", getSmallBusinessBalance())
            .append("smallBusinessGrowthM", getSmallBusinessGrowthM())
            .append("smallBusinessGrowthY", getSmallBusinessGrowthY())
            .append("companyBalance", getCompanyBalance())
            .append("companyGrowthM", getCompanyGrowthM())
            .append("companyGrowthY", getCompanyGrowthY())
            .append("supplyChainBalance", getSupplyChainBalance())
            .append("supplyChainGrowthM", getSupplyChainGrowthM())
            .append("supplyChainGrowthY", getSupplyChainGrowthY())
            .append("billFinancingBalance", getBillFinancingBalance())
            .append("billFinancingGrowthM", getBillFinancingGrowthM())
            .append("dataDate", getDataDate())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("billFinancingGrowthY", getBillFinancingGrowthY())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
