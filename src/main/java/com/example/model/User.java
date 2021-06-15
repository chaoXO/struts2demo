package com.example.model;

import java.util.Date;

/**
 * @author :yhc
 * @date :2021/6/10
 **/
public class User {
    private Integer id;
    private String name;
    private String password;
    //'0——硕士，1——博士，2——博士后，3——兼职研究员，4——讲师，5——副教授，6——教授'
    private Integer type;
    private String user_img;
    private Date create_time;
    private Date update_time;
    private Integer deleted;

    public User() {
    }

    public User(Integer id, String name, String password, Integer type, String user_img, Date create_time
            , Date update_time, Integer deleted) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.type = type;
        this.user_img = user_img;
        this.create_time = create_time;
        this.update_time = update_time;
        this.deleted = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                ", user_img=" + user_img +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", deleted=" + deleted +
                '}';
    }
}
