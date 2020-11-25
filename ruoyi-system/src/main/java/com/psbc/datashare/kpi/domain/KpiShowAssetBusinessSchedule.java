package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 全行资产业务情况-附表对象 kpi_show_asset_business_schedule
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiShowAssetBusinessSchedule extends BaseEntity
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

    /** 直贴-余额 */
    @Excel(name = "直贴-余额")
    private BigDecimal directPasteBalance;

    /** 直贴-月增 */
    @Excel(name = "直贴-月增")
    private BigDecimal directPasteGrowthM;

    /** 直贴-年增 */
    @Excel(name = "直贴-年增")
    private BigDecimal directPasteGrowthY;

    /** 转贴现-余额 */
    @Excel(name = "转贴现-余额")
    private BigDecimal rediscountBalance;

    /** 转贴现-月增 */
    @Excel(name = "转贴现-月增")
    private BigDecimal rediscountGrowthM;

    /** 转贴现-年增 */
    @Excel(name = "转贴现-年增")
    private BigDecimal rediscountGrowthY;

    /** 存放同业-余额 */
    @Excel(name = "存放同业-余额")
    private BigDecimal interbankBalance;

    /** 存放同业-月增 */
    @Excel(name = "存放同业-月增")
    private BigDecimal interbankGrowthM;

    /** 存放同业-年增 */
    @Excel(name = "存放同业-年增")
    private BigDecimal interbankGrowthY;

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
    public void setDirectPasteBalance(BigDecimal directPasteBalance) 
    {
        this.directPasteBalance = directPasteBalance;
    }

    public BigDecimal getDirectPasteBalance() 
    {
        return directPasteBalance;
    }
    public void setDirectPasteGrowthM(BigDecimal directPasteGrowthM) 
    {
        this.directPasteGrowthM = directPasteGrowthM;
    }

    public BigDecimal getDirectPasteGrowthM() 
    {
        return directPasteGrowthM;
    }
    public void setDirectPasteGrowthY(BigDecimal directPasteGrowthY) 
    {
        this.directPasteGrowthY = directPasteGrowthY;
    }

    public BigDecimal getDirectPasteGrowthY() 
    {
        return directPasteGrowthY;
    }
    public void setRediscountBalance(BigDecimal rediscountBalance) 
    {
        this.rediscountBalance = rediscountBalance;
    }

    public BigDecimal getRediscountBalance() 
    {
        return rediscountBalance;
    }
    public void setRediscountGrowthM(BigDecimal rediscountGrowthM) 
    {
        this.rediscountGrowthM = rediscountGrowthM;
    }

    public BigDecimal getRediscountGrowthM() 
    {
        return rediscountGrowthM;
    }
    public void setRediscountGrowthY(BigDecimal rediscountGrowthY) 
    {
        this.rediscountGrowthY = rediscountGrowthY;
    }

    public BigDecimal getRediscountGrowthY() 
    {
        return rediscountGrowthY;
    }
    public void setInterbankBalance(BigDecimal interbankBalance) 
    {
        this.interbankBalance = interbankBalance;
    }

    public BigDecimal getInterbankBalance() 
    {
        return interbankBalance;
    }
    public void setInterbankGrowthM(BigDecimal interbankGrowthM) 
    {
        this.interbankGrowthM = interbankGrowthM;
    }

    public BigDecimal getInterbankGrowthM() 
    {
        return interbankGrowthM;
    }
    public void setInterbankGrowthY(BigDecimal interbankGrowthY) 
    {
        this.interbankGrowthY = interbankGrowthY;
    }

    public BigDecimal getInterbankGrowthY() 
    {
        return interbankGrowthY;
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
            .append("totalBalance", getTotalBalance())
            .append("totalGrowthM", getTotalGrowthM())
            .append("totalGrowthY", getTotalGrowthY())
            .append("companyBalance", getCompanyBalance())
            .append("companyGrowthM", getCompanyGrowthM())
            .append("companyGrowthY", getCompanyGrowthY())
            .append("supplyChainBalance", getSupplyChainBalance())
            .append("supplyChainGrowthM", getSupplyChainGrowthM())
            .append("supplyChainGrowthY", getSupplyChainGrowthY())
            .append("directPasteBalance", getDirectPasteBalance())
            .append("directPasteGrowthM", getDirectPasteGrowthM())
            .append("directPasteGrowthY", getDirectPasteGrowthY())
            .append("rediscountBalance", getRediscountBalance())
            .append("rediscountGrowthM", getRediscountGrowthM())
            .append("rediscountGrowthY", getRediscountGrowthY())
            .append("interbankBalance", getInterbankBalance())
            .append("interbankGrowthM", getInterbankGrowthM())
            .append("interbankGrowthY", getInterbankGrowthY())
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
