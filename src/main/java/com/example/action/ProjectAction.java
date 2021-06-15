package com.example.action;

import com.example.dao.EssayDao;
import com.example.dao.ProjectDao;
import com.example.model.Essay;
import com.example.model.News;
import com.example.model.Project;
import com.example.service.DateParser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :yhc
 * @date :2021/6/14
 **/
public class ProjectAction extends ActionSupport {

    private String projectTitle;
    private String author;
    private String projectText;
    private Date start_time;
    private Date end_time;

    private Map<String,Object> session;

    //新闻审核时需要传出的变量
    private List<Project> projectList;
    private String check;


    public void validateSaveProject(){
        if (StringUtils.isEmpty(projectTitle)){
            addFieldError("error_message","项目主题不能为空");
        }
        if (StringUtils.isEmpty(author)){
            addFieldError("error_message","作者不能为空");
        }
        if (StringUtils.isEmpty(projectText)){
            addFieldError("error_message","项目详情介绍不能为空");
        }
    }

    public String SaveProject(){

        List<Project> projectList = ProjectDao.select(null,null,null);
        Project project = new Project(projectList.size()+1,projectTitle,author, DateParser.utilToSql(start_time),
                DateParser.utilToSql(end_time),projectText,DateParser.getTimeNow(),DateParser.getTimeNow(),0);
        ProjectDao.insert(project);

        session = ActionContext.getContext().getSession();
        session.put("result","项目上传成功");
        return "success";
    }

    public void CheckE(){
        List<Project> projectList = ProjectDao.select(null,null,null);
        session = ActionContext.getContext().getSession();
        session.put("projectList",projectList);
    }

    // 论文审核
    public String CheckEssay(){
        //遍历出所有的新闻
        CheckE();
        return "check";
    }


    public void Pass(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<Project> essayList = (List<Project>) session.get("projectList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (Project demo:essayList){
                if (demo.getId() == i){
                    demo.setDeleted(1);
                    ProjectDao.update(demo);
                }
            }
        }
    }

    public void NotPass(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<Project> essayList = (List<Project>) session.get("projectList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (Project demo:essayList){
                if (demo.getId() == i){
                    demo.setDeleted(2);
                    ProjectDao.update(demo);
                }
            }
        }
    }

    // 通过审核
    public String PassProject(){
        Pass();
        return "pass";
    }

    // 不通过审核
    public String NotPassProject(){
        NotPass();
        return "notpass";
    }

    // 下架再上架
    public String PassProjectAgain(){
        Pass();
        return "passAgain";
    }
    // 上架后下架
    public String NotPassProjectAgain(){
        NotPass();
        return "notpassAgain";
    }
// get set--------------------------------------------------------------------------------------
    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProjectText() {
        return projectText;
    }

    public void setProjectText(String projectText) {
        this.projectText = projectText;
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
}
