<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h2 align="center">添加班级</h2>
  	<form action="class/classAdd.action" method="post">
	    <table border="1" cellspacing="0" align="center">
	  			<tr>
	  				<td align="right">
	  					班级编号：
	  				</td>
	  				<td>
	  					<input type="text" size="20" name="C_id" style="border:none">
	  				</td>
	  			</tr>
	  			<tr>
	  				<td align="right">
	  					班级名：
	  				</td>
	  				<td>
	  					<input type="text" size="20" name="C_name" style="border:none">
	  				</td>
	  			</tr>
	  		</table>
	  		<br>
	  		<div align="center"><input type="submit" value="提交"></div>
	 </form>
  </body>
</html>
