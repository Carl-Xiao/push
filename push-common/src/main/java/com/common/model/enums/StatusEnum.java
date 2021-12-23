package com.common.model.enums;

/**
 * @description:
 * @author：carl
 * @date: 2021/12/23
 */
public enum StatusEnum {

    SUCCESS("200","success"),
    FAIL("200","FAIL");

    StatusEnum(String code, String message) {
        this.code = code;
        this.msg = message;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
