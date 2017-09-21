package com.claDao;

import java.util.List;
import com.PO.Cla;

public interface ClassDao {

	List<Cla> findCla(String hql);
	void saveOrUpdateCla(Cla cla);
	void deleteCla(Cla cla);
}
