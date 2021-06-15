package com.example.model;

import java.util.Date;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class Essay {
    private Integer id;
    private Integer file;
    private String title;
    private String writer;
    // 成员member (json{"id"})
    private String member;
    private Date time;
    // 论文类型
    private String type;
    private String publisher;
    private Date create_time;
    private Date update_time;
    // 0-未审核，1-审核通过，2-审核不通过
    private Integer deleted;

    public Essay() {
    }

    public Essay(Integer id, Integer file, String title, String writer, String member, Date time, String type,
                 String publisher, Date create_time, Date update_time, Integer deleted) {
        this.id = id;
        this.file = file;
        this.title = title;
        this.writer = writer;
        this.member = member;
        this.time = time;
        this.type = type;
        this.publisher = publisher;
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

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
        return "Essay{" +
                "id=" + id +
                ", file=" + file +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", member='" + member + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", deleted=" + deleted +
                '}';
    }
}
