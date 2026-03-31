package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
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
