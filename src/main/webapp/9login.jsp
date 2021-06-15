<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户登录界面</title>
    <style type="text/css">
        body {
            margin: 0px;
            height: 100%;
            width: 100%;
            overflow: hidden;
            background-size: cover;
            background: url("img/SketchPngd7519e9602731cb5b4d6920074aca262a1394285454deef3bf3ff3db698d11af.png") fixed center center;
        }

        .container {
            background-color: rgba(215, 223, 226, 0.7);
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            text-align: center;
            height: 250px;
            width: 350px;
            border: 2px;
            border-radius: 20px;
            font-size: 80%;
        }

        .table-condensed {
            position: absolute;
            top: 50%;
            left: 50%;
            margin: -50px 0 0 -130px;
        }

        td {
            text-align: left;
        }
    </style>
</head>
<body>
<div class="container">
    <p style="color: #ff0000; position: absolute;
            top:50%;
            left: 50%;
            margin: -75px 0 0 -130px; ">${error}</p>
    <script language="JavaScript">
        function toregister() {
            document.form1.action = "/register!register.action";
            document.form1.submit();
        }
    </script>
    <form role="form" action="login.action" method="post" id="us" name="form1">
        <table class="table-condensed">
            <h5>用户登录界面</h5>
            <hr>
            <tr>
                <td colspan="2">
                    <font color="red" >${session["registeresult"]}</font>
                </td>
            </tr>
            <tr>
                <td><label for="id">用户id</label></td>
                <td><input style="width:200px; height:20px;" class="form-control" placeholder="请输入用户id" type="text"
                           name="id" id="id" value=""/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <font color="red" ><s:fielderror fieldName="id"></s:fielderror></font>
                </td>
            </tr>
            <br/>
            <tr>
                <td><label for="password">密码</label></td>
                <td><input style="width:200px; height:20px;" class="form-control" placeholder="请输入密码" type="password"
                           name="password" id="password" value=""/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <font color="red" style="width:500px;"><s:fielderror fieldName="password"></s:fielderror></font>
                </td>
            </tr>

            <tr>
                <td><label for="teacher">类型</label></td>
                <td><input type="radio" name="type" id="teacher" value="teacher" checked/>老师
                    <input type="radio" name="type" id="student" value="student" />学生
                </td>
            </tr>
            <br/>
            <br/>
            <tr>
                <td><input type="submit" value="登录" name="login"></td>
                <td><input type="reset" value="重置" name="reset"/>&nbsp&nbsp
                    <input type=button value="新用户注册" onclick="toregister()"></td>
            </tr>
            <br/>


        </table>
    </form>
</div>
</body>
</html>
