package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Course;
import com.example.entity.StudentInfo;
@Repository
public interface Studentdao extends JpaRepository<StudentInfo, Integer> {
@Query("select course from StudentInfo course where stName=?1")
	StudentInfo findCourse(String stName);

}

