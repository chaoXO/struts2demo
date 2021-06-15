<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>论文发表——已下架论文列表</title>
    <link rel="stylesheet" href="../css/paper.css" type="text/css" />
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class=paper04>
        <p id="paperDeleteList1">论文发表——已下架论文列表</p>
        <form name="paperDelete" method="post" action="essay!PassAgain.action">
            <p id="paperDeleteList">已下架论文</p>
            <table>
                <tr>
                    <td>勾选</td><td>论文ID</td><td>标题</td><td>论文作者</td><td>下架时间</td><td>查看论文详情</td><td>删除</td>
                </tr>
                <s:iterator value="#session.essayList" var="essay">
                    <s:if test='#essay.deleted == 2'>
                        <tr>
                            <td><input type="checkbox" name="check" value="<s:property value="#essay.id"/>"/></td>
                            <td><s:property value="#essay.id"/></td>
                            <td><s:property value="#essay.title"/></td>
                            <td><s:property value="#essay.writer"/></td>
                            <td><s:property value="#essay.update_time"/></td>
                            <td><a href="paper02detail.jsp"><input type="button"  value="点击查看详情"></a></td>
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