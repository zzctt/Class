<%@page import="com.PO.Course"
        import="com.PO.Stu"
        import="com.PO.Score"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'stuInfo.jsp' starting page</title>
    
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
  <h2 align="center">成绩统计</h2>
  <br>
  <br>
  <%
  	ArrayList<Stu> list1=(ArrayList<Stu>)request.getAttribute("stuList");
  	ArrayList<Course> list2=(ArrayList<Course>)request.getAttribute("coList");
  	ArrayList<Score> list3=(ArrayList<Score>)request.getAttribute("scList");
  	int allScore=0;
  	System.out.println(list1);
  	System.out.println(list2);
  	System.out.println(list3);
   %>
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
  			 <td>学分</td>
  		</tr>
  		
  			<%
  		for(int i=0;i<list1.size();i++)
  			{
  					%>
  						<tr><td><%=list1.get(i).getStuName() %></td>
  						<%
  						    allScore=0;
  							for(int j=0;j<list2.size();j++)
  							{
  							 %>
  			                   	<td>
  			                   <% 
  								for(int k=0;k<list3.size();k++)
  			                   {
  			                  
	  							  if(list3.get(k).getSId().equals(list1.get(i).getStuId())&&list3.get(k).getSCoId().equals(list2.get(j).getCoId()))
	  							  {
	  								 if(!list3.get(k).getSScore().equals(""))
	  								 {
		  									 if(Integer.parseInt(list3.get(k).getSScore())>=60)
		  									 {
		  									    System.out.println(i+","+j+","+Integer.parseInt(list3.get(k).getSScore()));
		  									 	allScore=allScore+ Integer.parseInt(list2.get(j).getCoScore());
		  									 	System.out.println(allScore);
		  									 	%> 
		  										    <%=list3.get(k).getSScore() %>	
		  									 	<% 
		  									 }
		  									 else
		  									 {
		  									 	%>
		  									 		<font color="red"><%=list3.get(k).getSScore() %></font>
		  									 	<%
		  									 }
	  								%>
	  								<%
	  								  }
	  							}		
  							  }
  							    %>
	  								</td>
	  							<%
  							}
  						 %>
  						 <td><%=allScore %></td>
  					 </tr>
  				<%
  				}
  			 %>
  		</table>
  </body>
</html>
