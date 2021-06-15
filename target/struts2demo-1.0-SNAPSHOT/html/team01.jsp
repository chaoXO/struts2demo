<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>研究团队——团队录入</title>
    <link rel="stylesheet" href="../css/team.css" type="text/css"/>
    <script type="text/javascript" src="../js/team.js"></script>
    <script type="text/javascript" src="../js/ckeditor/ckeditor.js"></script>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <div class="team01">
        <p>研究团队——团队录入</p>
        <font color="red" ><s:fielderror fieldName="error_message"></s:fielderror></font>
        <form method="post" action="member!SaveTeam.action">
            <table>
                <tr>
                    <td>团队ID:</td><td><input type="text" name="teamId" class="editing" placeholder="自动生成"></td>
                </tr>
                <tr>
                    <td>研究课题:</td><td><input type="text" name="teamTitle" class="editing"></td>
                </tr>
            </table>
            <table id="memberList">
                <tr>
                    <td>姓名</td>
                    <td>性别</td>
                    <td>职称</td>
                    <td>研究方向</td>
                    <td>团队分工</td>
                </tr>
                <tr>
                    <td><input type="text" name="name"></td>
                    <td><input type="text" name="sex"></td>
                    <td><label for="type"></label>
                        <select id="type" name="type">
                            <%-- '0——硕士，1——博士，2——博士后，3——兼职研究员，4——讲师，5——副教授，6——教授'--%>
                            <option value="0">硕士</option>
                            <option value="1">博士</option>
                            <option value="2">博士后</option>
                            <option value="3">兼职研究员</option>
                            <option value="4">讲师</option>
                            <option value="5">副教授</option>
                            <option value="6">教授</option>
                        </select>
                    </td>
                    <td><input type="text" name="research_direction"></td>
                    <td><input type="text" name="remark"></td>
                </tr>
            </table> 
            <button type="button" onclick="addtr()">添加一行</button>
            <table>
                <td>课题详情：</td>
                <td>
                    <textarea name = "newsText"></textarea>
                <script type="text/javascript">CKEDITOR.replace('newsText');</script>
                </td>
            </table>
            <button type="submit">确认录入</button>
        </form>
    </div>

    <hr/>
    <div>
        <a href="home.jsp">回到导航</a> &nbsp
        <a href="../5index.jsp">回到首页</a>
    </div>
</body>
</html>