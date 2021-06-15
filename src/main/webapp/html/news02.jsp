<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>新闻动态——新闻审核</title>
    <link rel="stylesheet" href="../css/news.css" type="text/css" />
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class=news02>
        <p id="newsAuditTitle">新闻动态——新闻审核</p>


        <script language="JavaScript">
            function notpass() {
                document.newsaudit.action = "/news!NotPassNews.action";
                document.newsaudit.submit();
            }
        </script>
        <form name="newsaudit" method="post" action="news!PassNews.action">
            <p id="newsAuditList">待审核新闻</p>
            <table>
                <tr>
                    <td>勾选</td><td>新闻ID</td><td>新闻标题</td><td>上传时间</td><td>查看详情</td>
                </tr>

                <s:iterator value="#session.newsList" var="news">
                    <s:if test="#news.deleted==0">
                <tr>
                    <td><input type="checkbox" name="check" value="<s:property value="#news.id"/>"/></td>
                        <td><s:property value="#news.id"/></td>
                        <td><s:property value="#news.title"/></td>
                        <td><s:property value="#news.create_time"/></td>
                        <td><a href="news02detail.jsp"><input type="button"  value="点击查看详情"></a></td>
                </tr>
                    </s:if>
                </s:iterator>
            </table>
            <span><button type="submit">批量通过审核</button></span>
            <span><button type="button" onclick="notpass()">批量不通过审核</button></span>
        </form>

    </div>
    <hr/>
    <div>
        <a href="/html/home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
<s:debug/>
</body>
</html>