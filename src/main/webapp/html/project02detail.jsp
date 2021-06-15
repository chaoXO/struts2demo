<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>项目发表——查看项目详情</title>
    <link rel="stylesheet" href="../css/project.css" type="text/css"/>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="project02detail">文章内容</div>
    <div class="project02btn"><span><button type="button">审核通过</button></span><span><button type="button">审核不通过</button></span></div>
    <div class="project02opinion01">修改意见：</div>
    <div><textarea name = "reviseopinion" cols="80" rows="10"></textarea></div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>