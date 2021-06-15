package com.example.action;

import com.example.dao.EssayDao;
import com.example.dao.NewsDao;
import com.example.model.Essay;
import com.example.model.News;
import com.example.service.DateParser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;


import java.util.List;
import java.util.Map;

/**
 * @author :yhc
 * @date :2021/6/14
 **/
public class EssayAction extends ActionSupport {
    private String paperTitle;
    private String author;
    private String publisher;
    // 存储session值
    private Map<String,Object> session;

    //新闻审核时需要传出的变量
    private List<News> essayList;
    private String check;


    public void validateSaveEssay(){
        if (StringUtils.isEmpty(paperTitle)){
            addFieldError("error_message","标题不能为空");
        }
        if (StringUtils.isEmpty(author)){
            addFieldError("error_message","作者不能为空");
        }
        if (StringUtils.isEmpty(publisher)){
            addFieldError("error_message","出版社不能为空");
        }
    }

    public String SaveEssay(){

        List<Essay> essayList = EssayDao.select(null,null,null);
        Essay essay = new Essay(essayList.size()+1,0,paperTitle,author,"论文成员", DateParser.getTimeNow()
                ,null,publisher,DateParser.getTimeNow(),DateParser.getTimeNow(),0);
        EssayDao.insert(essay);


        session = ActionContext.getContext().getSession();
        session.get("result");
        session.put("result","论文上传成功");

        return "success";
    }


    public void CheckE(){
        List<Essay> essayList = EssayDao.select(null,null,null);
        session = ActionContext.getContext().getSession();
        session.put("essayList",essayList);
    }

    // 论文审核
    public String CheckEssay(){
        //遍历出所有的新闻
        CheckE();
        return "check";
    }

    // 查看通过的新闻审核
    public String CheckpassNews(){
        //遍历出所有未审核的新闻
        CheckE();
        return "checkpass";
    }
    // 查看未通过的新闻审核
    public String ChecknotpassNews(){
        //遍历出所有未审核的新闻
        CheckE();
        return "checknotpass";
    }


    public void Pass(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<Essay> essayList = (List<Essay>) session.get("essayList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (Essay demo:essayList){
                if (demo.getId() == i){
                    demo.setDeleted(1);
                    EssayDao.update(demo);
                }
            }
        }

    }

    public void NotPass(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<Essay> essayList = (List<Essay>) session.get("essayList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (Essay demo:essayList){
                if (demo.getId() == i){
                    demo.setDeleted(2);
                    demo.setUpdate_time(DateParser.getTimeNow());
                    EssayDao.update(demo);
                }
            }
        }
    }

    // 通过审核
    public String PassEssay(){
        Pass();
        return "pass";
    }

    // 不通过审核
    public String NotPassEssay(){
        NotPass();
        return "notpass";
    }

    //通过又下架
    public String NotPassAgain(){
        NotPass();
        return "notpassAgain";
    }

    //下架又通过
    public String PassAgain(){
        Pass();
        return "passAgain";
    }



    public List<News> getEssayList() {
        return essayList;
    }

    public void setEssayList(List<News> essayList) {
        this.essayList = essayList;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
