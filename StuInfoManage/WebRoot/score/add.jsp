<%@ page language="java" import="java.util.*" import="com.PO.Stu" import="com.PO.Course" import="com.PO.Score" pageEncoding="utf-8" %>
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
  <%
  	 ArrayList<Stu> list1=(ArrayList<Stu>) request.getAttribute("list2");
  	 ArrayList<Course> list2=(ArrayList<Course>) request.getAttribute("list1");
  	 ArrayList<Score> list3=(ArrayList<Score>) request.getAttribute("list3");
  %>
  <h2 align="center">成绩录入/修改</h2>
  <br>
  <form action="score/scoreAdd.action" method="post">
  	<table border="1" cellspacing="0" align="center">
  		<tr><td></td>
  			<%
  				for(int i=0;i<list2.size();i++)
  				{
  			%>
  					<td><%=list2.get(i).getCoName() %></td>
  			<%
  				}
  			 %>
  		</tr>
  		
  			<%
  				for(int j=0;j<list1.size();j++)
  				{
  					%>
  						<tr><td><%=list1.get(j).getStuName() %></td>
  						<%
  						
  							for(int i=0;i<list2.size();i++)
  							{
  							%>
  							<td>
  							<% 
  								boolean judge=true;
  								for(Score score : list3)
  								{
  									if(score.getSId().equals(list1.get(j).getStuId())&&score.getSCoId().equals(list2.get(i).getCoId()))
  									{
  								%> 
  									
  									   <input type="text" size="10" style="border:none" name="score" value="<%=score.getSScore() %>">			
  								<%
  									}
  								
	  								if(!score.getSId().equals(list1.get(j).getStuId())||!score.getSCoId().equals(list2.get(i).getCoId()))
	  								{
	  									judge=judge&&true;
	  								}
	  								else
	  								{
	  								    judge=judge&&false;
	  								}
  								}
  								if(judge)
  								{
  									%>
  										<input type="text" size="10" style="border:none" name="score">
  									<%
  								}
  								%>
  								</td>
  								<% 
  							}
  						 %>
  						 </tr>
  					<%
  				}
  			 %>
  			
  	<%--  	for(int i=0;i<list1.size();i++)
  	 	{
  	 	%>
  	 		<tr>
  	 			<td rowspan="3"><%=list1.get(i).getStuId() %></td>
  	 			<td rowspan="3"><%=list1.get(i).getStuName() %></td>
  	 			<td><%=list2.get(0).getCoId() %></td>
  	 			<td><%=list2.get(0).getCoName() %></td>
  	 			<td><input type="text" size="10" style="border:none" 
  	 			    name="<%=list1.get(i).getStuId() %>+<%=list2.get(0).getCoId()%>"></td>
  	 		</tr>
  	 	<%
  	 		for(int j=1;j<list2.size();j++)
  	 		{
  	  %>
  	  			<tr>
  	  				<td><%=list2.get(j).getCoId() %></td>
  	  				<td><%=list2.get(j).getCoName() %></td>
  	  				<td><input type="text" size="10" style="border:none" 
  	  				name="<%=list1.get(i).getStuId() %>+<%=list2.get(j).getCoId()%>"></td>
  	  			</tr>
  	  <%
  	  		}
  	  	}
  	  	
  	   %> --%>
  	   </table>
  	   <br>
  	   <div align="center"><input type="submit" value="提交" ></div>
  	 </form>
  </body>
</html>
