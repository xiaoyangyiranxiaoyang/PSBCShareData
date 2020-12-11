package com.psbc.credit.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 信贷问责记录表(LoanAccountability)实体类
 *
 * @author wangLin
 * @since 2020-12-11 14:37:47
 */
@Data
public class LoanAccountability implements Serializable {
    private static final long serialVersionUID = -16538440200762237L;

    private Object id;
    /**
     * 借据号
     */
    private String loadRctId;
    /**
     * 问责原因
     */
    private Integer accountabilityType;
    /**
     * 问责备注
     */
    private String remark;
    /**
     * 问责状态
     */
    private Integer accountabilityState;
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