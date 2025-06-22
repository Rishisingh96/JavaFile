package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;

public class BubbleSort {

    // 🔁 Optimized Bubble Sort Function
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // 🌀 Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 🔄 Inner loop for pairwise comparison
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if elements are out of order
                if (arr[j] > arr[j + 1]) {
                    // 🔃 Swap using temp variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Set flag to true if swap occurs
                }
            }

            // ✅ Break early if no swaps occurred (Already Sorted)
            if (!swapped) break;
        }
    }

    // 🖨 Print array function
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔰 Main method (like LeetCode example)
    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};  // 🎯 Sample input

        System.out.print("Original Array: ");
        printArray(arr);

        bubbleSort(arr);  // 🚀 Perform Optimized Bubble Sort

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}

/*
1️⃣ Bubble Sort
Best Case: O(n) (if already sorted)

Average/Worst Case: O(n²)

Space: O(1), Stable: ✅ Yes

Use Case:

Jab input chhoti ho ya nearly sorted ho

Mostly educational purpose ke liye use hoti hai

Real-world use very rare


*/