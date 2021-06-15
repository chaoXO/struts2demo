<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>论文发表——查看论文详情</title>
    <link rel="stylesheet" href="../css/paper.css" type="text/css" />
</head>
<body>
    <div class="paper02detail">文章内容</div>
    <div class="paper02btn"><span><button type="button">审核通过</button></span><span><button type="button">审核不通过</button></span></div>
    <div class="project02opinion01">修改意见：</div>
    <div><textarea name = "reviseopinion" cols="80" rows="10"></textarea></div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>