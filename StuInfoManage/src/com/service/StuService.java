package com.service;

import java.util.List;

import com.PO.Stu;

public interface StuService {

	boolean saveStu(Stu stu);
	boolean deleteStu(Stu stu);
	List<Stu> findStu();
	List<Stu> find(String type,Object value);
}
