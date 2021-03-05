package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Course;
import com.example.service.AdminService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {
	@Autowired
	AdminService adminservice;
	@GetMapping("/findCourse/{courseId}")
	public Course findById(@PathVariable int courseId)
	{
		return adminservice.getCourseById(courseId);
	}
	@PostMapping("/AddCourse")
	public String addCourse(@RequestBody Course course)
	{
		adminservice.addCourse(course);
		return "Course Added Successfully";
				
	}
	@GetMapping("/findAll")
	public List<Course> findById()
	{
		return adminservice.getAllCourses();
	}
	@PutMapping("/updatecourse")
	public Course updatecourse(@RequestBody Course course)
	{
		return adminservice.updateCourse(course);
	
	}
	@DeleteMapping("/deletecourse/{courseId}")
	public String removeById(@PathVariable int courseId)
	{
		return adminservice.removeCourseById(courseId);
	}
}
