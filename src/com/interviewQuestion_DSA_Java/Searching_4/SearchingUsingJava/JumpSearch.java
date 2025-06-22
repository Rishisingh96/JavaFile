package com.interviewQuestion_DSA_Java.Searching_4.SearchingUsingJava;

/*3. Jump Search
Time Complexity:

Best Case: O(1)

Average/Worst: O(√n)

Use Case:

Jab array sorted ho

Jab memory access expensive ho (like external memory)

Better than linear, but slower than binary — good trade-off*/
public class JumpSearch {

    /**
     * 🔍 Performs Jump Search in a sorted array
     * @param arr The sorted array
     * @param target The element to find
     * @return Index of target if found, else -1
     */
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;

        // 🔢 Step size is square root of array length
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        // 🔁 Jump ahead to find the block where target may exist
        while (prev < n && arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // ❌ Element not found
            }
        }

        // 🔁 Linear search in the found block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i; // ✅ Found target
            }
        }

        return -1; // ❌ Element not present
    }

    // 🔰 Main Method
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 12, 15, 22, 35, 48, 59, 63}; // 📦 Sorted array
        int target = 35; // 🎯 Target to find

        int index = jumpSearch(arr, target); // 🚀 Call Jump Search

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}

