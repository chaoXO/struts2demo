<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>研究团队——已录入个人</title>
    <link rel="stylesheet" href="../css/team.css" type="text/css"/>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="team04">
        <p>研究团队——已录入个人
            <form name="memberList">
                <table>
                    <tr>
                        <td>勾选</td><td>姓名</td><td>职称</td><td>个人主页</td><td>下架</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" name="check"></td>
                        <td></td><td></td><td></td><td><input type="button" name="off" value="下架"></td>
                    </tr>
                </table>
                <button type="button">批量下架</button><button>删除</button>
            </form>
    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>