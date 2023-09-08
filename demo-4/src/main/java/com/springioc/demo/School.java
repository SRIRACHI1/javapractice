package com.springioc.demo;

public class School {

	 private final Student student;

	    public School(Student student) {
	        this.student = student;
	    }

	    public void printStudentInfo() {
	        System.out.println("Student Name: " + student.getName());
	    }
    
}
