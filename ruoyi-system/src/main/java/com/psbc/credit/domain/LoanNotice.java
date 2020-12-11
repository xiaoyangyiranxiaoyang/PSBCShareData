package com.psbc.credit.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 信贷提醒记录表(LoanNotice)实体类
 *
 * @author wangLin
 * @since 2020-12-11 15:45:18
 */
@Data
public class LoanNotice implements Serializable {
    private static final long serialVersionUID = -86644600508894528L;

    private Long id;
    /**
     * 提醒类型
     */
    private Integer noticeType;
    /**
     * 提醒原因
     */
    private String noticeReason;
    /**
     * 处理备注
     */
    private String remark;
    /**
     * 是否处理
     */
    private Integer isHandle;
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
    /**
     * 借据号
     */
    private String loadRctId;

}