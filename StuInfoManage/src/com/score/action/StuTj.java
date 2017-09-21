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

@SuppressWarnings("serial")
public class StuTj extends ActionSupport implements RequestAware {

	Map<String, Object> map=new HashMap<String, Object>();
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	CourseService co=(CourseService)ctx.getBean("CourseService");
	StuService stu=(StuService)ctx.getBean("StuService");
	ScoreService sc=(ScoreService)ctx.getBean("ScoreService");
	
	public String execute() throws Exception
	{
		List<Course> coList=co.findCo();
		List<Stu> stuList=stu.findStu();
		List<Score> scList=sc.findScore();
		map.put("coList", coList);
		map.put("stuList", stuList);
		map.put("scList", scList);
		return "success";
	}

	public void setRequest(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.map=map;
	}
}
