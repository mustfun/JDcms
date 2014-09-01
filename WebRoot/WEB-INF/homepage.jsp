<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>个人主页</title>
<link href="css/home.css" rel="stylesheet" type="text/css" />
</head>
<body bgcolor="#F3F9FF">
<jsp:include page="/WEB-INF/head.jsp"></jsp:include>
<div class="kuang" style="background-color:white">
  <div class="touxiang">
    <table width="100%" height="596" border="0" style="text-align:center">
      <tr>
        <td height="43" style="font-family: '微软雅黑';font-size: 18px;">${loginuser.username}</td>
      </tr>
      <tr>
        <td height="155"><img src="images/user/${loginuser.photo}" /></td>
      </tr>
      <tr>
        <td height="47">注册时间<p>${loginuser.registerDate }</p></td>
      </tr>
      <tr>
        <td><p><img src="images/normal/level.png" width="15" height="15" />等级</p>
        <p>**${loginuser.level}**</p></td>
      </tr>
    </table>
  </div>
 <div class="middle">
 		<div style="font-size:24px; font-family:'微软雅黑'; font-weight:bold; text-align:center; line-height:100px;">我下载过得应用</div>
		<div>
				<table width="32%" border="0">
						  <tr>
						  <c:forEach items="${userdownappinfo}" var="appdown" varStatus="i">
							<td height="177" >
											<table width="250px;" height="167">
												  <tr>
													<td height="123"><img src="images/game/${appdown.app.appSrc }/App_logo/${appdown.app.appLogo}"/></td>
												  </tr>
												  <tr>
													<td height="36">${appdown.app.appName}</td>
												  </tr>
												
							  </table>
							</td>
							<c:if test="${i.count%3==0}">
								<tr></tr>
							</c:if>
							</c:forEach>
						  </tr>
		  </table>

		
		
		
		</div>
 
 
 </div>
</div>
<jsp:include page="/WEB-INF/tail.jsp"></jsp:include>
</body>
</html>
