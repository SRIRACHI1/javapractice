package com.practice.maps;

import java.util.HashMap;
import java.util.Map;

public class StudentGradesExample {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();
        
        studentGrades.put("Tommy", 89.5);
        studentGrades.put("Sam", 75.0);
        studentGrades.put("David", 92.3);
        
        String studentName = "Bob";
        if (studentGrades.containsKey(studentName)) {
            double grade = studentGrades.get(studentName);
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println(studentName + " not found in the records.");
        }
    }
}
