package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie","Alice", "David","Bob");

        // Using anonymous class
        Collections.sort(names, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        for (String name : names) {
            System.out.println(name);
        }

        // Using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        for (String name : names) {
            System.out.println(name);
        }

        // Using method reference
        Collections.sort(names, String::compareTo);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
