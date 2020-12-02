package com.ruoyi.system.domain;

import com.ruoyi.common.enums.CodeEnum;

/**
 * @author Robb
 * @Description:返回参数
 * @date 2020/11/17 16:54
 */
public class Result {

    public final static Result OK = new Result(CodeEnum.OK);
    public final static Result ERROR = new Result(CodeEnum.ERROR);

    private String code;
    private String message;

    public Result() {}

    public Result(CodeEnum codeMsg) {
        this(codeMsg.getCode(), codeMsg.getMessage());
    }
    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
