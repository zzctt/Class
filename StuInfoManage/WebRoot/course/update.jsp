<%@ page language="java" import="java.util.*" import="com.PO.Course" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
  <%
  	String coId=(String)request.getParameter("coId");
  	String coName=(String)request.getParameter("coName");
  	coName=new String(coName.getBytes("ISO-8859-1"),"utf-8");
  	String coNature=(String)request.getParameter("coNature");
  	coNature=new String(coNature.getBytes("ISO-8859-1"),"utf-8");
  	String coScore=(String)request.getParameter("coScore");
   %>
  <h2 align="center">修改课程信息</h2>
  	<form action="course/coAdd.action" method="post">
	    <table border="1" cellspacing="0" align="center">
	    	<tr>
	    		<td align="right">课程号：</td>
	    		<td><input type="text" size="20" name="Co_id" style="border:none" value="<%=coId %>" readonly="readonly"></td>
	        </tr>
	    	<tr>
	    		<td align="right">课程名：</td>
	    		<td><input type="text" size="20" name="Co_name" style="border:none" value="<%=coName %>"></td>
	    	</tr>
	    	<tr>
	    		<td align="right">性质：</td>
	    		<td><input type="text" size="20" name="Co_nature" style="border:none" value="<%=coNature %>"></td>
	    	</tr>
	    	<tr>
	    		<td align="right">学分：</td>
	    		<td><input type="text" size="20" name="Co_score" style="border:none" value="<%=coScore %>"></td>
	    	</tr>
	    </table>
	    <br>
	    <div align="center"><input type="submit" value="提交"></div>
	 </form>
  </body>
</html>
