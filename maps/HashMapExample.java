package com.practice.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs
        hashMap.put("Leo", 25);
        hashMap.put("Ramya", 30);
        hashMap.put("Chinnu", 28);
        
        // Accessing values
        int age = hashMap.get("Alice");
        System.out.println("Alice's age: " + age);
        
        // Iterating through the map
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

