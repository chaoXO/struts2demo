package com.example.action;

import com.example.dao.EssayDao;
import com.example.dao.NewsDao;
import com.example.dao.UserDao;
import com.example.model.Essay;
import com.example.model.News;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

/**
 * @author :yhc
 * @date :2021/6/15
 **/
public class ShowAction extends ActionSupport {

    // 存储session值
    private Map<String,Object> session;

    public String ShowNews(){
        List<News> newsList = NewsDao.select(null,null,null,1);
        session = ActionContext.getContext().getSession();
        session.put("newsList",newsList);
        return "success";
    }

    public String ShowPaper(){
        List<Essay> essayList = EssayDao.select(null,null,null);
        session = ActionContext.getContext().getSession();
        session.put("essayList",essayList);
        return "showPaper";
    }


    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
