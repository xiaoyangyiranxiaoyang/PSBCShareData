package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 全行资产业务情况表对象 kpi_show_asset_business
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiShowAssetBusiness extends BaseEntity
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

    /** 合计-日均 */
    @Excel(name = "合计-日均")
    private BigDecimal totalDaily;

    /** 三农贷款(小额)-余额 */
    @Excel(name = "三农贷款(小额)-余额")
    private BigDecimal smallAmountBalance;

    /** 三农贷款(小额)-月增 */
    @Excel(name = "三农贷款(小额)-月增")
    private BigDecimal smallAmountGrowthM;

    /** 三农贷款(小额)-年增 */
    @Excel(name = "三农贷款(小额)-年增")
    private BigDecimal smallAmountGrowthY;

    /** 三农贷款(小额)-日均 */
    @Excel(name = "三农贷款(小额)-日均")
    private BigDecimal smallAmountDaily;

    /** 消费贷款-余额 */
    @Excel(name = "消费贷款-余额")
    private BigDecimal consumptionBalance;

    /** 消费贷款-月增 */
    @Excel(name = "消费贷款-月增")
    private BigDecimal consumptionGrowthM;

    /** 消费贷款-年增 */
    @Excel(name = "消费贷款-年增")
    private BigDecimal consumptionGrowthY;

    /** 消费贷款-日均 */
    @Excel(name = "消费贷款-日均")
    private BigDecimal consumptionDaily;

    /** 小企业贷款-余额 */
    @Excel(name = "小企业贷款-余额")
    private BigDecimal smallBusinessBalance;

    /** 小企业贷款-月增 */
    @Excel(name = "小企业贷款-月增")
    private BigDecimal smallBusinessGrowthM;

    /** 小企业贷款-年增 */
    @Excel(name = "小企业贷款-年增")
    private BigDecimal smallBusinessGrowthY;

    /** 小企业贷款-日均 */
    @Excel(name = "小企业贷款-日均")
    private BigDecimal smallBusinessDaily;

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
    public void setTotalDaily(BigDecimal totalDaily) 
    {
        this.totalDaily = totalDaily;
    }

    public BigDecimal getTotalDaily() 
    {
        return totalDaily;
    }
    public void setSmallAmountBalance(BigDecimal smallAmountBalance) 
    {
        this.smallAmountBalance = smallAmountBalance;
    }

    public BigDecimal getSmallAmountBalance() 
    {
        return smallAmountBalance;
    }
    public void setSmallAmountGrowthM(BigDecimal smallAmountGrowthM) 
    {
        this.smallAmountGrowthM = smallAmountGrowthM;
    }

    public BigDecimal getSmallAmountGrowthM() 
    {
        return smallAmountGrowthM;
    }
    public void setSmallAmountGrowthY(BigDecimal smallAmountGrowthY) 
    {
        this.smallAmountGrowthY = smallAmountGrowthY;
    }

    public BigDecimal getSmallAmountGrowthY() 
    {
        return smallAmountGrowthY;
    }
    public void setSmallAmountDaily(BigDecimal smallAmountDaily) 
    {
        this.smallAmountDaily = smallAmountDaily;
    }

    public BigDecimal getSmallAmountDaily() 
    {
        return smallAmountDaily;
    }
    public void setConsumptionBalance(BigDecimal consumptionBalance) 
    {
        this.consumptionBalance = consumptionBalance;
    }

    public BigDecimal getConsumptionBalance() 
    {
        return consumptionBalance;
    }
    public void setConsumptionGrowthM(BigDecimal consumptionGrowthM) 
    {
        this.consumptionGrowthM = consumptionGrowthM;
    }

    public BigDecimal getConsumptionGrowthM() 
    {
        return consumptionGrowthM;
    }
    public void setConsumptionGrowthY(BigDecimal consumptionGrowthY) 
    {
        this.consumptionGrowthY = consumptionGrowthY;
    }

    public BigDecimal getConsumptionGrowthY() 
    {
        return consumptionGrowthY;
    }
    public void setConsumptionDaily(BigDecimal consumptionDaily) 
    {
        this.consumptionDaily = consumptionDaily;
    }

    public BigDecimal getConsumptionDaily() 
    {
        return consumptionDaily;
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
    public void setSmallBusinessDaily(BigDecimal smallBusinessDaily) 
    {
        this.smallBusinessDaily = smallBusinessDaily;
    }

    public BigDecimal getSmallBusinessDaily() 
    {
        return smallBusinessDaily;
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
            .append("totalDaily", getTotalDaily())
            .append("smallAmountBalance", getSmallAmountBalance())
            .append("smallAmountGrowthM", getSmallAmountGrowthM())
            .append("smallAmountGrowthY", getSmallAmountGrowthY())
            .append("smallAmountDaily", getSmallAmountDaily())
            .append("consumptionBalance", getConsumptionBalance())
            .append("consumptionGrowthM", getConsumptionGrowthM())
            .append("consumptionGrowthY", getConsumptionGrowthY())
            .append("consumptionDaily", getConsumptionDaily())
            .append("smallBusinessBalance", getSmallBusinessBalance())
            .append("smallBusinessGrowthM", getSmallBusinessGrowthM())
            .append("smallBusinessGrowthY", getSmallBusinessGrowthY())
            .append("smallBusinessDaily", getSmallBusinessDaily())
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
