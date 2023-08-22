package com.lambda;
import java.util.*;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Paris", "Beijing");

        List<String> filteredCities = cities.stream()
            .filter(city -> city.length() > 5)
            .collect(Collectors.toList());

        filteredCities.forEach(System.out::println);
    }
}
