<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<title>登录吉大应用网</title>
<link href="css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
		function checkUser()
		{
			span1.innerText="";
			span2.innerText="";
			if(document.forms[0].username.value.length<3||document.forms[0].username.value.length>12)
			{	
				span1.innerText="用户名为3至12个字符";
				return false;
			}
			if(document.forms[0].pwd.value.length<1||document.forms[0].pwd.value.length>12)
			{
				span2.innerText="密码3-12个字符";
				return false;
			}
		}
	
</script>
</head>

<body background="images/normal/login.jpg">
<div class="logo"><a href="${pageContext.request.contextPath }/showApp.do?flag=showmain"><img src="images/normal/logo.jpg" border="0" width="240" height="57" /></a></div>
<div style="margin-left: -10px;margin-top: -10px;background-color: #F3F9FF;width: 1366px; height: 58px;"></div>
<div class="first"><a href="${pageContext.request.contextPath}/toLogin.do?flag=toregister">马上注册</a></div>
<form onsubmit="return checkUser()" action="${pageContext.request.contextPath}/login.do?flag=login" method="post">
<div class="username">
  <input type="text" name="username" style=" height:33px; width:270px;"  />
	<span id="span1" style="color: red"></span>
</div>

<div class="pwd">
  <input type="password" name="pwd"  style=" height:33px; width:270px;" />
	<span id="span2" style="color: red"></span>
</div>

<div class="login1"><input type="image" onclick="submit"  src="images/normal/login1.png"  border="0"/></div>
</form>
</body>
</html>
