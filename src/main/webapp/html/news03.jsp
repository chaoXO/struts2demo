<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>新闻动态——已发布新闻列表</title>
    <link rel="stylesheet" href="../css/news.css" type="text/css" />
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class=news03>
        <p id="newsRelease1">新闻动态——已发布新闻列表</p>
        <form name="newsRelease" method="post" action="news!NotPassAgain.action">
            <p id="newsReleaseList">已发布新闻</p>
            <table>
                <tr>
                    <td>勾选</td><td>新闻ID</td><td>新闻标题</td><td>发布时间</td><td>查看新闻详情</td><td>下架</td>
                </tr>
                <s:iterator value="#session.newsList" var="news">
                    <s:if test='#news.deleted == 1'>
                        <tr>
                            <td><input type="checkbox" name="check" value="<s:property value="#news.id"/>"/></td>
                            <td><s:property value="#news.id"/></td>
                            <td><s:property value="#news.title"/></td>
                            <td><s:property value="#news.create_time"/></td>
<%--                            todo: 修正查看详情--%>
                            <td><a href="news02detail.jsp"><input type="button"  value="点击查看详情"></a></td>
                        </tr>
                    </s:if>
                </s:iterator>
                <tr>

                    <td><input type="checkbox" name="check"></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td><a href="news02detail.jsp"><input type="button" name="details" value="点击查看详情"></a></td><td><input type="button" name="off" value="下架"></td>
                </tr>
            </table>
            <span><button type="submit">批量下架</button></span><span><button type="button">删除</button></span>
        </form>

    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>