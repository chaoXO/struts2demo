<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>研究团队——个人录入</title>
    <link rel="stylesheet" href="../css/team.css" type="text/css"/>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="team02">
        <p>研究团队——个人录入</p>
        <form name="personList01">
            <table id="personList">
                <tr>
                    <td>姓名</td><td>性别</td><td>职称</td><td>研究方向</td><td>个人主页</td>
                </tr>
                <tr>
                    <td><input type="text"></td><td><input type="text"></td><td><input type="text"></td><td><input type="text"></td><td><input type="text" placeholder="请填入教师个人主页链接"></td>
                </tr>
            </table>
            <button type="button">确认录入</button>
        </form>
    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>