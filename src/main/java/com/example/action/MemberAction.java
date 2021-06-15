package com.example.action;

import com.example.dao.EssayDao;
import com.example.dao.MemberDao;
import com.example.model.Essay;
import com.example.model.Member;
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
public class MemberAction extends ActionSupport {
    private String name;
    private Integer type;
    private String teamTitle;
    private String remark;
    private String research_direction;
    private Map<String,Object> session;

    //新闻审核时需要传出的变量
    private List<News> memberList;
    private String check;


    public void validateSaveTeam(){
        if (StringUtils.isEmpty(name)){
            addFieldError("error_message","姓名不能为空");
        }
        if (StringUtils.isEmpty(teamTitle)){
            addFieldError("error_message","研究课题不能为空");
        }
        if (StringUtils.isEmpty(research_direction)){
            addFieldError("error_message","研究课题不能为空");
        }
        if (StringUtils.isEmpty(remark)){
            addFieldError("error_message","分工不能为空");
        }
    }


    public String SaveTeam(){

        List<Member> memberList = MemberDao.select(null,null,null);
        int maxTeamNo = 0;
        for(Member member:memberList){
            if (member.getId()>maxTeamNo){
                maxTeamNo = member.getId();
            }
        }
        Member member2 = new Member(maxTeamNo+1,name,"10086111@qq.com",teamTitle,0
                ,type,research_direction,"研究成果2","资源地址2","成员照片2",1);
        MemberDao.insert(member2);

        session = ActionContext.getContext().getSession();
        session.get("result");
        session.put("result","团队上传成功");
        return "success";
    }


    public void CheckE(){
        List<Member> memberList = MemberDao.select(null,null,null);
        session = ActionContext.getContext().getSession();
        session.put("memberList",memberList);
        System.out.println(memberList);
    }

    // 审核
    public String CheckMember(){
        CheckE();
        return "check";
    }

    // 查看隐藏团队
    public String CheckHideTeam(){
        //遍历出所有未审核的新闻
        CheckE();
        return "checkhide";
    }

    // 隐藏团队
    public String HideTeam(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<Member> memberList = (List<Member>) session.get("memberList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (Member demo:memberList){
                if (demo.getId() == i){
                    demo.setDeleted(-1);
                    MemberDao.update(demo);
                }
            }
        }
        return "hide";
    }

    // 恢复隐藏
    public String PresentTeam(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        List<Member> essayList = (List<Member>) session.get("memberList");
        System.out.println(this.getCheck());
        String[] chkValues = this.getCheck().split(",");
        for (String s:chkValues){
            int i = new Integer(s.trim());
            for (Member demo:essayList){
                if (demo.getId() == i){
                    demo.setDeleted(1);
                    MemberDao.update(demo);
                }
            }
        }
        return "present";
    }





    public List<News> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<News> memberList) {
        this.memberList = memberList;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTeamTitle() {
        return teamTitle;
    }

    public void setTeamTitle(String teamTitle) {
        this.teamTitle = teamTitle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResearch_direction() {
        return research_direction;
    }

    public void setResearch_direction(String research_direction) {
        this.research_direction = research_direction;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
