<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>科研项目——已发布项目列表</title>
    <link rel="stylesheet" href="../css/project.css" type="text/css"/>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class=project03>
        <p id="projectReleaseList1">科研项目——已发布项目列表</p>
        <form name="projectRelease" method="post" action="project!NotPassProjectAgain.action">
            <p id="projectReleaseList">已发布项目</p>
            <table>
                <tr>
                    <td>勾选</td><td>项目ID</td><td>项目主题</td><td>发布时间</td><td>查看新闻详情</td><td>下架</td>
                </tr>
                <s:iterator value="#session.projectList" var="project">
                    <s:if test='#project.deleted == 1'>
                        <tr>
                            <td><input type="checkbox" name="check" value="<s:property value="#project.id"/>"/></td>
                            <td><s:property value="#project.id"/></td>
                            <td><s:property value="#project.name"/></td>
                            <td><s:property value="#project.create_time"/></td>
                            <td><a href="#"><input type="button"  value="点击查看详情"></a></td>
                        </tr>
                    </s:if>
                </s:iterator>
            </table>
            <span><button type="submit">批量下架</button></span>
            <span><button type="button">删除</button></span>
        </form>

    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>