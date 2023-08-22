package com.lambda;
import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

        // Sorting using lambda expression
        Collections.sort(fruits, (a, b) -> a.compareTo(b));

        fruits.forEach(System.out::println);
    }
}
