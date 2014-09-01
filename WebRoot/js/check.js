function checkregister()
{
	span1.innerText="";//每次输入错误时，就可以自动归零
	span2.innerText="";
	span3.innerText="";
	span4.innerText="";
	span5.innerText="";
	span6.innerText="";
	span7.innerText="";
	span8.innerText="";
	//用户名验证
	if(document.forms[0].username.value.length<3||document.forms[0].username.value.length>12)
	{	
		
		span1.innerText="用户名为3至12个字符";
		return false;
	}
	//进行密码验证
	if(document.forms[0].name.value.length<3||document.forms[0].name.value.length>10)
	{
		span2.innerText="真实姓名3至12个字符";
		return false;
	}   
	if(document.forms[0].university.value.length<1)
	{
		span4.innerText="学校不能为空";
		return false;
	}	
	var txt=document.forms[0].email.value;
	var re=/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	if(!re.test(txt))
	{
		span5.innerText="邮箱有误";
		return false;
	}
	if(document.forms[0].pwd.value.length<1||document.forms[0].pwd.value.length>12)
	{
		span6.innerText="密码3-12个字符";
		return false;
	}
	if(document.forms[0].pwd2.value!=document.forms[0].pwd.value)
	{
		span7.innerText="两次输入密码不一致";
		return false;
	}
	if(document.forms[0].oicq.value.length<1||document.forms[0].oicq.value.length>10)
	{
		span8.innerText="您的qq号有误";
		return false;
	}
}