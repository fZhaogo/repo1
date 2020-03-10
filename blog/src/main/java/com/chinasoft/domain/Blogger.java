package com.chinasoft.domain;

/**
 * @Description TODO
 * @ClassName BloggerDao
 * @Author 86173
 * @Date 2020/3/7 20:44
 * @Version V1.0
 */
public class Blogger {
    private Integer id;
    private String blogname;
    private String image;
    private String name;
    private String sex;
    private String address;
    private String qq;
    private String email;
    private String password;

    public Blogger(Integer id, String blogname, String image, String name, String sex, String address, String qq, String email, String password) {
        this.id = id;
        this.blogname = blogname;
        this.image = image;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.qq = qq;
        this.email = email;
        this.password = password;
    }

    public Blogger() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", blogname='" + blogname + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
