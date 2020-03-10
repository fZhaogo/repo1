package com.chinasoft.domain;

import java.sql.Date;

/**
 * @Description TODO
 * @ClassName Comment
 * @Author 86173
 * @Date 2020/3/7 21:15
 * @Version V1.0
 */
public class Comment {
    private Integer id;
    private String content;
    private String blog_id;
    private String blogname;
    private Date date;

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(String blog_id) {
        this.blog_id = blog_id;
    }

    public String getBloggername() {
        return blogname;
    }

    public void setBloggername(String blogname) {
        this.blogname = blogname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", blog_id='" + blog_id + '\'' +
                ", bloggername='" + blogname + '\'' +
                ", date=" + date +
                '}';
    }
}
