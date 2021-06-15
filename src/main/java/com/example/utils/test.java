package com.example.utils;

import com.example.dao.*;
import com.example.model.*;
import com.example.service.DateParser;


import java.util.Date;
import java.util.List;

/**
 * @author :yhc
 * @date :2021/6/11
 **/
public class test {
    public static void main(String[] args) {
        //用户测试
//        User user = new User(1,"李明","123456",1,"www.baidu.com"
//                ,new Date(1997-1900,1,1,10,20,30),new Date(1997-1900,1,1),0);
//
//        User user2 = new User(10,"张三","123456",1,"www.sina.com"
//                ,new Date(1997-1900,1,1,10,20,30),new Date(1997-1900,1,1),0);

//        UserDao.insert(user);
        // UserDao.insert(user2);
        // UserDao.update(user);
//        List<User> userList =  UserDao.select(null,null,null);
//        for (User user1:userList){
//            System.out.println(user1.getId());
//        }
//        int h = new Date().getHours();
//        System.out.println(h > 19);
//        System.out.println(DateParser.getTimeNow());
        //新闻测试
//        News news = new News(3,"新闻标题demo","新闻作者demo"
//                ,"新闻正文demo","新闻图片的url",DateParser.getTimeNow()
//                ,DateParser.getTimeNow(),0);
//        News news2 = new News(10,"新闻标题demo2","新闻作者demo2"
//                ,"新闻正文demo2","新闻图片的url2",DateParser.getTimeNow()
//                ,DateParser.getTimeNow(),0);
        //NewsDao.insert(news2);
        //NewsDao.update(news2);
//        List<News> newsList = NewsDao.select(null,null,null,0);
//        System.out.println(newsList);

        //论文测试
//        Essay essay = new Essay(1,0,"论文标题demo","论文作者","论文成员",DateParser.getTimeNow()
//                ,null,"出版机构demo",DateParser.getTimeNow(),DateParser.getTimeNow(),0);
//        Essay essay2 = new Essay(2,0,"论文标题demo2","论文作者2","论文成员2",DateParser.getTimeNow()
//                ,null,"出版机构demo2",DateParser.getTimeNow(),DateParser.getTimeNow(),0);
        //EssayDao.insert(essay);
//        EssayDao.insert(essay2);
//        EssayDao.update(essay);
//        List<Essay> essayList = EssayDao.select(null,null,null);
//        System.out.println(essayList);

        // 团队和成员测试
//        Member member = new Member(2,"队长1","10086@qq.com","团队分工等",0
//                ,5,"研究方向","研究成果","资源地址","成员照片",1);
//        Member member2 = new Member(1,"队长1","10086111@qq.com","团队分工等22",0
//                ,5,"研究方向2","研究成果2","资源地址2","成员照片2",1);
//        MemberDao.insert(member);
//        //MemberDao.update(member2);
//        List<Member> memberList = MemberDao.select(null,null,null);
//        System.out.println(memberList);

        //项目测试
//        Project project = new Project(2,"项目主题","批准号",DateParser.getTimeNow(),DateParser.getTimeNow()
//                ,"项目详情介绍",DateParser.getTimeNow(),DateParser.getTimeNow(),0);
//        Project project2 = new Project(1,"项目主题2","批准号2",DateParser.getTimeNow(),DateParser.getTimeNow()
//                ,"项目详情介绍2",DateParser.getTimeNow(),DateParser.getTimeNow(),0);
        //ProjectDao.insert(project);
        //ProjectDao.update(project2);
//        List<Project> projectList = ProjectDao.select(null,null,null);
//        System.out.println(projectList);

        String s = "1";
        int a = new Integer(s);
        System.out.println(a + 1);


    }
}
