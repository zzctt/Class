package com.serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.PO.Score;
import com.scoreDao.ScoreDao;
import com.service.ScoreService;

@Component("ScoreService")
public class ScoreServiceImpl implements ScoreService {

	ScoreDao dao;

	public ScoreDao getDao() {
		return dao;
	}

	@Resource(name="ScoreDao")
	public void setDao(ScoreDao dao) {
		this.dao = dao;
	}

	public boolean saveOrUpdateScore(Score score) {
		// TODO Auto-generated method stub
		try 
		{
			dao.saveOrUpdateScore(score);
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}

	public List<Score> findScore() {
		// TODO Auto-generated method stub
		return (List<Score>) dao.findScore("from Score as model");
	}

	public boolean deleteScore(Score score) {
		// TODO Auto-generated method stub
		try 
		{
			dao.deleteScore(score);
			return true;
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			return false;
		}
	}

	public List<Score> find(String type, Object value) {
		// TODO Auto-generated method stub
		return (List<Score>) dao.findScore("from Score as model where model."+type+"='"+value+"'");
	}

}
