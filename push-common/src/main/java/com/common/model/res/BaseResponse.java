package com.common.model.res;

import java.io.Serializable;

/**
 * @author carl-xiao
 **/
public class BaseResponse<T> implements Serializable {
    /**
     * 状态码
     */
    private String code;
    /**
     * 描述信息
     */
    private String message;
    /**
     * 请求号
     */
    private String reqNo;
    /**
     * 请求数据
     */
    private T data;

    public BaseResponse(){

    }

    public BaseResponse(String code, String message, String reqNo, T data) {
        this.code = code;
        this.message = message;
        this.reqNo = reqNo;
        this.data = data;
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

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
