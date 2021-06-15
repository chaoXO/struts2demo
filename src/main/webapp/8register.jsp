<%--
  Created by IntelliJ IDEA.
  User: Win10
  Date: 2021/6/12
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>注册表单</title>
  <style type="text/css">
    body{
      margin:0px;
      height:100%;
      width:100%;
      overflow: hidden;
      background-size:cover;
      background: url("img/zuel11.png")  fixed center center;
    }
    .container{
      background-color: rgba(215,223,226,0.7);
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%,-50%);
      text-align: center;
      height: 250px;
      width: 350px;
      border: 2px;
      border-radius: 20px;
      font-size:80%;
    }
    input{
      height: 30px;
      width: 200px;
    }
  </style>
</head>

<body style="text-align:center;">

<div class="container" >
  <form class="formin" action="/register!RegisterIn.action" method="post" accept-charset="utf-8" _charset="utf-8">
    <h5>用户注册界面</h5>
    <hr>
    账号：<input type="text" name="id"><br/>
    姓名：<input type="text" name="name"><br/>
    密码：<input type="password" name="password"><br/>
    类型：<label for="type"></label>
          <select id="type" name="type">
            <%-- '0——硕士，1——博士，2——博士后，3——兼职研究员，4——讲师，5——副教授，6——教授'--%>
            <option value="0">硕士</option>
            <option value="1">博士</option>
            <option value="2">博士后</option>
            <option value="3">兼职研究员</option>
            <option value="4">讲师</option>
            <option value="5">副教授</option>
            <option value="6">教授</option>
          </select>
    <br/>
    <input type="submit" value="注册">
    <font color="red" ><s:fielderror fieldName="error_message"></s:fielderror></font>
  </form>
</div>
</body>
</html>