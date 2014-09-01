<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

<script type="text/javascript" language="javascript" src="js/qiehuan.js"></script>
<link href="css/logo.css" rel="stylesheet" type="text/css" />
<link href="css/qiehuan.css" rel="stylesheet" type="text/css">  
  
 </head>
  <body>
   <jsp:include page="/WEB-INF/head.jsp"></jsp:include>
   <div class="table">
<table width="100%" border="1" cellspacing="0" bordercolor="#1AA5EB">
  <tr  style="font-size:18px; text-align:center; color:#5A5A5A;">
    <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=1">通信辅助</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=2">系统工具</a></td>
  </tr>
  <tr style="font-size:18px; text-align:center; color:#5A5A5A;">
    <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=3">地图导航</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=4">音乐播放</a></td>
  </tr>
  <tr style="font-size:18px; text-align:center; color:#5A5A5A;">
    <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=5">图书阅读</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=6">生活应用</a></td>
  </tr>
  <tr style="font-size:18px; text-align:center; color:#5A5A5A;">
    <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=7">视频播放</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=8">安全管家</a></td>
  </tr>
  <tr style="font-size:18px; text-align:center; color:#5A5A5A;">
      <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=9">主题美化</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=10">安卓必备</a></td>
  </tr>
  <tr style="font-size:18px; text-align:center; color:#5A5A5A;">
    <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=11">影音软件</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=12">地图软件</a></td>
  </tr>
  <tr style="font-size:18px; text-align:center; color:#5A5A5A;">
    <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=13">购物管理</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=14">系统管理</a></td>
  </tr>
  <tr style="font-size:18px; text-align:center; color:#5A5A5A;">
    <td height="50"><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=15">生活应用</a></td>
    <td><a href="${pageContext.request.contextPath }/apptype.do?flag=gototype&id=16">学习帮助</a></td>
  </tr>
</table>
</div>
<div style="position:absolute; left: 1062px; top: 157px; height: 405px; width: 148px;"><a href="${pageContext.request.contextPath}/showApp.do?flag=aboutwebsite"><img src="images/normal/right_ab.png" alt="google提供的广告" width="150"  height="402" /></a></div>
<div class="tupianjiehuan">
<div id="ifocus">
 <div id="ifocus_pic">
  <div id="ifocus_piclist" style="left:0; top:0;">
   <ul>
    <li><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=9" target="_blank"><img src="images/game/shouye/01.jpg" alt="吉大应用网" border="0" /></a></li>
    <li><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=11" target="_blank"><img src="images/game/shouye/02.jpg" alt="吉大应用网" border="0" /></a></li>
    <li><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=6" target="_blank"><img src="images/game/shouye/03.jpg" alt="吉大应用网" border="0" /></a></li>
    <li><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=16" target="_blank"><img src="images/game/shouye/04.jpg" alt="吉大应用网" border="0" /></a></li>
   </ul>
  </div>
  <div id="ifocus_opdiv"></div>
  <div id="ifocus_tx">
   <ul>
    <li class="current">欢迎来到吉大应用网</li>
    <li class="normal">可以先登录或者注册 </li>
    <li class="normal">登录之后有个人中心</li>
    <li class="normal">可以点击试试</li>
   </ul>
  </div>
 </div>
 <div id="ifocus_btn">
  <ul>
   <li class="current"><img src="images/game/shouye/01.jpg" /></li>
   <li class="normal"><img src="images/game/shouye/02.jpg" alt="" /></li>
   <li class="normal"><img src="images/game/shouye/03.jpg" alt="" /></li>
   <li class="normal"><img src="images/game/shouye/04.jpg" alt="" /></li>
  </ul>
 </div>
</div>
</div>
<div class="mainbody">
  <table width="100%" border="0" >
  <tr>
  <c:forEach items="${appinfo}" var="app" varStatus="i">
      <td height="169" >
      <table width="100%" border="0" style="border: 1px solid silver; " bgcolor="white">
			  <tr>
				<td width="130px" rowspan="4"><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}"><img src="images/game/${app.appSrc }/App_logo/${app.appLogo}"/></a> </td>
				<td width="124px" height="47" style="font-weight: bold ;font-size: 20px">${app.appName }</td>
			  </tr>
			  <tr>
				<td height="40" class="autocut">${app.appSpedesc}</td>
			  </tr>
			  <tr>
				<td height="30">已有${app.appDownnum}人下载</td>
			  </tr>
			  <tr>
				<td height="40"><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}"><img src="images/normal/download.png"  /></a></td>
			  </tr>
		</table></td><td style="width: 5px; height: 169px"></td>
      <c:if test="${i.count%4==0}">
  		<tr></tr> 
      </c:if>
  </c:forEach>
  </tr>
    <!-- <tr>
      <td height="171">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="169">&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>-->
  </table>
</div>
<div class="fubiaoti"><a href="${pageContext.request.contextPath }/apptype.do?flag=showlatestapp">最新软件>>>>></a> 　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　<a href="${pageContext.request.contextPath }/apptype.do?flag=recomandapp">更多</a>&gt;&gt;&gt; 　	</div>
<jsp:include page="/WEB-INF/tail.jsp"></jsp:include>
  </body>
</html>
