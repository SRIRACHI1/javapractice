package com.springioc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("Chinta");
        return student;
    }

    @Bean
    public School school() {
        School school = new School();
        school.setStudent(student()); // Inject the student bean
        return school;
    }

}
