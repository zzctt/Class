package com.scoreDao;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.PO.Score;

@Component("ScoreDao")
public class ScoreDaoImpl implements ScoreDao {

	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveOrUpdateScore(Score score) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(score);
	}

	@SuppressWarnings("unchecked")
	public List<Score> findScore(String hql) {
		// TODO Auto-generated method stub
		return (List<Score>) getHibernateTemplate().find(hql);
	}

	public void deleteScore(Score score) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(score);
	}

}
