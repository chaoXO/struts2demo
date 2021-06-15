package com.example.action;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.MD5_SHA_1utils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :yhc
 * @date :2021/6/13
 **/
public class LoginAction extends ActionSupport {
    private Integer id;
    private String password;
    private User user;
    private Integer data_H;
    // 存储session值
    private Map<String,Object> session;

    @Override
    public void validate() {
            if (id == null){
                addFieldError("id","用户id不能为空");
            }
            if (StringUtils.isEmpty(password)){
                addFieldError("password","密码不能为空");
            }
            List<User> users = UserDao.select(id,null,null);
            if (users.size() == 0){
                addFieldError("id","输入用户id不存在");
            }else {
                user = users.get(0);
                try {
                    if (!user.getPassword().equals(MD5_SHA_1utils.getMD5String(password,"MD5"))){
                        addFieldError("password","输入密码错误");
                    };
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
    }

    @Override
    public String execute() throws Exception {
        // 返回逻辑字符串（自定、有意义）
        data_H = new Date().getHours();
        session = ActionContext.getContext().getSession();
        session.put("user",user);

        return "ok";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getData_H() {
        return data_H;
    }

    public void setData_H(Integer data_H) {
        this.data_H = data_H;
    }
}
