package com.practice.maps;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookExample {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        
        phoneBook.put("Anil", "123-456-7890");
        phoneBook.put("Honey", "987-654-3210");
        phoneBook.put("Jasho", "555-555-5555");
        
        String name = "Anil";
        if (phoneBook.containsKey(name)) {
            String phoneNumber = phoneBook.get(name);
            System.out.println(name + ": " + phoneNumber);
        } else {
            System.out.println(name + " not found in the phone book.");
        }
    }
}
