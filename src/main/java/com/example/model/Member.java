package com.example.model;

/**
 * @author :yhc
 * @date :2021/6/10
 **/
public class Member {
    // 同一个team统一id
    private Integer id;
    private String name;
    private String email;
    // 研究课题
    private String remark;
    private Integer graduated;
    //'0——硕士，1——博士，2——博士后，3——兼职研究员，4——讲师，5——副教授，6——教授'

    private Integer type;
    private String research_direction;
    private String achievement;
    //
    private String url;
    private String member_img;
    // delete :0 为一般成员， delete :1 为team队长(用来唯一标识队伍)
    // delete :-1 表示隐藏
    private Integer deleted;


    public Member(Integer id, String name, String email, String remark, Integer graduated, Integer type
            , String research_direction, String achievement, String url, String member_img, Integer deleted) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.remark = remark;
        this.graduated = graduated;
        this.type = type;
        this.research_direction = research_direction;
        this.achievement = achievement;
        this.url = url;
        this.member_img = member_img;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getGraduated() {
        return graduated;
    }

    public void setGraduated(Integer graduated) {
        this.graduated = graduated;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getResearch_direction() {
        return research_direction;
    }

    public void setResearch_direction(String research_direction) {
        this.research_direction = research_direction;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMember_img() {
        return member_img;
    }

    public void setMember_img(String member_img) {
        this.member_img = member_img;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", remark='" + remark + '\'' +
                ", graduated=" + graduated +
                ", type=" + type +
                ", research_direction='" + research_direction + '\'' +
                ", achievement='" + achievement + '\'' +
                ", url='" + url + '\'' +
                ", member_img='" + member_img + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
