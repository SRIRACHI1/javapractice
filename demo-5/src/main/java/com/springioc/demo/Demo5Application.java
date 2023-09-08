package com.springioc.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageClient messageClient = context.getBean(MessageClient.class);
        messageClient.sendMessage("Hello, Dependency Injection with Spring!");
	}

}
