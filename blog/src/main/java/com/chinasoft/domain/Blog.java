package com.chinasoft.domain;

import java.sql.Date;

/**
 * @Description TODO
 * @ClassName Blog
 * @Author 86173
 * @Date 2020/3/7 21:15
 * @Version V1.0
 */
public class Blog {
    private Integer id;
    private String type;
    private String font;
    private String title;
    private String image;
    private String context;
    private Integer blogger_id;
    private Date date;
    private Integer hits;

    public Blog() {
    }

    public Blog(Integer id, String type, String font, String title, String image, String context, Integer blogger_id, Date date, Integer hits) {
        this.id = id;
        this.type = type;
        this.font = font;
        this.title = title;
        this.image = image;
        this.context = context;
        this.blogger_id = blogger_id;
        this.date = date;
        this.hits = hits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getBlogger_id() {
        return blogger_id;
    }

    public void setBlogger_id(Integer blogger_id) {
        this.blogger_id = blogger_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", font='" + font + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", context='" + context + '\'' +
                ", blogger_id='" + blogger_id + '\'' +
                ", date=" + date +
                ", hits=" + hits +
                '}';
    }
}
