<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <link href="css/adminmain.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="shangmian"><a href="${pageContext.request.contextPath }/showApp.do?flag=showmain"><img style="margin-left:80px;width:230px;height:70px;float:left" src="images/normal/logo.jpg" /></a>
			<div class="denglu"><span style=" margin-left:750px;">
			<a href="${pageContext.request.contextPath }/showApp.do?flag=showmain">返回网站</a></span><span style=" margin-left:30px; line-height:50px;"><a href="${pageContext.request.contextPath }/admin.do?flag=showmain">返回主页</a></span></div>
		<c:if test="${admininfo.username!=null}">
		<div style="margin-left: 1100">	欢迎您：管理员${admininfo.username}</div><div style="margin-left:1100px;font-weight: bold;font-size: 24px;" class="upload"><a href="${pageContext.request.contextPath }/upload.do?flag=gotest">上传应用</a></div>
		</c:if>
	</div>
	<div class="daohang">
	<span style="margin-left:80px;margin-top:15px; font-size:24px; font-family:'微软雅黑'; color: #FF3FFF">打造安全便捷应用平台</span>
	</div>
	
	<div class="houtai"><div style="margin-top:40px; font-size:36px; color:#0000FF; margin-left:550px;">后台管理中心</div></div>
	
	<div class="shujuqu">
		<div class="lianjie">
			<div style="font-family: '微软雅黑';font-size: 32px; line-height: 60px;"><a href="${pageContext.request.contextPath}/admin.do?flag=shownextuser">点击此处进入用户管理>>>>></a></div>
			<div style="font-family: '微软雅黑';font-size: 32px; line-height: 60px;"><a href="${pageContext.request.contextPath}/admin.do?flag=shownextapp">点击此处进入应用管理>>>>></a></div>
			<div style="font-family: '微软雅黑';font-size: 32px; line-height: 60px;"><a href="${pageContext.request.contextPath}/admin.do?flag=shownextcomment">点击此处进入评论管理>>>>></a></div>
    	</div>
    </div>
	 <div class="tail"></div>
</body>
</html>
