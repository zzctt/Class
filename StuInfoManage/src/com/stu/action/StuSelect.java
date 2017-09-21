package com.stu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PO.Stu;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StuService;

public class StuSelect extends ActionSupport implements RequestAware {
	
	private Map<String, Object> map=new HashMap<String, Object>();
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	StuService stu=(StuService)ctx.getBean("StuService");
	
	public StuService getStu() {
		return stu;
	}
	public void setStu(StuService stu) {
		this.stu = stu;
	}
	
	public String execute() throws Exception
	{
		try 
		{
			List<Stu>stuList=stu.findStu();
			map.put("stuList",stuList);
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
