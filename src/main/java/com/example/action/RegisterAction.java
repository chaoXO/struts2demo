package com.example.action;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.DateParser;
import com.example.service.MD5_SHA_1utils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/**
 * @author :yhc
 * @date :2021/6/13
 **/
public class RegisterAction extends ActionSupport {

    //接收html中的name值
    private Integer id;
    private String name;
    private String password;
    private Integer type;

    private Map<String,Object> session;

    // 跳转注册页面
    public String register(){
        return "register";
    }
    // 注册信息先验证

    public void validateRegisterIn() {
        if (StringUtils.isEmpty(name)){
            addFieldError("error_message","用户名不能为空");
        }
        if (StringUtils.isEmpty(password)){
            addFieldError("error_message","密码不能为空");
        }
        List<User> userList =  UserDao.select(null,null,null);
        if (id == null){
            addFieldError("error_message","id不能为空");
        }else {
            for (User user1:userList){
                if (user1.getId() == id){
                    addFieldError("error_message","id已存在请重新输入");
                }
            }
        }

    }
    // 进行注册
    public String RegisterIn() throws NoSuchAlgorithmException {
        User user = new User(id,name, MD5_SHA_1utils.getMD5String(password,"MD5"),type,null,
                DateParser.getTimeNow(),DateParser.getTimeNow(),0);
        System.out.println(user);
        UserDao.insert(user);

        session = ActionContext.getContext().getSession();
        session.put("registeresult","注册成功");
        return "ok";
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
