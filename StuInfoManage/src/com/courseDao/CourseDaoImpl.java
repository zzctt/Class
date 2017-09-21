package com.courseDao;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.PO.Course;

@Component("CourseDao")
public class CourseDaoImpl implements CourseDao {

	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
    @Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveOrUpdateCo(Course co) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(co);
	}

	@SuppressWarnings("unchecked")
	public List<Course> findCo(String hql) {
		// TODO Auto-generated method stub
		return (List<Course>) getHibernateTemplate().find(hql);
	}

	public void deleteCo(Course co) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(co);
		
	}

}
