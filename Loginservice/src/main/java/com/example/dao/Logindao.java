package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.StudentInfo;

public interface Logindao  extends JpaRepository<StudentInfo,Integer>
{
	@Query("select login from StudentInfo login  where stId=?1 and mailid=?2 and password=?3")
	public StudentInfo authentication(int stId,String mailid,String password);
	
}