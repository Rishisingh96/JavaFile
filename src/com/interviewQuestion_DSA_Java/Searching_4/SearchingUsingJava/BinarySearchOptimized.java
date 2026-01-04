package com.interviewQuestion_DSA_Java.Searching_4.SearchingUsingJava;
/*2. Binary Search
Time Complexity:

Best Case: O(1)

Worst/Average: O(log n)

Use Case:

Array sorted hona chahiye

Jab fast searching chahiye in logarithmic time

Har baar array ko 2 parts mein divide karke search karo*/
public class BinarySearchOptimized {

    public static void main(String[] args) {
        int[] arr = {-12, -10, -5, 0, 2, 4, 8, 10, 18, 30, 55, 100};
        int target = 18;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

  
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // 🔁 Loop until search space is exhausted
        while (start <= end) {
            // Prevents potential integer overflow
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // ✅ Target found
            } else if (target < arr[mid]) {
                end = mid - 1; // 🔁 Search left half
            } else {
                start = mid + 1; // 🔁 Search right half
            }
        }

        return -1; // ❌ Target not found
    }
}
