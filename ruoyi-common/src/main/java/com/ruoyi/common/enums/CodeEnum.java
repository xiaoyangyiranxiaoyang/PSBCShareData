package com.ruoyi.common.enums;

/**
 * @author Robb
 * @Description: 返回编码信息
 * @date 2020/11/17 16:55
 */
public enum CodeEnum {

    OK("0", "code.ok"),

    NODATA("204", "code.nodata"),

    UNAUTHORIZED("401", "code.unauthorized"),

    FORBIDDEN("403", "code.forbidden"),

    CONFLICT("409", "code.conflict"),

    ERROR("500", "code.error"),

    SERVICE_ERROR("599", "code.service.error"),

    VALIDATE_ERROR("598", "code.validate.error"),

    NOT_NULL("598", "code.notNull"),
    NOT_EMPTY("598", "code.notEmpty"),

    PARAMETER_NOT_NULL("598", "code.parameter.notNull"),
    PARAMETER_NOT_EMPTY("598", "code.parameter.notEmpty"),

    PARAMTER_TOO_LARGER("593","code.paramter.too.larger"),

    QUERY_PARAMETER_NOT_EMPTY("597", "code.query.parameter.notEmpty"),

    EXISTS("596", "code.validate.exists"),
    NOT_EXISTS("595", "code.validate.notExists"),

    IMPORT_TMPL_EMPTY("594", "code.import.nodata"),

    DATA_CHANGE_ERROR("595", "data.change.error"),

    IMPORT_ROW("594", "code.import.row"),

    IMPORT_MAX_ROW("595", "code.import.max.row"),

    //文件格式不正确或大小超过限制
    UPLOAD_FILE_SIZE("701", "upload.file.size.error"),

    //将上传的file转image时出现异常
    TRANSFER_IMAGE_ERROR("702", "transfer.image.error"),

    //上传图片为空
    UPLOAD_IMAGE_NULL_ERROR("703", "upload.image.null.error"),
    //用户信息为空
    USER_INFO_IS_NULL("1025","user.info.is.null"),
    WAREHOUSE_CODE_EXISTS("2000", "wareHouse.wareHouseCodeExist"),
    CODE_CODE_EXISTS("2006", "code.codeExist"),
    //重复操作
    REPEAT_OPERATION("2008", "repeat.operation"),
    ;

    private String code;
    private String message;
    private CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
