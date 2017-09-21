package com.cla.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PO.Cla;
import com.service.ClaService;

public class ClaDelete {

	HttpServletRequest request=ServletActionContext.getRequest();
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	ClaService cla=(ClaService)ctx.getBean("ClaService");
	
	public String execute() throws Exception
	{
		String cId=(String) request.getParameter("cId");
		List<Cla> claList=cla.findCla("CId", cId);
		if(cla.deleteCla(claList.get(0)))
		{
			return "success";
		}
		else 
		{
			return "error";
		}
	}
}
