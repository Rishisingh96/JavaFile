package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;

public class OptimizedBubbleSort {

    // 🔁 Optimized Bubble Sort Function
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 🔃 Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // ✅ If no swap happened, array is already sorted
            if (!swapped)
                break;
        }
    }

    // 🖨 Print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔰 Main method
    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};  // 🎯 Fixed input

        System.out.print("Original Array: ");
        printArray(arr);

        // 🚀 Sort array
        bubbleSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
