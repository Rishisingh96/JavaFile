package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;

public class InsertionSort {

    // 🔁 Insertion Sort Function
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];        // 🗝️ Current element to insert
            int j = i - 1;

            // 🔄 Shift larger elements to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                 j--;
            }

            // ✅ Place key in correct position
            arr[j + 1] = key;
        }
    }

    // 🖨 Print array elements
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // 🔰 Main method
    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};  // 🎯 Fixed input

        System.out.print("Original Array: ");
        printArray(arr);

        // 🚀 Perform insertion sort
        insertionSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
/*3️⃣ Insertion Sort
Best Case: O(n) (for nearly sorted arrays)

Average/Worst Case: O(n²)

Space: O(1), Stable: ✅ Yes

Use Case:

Jab array partially sorted ho

Small datasets ke liye best

Hybrid algorithms (like TimSort) mein use hoti hai*/