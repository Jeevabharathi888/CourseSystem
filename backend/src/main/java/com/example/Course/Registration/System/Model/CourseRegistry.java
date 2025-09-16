package com.example.Course.Registration.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;
    private String name;
    private String mailId;
    private String courseRegistered;


    public CourseRegistry(String name, String mailId, String courseRegistered) {
        this.name = name;
        this.mailId = mailId;
        this.courseRegistered = courseRegistered;
    }
    public CourseRegistry()
    {

    }

}
