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
	
	<div class="houtai"><div style="margin-top:40px; font-size:36px; color:#0000FF; margin-left:550px;">应用管理中心</div></div>
	
	<div class="shujuqu">
			<div class="appdiv">
				<table width="100%" border="0" style="table-layout: fixed;">
				  <tr bgcolor="#FF3FAA" style="text-align:center ;color: #0000FF; font-weight:bold">
					<td width="8%">id</td>
					<td width="11%">名称</td>
					<td width="10%">编号</td>
					<td width="13%">下载数</td>
					<td width="14%">下载地址</td>
					<td width="11%">喜欢数</td>
					<td width="12%">简短描述</td>
					<td width="11%">描述</td>
					<td width="10%">操作</td>
				  </tr>
				 <c:forEach items="${applist}" var="app">
				  <tr bgcolor="#F5F7F7" style="height: 50px;">
					<td>${app.id }</td>
					<td>${app.appName }</td>
					<td>${app.appId }</td>
					<td>${app.appDownnum }</td>
					<td><div class="autocut">${app.appDownadd }</div></td>
					<td>${app.appLike }</td>
					<td><div class="autocut">${app.appSpedesc }</div></td>
					<td><div class="autocut">${app.appDesc }</div></td>
					<td><a onclick="return confirm('你真的要删除吗');" href="${pageContext.request.contextPath}/admin.do?flag=delsomedody&type=app&id=${app.id}">删除</a></td>
				</tr>
				  </c:forEach>
		</table>
		
		</div>
		</div>
		
	  <div class="xiayiye">
	  <span style="color:#00DFFF;font-weight:bolder"">
	   <c:if test="${pageNow>1}">
	  <a href="${pageContext.request.contextPath}/admin.do?flag=shownextapp&pageNow=${pageNow-1}">上一页</a></c:if></span>
	  <span style=" margin-left:10px;color:#00DFFF; font-weight:bolder">
	  <c:if test="${pageNow<pageCount}">
	  <a href="${pageContext.request.contextPath}/admin.do?flag=shownextapp&pageNow=${pageNow+1}">下一页</a></c:if></span></div>
	  
		<div class="tail"></div>
</body>
</html>
