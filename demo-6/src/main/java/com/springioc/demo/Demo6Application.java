package com.springioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo6Application {

	    public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        BookController controller = context.getBean(BookController.class);

	        // Add some books
	        controller.addBook("The Great Gatsby", "F. Scott Fitzgerald");
	        controller.addBook("To Kill a Mockingbird", "Harper Lee");
	        controller.addBook("1984", "George Orwell");

	        System.out.println("List of Books:");
	        for (Book book : controller.getAllBooks()) {
	            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
	        }
	    }


}
