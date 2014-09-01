<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/jquery-1.3.1.js"></script>
<link href="css/admin.css" rel="stylesheet" type="text/css" />
  </head>
  
<body  bgcolor="#F5F7FA">
<div style="width: 300px; height: 200px;">

</div>
<form action="${pageContext.request.contextPath }/upload.do?flag=uploadok" method="post" enctype="multipart/form-data">
<input  type="file" name="applogo" id="applogo" onchange="fileSelectHandler()" style="width: 70px;"  /><br/>
<div><img id="preview"  /></div>
<br>
<input  type="file" name="appjietu" id="appjietu" onchange="senSelectHandler()" style="width: 70px;"  /><br/>
<div><img id="preview2"  /></div>
<input type="submit" value="提交"  />
</form>
 </body>
</html>
