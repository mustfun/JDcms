var xmlrequest;   
//这个函数得到xml请求
function createXMLHttpRequest(){
		if (window.ActiveXObject) {
			xmlrequest = new ActiveXObject("Microsoft.XMLHTTP"); //其他浏览器
		} else {
			xmlrequest = new XMLHttpRequest(); //ie浏览器
		}
}

function setrequest(app)
{
		createXMLHttpRequest(); //调用上面的那个函数
		if(xmlrequest) //如果为真，或者说不为空
		{
				//window.alert("pointout");
			//	window.alert($("#textarea").val()); //成功用jquery获取到值，哈哈
			//	return false;
				//准备发送请求,发送的地址，可以是servlet或者是一个action
				var text=$("#textarea").val();
				var  requ="/JDApp/Comments?textvalue="+text+"&appid="+app.id;
				//测试成功，拿到了，哈哈
				//打开请求
				xmlrequest.open("get", requ, true);
				
				//下面一个是回调函数，处理结果的，哈哈
				xmlrequest.onreadystatechange=getrequest;  //这里好像写错了，回调函数不要()
				xmlrequest.setRequestHeader("Content-Type", "text/html;charset=utf-8");
				xmlrequest.send();
				//上面那个回调也不要括号，真奇葩
		}
}

function getrequest(){
		//判断是否成功返回，是否完成
		if(xmlrequest.readyState==4)
		{
			if(xmlrequest.status==200)
			{
				//	window.alert("you have come in");
					//表示获取到了allcomments，然后拼接成一个新的div发送过去
				   	//然后我们得到那个xml文件 得到了comments
					var allcomments=xmlrequest.responseXML.getElementsByTagName("comments");
					var table="<table width='100%' border='0' style='border: 1px silver solid;'>";
	
					for(var i=1;i<=allcomments.length;i++)
					{
					//	window.alert(allcomments.length);
							table+="<tr><td width='9%' heigth='40'> "
								+allcomments[i-1].childNodes[0].childNodes[0].data+"</td><td width='91%'>"
							+allcomments[i-1].childNodes[1].childNodes[0].data+"</td></tr>";
					}
					table+="</table>";
					//终于把表格拼接完成了，哈哈
				//	window.alert("the hole table is"+table);
					document.getElementById("changecomment").innerHTML=table;
			}
		}

}
function cleartextarea()
{
	$("#textarea").val("");
}

/*function likeapp(id)
{
	createXMLHttpRequest(); //调用上面的那个函数
	if(xmlrequest) //如果为真，或者说不为空
	{
		alert("你猜你发现我的爱");
		window.alert(id);
		alert("id是"+id);
		return false;
	}
}
*/
function likeapp(app2)
{
	createXMLHttpRequest(); //调用上面的那个函数
	if(xmlrequest) //如果为真，或者说不为空
	{
		alert("感谢您喜欢这个应用");
		//alert(app2.id);
		var str=app2.id;
		var ids=new Array();
		ids=str.split(","); //字符分割 
		var id=ids[0]
		var likeid=ids[1];
		var a=parseInt(likeid)+1;
		//alert(id);
		//alert(likeid);
		//return false;
		document.getElementById("likenum").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;"+a+"&nbsp;喜欢";
		//window.location.href="LikeAppServlet?id="+id;
		var  requ="/JDApp/LikeAppServlet?id="+id;
		xmlrequest.open("get", requ, true);
		//下面一个是回调函数，处理结果的，哈哈
		xmlrequest.onreadystatechange=returnlikeapp;  //这里好像写错了，回调函数不要()
		xmlrequest.setRequestHeader("Content-Type", "text/html;charset=utf-8");
		xmlrequest.send();
		//上面那个回调也不要括号，真奇葩
	}
	
}

function adddownnum(appdownnum)
{
	createXMLHttpRequest(); //调用上面的那个函数
	if(xmlrequest) //如果为真，或者说不为空
	{
		alert("感谢您下载这个应用");
		//alert(appdownnum.id);
		var  requ="/JDApp/AddAppDownNum?id="+appdownnum.id;
		xmlrequest.open("get", requ, true);
		//下面一个是回调函数，处理结果的，哈哈
		//xmlrequest.onreadystatechange=returndownapp;  //这里好像写错了，回调函数不要()
		xmlrequest.setRequestHeader("Content-Type", "text/html;charset=utf-8");
		xmlrequest.send();
		
	}
}