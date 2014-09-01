<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <link href="css/appinfo.css" rel="stylesheet" type="text/css" />
    	<link rel="css/logo.css" type="text/css" href="styles.css">
		<script type="text/javascript" src="js/jquery-1.3.1.js"></script>
		<script type="text/javascript" src="js/myajax.js"></script>
 		<script language="javascript" type="text/javascript">
    			function aafocus(obj){
    				//window.alert("为什么无效啊");
    				var _targetTop = $('#'+obj).offset().top;//获取位置
					jQuery("html,body").animate({scrollTop:_targetTop},300);//跳转
				}
				function checkiflogin(){
					
					if(${loginuser==null})
					{
						alert("您还没有进行登录");
					}
				}
		</script>
   
    <title>吉大应用网</title>
    
</head>
<jsp:include page="/WEB-INF/head.jsp"></jsp:include>
<body bgcolor="#E3F0F6">
<div class="kuang" style="background-color:white">
  <table width="100%" height="1544" border="0" style=" border:solid silver 1px">
    <tr>
      <td height="1538"><div class="head">
        <table width="100%" height="195"  >
          <tr>
            <td width="32%" rowspan="4" style="text-align:center"><img src="images/game/${appinfomation.appSrc}/App_logo/${appinfomation.appLogo }"/></td>
            <td width="68%" height="63" style="font-size: 24px">${appinfomation.appName}</td>
          </tr>
          <tr>
            <td height="28">${appinfomation.appSpedesc }</td>
          </tr>
          <tr>
            <td height="8"></td>
          </tr>
          <tr>
            <td height="41"><a target="_blank" href="${appinfomation.appDownadd }" onclick="adddownnum(this)" id="${appinfomation.id }"><img src="images/normal/downloadnow.png" border="0" /></a></td>
          </tr>
        </table>
      </div>
	  <div class="like">
	    	<table>
	    			<tr>
	    			<td>　<a href="javascript:void(0)" onclick="aafocus('pinglunid');">　<img alt="评论"  src="images/normal/discuss.png" border="0"></a></td>
	    			<td>　　<a href="javascript:void(0)" onclick="likeapp(this);" id="${appinfomation.id},${appinfomation.appLike}">　<img border="0" alt="喜欢" src="images/normal/like.png"></a></td>
	    			<td>　　<a target="_blank" href="${appinfomation.appDownadd }">　<img alt="下载" src="images/normal/havedown.png" border="0"></a></td>
	    			</tr>
	    			<tr style="font-size: 18px; color: silver;">
	    				<td>　　去评论</td>
	    				<td><div id="likenum">　　${appinfomation.appLike} 喜欢</div></td>
	    				<td>　　${appinfomation.appDownnum}人下载</td>
	    				
	    			</tr>
	    	</table>
	  </div>
	  <div class="yingyong">
	    <table width="100%" height="277" border="0" style="border: 1px silver solid;">
          <tr>
            <td height="39"><h2>应用信息</h2></td>
          </tr>
          <tr style="color:#999999;">
            <td height="38">大小：7M</td>
          </tr>
          <tr style="color:#999999;">
            <td height="36">分类：软件</td>
          </tr>
          <tr style="color:#999999;">
            <td height="38">语言：中文</td>
          </tr >
          <tr style="color:#999999;">
            <td height="39">资费：免费</td>
          </tr>
          <tr style="color:#999999;">
            <td height="38">系统：2.2以上</td>
          </tr>
          <tr style="color:#999999;">
            <td height="31">开发商：未知</td>
          </tr>
        </table>
	  </div>
	  
	  
	  
	  <div class="jietu" style="text-align: center;"><img style="height: 100%;width: 40%; " alt="截图" src="images/game/${appinfomation.appSrc}/App/${appinfomation.appPhoto }"></div>
	  <div class="jieshao" style=" font-size:24px; color:green;"><table><tr><td style="border-bottom-color:#D5D5D5; border-bottom-style:ridge;font-family: '微软雅黑';font-weight: 900;font-size: 20px;">应用介绍</td></tr></table></div>
	  <div class="jieshao2">
	   <div style="font-size: 15px;color: #7DB7E7;">${appinfomation.appDesc }</div>
          
        
	  </div>
	 
	  <div id="pinglunid" class="pinglun"style=" font-size:24px; color:green;"><table><tr><td style="border-bottom-color:#D5D5D5; border-bottom-style:ridge;font-family: '微软雅黑';font-weight: 900;font-size: 20px;">应用评论</td></tr></table></div>
	  
	  <div class="pinglunkuang"> <table width="100%" height="180" border="0" style="border:1px solid  #EAEDF1">
          <tr>
            <td><textarea style="width: 706px;height:180px;overflow: hidden;" id="textarea"></textarea></td>
          </tr>
      </table></div>
	  <div class="pingluntu"><a href="javascript:void(0);"  onclick='checkiflogin();setrequest(this);cleartextarea()'  id="${appinfomation.id}"   ><img src="images/normal/pingluntu.png" border="0" /></a></div>
	  <div class="pinglunren" id="changecomment" >
	 <table width="100%" border="0" style="border: 1px silver solid;">
 	<c:forEach items="${commentinfo}" var="comtent"> <tr>
    	<td width="9%" height="40">${comtent.users.username }:</td>
    	<td width="91%">${comtent.contents }</td>
  	</tr>
  	</c:forEach>
	</table>
 </div>
	  
	   <div class="tonglei">
	   <table width="100%" border="0" style="border: 1px silver solid;" >
  <tr>
    <td><h2>下载量最高</h2></td>
  </tr>
</table>

	     <table width="100%"  border="0" style="border: 1px silver solid;">
			<c:forEach items="${mostdownload}" var="app">
			<tr>
				 <td><div><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}"><img style="border: 0px;width: 60px;height: 60px;float: left;" src="images/game/${app.appSrc }/App_logo/${app.appLogo}"/></a><div style="margin-left: 30px;float: left;">已有${app.appDownnum }次下载</div></div>
				     <div style="margin-left: 90px;font-weight: bold;font-size: 18px;"><a href="${pageContext.request.contextPath }/showApp.do?flag=showapp&id=${app.id}">点击下载</a></div>
				 </td>     
		    </tr>
		    </c:forEach>
				  
</table>
</div></td>
    </tr>
  </table>
</div>
<div class="dibu"><jsp:include page="tail.jsp"></jsp:include></div>
</body>
</html>
