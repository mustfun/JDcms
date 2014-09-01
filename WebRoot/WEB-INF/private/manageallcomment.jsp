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
	
	<div class="houtai"><div style="margin-top:40px; font-size:36px; color:#0000FF; margin-left:550px;">评论管理中心</div></div>
	
	<div class="shujuqu">
			
			<table width="100%" border="0">
			  <tr bgcolor="#FF3FAA" style="text-align:center; color: #0000FF; font-weight:bold">
				<td width="11%">id</td>
				<td width="14%">评论应用名</td>
				<td width="16%">评论人</td>
				<td width="50%">内容</td>
				<td width="9%">操作</td>
			  </tr>
			  
			  <c:forEach items="${appcommentlist}" var="comment">
			  <tr bgcolor="#F5F7F7" style="height: 50px;text-overflow:ellipsis;;overflow: hidden;">
			   <td height="33">${comment.id }</td>
				<td>${comment.app.appName }</td>
				<td>${comment.users.name }</td>
				<td>${comment.contents }</td>
				<td><a onclick="return confirm('你真的要删除吗');" href="${pageContext.request.contextPath}/admin.do?flag=delsomedody&type=comment&id=${comment.id}">删除</a></td>
			  </tr>
			  </c:forEach>
		</table>
		</div>
		
	  <div class="xiayiye">
	  <span style="color:#00DFFF;font-weight:bolder"">
	   <c:if test="${pageNow>1}">
	  <a href="${pageContext.request.contextPath}/admin.do?flag=shownextcomment&pageNow=${pageNow-1}">上一页</a></c:if></span>
	  <span style=" margin-left:10px;color:#00DFFF; font-weight:bolder">
	  <c:if test="${pageNow<pageCount}">
	  <a href="${pageContext.request.contextPath}/admin.do?flag=shownextcomment&pageNow=${pageNow+1}">下一页</a></c:if></span></div>
	  
		<div class="tail"></div>
</body>
</html>
