package com.serviceImpl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.PO.Cla;
import com.claDao.ClassDao;
import com.service.ClaService;

@Component("ClaService")
public class ClaServiceImpl implements ClaService {

	ClassDao dao;
	
	public ClassDao getDao() {
		return dao;
	}

	@Resource(name="ClassDao")
	public void setDao(ClassDao dao) {
		this.dao = dao;
	}

	public boolean saveOrUpdateCla(Cla cla) {
		// TODO Auto-generated method stub
		try 
		{
			dao.saveOrUpdateCla(cla);
			return true;
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			return false;
		}
	}

	public boolean deleteCla(Cla cla) {
		// TODO Auto-generated method stub
		try 
		{
			dao.deleteCla(cla);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public List<Cla> findCla() {
		// TODO Auto-generated method stub
		return (List<Cla>) dao.findCla("from Cla as model");
	}

	public List<Cla> findCla(String type, Object value) {
		// TODO Auto-generated method stub
		return (List<Cla>) dao.findCla("from Cla as model where model."+type+"='"+value+"'");
	}

}
