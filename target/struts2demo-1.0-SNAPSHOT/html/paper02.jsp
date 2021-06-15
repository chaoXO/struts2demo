<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>论文发表——论文审核</title>
    <link rel="stylesheet" href="../css/paper.css" type="text/css" />
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class=paper02>
        <p id="paperAuditTitle">论文发表——论文审核</p>
        <form name="paperaudit" method="post" action="essay!PassEssay.action">
            <p id="paperAuditList">待审核论文</p>
            <table>
                <tr>
                    <td>勾选</td><td>论文ID</td><td>论文标题</td><td>上传时间</td><td>查看详情</td>
                </tr>
                <s:iterator value="#session.essayList" var="essay">
                    <s:if test='#essay.deleted == 0'>
                        <tr>
                            <td><input type="checkbox" name="check" value="<s:property value="#essay.id"/>"/></td>
                            <td><s:property value="#essay.id"/></td>
                            <td><s:property value="#essay.title"/></td>
                            <td><s:property value="#essay.create_time"/></td>
                            <td><a href="paper02detail.jsp"><input type="button"  value="点击查看详情"></a></td>
                        </tr>
                    </s:if>
                </s:iterator>

            </table>
            <span><button type="submit">批量通过审核</button>
            </span><span><button type="button">批量不通过审核</button></span>
        </form>

    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>