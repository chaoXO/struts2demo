package com.example.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author :yhc
 * @date :2021/6/14
 **/
public class Interceptor1 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("=============  进入第一个拦截器  =============");
        String result = actionInvocation.invoke();
        System.out.println("=============  退出第一个拦截器  =============");
        return result;
    }
}
