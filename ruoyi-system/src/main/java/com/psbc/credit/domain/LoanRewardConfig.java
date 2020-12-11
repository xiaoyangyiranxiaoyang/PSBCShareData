package com.psbc.credit.domain;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (LoanRewardConfig)表实体类
 * @author wangLin
 * @since 2020-12-07 12:22:59
 */
@Data
public class LoanRewardConfig  {

    private Object id;
    /**部门id*/
    private Long deptId;
    /**部门名称*/
    private String deptName;
    /**父部门id*/
    private Long parentId;
    /**用户ID*/
    private Long userId;
    /**用户昵称*/
    private String userName;
    /**奖励金额*/
    private Double rewardAmount;
    /**贷种*/
    private Integer loanType;
    /**创建人*/
    private String createBy;
    /**创建时间-应用操作时间*/
    private Date createTime;
    /**服务器IP*/
    private String serverIp;
    /**修改人*/
    private String updateBy;
    /**修改时间*/
    private Date updateTime;
    /**是否逻辑删除:默认0未删除;1已删除*/
    private Integer delFlag;



}