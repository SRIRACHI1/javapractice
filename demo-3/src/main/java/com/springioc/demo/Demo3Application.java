package com.springioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		  ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);

	        // Get the School bean
	        School school = context.getBean(School.class);

	        // Print student information
	        school.printStudentInfo();
	}

}
