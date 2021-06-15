<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>科研项目——项目录入</title>
    <link rel="stylesheet" href="../css/project.css" type="text/css" />
    <script type="text/javascript" src="../js/project.js"></script>
    <script type="text/javascript" src="../js/ckeditor/ckeditor.js"></script>
</head>
<body onload="showTime()">
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="project01" name="project01">
        <p>科研项目——项目录入</p>
        <form name="edit" method="post" action="project!SaveProject.action">
        <table>
            <tr>
                <font color="red" ><s:fielderror fieldName="error_message"></s:fielderror></font>
            </tr>
            <tr>
                <td>科研项目ID:</td><td><input type="text" name="projectId" class="editing" placeholder="自动生成"></td>
            </tr>
            <tr>
                <td>录入时间:</td><td><input type="text" name="showtime" class="editing"></td>
            </tr>
            <tr>
                <td>科研项目主题:</td><td><input type="text" name="projectTitle" class="editing"></td>
            </tr>
            <tr>
                <td>项目开始时间:</td><td><input type="date" name="start_time" class="editing"></td>
            </tr>
            <tr>
                <td>项目结束时间:</td><td><input type="date" name="end_time" class="editing"></td>
            </tr>
            <tr>
                <td>关键词</td><td><input type="text" name="keyWords" class="editing"></td>
            </tr>
            <tr>
                <td>作者:</td><td><input type="text" name="author" class="editing"></td>
            </tr>
            <tr>
                <td>项目详情介绍:</td>
                <td>
                    <textarea name = "projectText"></textarea>
                <script type="text/javascript">CKEDITOR.replace('projectText');</script>
                </td> 
            </tr>
        </table>
            <span><input type="checkbox" name="check"></span>
            <span>开启评论</span><span><button type="button">预览</button></span>
            <span><button type="submit">确认录入</button></span>
        </form>

    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>