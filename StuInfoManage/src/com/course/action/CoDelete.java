package com.course.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PO.Course;
import com.PO.Score;
import com.service.CourseService;
import com.service.ScoreService;

public class CoDelete {
	
	HttpServletRequest request=ServletActionContext.getRequest();
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	CourseService co=(CourseService)ctx.getBean("CourseService");
	ScoreService sc=(ScoreService)ctx.getBean("ScoreService");
	
	public CourseService getCo() {
		return co;
	}
	public void setCo(CourseService co) {
		this.co = co;
	}
	
	public String execute() throws Exception
	{
		String coId=(String) request.getParameter("coId");
		try 
		{
			List<Course>coList=co.find("coId", coId);
			List<Score>scList=sc.find("SCoId",coId);
			co.deleteCo(coList.get(0));
			for(Score sc1 : scList)
			{
				sc.deleteScore(sc1);
			}
			return "success";
		} 
		catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}
	
}
