package com.example.model;

import java.util.Date;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class Project {
    private Integer id;
    private String name;
    //批准号
    private String auth_num;
    private Date start_time;
    private Date end_time;
    private String principal;
    private Date create_time;
    private Date update_time;
    private Integer deleted;

    public Project() {
    }

    public Project(Integer id, String name, String auth_num, Date start_time, Date end_time,
                   String principal, Date create_time, Date update_time, Integer deleted) {
        this.id = id;
        this.name = name;
        this.auth_num = auth_num;
        this.start_time = start_time;
        this.end_time = end_time;
        this.principal = principal;
        this.create_time = create_time;
        this.update_time = update_time;
        this.deleted = deleted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth_num() {
        return auth_num;
    }

    public void setAuth_num(String auth_num) {
        this.auth_num = auth_num;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
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
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auth_num='" + auth_num + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", principal=" + principal +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", deleted=" + deleted +
                '}';
    }
}
