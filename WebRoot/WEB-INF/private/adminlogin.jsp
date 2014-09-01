<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>管理员登陆</title>
  <script type="text/javascript">
  			function checkAdmin()
		{
			span1.innerText="";
			span2.innerText="";
			if(document.forms[0].username.value.length<3||document.forms[0].username.value.length>12)
			{	
				alert(document.forms[0].username.value);
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
<body bgcolor="#E3E3E3">
		<div style="margin-left:200px;margin-top:200px;"><img src="images/normal/admin_login_bg.png"></div>
		<div style="position:absolute; color:#00DFFF; font-family:'微软雅黑'; font-size:36px; font-weight:900; left: 304px; top: 131px;">吉大应用网后台登陆</div>
		
		<form onsubmit="return checkAdmin()" action="${pageContext.request.contextPath}/admin.do?flag=showalluser" method="post">
		<div style="position:absolute; left: 404px; top: 310px; height: 33px;">
				<input type="text" name="username" style="width:250px; height:35px;" /></div>
				
		<div style="position:absolute; left: 404px; top: 370px; height: 33px;">
				<input type="password" name="pwd" style="width:250px; height:35px;" /></div>
		<div style="position:absolute; left: 404px; top: 430px; height: 33px;">
				<input type="image" border="0px" src="images/normal/admin_login.png"></div>		
		</form>		
		
</body>
</html>
