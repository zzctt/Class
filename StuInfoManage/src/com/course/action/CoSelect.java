package com.course.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PO.Course;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CourseService;

public class CoSelect extends ActionSupport implements RequestAware{

	private Map<String, Object> map=new HashMap<String, Object>();
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	CourseService co=(CourseService)ctx.getBean("CourseService");
	
	public CourseService getCo() {
		return co;
	}

	public void setCo(CourseService co) {
		this.co = co;
	}

	public String execute() throws Exception
	{
		try 
		{
			List<Course> coList=co.findCo();
			map.put("coList", coList);
			return "success";
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e+"111");
			return "error";
		}
	}

	public void setRequest(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.map=map;
	}
}
