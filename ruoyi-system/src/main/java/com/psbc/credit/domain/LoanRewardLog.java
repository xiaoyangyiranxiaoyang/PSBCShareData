package com.psbc.credit.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 信贷奖励发放记录表(LoanRewardLog)实体类
 *
 * @author wangLin
 * @since 2020-12-11 16:29:25
 */
@Data
public class LoanRewardLog implements Serializable {
    private static final long serialVersionUID = -85422820243622778L;

    private Long id;
    /**
     * 借据号
     */
    private String loadRctId;
    /**
     * 奖励第几期
     */
    private Integer num;
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