package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Repository.CourseRegistryRepository;
import com.example.Course.Registration.System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegistryRepository courseRegistryRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<CourseRegistry> getAllCourseRegistry() {
        return courseRegistryRepository.findAll();
    }
    
    public void enrollCourse(String name, String mailId, String courseRegistered) {
        CourseRegistry courseRegistry = new CourseRegistry(name,mailId,courseRegistered);
        courseRegistryRepository.save(courseRegistry);

    }}

