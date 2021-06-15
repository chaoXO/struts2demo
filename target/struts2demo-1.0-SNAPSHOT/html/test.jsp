<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>在网页中添加表格</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

         div {
             width: 400px;
             margin: 100px auto;
         }
        table {
            margin-top: 10px;
            width: 400px;
            border: 2px solid #000;
            border-collapse: collapse;
        }
        table thead tr {
            background-color: purple;
            color: #e0e0e0;
        }

        table tr {
            background-color: pink;
        }

        table td {
            text-align: center;
            border:1px solid #000 ;
        }

        table td:nth-child(1){
            width: 100px;
        }

        table td:nth-child(2){
            width: 300px;
        }
    </style>
</head>
<body>
<div>
    <label for="">请输入姓名：</label>
    <input type="text" class="uname"><br />
    <label for="">请输入邮箱：</label>
    <input type="email" class="email"><br />
    <button>添加</button><br />
    <table>
        <thead>
        <tr>
            <td>姓名</td>
            <td>邮箱</td>
        </tr>
        </thead>
        <tbody>
            <!--    动态添加内容  -->
        </tbody>
    </table>
</div>

<script>
    // 获取元素
    var uname = document.querySelector('.uname');
    var email = document.querySelector('.email');
    var btn = document.querySelector('button');
    var tbody = document.querySelector('tbody');

    btn.onclick =function () {
        //检测输入的内容不为空
        if(uname.value === '' || email.value === '')
            alert('请输入内容');
        else {
            //创建节点
            var tr = document.createElement('tr');
            var td1 = document.createElement('td');
            var td2 = document.createElement('td');
            //获取元素内容
            td1.innerHTML = uname.value;
            td2.innerHTML = email.value;
            //添加内容到表格中
            tr.append(td1);
            tr.append(td2);
            tbody.append(tr);
        }
    }
</script>
<hr/>
<div>
    <a href="home.jsp">回到导航</a> &nbsp
    <a href="../5index.jsp">回到首页</a>
</div>

</body>
</html>