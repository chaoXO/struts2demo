<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>论文发表——论文录入</title>
    <link rel="stylesheet" href="../css/paper.css" type="text/css" />
    <script type="text/javascript" src="../js/paper.js"></script>
    <script type="text/javascript" src="../js/ckeditor/ckeditor.js"></script>
</head>
<body onload="showTime()">
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="paper01" name="paper01">
        <p>论文发表——论文录入</p>
        <form name="edit2" method="post" action="essay!SaveEssay.action">
        <table>
            <tr>
                <font color="red" ><s:fielderror fieldName="error_message"></s:fielderror></font>
            </tr>
            <tr>
                <td>新闻论文ID:</td><td><input type="text" name="paperId" class="editing" placeholder="自动生成"></td>
            </tr>
            <tr>
                <td>录入时间:</td><td><input type="text" name="showtime" class="editing"></td>
            </tr>
            <tr>
                <td>论文标题:</td><td><input type="text" name="paperTitle" class="editing"></td>
            </tr>
            <tr>
                <td>副标题:</td><td><input type="text" name="paperSubTitle" class="editing"></td>
            </tr>
            <tr>
                <td>摘要:</td><td><input type="text" name="summary" class="editing"></td>
            </tr>
            <tr>
                <td>关键词</td><td><input type="text" name="keyWords" class="editing"></td>
            </tr>
            <tr>
                <td>出版商：</td><td><input type="text" name="publisher" class="editing"></td>
            </tr>
            <tr>
                <td>期刊类型：</td><td><input type="text" name="type" class="editing"></td>
            </tr>
            <tr>
                <td>作者:</td><td><input type="text" name="author" class="editing"></td>
            </tr>
            <tr>
                <td>论文正文:</td>
                <td>
                    <textarea name = "paperText"></textarea>
                <script type="text/javascript">CKEDITOR.replace('paperText');</script>
                </td> 
            </tr>
        </table>
            <span><input type="checkbox" name="check"></span>
            <span>开启评论</span><span><button type="button">预览</button></span>
            <span><button type="submit">确认录入并提交审核</button></span>
        </form>

    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>

</body>
</html>