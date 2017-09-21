package com.claDao;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.PO.Cla;

@Component("ClassDao")
public class ClassDaoImpl implements ClassDao {
	
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<Cla> findCla(String hql) {
		// TODO Auto-generated method stub
		return (List<Cla>) getHibernateTemplate().find(hql);
	}

	public void saveOrUpdateCla(Cla cla) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(cla);
	}

	public void deleteCla(Cla cla) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(cla);
	}

}
