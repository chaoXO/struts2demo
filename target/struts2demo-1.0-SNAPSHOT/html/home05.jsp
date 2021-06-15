<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页后台——研究团队编辑</title>
    <link rel="stylesheet" href="../css/home.css" type="text/css"/>
    <script type="text/javascript" src="../js/home.js"></script>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="home05" style="border: 1px solid #000;">
        <p>首页后台——研究团队编辑</p>
        <form name="teamEdit01" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">团队1</th>
                   <td rowspan="1">团队ID:</td>
                   <td rowspan="1"><input type="text" name="teamId"></td>
               </tr>
               <tr>
                <td rowspan="1">团队简介:</td>
                <td rowspan="1"><input type="text" name="teamIntroduction" placeholder="由ID自动匹配"></td>
               </tr>
               <tr>
                   <td rowspan="1">图片:</td>
                   <td rowspan="1"><input type="file" name="mypicture" placeholder="请选择图片" onchange="getPictureContent()"></td>
                   <td rowspan="1"><input type="submit" value="上传图片"></td>
               </tr>
            </table>
        </form>
        <form name="teamEdit02" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">团队2</th>
                   <td rowspan="1">团队ID:</td>
                   <td rowspan="1"><input type="text" name="teamId"></td>
               </tr>
               <tr>
                <td rowspan="1">团队简介:</td>
                <td rowspan="1"><input type="text" name="teamIntroduction" placeholder="由ID自动匹配"></td>
               </tr>
               <tr>
                   <td rowspan="1">图片:</td>
                   <td rowspan="1"><input type="file" name="mypicture" placeholder="请选择图片" onchange="getPictureContent()"></td>
                   <td rowspan="1"><input type="submit" value="上传图片"></td>
               </tr>
            </table>
        </form>
        <form name="teamEdit03" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">团队3</th>
                   <td rowspan="1">团队ID:</td>
                   <td rowspan="1"><input type="text" name="teamId"></td>
               </tr>
               <tr>
                <td rowspan="1">团队简介:</td>
                <td rowspan="1"><input type="text" name="teamIntroduction" placeholder="由ID自动匹配"></td>
               </tr>
               <tr>
                   <td rowspan="1">图片:</td>
                   <td rowspan="1"><input type="file" name="mypicture" placeholder="请选择图片" onchange="getPictureContent()"></td>
                   <td rowspan="1"><input type="submit" value="上传图片"></td>
               </tr>
            </table>
        </form>
        <form name="teamEdit04" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">团队4</th>
                   <td rowspan="1">团队ID:</td>
                   <td rowspan="1"><input type="text" name="teamId"></td>
               </tr>
               <tr>
                <td rowspan="1">团队简介:</td>
                <td rowspan="1"><input type="text" name="teamIntroduction" placeholder="由ID自动匹配"></td>
               </tr>
               <tr>
                   <td rowspan="1">图片:</td>
                   <td rowspan="1"><input type="file" name="mypicture" placeholder="请选择图片" onchange="getPictureContent()"></td>
                   <td rowspan="1"><input type="submit" value="上传图片"></td>
               </tr>
            </table>
        </form>
        <span><input type="submit" name="home02btn" value="预览"></span><span><input type="submit" name="home02btn" value="确认修改"></span>
    </div>
    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>