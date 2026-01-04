package com.interviewQuestion_DSA_Java.Array_3.Easy;

import java.util.*;

public class CheckDuplicateElement {

    // 🔹 METHOD 1: HashSet (Best - O(n))
    static boolean checkDuplicateUsingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return true; // duplicate found
            }
        }
        return false;
    }

    // 🔹 METHOD 2: Sorting (O(n log n), O(1) extra space)
    static boolean checkDuplicateUsingSorting(int[] arr) {
        int[] copy = arr.clone(); // original array safe rahe
        Arrays.sort(copy);

        for (int i = 1; i < copy.length; i++) {
            if (copy[i] == copy[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // 🔹 METHOD 3: Brute Force (O(n²))
    static boolean checkDuplicateUsingBruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 🔹 METHOD 4: Print duplicate elements
    static void printDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                dup.add(num);
            }
        }

        if (dup.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicate elements: " + dup);
        }
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) {
        int[] arr = {6, 9, 23, 7, 9, 34, 65, 23, 2, 4};

        System.out.println("Using HashSet: " + checkDuplicateUsingHashSet(arr));
        System.out.println("Using Sorting: " + checkDuplicateUsingSorting(arr));
        System.out.println("Using Brute Force: " + checkDuplicateUsingBruteForce(arr));

        printDuplicates(arr);
    }
}
