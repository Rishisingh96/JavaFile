package com.Java_8_17_21.InterviewQ;

import java.util.*;
import java.util.stream.Collectors;

public class Day1 {
    public static void main(String[] args) {
        // Sample data
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rishi", 22);
        map.put("Ravi", 23);
        map.put("Rohan", 18);
        map.put("Saloni", 17);
        map.put("Mohan", 26);
        map.put("Garima", 15);
        map.put("Sohan", 28);
        map.put("Mohit", 69);
        map.put("Raju", 61);

        System.out.println("Original Map: " + map);
        System.out.println("--------------------------------------------------");

        // 1. Using Stream API (Lambda)
        System.out.println("1. Using Stream API (Lambda):");
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 20 && entry.getValue() < 60)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        System.out.println("--------------------------------------------------");

        // 2. Using For-Each Loop
        System.out.println("2. Using For-Each Loop:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 20 && entry.getValue() < 60) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        System.out.println("--------------------------------------------------");

        // 3. Using StringBuilder
        System.out.println("3. Using StringBuilder:");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 20 && entry.getValue() < 60) {
                sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
            }
        }
        System.out.print(sb.toString());
        System.out.println("--------------------------------------------------");

        // 4. Using Iterator
        System.out.println("4. Using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() > 20 && entry.getValue() < 60) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        System.out.println("--------------------------------------------------");

        // 5. Using Streams to collect filtered map
        System.out.println("5. Using Stream to collect filtered map:");
        Map<String, Integer> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 20 && entry.getValue() < 60)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered Map: " + filteredMap);
        System.out.println("--------------------------------------------------");

        // 6. Using removeIf (on copy map)
        System.out.println("6. Using removeIf (on copy map):");
        Map<String, Integer> copyMap = new HashMap<>(map); // Clone to preserve original
        copyMap.entrySet().removeIf(entry -> !(entry.getValue() > 20 && entry.getValue() < 60));
        System.out.println("After removeIf: " + copyMap);
        System.out.println("--------------------------------------------------");

        // 7. Using forEach Lambda
        System.out.println("7. Using forEach Lambda:");
        map.forEach((key, value) -> {
            if (value > 20 && value < 60) {
                System.out.println(key + " " + value);
            }
        });
        System.out.println("--------------------------------------------------");

        // 8. Count Example
        long count = map.values().stream().filter(age -> age > 20).count();
        System.out.println("8. Count of users older than 20: " + count);
    }
}

