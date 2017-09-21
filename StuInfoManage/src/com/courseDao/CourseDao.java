package com.courseDao;

import java.util.List;
import com.PO.Course;

public interface CourseDao {

	void saveOrUpdateCo(Course co);
	List<Course> findCo(String hql); 
	void deleteCo(Course co);

	}


