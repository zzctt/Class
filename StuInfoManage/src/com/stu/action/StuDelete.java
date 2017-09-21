package com.stu.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PO.Score;
import com.PO.Stu;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ScoreService;
import com.service.StuService;

public class StuDelete extends ActionSupport {
	
	HttpServletRequest request=ServletActionContext.getRequest();
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	StuService stu=(StuService)ctx.getBean("StuService");
	ScoreService sc=(ScoreService)ctx.getBean("ScoreService");
	
	public StuService getStu() {
		return stu;
	}

	public void setStu(StuService stu) {
		this.stu = stu;
	}

	public String execute() throws Exception
	{
		String Stu_id=(String) request.getParameter("StuId");
		try 
		{
			System.out.println("1");
			List<Stu> stuList=stu.find("stuId", Stu_id);
			List<Score> scList=sc.find("SId", Stu_id);
		    stu.deleteStu(stuList.get(0));
		    for(Score sc1 : scList)
			{
				sc.deleteScore(sc1);
			}
		    return "success";
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
			return "error";
		}
			
	}
}
