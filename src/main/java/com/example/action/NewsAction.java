package com.example.action;

import com.example.dao.NewsDao;
import com.example.dao.UserDao;
import com.example.model.News;
import com.example.model.User;
import com.example.service.DateParser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.*;

/**
 * @author :yhc
 * @date :2021/6/14
 **/
public class NewsAction extends ActionSupport {


    private String title;
    private String writer;
    private String txt;
    //图片上传需要的变量
    private File upload_pic;
    private String upload_picContentType; // name属性值 + ContentType 后缀   文件类型
    private String upload_picFileName;    // name属性值 + ContentType 后缀   文件名称


    //新闻审核时需要传出的变量
    private List<News> newsList;
    private String check;

    //查看详情的时候的变量
    private String temp;

    // 存储session值
    private Map<String,Object> session;


    public void validateUploadByIo() {
        if (StringUtils.isEmpty(title)){
            addFieldError("error_message","标题不能为空");
        }
        if (StringUtils.isEmpty(writer)){
            addFieldError("error_message","作者不能为空");
        }
        if (StringUtils.isEmpty(writer)){
            addFieldError("error_message","正文不能为空");
        }
    }

    //  使用IO流上传
    public String UploadByIo() throws IOException {
        String path = "";
        String newFilename = "";
        // 仅在有文件上传时打开IO流
        if(upload_pic != null) {
            path = "C:\\Users\\Win10\\Desktop\\课件\\企业级java\\课设\\struts2demo\\target\\struts2demo-1.0-SNAPSHOT\\news_pic";
            // 读取文件
            FileInputStream fis = new FileInputStream(upload_pic);
            String extension = FilenameUtils.getExtension(upload_picFileName);
            // 重命名文件名称
            newFilename = UUID.randomUUID() + "." + extension;
            System.out.println(extension);
            // 写出文件
            FileOutputStream fos = new FileOutputStream(path + "\\" + newFilename);
            IOUtils.copy(fis, fos);
            //关闭流
            if (fos != null) {
                fos.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        //把新闻类传到数据库
        List<News> list = NewsDao.select(null,null,null,null);
        News news = new News(list.size()+1,title,writer
                ,txt,path + "/" + newFilename, DateParser.getTimeNow()
                ,DateParser.getTimeNow(),0);
        NewsDao.insert(news);
        session = ActionContext.getContext().getSession();
        session.put("result","新闻上传成功");
        return "success";
    }

    // 新闻审核
    public String CheckNews(){
        //遍历出所有未审核的新闻
        List<News> newsList = NewsDao.select(null,null,null,null);
        session = ActionContext.getContext().getSession();
        session.put("newsList",newsList);
        return "check";
    }

    // 查看新闻详情
    public String CheakDetail(){
        return "detail";
    }

    // 查看通过的新闻审核
    public String CheckpassNews(){
        //遍历出所有未审核的新闻
        List<News> newsList = NewsDao.select(null,null,null,null);
        session = ActionContext.getContext().getSession();
        session.put("newsList",newsList);
        return "checkpass";
    }
    // 查看未通过的新闻审核
    public String ChecknotpassNews(){
        //遍历出所有未审核的新闻
        List<News> newsList = NewsDao.select(null,null,null,null);
        session = ActionContext.getContext().getSession();
        session.put("newsList",newsList);
        return "checknotpass";
    }



    public void Pass(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<News> news = (List<News>) session.get("newsList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (News demo:news){
                if (demo.getId() == i){
                    demo.setDeleted(1);
                    NewsDao.update(demo);
                }
            }
        }
    }

    public void NotPass(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<News> news = (List<News>) session.get("newsList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (News demo:news){
                if (demo.getId() == i){
                    demo.setDeleted(2);
                    demo.setUpdate_time(DateParser.getTimeNow());
                    NewsDao.update(demo);
                }
            }
        }
    }

    // 通过审核
    public String PassNews(){
        Pass();
        return "pass";
    }

    // 不通过审核
    public String NotPassNews(){
        NotPass();
        return "notpass";
    }

    // 通过后不通过
    public String NotPassAgain(){
        NotPass();
        return "notPassAgain";
    }

    // 不通过后再通过
    public String PassAgain(){
        Pass();
        return "PassAgain";
    }






    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
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

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public File getUpload_pic() {
        return upload_pic;
    }

    public void setUpload_pic(File upload_pic) {
        this.upload_pic = upload_pic;
    }

    public String getUpload_picContentType() {
        return upload_picContentType;
    }

    public void setUpload_picContentType(String upload_picContentType) {
        this.upload_picContentType = upload_picContentType;
    }

    public String getUpload_picFileName() {
        return upload_picFileName;
    }

    public void setUpload_picFileName(String upload_picFileName) {
        this.upload_picFileName = upload_picFileName;
    }
}
