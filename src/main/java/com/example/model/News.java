package com.example.model;

import java.util.Date;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class News {
    private Integer id;
    private String title;
    private String writer;
    private String text;
// (json{"id","position"} foreign file null)
    private String img;
    private Date create_time;
    private Date update_time;
    // delete -0 表示未审核 -1 表示审核成功 -2 表示审核失败
    private Integer deleted;

    public News() {
    }

    public News(Integer id, String title, String writer, String text, String img
            , Date create_time, Date update_time, Integer deleted) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.text = text;
        this.img = img;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", text='" + text + '\'' +
                ", img='" + img + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", deleted=" + deleted +
                '}';
    }
}
