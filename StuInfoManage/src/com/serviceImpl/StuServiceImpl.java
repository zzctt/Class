package com.serviceImpl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.PO.Stu;
import com.service.StuService;
import com.stuDao.StuDao;

@Component("StuService")
public class StuServiceImpl implements StuService {

	StuDao dao;
	
	public StuDao getDao() {
		return dao;
	}

	@Resource(name="StuDao")
	public void setDao(StuDao dao) {
		this.dao = dao;
	}

	public boolean saveStu(Stu stu) {
		// TODO Auto-generated method stub
		try 
		{
			dao.saveOrUpdateStu(stu);
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("´æ´¢Ê§°Ü:"+e);
			return false;
		}
		
	}

	public List<Stu> findStu() {
		// TODO Auto-generated method stub
		return (List<Stu>) dao.findStu("from Stu as model ");
	}

	public List<Stu> find(String type, Object value) {
		// TODO Auto-generated method stub
		return (List<Stu>) dao.findStu("from Stu as model where model."+type+"='"+value+"'");
	}

	public boolean deleteStu(Stu stu) {
		// TODO Auto-generated method stub
		try 
		{
			 dao.deleteStu(stu);
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			return false;
		}
	}

}
