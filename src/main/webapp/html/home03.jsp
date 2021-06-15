<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页后台——论文发表编辑</title>
    <link rel="stylesheet" href="../css/home.css" type="text/css"/>
    <script type="text/javascript" src="../js/home.js"></script>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="home03" style="border: 1px solid #000;">
        <p>首页后台——论文发表编辑</p>
        <form name="paperEdit01" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">论文发表1</th>
                   <td rowspan="1">论文ID:</td>
                   <td rowspan="1"><input type="text" name="paperId"></td>
               </tr>
               <tr>
                <td rowspan="1">论文引用格式:</td>
                <td rowspan="1"><input type="text" name="paperSummary" placeholder="输入ID后自动显示"></td>
               </tr>
            </table>
        </form>
        <form name="paperEdit02" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">论文发表2</th>
                   <td rowspan="1">论文ID:</td>
                   <td rowspan="1"><input type="text" name="paperId"></td>
               </tr>
               <tr>
                <td rowspan="1">论文引用格式:</td>
                <td rowspan="1"><input type="text" name="paperSummary" placeholder="输入ID后自动显示"></td>
               </tr>
            </table>
        </form>
        <form name="paperEdit03" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">论文发表3</th>
                   <td rowspan="1">论文ID:</td>
                   <td rowspan="1"><input type="text" name="paperId"></td>
               </tr>
               <tr>
                <td rowspan="1">论文引用格式:</td>
                <td rowspan="1"><input type="text" name="paperSummary" placeholder="输入ID后自动显示"></td>
               </tr>
            </table>
        </form>
        <form name="paperEdit04" edition="" method="" style="border: 1px solid #000;">
            <table>
               <tr rowspan="4" >
                   <th rowspan="3">论文发表4</th>
                   <td rowspan="1">论文ID:</td>
                   <td rowspan="1"><input type="text" name="paperId"></td>
               </tr>
               <tr>
                <td rowspan="1">论文引用格式:</td>
                <td rowspan="1"><input type="text" name="paperSummary" placeholder="输入ID后自动显示"></td>
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