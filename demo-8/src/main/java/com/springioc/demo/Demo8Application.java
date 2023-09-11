package com.springioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo8Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        // Get the math service bean from the Spring container
        MathService mathService = (MathService) context.getBean("mathService");

        // Perform mathematical operations
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + mathService.add(a, b));
        System.out.println("Subtraction: " + mathService.subtract(a, b));
        System.out.println("Multiplication: " + mathService.multiply(a, b));
        System.out.println("Division: " + mathService.divide(a, b));	}

}
