<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>
      body {
        margin: 0;
      }
      ::-webkit-scrollbar {
        display: none;
      }
      button {
        margin: 0;
        padding: 0;
        border: 1px solid transparent;
        outline: none;
      }
      button:active {
        opacity: 0.6;
      }
    </style>
    <link rel="stylesheet" type="text/css" href="./css/index7.css" />
  </head>
  <body>
    <div class="page">
      <div class="block1">
        <div class="bd1">
          <div class="bd2">
            <div class="block2">
              <div class="layer1"></div>
              <div class="layer2"></div>
              <span class="info1"><a href="5index.jsp">首页</a></span>
              <span class="word1"><a href="show!ShowNews.action">新闻动态</a></span>
              <span class="info2"><a href="show!ShowPaper.action">论文发表</a></span>
              <span class="word2"><a href="3research_team1.jsp">研究团队</a></span>
              <span class="txt1"><a href="9login.jsp">科研项目</a></span>
              <span class="txt2"><a href="9login.jsp">登录</a></span>
            </div>
          </div>
          <span class="txt3">预览</span>
          <div class="bd3">
            <div class="main1">
              <div class="bd4">
                <span class="word3">2021</span>
                <span class="txt4">2020</span>
                <span class="txt5">2019</span>
                <span class="word4">2018</span>
                <span class="info3">2017</span>
                <span class="info4">2016</span>
                <span class="word5">2015</span>
                <span class="word6">2014</span>
              </div>
              <div class="bd5"></div>
              <div class="bd6">

              </div>
              <div class="bd7">
                <div class="section1">
                  <div class="section2"></div>
                  <span class="word8">2021</span>
                </div>

          <s:iterator value="#session.essayList" var="essay">
              <s:if test="#essay.deleted==1">

                <span class="txt7">
                  作者：<s:property value="#essay.writer"/>
                </span>
                <span class="word9">
                  题名：<s:property value="#essay.title"/>
                </span>
                <div class="section3">
                  <span class="word10">
                    来源：<s:property value="#essay.publisher"/>
                  </span>
                  <span class="word11">&gt;&gt;</span>
                </div>
              </s:if>
          </s:iterator>




              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="block3"></div>
      <div class="block4">
        <div class="group1">
          <span class="info9">论文发表</span>
          <span class="txt10">Publications</span>
        </div>
      </div>
      <img
        class="img1"
        referrerpolicy="no-referrer"
        src="./img/SketchPnga9179796bedd5e03a3dc9b238237a69e37874b08829d2335acc01717d5c97931.png"
      />
    </div>
  </body>
</html>
