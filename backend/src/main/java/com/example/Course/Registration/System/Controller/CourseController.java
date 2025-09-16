//package com.example.Course.Registration.System.Controller;
//
//import com.example.Course.Registration.System.Model.Course;
//import com.example.Course.Registration.System.Model.CourseRegistry;
//import com.example.Course.Registration.System.Service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class CourseController {
//    @Autowired
//    private CourseService courseService;
//
//    @GetMapping("courses")
//    public List<Course> getAllCourses() {
//        return courseService.getAllCourses();
//    }
//
//    @GetMapping("courses/enrolled")
//    public List<CourseRegistry> getAllCourseRegistry() {
//        return courseService.getAllCourseRegistry();
//    }
//
//    @PostMapping("courses/register")
//    public String enrollCourse(@RequestParam("name")String name,
//                               @RequestParam("mailId") String emailId,
//                               @RequestParam("courseRegistered") String courseName) {
//        courseService.enrollCourse(name, emailId, courseName);
//        return "Congartulation " + name + " Your" + courseName + " Course Was Registered";
//    }
//}
//
//
//
//
//
package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get all available courses
    @GetMapping("courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Get all registered students
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> getAllCourseRegistry() {
        return courseService.getAllCourseRegistry();
    }

    // Register a new course using RequestParam
    @PostMapping("courses/register")
    public String enrollCourse(
            @RequestParam("name") String name,
            @RequestParam("mailId") String emailId,
            @RequestParam("courseRegistered") String courseName) {

        courseService.enrollCourse(name, emailId, courseName);

        return "Congratulations " + name +
                ", your " + courseName + " course was registered!";
    }
}

