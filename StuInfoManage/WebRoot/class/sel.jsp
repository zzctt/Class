<%@ page language="java" import="java.util.*" import="com.PO.Cla" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sel.jsp' starting page</title>
    
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
    	ArrayList<Cla> claList=(ArrayList<Cla>) request.getAttribute("claList");
     %>
     <br><br>
     <table align="center" border="1" cellspacing="0">
     	<tr>
     		<td>班级编号</td><td>班级名</td><td align="center">操作</td>
     	</tr>
     		<%
     			for(Cla cla : claList)
     			{
     			%>
     				<tr>
     					<td><%=cla.getCId() %></td><td><%=cla.getCName() %></td>
     					<td><a href="class/update.jsp?cId=<%=cla.getCId() %>
     					&cName=<%=cla.getCName() %>">修改</a><a href="class/classDelete.action?cId=<%=cla.getCId() %>">删除</a></td>    				
     				</tr>
     			<%
     			}
     		 %>
     </table>
  </body>
</html>
