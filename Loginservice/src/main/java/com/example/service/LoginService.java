package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Logindao;
import com.example.entity.StudentInfo;

@Service
public class LoginService implements LoginServiceImpl {

	@Autowired
	Logindao logindao;
	
	@Override
	public StudentInfo authentication(int stId,String mailid,String password) {
		return logindao.authentication(stId,mailid,password);
	}

}