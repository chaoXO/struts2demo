<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>后台编辑</title>
    <link rel="stylesheet" href="../css/home.css" type="text/css" />
    <script type="text/javascript" src="../js/home.js"></script>
</head>
<body>
    <p><img src="../images/zuel.png" width="300px" height="80px" alt="此图片无法显示"/></p>
    <hr/>
    <div>
        ${session["user"].name}
                     <s:if test="data_H > 19">晚上好</s:if>
                     <s:elseif test="data_H < 11">早上好</s:elseif>
                     <s:else>中午好</s:else>
    </div><br/>
    <div>
        ${session["result"]}
    </div>
    <hr/>
    <div id="menu0" class="menu" >
        <div class="mainmenu" id="main0">
            首页编辑
        </div>
        <div class="sub" id="sub0">
            <div><a href="/html/home01.jsp">学院简介编辑</a></div>
            <div><a href="/html/home02.jsp">新闻动态编辑</a></div>
            <div><a href="/html/home03.jsp">论文发表编辑</a></div>
            <div><a href="/html/home04.jsp">科研项目编辑</a></div>
            <div><a href="/html/home05.jsp">研究团队编辑</a></div>
        </div>       
    </div>
    <div  id="menu1" class="menu">
        <div class="mainmenu" id="main1">
            新闻动态编辑
        </div>
        <div class="sub" id="sub1">
           <div><a href="/html/news01.jsp">新闻录入</a></div>
           <div><a href="/html/news!CheckNews.action">新闻审核</a></div>
           <div><a href="/html/news!CheckpassNews.action">已发布新闻列表</a></div>
           <div><a href="/html/news!ChecknotpassNews.action">已下架新闻列表</a></div>
        </div>
    </div>
    <div  id="menu2" class="menu">
        <div class="mainmenu" id="main2">
            论文发表编辑
        </div>
        <div class="sub" id="sub2">
           <div><a href="/html/paper01.jsp">论文录入</a></div>
           <div><a href="/html/essay!CheckEssay.action">论文审核</a></div>
           <div><a href="/html/essay!CheckpassNews.action">已发布论文列表</a></div>
           <div><a href="/html/essay!ChecknotpassNews.action">已下架论文列表</a></div>
        </div>
    </div>
    <div id="menu3" class="menu">
        <div class="mainmenu" id="main3">
            研究团队编辑
        </div>
        <div class="sub" id="sub3">
           <div><a href="/html/team01.jsp">团队录入</a></div>
           <div><a href="/html/team02.jsp">个人录入</a></div>
           <div><a href="/html/member!CheckMember.action">已录入团队</a></div>
           <div><a href="/html/team04.jsp">已录入个人</a></div>
           <div><a href="/html/member!CheckHideTeam.action">已隐藏团队信息</a></div>
           <div><a href="/html/team06.jsp">已隐藏个人信息</a></div>
        </div>
    </div>
    <div id="menu4" class="menu">
        <div class="mainmenu" id="main4">
            科研项目编辑
        </div>
        <div class="sub" id="sub4">
           <div><a href="/html/project01.jsp">项目录入</a></div>
           <div><a href="/html/project!CheckEssay.action">项目发表审核</a></div>
           <div><a href="/html/project03.jsp">已发布项目列表</a></div>
           <div><a href="/html/project04.jsp">已下架项目列表</a></div>
        </div>
    </div>
    <hr/>
    <div style="height: 700px;"></div>
    <s:debug/>
</body>
</html>