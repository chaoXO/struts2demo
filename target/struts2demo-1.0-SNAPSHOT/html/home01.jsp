<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页后台——学院简介</title>
    <link rel="stylesheet" href="../css/home.css" type="text/css" />
    <script type="text/javascript" src="../js/home.js"></script>
    <script type="text/javascript" src="../js/ckeditor/ckeditor.js"></script>
</head>
<body onload="showTime()">
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="home01">
       <p>首页后台——学院简介编辑</p> 
       <form name="edit" action="" method="">
           <table>
               <tr>
                   <td>编辑作者:</td><td><input type="text" name="editor"></td>
                   <td>编辑时间:</td><td><input type="text" name="showtime" class="editing"></td>
               </tr>
               <tr>
                   <td>文本摘要：</td><td><textarea cols="100" rows="8">点击编辑文本摘要</textarea></td>
               </tr>
               <tr>
                   <td>文本正文输入：</td>
                   <td>
                       <textarea name = "financial"></textarea>
                       <script type="text/javascript">CKEDITOR.replace('financial');</script>
                   </td>
               </tr>
               <tr>
                   <td></td>
                   <td><button type="button">预览</button><button type="button">确认更新</button></td>
               </tr>
            </table>	        
       </form>
    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>

</body>
</html>