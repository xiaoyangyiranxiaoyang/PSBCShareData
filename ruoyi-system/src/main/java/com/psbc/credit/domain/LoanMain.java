package com.psbc.credit.domain;

import com.ruoyi.common.annotation.DataSource;
import lombok.Data;

import java.io.Serializable;

/**
 * 贷款记录表(LoanMain)实体类
 *
 * @author wangLin
 * @since 2020-11-30 11:40:25
 */
@Data
public class LoanMain implements Serializable {
    private static final long serialVersionUID = -98158588241864967L;

    private Object id;
    /**
     * 贷款申请id
     */
    private String applyId;
    /**
     * 借据号
     */
    private String loadRctId;
    /**
     * 客户号
     */
    private String custId;
    /**
     * 客户姓名
     */
    private String custName;
    /**
     * 客户证件号
     */
    private String custCertId;
    /**
     * 产品编码
     */
    private String loanProductId;
    /**
     * 贷款产品名称
     */
    private String productName;
    /**
     * 产品分类
     */
    private String productClass;
    /**
     * 贷款利率
     */
    private Double intRate;
    /**
     * 基准利率
     */
    private Double bmkRate;
    /**
     * 用途
     */
    private String usageDesc;
    /**
     * 贷款期限
     */
    private Integer loanTerm;
    /**
     * 贷款开始时间
     */
    private String loanBgnDate;
    /**
     * 贷款截止时间
     */
    private String loanDltneDate;
    /**
     * 贷款金额
     */
    private Double loanAmt;
    /**
     * 贷款余额
     */
    private Double loanBal;
    /**
     * 保全移交标记
     */
    private String handovFlag;
    /**
     * 还款账户名称
     */
    private String repayAccName;
    /**
     * 还款账户账号
     */
    private String repayAccAccNo;
    /**
     * 风险分类
     */
    private String riskClass;
    /**
     * 柜员号
     */
    private String tellerNo;
    /**
     * 创建机构号
     */
    private String instNo;
    /**
     * 员工姓名
     */
    private String empolyeeName;
    /**
     * 员工证件号
     */
    private String empolyeeCard;
    /**
     * 机构名称
     */
    private String instName;
    /**
     * 额度合同编号
     */
    private String limitContractNo;
    /**
     * 贷款合同编号
     */
    private String loanContractNo;
    /**
     * 跑批时间
     */
    private String etlDate;

}