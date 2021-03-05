package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDao;
import com.example.entity.Course;
@Service
@Transactional
public class AdminService implements AdminServiceImpl{

	@Autowired
	 AdminDao admindao;
	@Override
	public Course getCourseById(int courseId) {
		return admindao.findOne(courseId);
	}
	@Override
	public void addCourse(Course course) {
		admindao.save(course);
	}
	@Override
	public List<Course> getAllCourses() {
		return admindao.findAll();
	}
	@Override
	public Course updateCourse(Course course) {
       Course updateCourse=course;

	return admindao.save(updateCourse);
	}
	@Override
	public String removeCourseById(int courseId) {
	admindao.delete(courseId);
	return "Course with Id"+courseId+"deleted";

	}

}
