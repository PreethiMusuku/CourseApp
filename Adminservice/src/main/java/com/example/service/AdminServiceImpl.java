package com.example.service;

import java.util.List;

import com.example.entity.Course;

public interface AdminServiceImpl {
	public void addCourse(Course course);
	public List<Course> getAllCourses();
	public Course getCourseById(int courseId);
	public String removeCourseById(int courseId);
	public Course updateCourse(Course courseId);
}
