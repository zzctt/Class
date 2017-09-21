package com.score.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PO.Course;
import com.PO.Score;
import com.PO.Stu;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CourseService;
import com.service.ScoreService;
import com.service.StuService;

public class ReadyAdd extends ActionSupport implements RequestAware {

	Map<String, Object> map=new HashMap<String, Object>();
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	CourseService co=(CourseService)ctx.getBean("CourseService");
	StuService stu=(StuService)ctx.getBean("StuService");
	ScoreService sc=(ScoreService)ctx.getBean("ScoreService");
	
	public String execute() throws Exception
	{
		try 
		{
			List<Course>list1=co.findCo();
			map.put("list1", list1);
			List<Stu>list2=stu.findStu();
			map.put("list2", list2);
			List<Score>list3=sc.findScore();
			map.put("list3", list3);
			return "success";
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			return "error";
		}
		
	}
	
	public void setRequest(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.map=map;
	}
}
