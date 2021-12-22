package com.common.model.req;

/**
 * @author carl-xiao
 **/
public class BaseRequest {
    /**
     * 唯一请求序列号
     */
    private String reqNo;
    /**
     * 当前时间戳
     */
    private long timeStamp;

    public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
