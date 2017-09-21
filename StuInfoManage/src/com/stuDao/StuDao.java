package com.stuDao;

import java.util.List;

import com.PO.Stu;

public interface StuDao {
	
	void saveOrUpdateStu(Stu stu);
	List<Stu> findStu(String hql); 
	void deleteStu(Stu stu);

}
