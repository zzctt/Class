<%@ page language="java" import="java.util.*" import="com.PO.Stu" import="java.util.ArrayList" pageEncoding="utf-8" %>
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
  	ArrayList<Stu> stuList=(ArrayList<Stu>)request.getAttribute("stuList");
   %>
    <br>
    
    <br>
    <table border="1" cellspacing="0" align="center">
    	<tr>
    		<td>学号</td><td>班级</td><td>姓名</td><td>性别</td><td>出生年月</td><td>手机号</td><td>住址</td><td colspan="2" align="center">操作</td>
    	</tr>
    	<%
    		for(Stu stu:stuList)
    		{
    			%>
    	<tr>
	    	<td><%=stu.getStuId() %></td><td><%=stu.getStuCId() %></td><td><%=stu.getStuName() %></td>
	    	<td><%=stu.getStuSex() %></td><td><%=stu.getStuBirth() %></td><td><%=stu.getStuPhonenumber() %></td>
	    	<td><%=stu.getStuAddress() %></td><td><a href="stu/update.jsp?StuId=<%=stu.getStuId() %>
	    	&StuCId=<%=stu.getStuCId() %>&StuName=<%=stu.getStuName() %>&StuSex=<%=stu.getStuSex() %>
	    	&StuBirth=<%=stu.getStuBirth() %>&StuPhonenumber=<%=stu.getStuPhonenumber() %>&StuAddress=<%=stu.getStuAddress() %>">修改</a>
	    	<a href="stu/stuDelete.action?StuId=<%=stu.getStuId() %>">删除</a></td>
	    </tr>
    			<%
    		}
    	 %>
    </table>
  </body>
</html>                          
