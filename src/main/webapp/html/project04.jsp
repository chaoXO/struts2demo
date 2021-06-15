<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>科研项目——已下架项目列表</title>
    <link rel="stylesheet" href="../css/project.css" type="text/css" />
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class=project04>
        <p id="projectDeleteList1">科研项目——已下架项目列表</p>
        <form name="projectDelete" method="post" action="project!PassProjectAgain.action">
            <p id="projectDeleteList">已下架项目</p>
            <table>
                <tr>
                    <td>勾选</td><td>项目ID</td><td>项目主题</td><td>下架时间</td><td>查看论文详情</td><td>删除</td>
                </tr>
                <s:iterator value="#session.projectList" var="project">
                    <s:if test='#project.deleted == 2'>
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
            <span><button type="button">批量删除</button></span>
            <span><button type="submit">批量恢复发布</button></span>
        </form>

    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>