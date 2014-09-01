<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib   prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<link href="css/apptype.css" rel="stylesheet" type="text/css" />
</head>

<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="struts">
  <div class="app_table">
  		<table width="100%">
  			<c:forEach items="${applist}" var="app">
  			<tr>
    			<td><div class="app_icon"><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}"><img style="width: 65px; height: 65px;border: 0" src="images/game/${app.appSrc }/App_logo/${app.appLogo}"/></a></div>
					<div class="app_name" style="font-size: 16px; font-family: '微软雅黑'"><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}">${app.appName}</a></div>
					<div class="down_adress"><a href="${app.appDownadd}">点击下载</a></div>
					<div class="app_shortdesc">作者点评:${app.appSpedesc }</div>
				</td>
 			</tr>
 			<tr style="height:30px;"></tr>
			<tr style="height:40px;"><td><img alt="" src="images/normal/typeline.png"></td></tr></c:forEach>
		</table>
 </div>
 
 <!-- 分页专用哦 -->
 <div class="fanye">
 <c:if test="${pageNow-1>0}">
  <div class="shangyiye"><a href="${pageContext.request.contextPath}/apptype.do?flag=showlatestapp&pageNow=${pageNow-1}">上一页</a></div>
  	</c:if>	
  		<div class="yema"><a href="${pageContext.request.contextPath}/apptype.do?flag=showlatestapp&pageNow=1">首页</a></div>
  <c:if test="${pageNow<pageCount}">
  <div class="xiayiye"><a href="${pageContext.request.contextPath}/apptype.do?flag=showlatestapp&pageNow=${pageNow+1}">下一页</a></div>
  </c:if>		
 </div>
</div>
<jsp:include page="tail.jsp"></jsp:include>
</body>
</html>