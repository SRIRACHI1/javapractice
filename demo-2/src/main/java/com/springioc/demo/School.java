package com.springioc.demo;

public class School {
	
	private Student student;
	
	public Student getStudent(){
		return student;
	}
	
	 public void setStudent(Student student){
		this.student=student;
	}
	
	public void printStudentInfo() {
		System.out.println("Student Name: "+student.getName());
	}

}
