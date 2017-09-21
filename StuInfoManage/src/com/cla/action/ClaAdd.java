package com.cla.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PO.Cla;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ClaService;

public class ClaAdd extends ActionSupport {

	private String C_id;
	private String C_name;
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	ClaService cla=(ClaService)ctx.getBean("ClaService");
	
	public ClaService getCla() {
		return cla;
	}
	public void setCla(ClaService cla) {
		this.cla = cla;
	}
	
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	
	public String execute() throws Exception {
		
		if(cla.saveOrUpdateCla(cla()))
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
	
	public Cla cla()
	{
		Cla cla=new Cla();
		cla.setCId(this.getC_id());
		cla.setCName(this.getC_name());
		return cla;
     }
}