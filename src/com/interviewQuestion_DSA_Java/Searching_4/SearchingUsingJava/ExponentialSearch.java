package com.interviewQuestion_DSA_Java.Searching_4.SearchingUsingJava;
/*5. Exponential Search
Time Complexity:

Best Case: O(1)

Worst Case: O(log n)

Use Case:

Jab array sorted ho

Jab target element start ke paas ho ya pata ho ki kahan ke aas-paas hoga

Very large sorted array jisme random access fast ho (like binary + jump hybrid)*/
public class ExponentialSearch {

    // 🔁 Binary Search helper function
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // ❌ Not found
    }

    /**
     * 🔍 Performs Exponential Search on a sorted array
     * @param arr    The sorted input array
     * @param target The element to search
     * @return Index of target if found, else -1
     */
    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        // ✅ First element check
        if (arr[0] == target)
            return 0;

        // 🔁 Find range for binary search by repeated doubling
        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        // 🔎 Binary search in found range
        return binarySearch(arr, i / 2, Math.min(i, n - 1), target);
    }

    // 🔰 Main Method
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 18, 21, 30, 45, 60};  // 📦 Sorted array
        int target = 21;

        int index = exponentialSearch(arr, target);  // 🚀 Call exponential search

        if (index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found in the array.");
    }
}

