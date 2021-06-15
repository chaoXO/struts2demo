package com.example.action;

import com.opensymphony.xwork2.Action;

/**
 * @author :yhc
 * @date :2021/6/13
 **/
public class HelloAction2 implements Action {

    // 定义变量接收页面的用户名
    // 需要和input的name值一致，且必须提供get、set方法
    // 用来接收和发送
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        // 返回逻辑字符串（自定、有意义）
        return "ok";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
