package com.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.PO.Course;
import com.courseDao.CourseDao;
import com.service.CourseService;

@Component("CourseService")
public class CourseServiceImpl implements CourseService {

	CourseDao dao;
	
	public CourseDao getDao() {
		return dao;
	}

	@Resource(name="CourseDao")
	public void setDao(CourseDao dao) {
		this.dao = dao;
	}

	public boolean saveCo(Course co) {
		// TODO Auto-generated method stub
		try 
		{
			dao.saveOrUpdateCo(co);
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			return false;
		}
	}

	public boolean deleteCo(Course co) {
		// TODO Auto-generated method stub
		try 
		{
			dao.deleteCo(co);
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			return false;
		}
	}

	public List<Course> findCo() {
		// TODO Auto-generated method stub
		return (List<Course>)dao.findCo("from Course as model");
	}

	public List<Course> find(String type, Object value) {
		// TODO Auto-generated method stub
		return (List<Course>)dao.findCo("from Course as model where model."+type+"='"+value+"'");
	}

}
