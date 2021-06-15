<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>研究团队——已下架团队</title>
    <link rel="stylesheet" href="../css/team.css" type="text/css"/>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="team05">
        <p>研究团队——已下架团队</p>
        <form name="teamhidenList" method="post" action="member!PresentTeam.action">
            <table>
                <tr>
                    <td>勾选</td><td>团队ID</td><td>研究课题</td><td>课题详情</td><td>恢复显示</td><td>删除</td>
                </tr>
                <s:iterator value="#session.memberList" var="member">
                    <s:if test='#member.deleted == -1'>
                        <tr>
                            <td><input type="checkbox" name="check" value="<s:property value="#member.id"/>"/></td>
                            <td><s:property value="#member.id"/></td>
                            <td><s:property value="#member.remark"/></td>
                            <td><s:property value="#member.research_direction"/></td>
                            <td><a href="#"><input type="button"  value="恢复显示"></a></td>
                        </tr>
                    </s:if>
                </s:iterator>
            </table>
            <button type="submit">批量恢复显示</button><button>批量删除</button>
        </form>
    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>