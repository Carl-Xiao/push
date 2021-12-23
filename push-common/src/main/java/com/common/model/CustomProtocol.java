package com.common.model;

import java.io.Serializable;

/**
 * @author carl-xiao
 * @Description https://www.1024sou.com/article/487077.html 参考消息体设计
 **/
public class CustomProtocol  implements Serializable {
    /**
     * 消息头
     */
    private long id;
    /**
     * 消息正文
     */
    private String content;

    public CustomProtocol() {

    }

    public CustomProtocol(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
