package com.interviewQuestion_DSA_Java.Array_3.Easy;

import java.util.*;
import java.util.stream.Collectors;

public class FindUniqueNumber {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 1, 2, 3};
//        int result = 0;
        // XOR operation Time complexity O(n)
       /* for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result);*/

        // Another way to find unique  Time complexity O(n^2)
      int [] arr = {1, 5,2, 3, 2, 4, 1, 2, 3};
      /*    int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(arr[i]);
                break;
            }
            count = 0;
        }
*/
        // Another way to find unique  Time complexity O(n^2)
/*
        List<Integer> list = Arrays.asList(1, 5, 2, 3, 2, 4, 1, 2, 3);
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) == 1){
                System.out.println(list.get(i));
                break;
            }
        }
*/

        // 1. Brute Force Method 1 (Using Two Loops)
        /*System.out.println("Unique Values:");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }*/

        //2. Brute Force Method 2 (Using Arrays.sort and Binary Search)
      /*  Arrays.sort(arr); // Sort the array
        System.out.println("Unique Values:");
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                System.out.print(arr[i] + " ");
            }
        }*/
        //3. Brute Force Method 3 (Using Frequency Array)

       /* int max = Integer.MIN_VALUE;

        // Find the maximum value in the array
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Create a frequency array
        int[] frequency = new int[max + 1]; // assuming positive values only

        // Count occurrences
        for (int num : arr) {
            frequency[num]++;
        }

        System.out.println("Unique Values:");
        // Print elements that appear only once
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 1) {
                System.out.print(i + " ");
            }
        }*/

      //  Optimized Method 1 (Using HashMap for Counting Occurrences)
/*
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Unique Values:");
        // Print elements that have a frequency of 1
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }*/


        //Optimized Method 3 (Using Java Streams - Java 8+)

        // Convert array to List
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // Find unique values using streams
        List<Integer> uniqueValues = list.stream()
                .filter(n -> Collections.frequency(list, n) == 1)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique Values: " + uniqueValues);
    }
}
