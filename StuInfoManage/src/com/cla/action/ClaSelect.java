package com.cla.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PO.Cla;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ClaService;

public class ClaSelect extends ActionSupport implements RequestAware {

	private Map<String, Object> map=new HashMap<String, Object>();
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	ClaService cla=(ClaService)ctx.getBean("ClaService");
	
	public String execute() throws Exception
	{
		try 
		{
			List<Cla> claList=cla.findCla();
			map.put("claList", claList);
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
