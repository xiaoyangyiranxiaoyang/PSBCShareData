package com.psbc.credit.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 信贷免责记录表(LoanExemption)实体类
 *
 * @author wangLin
 * @since 2020-12-11 15:44:35
 */
@Data
public class LoanExemption implements Serializable {
    private static final long serialVersionUID = 965932886123426811L;

    private Object id;
    /**
     * 借据号
     */
    private String loadRctId;
    /**
     * 免责原因
     */
    private Integer exemptionType;
    /**
     * 免责备注
     */
    private String remark;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间-应用操作时间
     */
    private Date createTime;
    /**
     * 服务器IP
     */
    private String serverIp;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 是否逻辑删除:默认0未删除;1已删除
     */
    private Integer delFlag;

}