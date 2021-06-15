<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>新闻动态——新闻录入</title>
    <link rel="stylesheet" href="../css/news.css" type="text/css"/>
    <script type="text/javascript" src="../js/news.js"></script>
    <script type="text/javascript" src="../js/ckeditor/ckeditor.js"></script>
</head>
<body onload="showTime()">
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="news01" name="news01">
        <p>新闻动态——新闻录入</p>

        <form name="edit" action="news!UploadByIo.action" method="post" id="form11" enctype="multipart/form-data">
        <table>
            <tr>
                <td>新闻ID:</td><td><input type="text" name="newsId" class="editing" placeholder="自动生成"></td>
            </tr>
            <tr>
                <td>录入时间:</td><td><input type="text" name="showtime" class="editing"></td>
            </tr>
            <tr>
                <td>新闻标题:</td><td><input type="text" name="title" class="editing"></td>
            </tr>
            <tr>
                <font color="red" ><s:fielderror fieldName="error_message"></s:fielderror></font>
            </tr>
            <tr>
                <td>副标题:</td><td><input type="text" name="newsSubTitle" class="editing"></td>
            </tr>
            <tr>
                <td>关键词:</td><td><input type="text" name="keyWord" class="editing"></td>
            </tr>
            <tr>
                <td>新闻作者:</td><td><input type="text" name="writer" class="editing"></td>
            </tr>
            <tr>
                <td>新闻摘要:</td><td><textarea cols="50" rows="8" placeholder="点击编辑文本摘要"></textarea></td>
            </tr>
            <tr>
                <td>新闻图片:</td><td><input type="file" name="upload_pic"></td>
            </tr>
            <tr>
                <td>新闻正文:</td>
                <td>
                    <textarea name = "txt"></textarea>
                <script type="text/javascript">CKEDITOR.replace('txt');</script>
                </td> 
            </tr>
        </table>
            <span><input type="checkbox" name="check"></span>
            <span>开启评论</span><span><button type="button">预览</button></span>
            <span><button type="submit" >确认录入并提交审核</button></span>
        </form>
    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>