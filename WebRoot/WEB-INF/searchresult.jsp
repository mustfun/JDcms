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
  			<tr>
  				<c:if test="${app!=null}">
    			<td>
    				<div class="app_icon"><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}"><img style="width: 65px; height: 65px;border: 0" src="images/game/${app.appSrc }/App_logo/${app.appLogo}"/></a></div>
					<div class="app_name" style="font-size: 16px; font-family: '微软雅黑'"><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}">${app.appName}</a></div>
					<div class="down_adress"><a href="${app.appDownadd}">点击下载</a></div>
					<div class="app_shortdesc">作者点评:${app.appSpedesc }</div>
				</td>
				</c:if>
				<c:if test="${app==null}">
					<td align="center" style="color: red;font-family: '微软雅黑';font-size: 24px;">抱歉，没有找到该应用</td>
				</c:if>
 			</tr>
 			<tr style="height:30px;"></tr>
			<tr style="height:40px;"><td><img alt="" src="images/normal/typeline.png"></td></tr>
		</table>
 </div>
</div>
<jsp:include page="tail.jsp"></jsp:include>
</body>
</html>