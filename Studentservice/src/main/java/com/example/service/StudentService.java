package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Coursedao;
import com.example.dao.Studentdao;
import com.example.entity.Course;
import com.example.entity.StudentInfo;
@Service
@Transactional
public class StudentService implements StudentServiceImpl{
@Autowired
Studentdao stdao;
@Autowired
Coursedao coursedao;
@Override
public List<Course> getAllCourses() {
	return coursedao.findAll();
}
@Override
public void addCourse(StudentInfo info) {
	StudentInfo studentdetails=stdao.findCourse(info.getStName());
	if(studentdetails!=null) {
		studentdetails.getRegisterdlist().addAll(info.getRegisterdlist());
	}
//if(stdao.findOne(info.getStId()) != null) {
//	System.out.println("if loop");
//	System.out.println(stdao.findOne(info.getStId()).getRegisterdlist().addAll(info.getRegisterdlist()));
//}
else
		stdao.save(info);
}
@Override
public StudentInfo getRegCourseById(int stId) {
	return stdao.findOne(stId);
}
}
