package com.chinasoft.domain;

import java.sql.Date;

/**
 * @Description TODO
 * @ClassName Message
 * @Author 86173
 * @Date 2020/3/7 21:16
 * @Version V1.0
 */
public class Message {
    private Integer id;
    private Integer host_id;
    private String content;
    private String bloggername;
    private Date date;

    public Message() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHost_id() {
        return host_id;
    }

    public void setHost_id(Integer host_id) {
        this.host_id = host_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBloggername() {
        return bloggername;
    }

    public void setBloggername(String bloggername) {
        this.bloggername = bloggername;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", host_id=" + host_id +
                ", content='" + content + '\'' +
                ", bloggername='" + bloggername + '\'' +
                ", date=" + date +
                '}';
    }
}
