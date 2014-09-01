<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册吉大应用网</title>
<link href="css/register.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/JDApp/js/jquery-1.3.1.js"></script>
<script type="text/javascript" src="/JDApp/js/ajax_uni.js"></script>
<script type="text/javascript" src="/JDApp/js/check.js"></script>
</head>
<body bgcolor="#F3F9FF">
<div class="logo2"  onContextMenu="return false"><img src="images/normal/logo.jpg" /></div>
<div class="register">
  <p><strong>欢迎注册吉大应用网</strong></p>
 	<div class="register_head"><img src="images/normal/register_head.png" width="240" height="33" /> </div>
</div>
<form action="${pageContext.request.contextPath}/login.do?flag=register" method="post">
<div class="table">
  <table width="100%" height="570" border="0" style="font-size:16px; color:#9A9A9A;">
    <tr style="text-align:center;">
      <td width="21%" height="48">您的用户名</td>
      <td width="33%">
        <input type="text" name="username" style="width:300px; height:30px;" /></td>
      <td width="25%" style="color: red"><span id="span1"></span></td>
    </tr>
    <tr style="text-align:center;">
      <td height="44">您的真实姓名</td>
      <td><input type="text" name="name"  style="width:300px; height:30px;" /></td>
      <td><span id="span2" style="color:red"></span></td>
    </tr>
    <tr style="text-align:center;">
      <td height="50">性别</td>
      <td><input type="radio" value="男" name="sex" checked="checked" />男　　　　　　<input type="radio" value="男" name="sex"/>女</td>
      <td><span id="span3" style="color:red"></span></td>
    </tr>
    <tr style="text-align:center;">
      <td height="49">学校类型</td>
      <td><select >
 				     <option>---请选择---</option>
 				     <option>大学</option>
      </select></td>
      <td>&nbsp;</td>
    </tr>
    <tr style="text-align:center;">
      <td height="54">学校</td>
      <td><input type="hidden" name="universityId" id="uuniversity"   />
      <input type="text" onclick="showUniTbl();" name="university" id="university"  style="width:300px; height:30px;"/></td>
      <td><span id="span4" style="color:red"></span></td>
    </tr>
    <tr style="text-align:center;">
      <td height="50">邮箱</td>
      <td>
      <input type="text" name="email"  style="width:300px; height:30px;"/></td>
      <td><span id="span5" style="color: red"></span></td>
    </tr>
    <tr style="text-align:center;">
      <td height="46">密码</td>
      <td><input type="password" name="pwd"  style="width:300px; height:30px;"/></td>
      <td><span id="span6" style="color:red"></span></td>
    </tr>
    <tr style="text-align:center;">
      <td height="52">确认密码</td>
      <td><input type="password" name="pwd2" style="width:300px; height:30px;" /></td>
      <td><span id="span7" style="color:red"></span></td>
    </tr>
    <tr style="text-align:center;">
      <td height="50">您的QQ号</td>
      <td><input type="text" name="oicq" style="width:300px; height:30px;" /></td>
      <td><span id="span8" style="color:red"></span></td> 
    </tr>
    <tr>
      <td height="48"> </td>
      <td><input type="image" src="images/normal/zhuce.png" onclick="return checkregister();" /></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="44" colspan="2">　　　<input type="checkbox"  />已同意吉大应用网<a href="#">《网络服务条款》</a></td><td><span style="color:red" id="span9"></span></td>
    </tr>
  </table>
</div>
</form>

<!-- 准备显示的大学表格 start -->
<div class="divSch" id="uniDiv"
	style=" display:none;  position: absolute; top: 196px; left: 686px">
	<table style="solid;3px;color: gray;" align="center" height="413" width="500px"
		bordercolor="#3B5888">
	
		<!-- 显示当前国家的所有直辖市和省份 -->
		<tr>
		<td height="49" bordercolor="#C3C3C3">
			<div id="proTbl">
				<table width="100%">
					<tr>
						<td>
							  <c:forEach  items="${provincelist}" var="province" >
							<a onclick='setProUnis(this)'  href="javascript:void(0);" class="xh"
							 id="${ province.id}"
							 >${province.name}</a>
							</c:forEach>
						</td>
							
					</tr>
				</table>
			</div>
		</tr>
		<!-- 显示当前省或者直辖市的大学 -->
		<tr>
		<td valign="top" bordercolor="#C3C3C3">
			<div style="width: 550px; height: 280px; overflow: auto"
				id="uniTbl">
				<table width="100%">
					<tr>
						<c:forEach var="university" items="${unilist}" varStatus="vs">
						<td>
						<li>
								<a onclick='showMyUni(this)' href="javascript:void(0);"
								class="xh"  id="${university.id }">${university.name }</a></li></td>
								<c:if  test="${vs.count%3==0}"></tr><tr></c:if>
						</c:forEach>
					</tr>
				</table>
			</div>
		  </td>
	  </tr>
			<tr>
			<td align="right" bordercolor="#FFFFFF">
				<input type="button" value="关闭窗口" onclick="closeUniTbl()"
					style="color: white; background-color: #3B5888; padding: 3px;" />
				<br />
				<br />
				<br />
				<br />
			</td>
			</tr>
  </table>
</div>
<!-- 准备显示的大学表格 end -->
</body>
</html>
