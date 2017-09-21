<%@ page language="java" import="java.util.*" import="com.PO.Course" import="com.PO.Score" import="com.PO.Stu" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'courseInfo.jsp' starting page</title>
    
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
  <h2 align="center">课程统计</h2>
  <br>
  <br>
  	<table border="1" cellspacing="0" align="center">
  		<tr>
  			<td>课程名</td><td>最低分</td><td>平均分</td><td>最高分</td>
  		</tr>
    <%
    	 int minScore=100;
	     int maxScore=0;
		 int nulldeal=0;
		 int num=0;
		 float averageScore=0;
    	ArrayList<Course> coList=(ArrayList<Course>)request.getAttribute("coList");
    	ArrayList<Score> scList=(ArrayList<Score>)request.getAttribute("scList");
    	ArrayList<Stu> stuList=(ArrayList<Stu>)request.getAttribute("stuList");
    	for(Course co : coList)
    	{
    	    %>
				<tr><td><%=co.getCoName() %></td>
			<%
			 minScore=100;
			 maxScore=0;
			 nulldeal=0;
			 num=0;
			 averageScore=0;
			for(Score sc : scList)
			{
				if(co.getCoId().equals(sc.getSCoId()))
				{
					System.out.println(sc.getSScore());
					if(sc.getSScore().equals(""))
					{
						minScore=nulldeal;
						num=num+nulldeal;
					}
					else
					{
						//最高分
						if(Integer.parseInt(sc.getSScore())>maxScore)
						{
							maxScore=Integer.parseInt(sc.getSScore());
						}
						//最低分
						if(Integer.parseInt(sc.getSScore())<minScore)
						{
							minScore=Integer.parseInt(sc.getSScore());
						}
						num=num+Integer.parseInt(sc.getSScore());
						if(stuList.size()!=0)
						{
							averageScore=(float)num/(float)stuList.size();
						}
					
					}	
				}
				
			}
			%>
				<td><%=minScore %></td><td><%=averageScore %></td><td><%=maxScore %></td>    
			</tr>
			<% 	
 	   	}
     %>
     </table>
  </body>
</html>
