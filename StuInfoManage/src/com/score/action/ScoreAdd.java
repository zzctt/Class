package com.score.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PO.Course;
import com.PO.Score;
import com.PO.Stu;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CourseService;
import com.service.ScoreService;
import com.service.StuService;

public class ScoreAdd extends ActionSupport {

	HttpServletRequest request=ServletActionContext.getRequest();
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	ScoreService sco=(ScoreService)ctx.getBean("ScoreService");
	StuService stu=(StuService) ctx.getBean("StuService");
	CourseService  co=(CourseService) ctx.getBean("CourseService");
	
	public String execute() throws Exception
	{
		int count=0;
		Score sc=new Score();
		List<Course> coList=(List<Course>)co.findCo();
		List<Stu> stuList=(List<Stu>)stu.findStu();
		String [] score=request.getParameterValues("score");
		System.out.println(score.length);
		try 
		{
			for(int i=0;i<stuList.size();i++)
			{
				for(int j=0;j<coList.size();j++)
				{
					sc.setSId(stuList.get(i).getStuId());
					System.out.println("第"+count+"条数据,"+stuList.get(i).getStuId());
					sc.setSCoId(coList.get(j).getCoId());
					System.out.println(count+","+coList.get(j).getCoId());
					sc.setSScore(score[count]);
					System.out.println(score[count]);
					sc.setSPk(stuList.get(i).getStuId()+","+coList.get(j).getCoId());
					sco.saveOrUpdateScore(sc);
					count++;
					
				}
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
