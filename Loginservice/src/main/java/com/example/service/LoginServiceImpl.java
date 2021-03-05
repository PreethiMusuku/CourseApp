package com.example.service;

import java.util.List;

import com.example.entity.StudentInfo;

public interface LoginServiceImpl {

	StudentInfo authentication(int stId, String mailid,String password);


}