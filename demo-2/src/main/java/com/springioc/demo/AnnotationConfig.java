package com.springioc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
	
	@Bean
	public Student student() {
		Student student = new Student();
		student.setName("Ramya");
		return student;
	}
	@Bean
	public School school() {
		School school = new School();
		school.setStudent(student());
		return school;
	}

}
