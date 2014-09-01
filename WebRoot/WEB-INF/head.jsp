<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<link href="css/logo.css" rel="stylesheet" type="text/css" />
 	<script type="text/javascript">
 		function sendsearch()
 		{
 			var a=document.getElementById("search").value;
 			window.location.href="${pageContext.request.contextPath}/tohome.do?flag=searshapp&text="+a;
 		}
 	
 	</script>
 </head>
  
<body  bgcolor="#F5F7FA">
<div class="logo"><a href="${pageContext.request.contextPath }/showApp.do?flag=showmain"><img style="border: 0" src="images/normal/logo.jpg" width="199" height="75" /></a></div>
<div class="sousuo">
	<input type="text" style="width: 365px; height: 31px;float: left;" id="search" />
<a href="#" onclick="return sendsearch()"><img alt="搜索" src="images/normal/sousuo.png" border="0" ></a></div>
<div class="logo_pan"><span style="color:#BAB2CA; font-size:15px;">热搜：flappy bird 神庙逃亡 天天酷跑 天天飞车</span></div>
<div class="login">
	<c:if test="${loginuser.username==null}" >
					<span><a href="${pageContext.request.contextPath }/toLogin.do?flag=tologin">登录</a></span>
						<span><a href="${pageContext.request.contextPath }/toLogin.do?flag=toregister">注册</a></span>
					</c:if>
					<c:if test="${loginuser.username!=null}">
					<span>欢迎您:<a href="${pageContext.request.contextPath}/tohome.do?flag=tohome" >${loginuser.username }</a></span>
					<span>　<a href="${pageContext.request.contextPath }/login.do?flag=logout">退出</a></span>
					</c:if>
</div>
<div class="guanliyuan"><c:if test="${loginuser.level<2}">
					<span style="font-family: cursive;font-size: 24px;"><a href="${pageContext.request.contextPath }/upload.do?flag=gotest">上传应用</a></span>
					</c:if>
</div>
<div class="login" style="margin-left: 250px;"><a href="${pageContext.request.contextPath}/admin.do?flag=gotoadminlogin">管理员入口</a></div>

<div class="biaoti">
				<ul style="margin-top: 10px;">
						<li style="display:inline"><a href="${pageContext.request.contextPath }/showApp.do?flag=showmain">安卓应用分类</a></li>
						<li style="display:inline; margin-left:45px"><a href="${pageContext.request.contextPath }/showApp.do?flag=showmain">首页</a></li>
						<li style="display:inline;margin-left:45px"><a href="${pageContext.request.contextPath }/apptype.do?flag=showlatestapp">最近更新</a></li>
						<li style="display:inline;margin-left:45px"><a href="${pageContext.request.contextPath }/apptype.do?flag=recomandapp">应用推荐</a></li>
						<li style="display:inline;margin-left:49px"><a href="${pageContext.request.contextPath }/apptype.do?flag=showlatestapp">应用精选</a></li>
						<li style="display:inline;margin-left:49px"><a href="${pageContext.request.contextPath}/apptype.do?flag=mostdownload">应用排行</a></li>
						<li style="display:inline;margin-left:49px"><a href="${pageContext.request.contextPath}/showApp.do?flag=aboutwebsite">关于本站</a></li>
						
				</ul>
</div>
</html>
