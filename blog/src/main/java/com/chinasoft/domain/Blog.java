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
    private String title;
    private String image;
    private String context;
    private String bloggername;
    private Date date;
    private Integer hits;

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", context='" + context + '\'' +
                ", bloggername='" + bloggername + '\'' +
                ", date=" + date +
                ", hits=" + hits +
                '}';
    }
}
