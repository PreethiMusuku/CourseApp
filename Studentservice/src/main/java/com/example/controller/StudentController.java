package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Course;
import com.example.entity.StudentInfo;
import com.example.service.StudentService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {
	@Autowired
	StudentService studentservice;

	@GetMapping("/viewAllcourses")
	public List<Course> findBy()
	{
		return studentservice.getAllCourses();
	}

	@PostMapping("/RegisterCourse")
	public String addCourse(@RequestBody StudentInfo info)
	{
		studentservice.addCourse(info);
		return "Registered a course";
				
	}

	@GetMapping("/findRegCourse/{stId}")
	public StudentInfo findById(@PathVariable int stId)
	{
		return studentservice.getRegCourseById(stId);
	}
	
}
