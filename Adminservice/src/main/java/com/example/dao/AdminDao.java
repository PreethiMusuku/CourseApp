package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Course;

public interface AdminDao extends JpaRepository<Course, Integer> {


}

