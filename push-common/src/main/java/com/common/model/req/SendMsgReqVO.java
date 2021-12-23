package com.common.model.req;

import com.common.model.req.BaseRequest;

/**
 * @description:
 * @author：carl
 * @date: 2021/12/23
 */
public class SendMsgReqVO extends BaseRequest {
    private long id ;
    private String msg ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
