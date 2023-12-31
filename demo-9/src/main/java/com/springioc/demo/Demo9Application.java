package com.springioc.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo9Application {

	 public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        HelloWorld helloWorld = context.getBean(HelloWorld.class);
	        helloWorld.sayHello();
	    }
}
