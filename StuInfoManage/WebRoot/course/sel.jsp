<%@ page language="java" import="java.util.*" import="com.PO.Course" import="java.util.ArrayList" pageEncoding="utf-8"%>
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
  <script type="text/javascript" src="js/jquery-1.4.js"></script>
  <script type="text/javascript">
  	$(function(){
  		
  		$("#delete").click(function(){
  			
  		});
  	});
  	

  </script>
    <body>
    <%
        ArrayList<Course>coList=(ArrayList<Course>)request.getAttribute("coList");
        System.out.println(coList);
     %>
	  <br><br>
	  <table border="1" cellspacing="0" align="center">
	    	<tr>
	    		<td>课程号</td><td>课程名</td><td>性质</td><td>学分</td><td align="center">操作</td>    	
	    	</tr>
			  <%
			  	for(Course co : coList)
			  	{
			  		%>
			 <tr>
			  	<td><%=co.getCoId() %></td><td><%=co.getCoName() %></td>
			  	<td><%=co.getCoNature() %></td><td><%=co.getCoScore() %></td>
			  	<td><a href="course/update.jsp?coId=<%=co.getCoId() %>&coName=<%=co.getCoName() %>
			  	&coNature=<%=co.getCoNature() %>&coScore=<%=co.getCoNature() %>">修改</a>
			  	<a href="course/coDelete.action?coId=<%=co.getCoId()%>">删除
			  		<!-- <script>
			  		var document
			  		$.ajax({  
                    type : "POST",  //提交方式  
                    url : "${pageContext.request.contextPath}/org/doDelete.action",//路径  
                    data : {  
                        "org.id" : "  
                    },//数据，这里使用的是Json格式进行传输  
                    success : function(result) {//返回数据根据结果进行相应的处理  
                        if ( result.success ) {  
                            $("#tipMsg").text("删除数据成功");  
                            tree.deleteItem("${org.id}", true);  
                        } else {  
                            $("#tipMsg").text("删除数据失败");  
                        }  
                    },
                    error : function(data){
                    
                    }  
                });  
			  		</script> -->
			  	</a></td>
			  </tr>
			  		<% 
			  	} 
			  %>
	    
	    </table>
  </body>
</html>
