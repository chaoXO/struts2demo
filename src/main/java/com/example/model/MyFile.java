package com.example.model;

import java.util.Date;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class MyFile {
    private Integer id;
    private String url;
    private Integer type;
    private Date create_time;
    private Date update_time;
    private Integer deleted;

    public MyFile() {
    }

    public MyFile(Integer id, String url, Integer type, Date create_time, Date update_time, Integer deleted) {
        this.id = id;
        this.url = url;
        this.type = type;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        return "File{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", type=" + type +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", deleted=" + deleted +
                '}';
    }
}
