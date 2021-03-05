package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.StudentInfo;
import com.example.exception.InvalidDetailsException;
import com.example.service.LoginService;

@RestController
@CrossOrigin("http://localhost:4200")
public class LoginController
{
    
	@Autowired
	LoginService loginservice;
	/*Login using id and password*/
	@GetMapping(value="/Login/{enter-stid}/{mailid}/{password}")
	public String authentication(@PathVariable ("enter-stid") int stId,@PathVariable("mailid") String mailid,@PathVariable("password") String password ) 
	{
		StudentInfo loginobj=loginservice.authentication(stId,mailid,password);
		return "login successful";
//		if(loginobj!=null)
//		{
//		return "login successful" ;
//		}
//		else
//		{
//			throw new InvalidDetailsException("No records found with the given login credentials!!!");
//
//		}
//		
	}
	
	}