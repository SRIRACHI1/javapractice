package com.springioc.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo4Application {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

	        School school = (School) context.getBean("school");

	        school.printStudentInfo();
	}

}
