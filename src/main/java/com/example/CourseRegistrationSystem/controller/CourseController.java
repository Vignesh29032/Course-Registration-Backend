package com.example.CourseRegistrationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.service.CourseService;
@CrossOrigin(origins = "https://courseregistryy.netlify.app")
@RestController
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping("courses")
    public List<Course>  availablecourses(){
        return service.availablecourse();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledstudents(){
        return service.enrolledstudents();
    }

    @PostMapping("courses/register")
    public String enrolleCourse(@RequestParam("name") String name,
                                @RequestParam("emailId") String emailId,
                                @RequestParam String coursename){
        service.enrollcourse(name,emailId,coursename);
        return "Congratulation! "+name+" Enrollment Succefull for "+coursename;

    }

}
