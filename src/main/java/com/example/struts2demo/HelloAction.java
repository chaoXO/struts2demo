package com.example.struts2demo;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author :yhc
 * @date :2021/6/13
 **/
public class HelloAction extends ActionSupport {

    @Override
    public String execute(){
        return "success";
    }
}
