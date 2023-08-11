package com.practice.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // Adding key-value pairs
        linkedHashMap.put("Apple", 5);
        linkedHashMap.put("Banana", 3);
        linkedHashMap.put("Cherry", 8);
        
        // Iterating through the map
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

