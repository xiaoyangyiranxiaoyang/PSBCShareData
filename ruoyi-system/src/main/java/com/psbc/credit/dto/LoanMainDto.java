package com.psbc.credit.dto;

import com.psbc.credit.domain.LoanMain;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Robb
 * @Description: 个贷信息查询传入参数
 * @date 2020/11/30 12:38
 */
@Data
public class LoanMainDto extends LoanMain {
    /**奖励金额*/
    private BigDecimal rewardAmount;
    /**奖励期数*/
    private Integer grantTimes;
    /**奖励已发放期数*/
    private Integer Issued;
    /**奖励下次发放时间*/
    private Date nextGrantDate;

}
