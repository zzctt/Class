package com.service;

import java.util.List;

import com.PO.Course;

public interface CourseService {

	boolean saveCo(Course co);
	boolean deleteCo(Course co);
	List<Course> findCo();
	List<Course> find(String type,Object value);
}
