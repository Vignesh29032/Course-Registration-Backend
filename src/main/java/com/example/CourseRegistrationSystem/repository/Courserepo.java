package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepo extends JpaRepository<Course,String> {
}
