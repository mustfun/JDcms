<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/jquery-1.3.1.js"></script>
  </head>
  
  <body  background="images/normal/uploadbg.jpg"  >
  <div style="text-align: center;color: white;font-size: 40px;">欢迎管理员添加应用</div>
   <div class="admin">
<form enctype="multipart/form-data"  action="${pageContext.request.contextPath }/upload.do?flag=uploadok" method="post" >
<table width="73%" style="color: white;font-size:20px;border-color: yellow;">
  <tr>
    <td>应用的编号</td>
    <td><input type="text" name="app_id" /></td>
  </tr>
  <tr>
    <td>应用名</td>
    <td><input type="text" name="app_name" /></td>
  </tr>
  <tr>
    <td>应用简短描述</td>
    <td><input type="text" name="app_spedesc" /></td>
  </tr>
  <tr>
    <td>应用详细描述</td>
    <td><textarea  name="app_desc" style="height:200px; width:300px; overflow:hidden"></textarea></td>
  </tr>
  <tr>
    <td>应用下载地址</td>
    <td><input type="text" name="downadre" /></td>
  </tr>
  <tr>
    <td>应用类别</td>
    <td>
    		<select name="app_type">
    				<option>--请选择应用类别--</option>
    				<option value="1">聊天辅助</option>
    				<option value="2">系统工具</option>
    				<option value="3">地图导航</option>
    				<option value="4">音乐播放</option>    				
    				<option value="5">图书阅读</option>    				
    				<option value="6">生活应用</option>    				
    				<option value="7">视频播放</option>    				
    				<option value="8">安全管家</option>    				
    				<option value="9">主题美化</option>    				
    				<option value="10">安卓必备</option>    				
    				<option value="11">影音软件</option>    				
    				<option value="12">地图软件</option>    				
    				<option value="13">购物管理</option>    				
    				<option value="14">系统管理</option>    				
    				<option value="15">生活应用</option>    				
    				<option value="16">学习帮助</option>   				
    		</select>
    </td>
  </tr>
  <tr>
    <td>应用logo</td>
    <td><div style="width:124px; height:124px;"><img id="preview" width="124px;" height="124px" border="0"  /></div><input  type="file" name="applogo" id="applogo" onchange="fileSelectHandler()" style="width: 70px;"  /></td>
  </tr>
  <tr>
    <td>应用截图</td>
    <td><div style=" width:200px; height:120px;"><img id="preview2" width="80px;" height="133px" border="0"  /></div><input  type="file" name="appjietu" id="appjietu" onchange="senSelectHandler()" style="width: 70px;"  /></td>
  </tr>
  <tr ><td><input type="submit" value="开始上传"/></td></tr>
</table>
</form>
</div>
  </body>
</html>
