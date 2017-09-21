package com.course.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PO.Course;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CourseService;

public class CoAdd extends ActionSupport{

	private String Co_id;
	private String Co_name;
	private String Co_nature;
	private String co_score;
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	CourseService co=(CourseService)ctx.getBean("CourseService");
	
	public String getCo_id() {
		return Co_id;
	}
	public void setCo_id(String co_id) {
		Co_id = co_id;
	}
	public String getCo_name() {
		return Co_name;
	}
	public void setCo_name(String co_name) {
		Co_name = co_name;
	}
	public String getCo_nature() {
		return Co_nature;
	}
	public void setCo_nature(String co_nature) {
		Co_nature = co_nature;
	}
	public String getCo_score() {
		return co_score;
	}
	public void setCo_score(String co_score) {
		this.co_score = co_score;
	}
		
	public String execute() throws Exception
	{
		if(co.saveCo(co()))
		{
			return "success";
		}
		else 
		{
			return "error";
		}
	}
	
	public Course co()
	{
		Course co=new Course();
		co.setCoId(this.getCo_id());
		co.setCoName(this.getCo_name());
		co.setCoNature(this.getCo_nature());
		co.setCoScore(this.getCo_score());
		return co;
	}
}
