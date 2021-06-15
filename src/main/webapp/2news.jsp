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
    <link rel="stylesheet" type="text/css" href="./css/index2.css" />
  </head>
  <body>
    <div class="page">
      <div class="mod1">
        <span class="word1"><a href="5index.jsp">首页</a></span>
        <span class="info1"><a href="2news.jsp">新闻动态</a></span>
        <span class="word2"><a href="7essay.jsp">论文发表</a></span>
        <span class="txt1"><a href="3research_team1.jsp">研究团队</a></span>
        <span class="word3"><a href="#">科研项目</a></span>
        <span class="info2"><a href="9login.jsp">登录</a></span>
      </div>
      <img
        class="pic1"
        referrerpolicy="no-referrer"
        src="./img/SketchPngbe5a47eaedc975cee648ddccf301f17ab28cff9f278bc928470b6af3a6f39839.png"
      />
      <div class="mod2">
        <div class="layer1">
          <div class="section1">
            <img
              class="img1"
              referrerpolicy="no-referrer"
              src="./img/SketchPngc3d1064dc03cde82b01bb5f4964db48a12e2cf0bdb1b471ae6b85dae4db1711c.png"
            />
            <img
              class="pic2"
              referrerpolicy="no-referrer"
              src="./img/SketchPng1482288680c710c1148faf160586dac95200a5bbcf57f8fcf092302f2baeb5f1.png"
            />
            <span class="word4"><a href="5index.jsp">首页</a></span>
            <span class="word5"><a href="show!ShowNews.action">新闻动态</a></span>
            <span class="txt2"><a href="show!ShowPaper.action">论文发表</a></span>
            <span class="word6"><a href="3research_team1.jsp">研究团队</a></span>
            <span class="info3"><a href="#">科研项目</a></span>
            <span class="txt3"><a href="9login.jsp">登录</a></span>
          </div>


              <div class="wrap1">
                <span class="word13">新闻一级标题-研究院6</span>
                <div class="box2">
                  <span class="txt4">2021-03-09</span>
                  <span class="word14">作者：jiajia</span>
                </div>
                <span class="paragraph1">
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新闻摘要—举例：2021年3月11日，阿里巴巴达摩院机器智能实验室自然语言智能团队的资深算法专家孙常龙老师和高级算法专家康杨杨老师应邀来武汉大学。2021年3月11日，阿里巴巴达摩院机器智能实验室自然语言智能团队的资深算法专家孙常龙老师和高级算法专家康杨杨老师应邀来武汉大学。
                  <br />
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新闻摘要—举例：2021年3月11日，阿里巴巴达摩院机器智能实验室自然语言智能团队的资深算法专家孙常龙老师和高级算法专家康杨杨老师应邀来武汉大学。2021年3月11日，阿里巴巴达摩院机器智能实验室自然语言智能团队的资深算法专家孙常龙老师和高级算法专家康杨杨老师应邀来武汉大学。
                  <br />
                </span>
                <span class="txt5">&gt;&gt;&nbsp;查看更多</span>
              </div>
            </div>
          </div>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>


      <s:iterator value="#session.newsList" var="news">

          <div class="section8">
            <div class="layer2">
              <img
                class="img3"
                referrerpolicy="no-referrer"
                src="./img/SketchPng05082392fe8eba6f372a35a2e71b0638ae91ed9cc68decf4dd8fed910455feea.png"
              />
              <div class="layer3">
                <span class="word18"><s:property value="#news.title"/></span>
                <div class="mod6">
                  <span class="word19">2021-03-09</span>
                  <span class="word20"><s:property value="#news.writer"/></span>
                </div>
                <span class="paragraph3">
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="#news.text"/>
                  <br />
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="#news.text"/>
                  <br />
                </span>
                <span class="word21">&gt;&gt;&nbsp;查看更多</span>
              </div>
            </div>
          </div>
      </s:iterator>


          <div class="section9">
            <div class="mod7"><span class="word22">1</span></div>
            <div class="mod8"><span class="word23">2</span></div>
            <div class="mod9"><span class="info7">3</span></div>
            <div class="mod10"><span class="word24">4</span></div>
            <div class="mod11"><span class="word25">5</span></div>
          </div>
        </div>
      </div>
      <div class="mod12">
        <div class="layer4">
          <span class="word26">新闻动态</span>
          <span class="word27">LABORATORY&nbsp;NEWS</span>
        </div>
      </div>
      <div class="mod13">
        <div class="section10">
          <span class="word28">新闻动态</span>
          <span class="word29">LABORATORY&nbsp;NEWS</span>
        </div>
      </div>
      <img
        class="pic6"
        referrerpolicy="no-referrer"
        src="./img/SketchPnga968c1fcd2681090fecb6fbd62a6acab0df25378b46a9fb2db4992b6a0f5cb32.png"
      />
    </div>
  </body>
</html>
