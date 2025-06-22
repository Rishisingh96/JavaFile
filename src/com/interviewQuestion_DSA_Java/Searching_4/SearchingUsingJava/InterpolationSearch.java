package com.interviewQuestion_DSA_Java.Searching_4.SearchingUsingJava;
/*4. Interpolation Search
Time Complexity:

Best Case: O(1)

Average Case: O(log log n)

Worst Case: O(n)

Use Case:

Jab array sorted ho aur uniformly distributed (e.g., 10, 20, 30, 40...)

Binary search se bhi fast ho sakta hai agar data evenly spread ho*/
public class InterpolationSearch {

    /**
     * 🔍 Performs Interpolation Search on a sorted, uniformly distributed array
     * @param arr   The sorted input array
     * @param target The element to search for
     * @return Index of target if found, else -1
     */
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // 🔁 Continue searching while target is within range
        while (low <= high && target >= arr[low] && target <= arr[high]) {
            // 🔸 Prevent divide by zero
            if (arr[low] == arr[high]) {
                if (arr[low] == target)
                    return low;
                else
                    return -1;
            }

            // 📍 Estimate position using interpolation formula
            int pos = low + ((target - arr[low]) * (high - low)) /
                    (arr[high] - arr[low]);

            // ✅ Element found
            if (arr[pos] == target)
                return pos;

            // 🔁 If target is larger, search right
            if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1; // ❌ Element not found
    }

    // 🔰 Main method
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80}; // 🎯 Uniformly distributed, sorted array
        int target = 70;

        int index = interpolationSearch(arr, target); // 🚀 Call search

        if (index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found in the array.");
    }
}

