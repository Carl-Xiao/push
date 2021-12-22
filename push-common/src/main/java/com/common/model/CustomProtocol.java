package com.common.model;

/**
 * @author carl-xiao
 * @Description https://www.1024sou.com/article/487077.html 参考消息体设计
 **/
public class CustomProtocol {
    /**
     * 消息头
     */
    private long header;
    /**
     * 消息正文
     */
    private String content;

    public CustomProtocol() {

    }

    public CustomProtocol(long header, String content) {
        this.header = header;
        this.content = content;
    }

    public long getHeader() {
        return header;
    }

    public void setHeader(long header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
