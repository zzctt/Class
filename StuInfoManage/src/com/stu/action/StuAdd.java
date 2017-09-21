package com.stu.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PO.Stu;
import com.opensymphony.xwork2.ActionSupport;
import com.service.StuService;

public class StuAdd extends ActionSupport {
	
	private String Stu_id;
	private String Stu_C_id;
	private String Stu_name;
	private String Stu_sex;
	private String Stu_birth;
	private String Stu_address;
	private String Stu_phonenumber;
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	StuService stu=(StuService)ctx.getBean("StuService");
	
	public StuService getStu() {
		return stu;
	}


	public void setStu(StuService stu) {
		this.stu = stu;
	}
	
	public String getStu_id() {
		return Stu_id;
	}

	public void setStu_id(String stu_id) {
		Stu_id = stu_id;
	}

	public String getStu_C_id() {
		return Stu_C_id;
	}

	public void setStu_C_id(String stu_C_id) {
		Stu_C_id = stu_C_id;
	}

	public String getStu_name() {
		return Stu_name;
	}

	public void setStu_name(String stu_name) {
		Stu_name = stu_name;
	}

	public String getStu_sex() {
		return Stu_sex;
	}

	public void setStu_sex(String stu_sex) {
		Stu_sex = stu_sex;
	}

	public String getStu_birth() {
		return Stu_birth;
	}

	public void setStu_birth(String stu_birth) {
		Stu_birth = stu_birth;
	}

	public String getStu_address() {
		return Stu_address;
	}

	public void setStu_address(String stu_address) {
		Stu_address = stu_address;
	}

	public String getStu_phonenumber() {
		return Stu_phonenumber;
	}

	public void setStu_phonenumber(String stu_phonenumber) {
		Stu_phonenumber = stu_phonenumber;
	}

	public String  execute() throws Exception
	{
		if(stu.saveStu(stu()))
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
	public Stu stu()
	{
		Stu stu=new Stu();
		stu.setStuId(this.getStu_id());
		stu.setStuCId(this.getStu_C_id());
		stu.setStuName(this.getStu_name());
		stu.setStuSex(this.getStu_sex());
		stu.setStuBirth(this.getStu_birth());
		stu.setStuAddress(this.getStu_address());
		stu.setStuPhonenumber(this.getStu_phonenumber());
		stu.setStuPassword("");
		return stu;
	}
}
