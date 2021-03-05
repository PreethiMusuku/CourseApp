package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Course;
@Repository
public interface Coursedao extends JpaRepository<Course, Integer> {

}
