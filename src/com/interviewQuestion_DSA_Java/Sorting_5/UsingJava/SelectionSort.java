package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;

public class SelectionSort {

    // 🔁 Selection Sort Function
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // 🌀 Loop for each position in the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index holds the minimum

            // 🔍 Find the actual minimum in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update index of minimum element
                }
            }

            // 🔃 Swap the found minimum with the current element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // 🖨 Function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔰 Main method (LeetCode-style)
    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};  // 🎯 Sample input

        System.out.print("Original Array: ");
        printArray(arr);

        selectionSort(arr);  // 🚀 Perform Selection Sort

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}

/*2️⃣ Selection Sort
All Cases: O(n²)

Space: O(1), Stable: ❌ No

Use Case:

Jab memory bahut limited ho

Stability ki zarurat na ho

Simple implementation required ho*/