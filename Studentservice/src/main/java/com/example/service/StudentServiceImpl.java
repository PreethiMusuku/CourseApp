package com.example.service;

import java.util.List;

import com.example.entity.Course;
import com.example.entity.StudentInfo;

public interface StudentServiceImpl {
	public void addCourse(StudentInfo info);
	public List<Course> getAllCourses();
	public StudentInfo getRegCourseById(int stId);
	
}
