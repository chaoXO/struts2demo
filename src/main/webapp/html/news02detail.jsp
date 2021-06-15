<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>新闻动态——查看新闻详情</title>
    <link rel="stylesheet" href="../css/news.css" type="text/css" />
</head>
<body>
    <div class="news02detail">
        ${session.newsList[0].text}
    </div>
    <div class="news02btn"><span><button type="button">审核通过</button></span><span><button type="button">审核不通过</button></span></div>
    <div class="news02opinion01">修改意见：</div>
    <div><textarea name = "reviseopinion" cols="80" rows="10"></textarea></div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
    <s:debug/>
</body>
</html>