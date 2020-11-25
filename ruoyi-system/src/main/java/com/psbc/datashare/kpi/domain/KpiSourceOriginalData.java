package com.psbc.datashare.kpi.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 数据原（商业银行日报）对象 kpi_source_original_data
 * 
 * @author mql
 * @date 2020-11-25
 */
public class KpiSourceOriginalData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 指标号 */
    @Excel(name = "指标号")
    private String indicatorNum;

    /** 指标名称 */
    @Excel(name = "指标名称")
    private String indicatorName;

    /** 青海生分行 */
    @Excel(name = "青海生分行")
    private BigDecimal quanSheng;

    /** 青海省分行本部 */
    @Excel(name = "青海省分行本部")
    private BigDecimal benBu;

    /** 青海省分行机关 */
    @Excel(name = "青海省分行机关")
    private BigDecimal jiGuan;

    /** 西宁市城西支行 */
    @Excel(name = "西宁市城西支行")
    private BigDecimal chengXi;

    /** 大通支行 */
    @Excel(name = "大通支行")
    private BigDecimal daTong;

    /** 青海省海东市支行 */
    @Excel(name = "青海省海东市支行")
    private BigDecimal haiDong;

    /** 西宁市城中支行 */
    @Excel(name = "西宁市城中支行")
    private BigDecimal chengZhong;

    /** 青海省海南藏族自治州支行 */
    @Excel(name = "青海省海南藏族自治州支行")
    private BigDecimal haiNan;

    /** 青海省玉树藏族自治州支行 */
    @Excel(name = "青海省玉树藏族自治州支行")
    private BigDecimal yuShu;

    /** 海西蒙古族藏族自治州支行 */
    @Excel(name = "海西蒙古族藏族自治州支行")
    private BigDecimal haiXi;

    /** 青海省海北藏族自治州支行 */
    @Excel(name = "青海省海北藏族自治州支行")
    private BigDecimal haiBei;

    /** 黄南藏族自治州支行 */
    @Excel(name = "黄南藏族自治州支行")
    private BigDecimal huangNan;

    /** 青海省果洛藏族自治州支行 */
    @Excel(name = "青海省果洛藏族自治州支行")
    private BigDecimal guoLuo;

    /** 格尔木市支行 */
    @Excel(name = "格尔木市支行")
    private BigDecimal geErMu;

    /** 青海省分行(营业部) */
    @Excel(name = "青海省分行(营业部)")
    private BigDecimal yingYiBu;

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
    public void setIndicatorNum(String indicatorNum) 
    {
        this.indicatorNum = indicatorNum;
    }

    public String getIndicatorNum() 
    {
        return indicatorNum;
    }
    public void setIndicatorName(String indicatorName) 
    {
        this.indicatorName = indicatorName;
    }

    public String getIndicatorName() 
    {
        return indicatorName;
    }
    public void setQuanSheng(BigDecimal quanSheng) 
    {
        this.quanSheng = quanSheng;
    }

    public BigDecimal getQuanSheng() 
    {
        return quanSheng;
    }
    public void setBenBu(BigDecimal benBu) 
    {
        this.benBu = benBu;
    }

    public BigDecimal getBenBu() 
    {
        return benBu;
    }
    public void setJiGuan(BigDecimal jiGuan) 
    {
        this.jiGuan = jiGuan;
    }

    public BigDecimal getJiGuan() 
    {
        return jiGuan;
    }
    public void setChengXi(BigDecimal chengXi) 
    {
        this.chengXi = chengXi;
    }

    public BigDecimal getChengXi() 
    {
        return chengXi;
    }
    public void setDaTong(BigDecimal daTong) 
    {
        this.daTong = daTong;
    }

    public BigDecimal getDaTong() 
    {
        return daTong;
    }
    public void setHaiDong(BigDecimal haiDong) 
    {
        this.haiDong = haiDong;
    }

    public BigDecimal getHaiDong() 
    {
        return haiDong;
    }
    public void setChengZhong(BigDecimal chengZhong) 
    {
        this.chengZhong = chengZhong;
    }

    public BigDecimal getChengZhong() 
    {
        return chengZhong;
    }
    public void setHaiNan(BigDecimal haiNan) 
    {
        this.haiNan = haiNan;
    }

    public BigDecimal getHaiNan() 
    {
        return haiNan;
    }
    public void setYuShu(BigDecimal yuShu) 
    {
        this.yuShu = yuShu;
    }

    public BigDecimal getYuShu() 
    {
        return yuShu;
    }
    public void setHaiXi(BigDecimal haiXi) 
    {
        this.haiXi = haiXi;
    }

    public BigDecimal getHaiXi() 
    {
        return haiXi;
    }
    public void setHaiBei(BigDecimal haiBei) 
    {
        this.haiBei = haiBei;
    }

    public BigDecimal getHaiBei() 
    {
        return haiBei;
    }
    public void setHuangNan(BigDecimal huangNan) 
    {
        this.huangNan = huangNan;
    }

    public BigDecimal getHuangNan() 
    {
        return huangNan;
    }
    public void setGuoLuo(BigDecimal guoLuo) 
    {
        this.guoLuo = guoLuo;
    }

    public BigDecimal getGuoLuo() 
    {
        return guoLuo;
    }
    public void setGeErMu(BigDecimal geErMu) 
    {
        this.geErMu = geErMu;
    }

    public BigDecimal getGeErMu() 
    {
        return geErMu;
    }
    public void setYingYiBu(BigDecimal yingYiBu) 
    {
        this.yingYiBu = yingYiBu;
    }

    public BigDecimal getYingYiBu() 
    {
        return yingYiBu;
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
            .append("indicatorNum", getIndicatorNum())
            .append("indicatorName", getIndicatorName())
            .append("quanSheng", getQuanSheng())
            .append("benBu", getBenBu())
            .append("jiGuan", getJiGuan())
            .append("chengXi", getChengXi())
            .append("daTong", getDaTong())
            .append("haiDong", getHaiDong())
            .append("chengZhong", getChengZhong())
            .append("haiNan", getHaiNan())
            .append("yuShu", getYuShu())
            .append("haiXi", getHaiXi())
            .append("haiBei", getHaiBei())
            .append("huangNan", getHuangNan())
            .append("guoLuo", getGuoLuo())
            .append("geErMu", getGeErMu())
            .append("yingYiBu", getYingYiBu())
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
