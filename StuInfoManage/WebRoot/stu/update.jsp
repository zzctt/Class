<%@ page language="java" import="java.util.*" import="java.util.ArrayList" import="com.PO.Stu" pageEncoding="utf-8"%>
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
    String StuId=(String) request.getParameter("StuId");
    String StuCId=(String) request.getParameter("StuCId");
    StuCId=new String(StuCId.getBytes("ISO-8859-1"),"utf-8");
    String StuName=(String) request.getParameter("StuName");
    StuName=new String(StuName.getBytes("ISO-8859-1"),"utf-8");
    String StuSex=(String) request.getParameter("StuSex");
    StuSex=new String(StuSex.getBytes("ISO-8859-1"),"utf-8");
    String StuAddress=(String) request.getParameter("StuAddress");
    StuAddress=new String(StuAddress.getBytes("ISO-8859-1"),"utf-8");
    String StuPhonenumber=(String) request.getParameter("StuPhonenumber");
    String StuBirth=(String) request.getParameter("StuBirth");
    %>
    <h2 align="center">修改学生信息</h2>
     <br>
     	<form action="stu/stuUpdate.action" method="post">
	     <table border="1" cellspacing="0" align="center">
	     	<tr>
	     		<td align="right">
	     			学号：
	     		</td>
	     		<td align="right">
	     			<input type="text" name="Stu_id" size="10" style="border:none" value="<%=StuId %>" readonly="readonly">
	     		</td>
	     		<td align="right">
	     			班级：
	     		</td>
	     		<td align="right">
	     			<input type="text" name="Stu_C_id" size="10" style="border:none" value="<%=StuCId %>" >
	     		</td>
	     	</tr>
	     	<tr>
	     		<td align="right">
	     			姓名：
	     		</td>
	     		<td>
	     			<input type="text" name="Stu_name" size="10" style="border:none" value="<%=StuName %>">
	     		</td>
	     		<td align="right">
	     			性别：
	     		</td>
	     		<td>
	     			<input type="text" name="Stu_sex" size="10" style="border:none" value="<%=StuSex %>">
	     		</td>
	     	</tr>
	     	<tr>
	     		<td align="right">
	     			联系电话：
	     		</td>
	     		<td>
	     			<input type="text" name="Stu_phonenumber" size="10" style="border:none" value="<%=StuPhonenumber %>">
	     		</td>
	     		<td align="right">
	     			住址：
	     		</td>
	     		<td>
	     			<input type="text" name="Stu_address" size="10" style="border:none" value="<%=StuAddress %>">
	     		</td>
	     	</tr>
	     	<tr>
	     		<td align="right">
	     			出生年月：
	     		</td>
	     		<td colspan="3">
	     			<input type="text" name="Stu_birth" size="30" style="border:none" value="<%=StuBirth %>">
	     		</td>
	     	</tr>
	     </table>
	     <br>
	     <div align="center"><input type="submit" value="确定"></div>
	   </form>
  </body>
</html>
