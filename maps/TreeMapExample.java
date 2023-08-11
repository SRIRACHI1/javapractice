package com.practice.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>();
        
        treeMap.put("Ramya", 12);
        treeMap.put("Anil", 8);
        treeMap.put("honey", 15);
        
        // Iterating through the map
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

