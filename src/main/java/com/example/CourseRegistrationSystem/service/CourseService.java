package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.repository.CourseRegistryRepo;
import com.example.CourseRegistrationSystem.repository.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    Courserepo courserepository;

    @Autowired
    CourseRegistryRepo registryRepo;

    public List<Course> availablecourse() {
            return courserepository.findAll();
    }

    public List<CourseRegistry> enrolledstudents() {
            return registryRepo.findAll();
    }

    public void enrollcourse(String name, String emailId, String coursename) {
            CourseRegistry courseRegistry=new CourseRegistry(name,emailId,coursename);
            registryRepo.save(courseRegistry);
    }
}
