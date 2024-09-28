package com.interviewQuestion_DSA_Java.Searching_4;

import java.util.Arrays;

public class SearchTechniques {

    // Function to display the array elements
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    // Linear Search
    // Time Complexity: O(n)
    public static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    // Binary Search (array must be sorted)
    // Time Complexity: O(log n)
    public static boolean binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    // Jump Search (array must be sorted)
    // Time Complexity: O(√n)
    public static boolean jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return false;
            }
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 10, 30, 33, 50, 60, 65, 70};
        int key = 30;

        // Display the array
        display(arr);

        // Linear Search
     //   boolean isFound = linearSearch(arr, key);
//        System.out.println(isFound ? "Element found using Linear Search." : "Element not found using Linear Search.");

        // Binary Search
       boolean isFound = binarySearch(arr, key);
        System.out.println(isFound ? "Element found using Binary Search." : "Element not found using Binary Search.");
//
//        // Jump Search
//        isFound = jumpSearch(arr, key);
//        System.out.println(isFound ? "Element found using Jump Search." : "Element not found using Jump Search.");
    }
}
