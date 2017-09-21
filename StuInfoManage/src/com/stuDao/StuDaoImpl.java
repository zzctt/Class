package com.stuDao;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.PO.Stu;

@Component("StuDao")
public class StuDaoImpl implements StuDao {

	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void saveOrUpdateStu(Stu stu) {
		// TODO Auto-generated method stub
			getHibernateTemplate().saveOrUpdate(stu);
	}

	@SuppressWarnings("unchecked")
	public List<Stu> findStu(String hql) {
		// TODO Auto-generated method stub
		return  (List<Stu>)getHibernateTemplate().find(hql);
	}

	public void deleteStu(Stu stu) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(stu);
		
	}

}
