package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;
/*5️⃣ Quick Sort
Best/Average Case: O(n log n)

Worst Case: O(n²) (if pivot is poor)

Space: O(log n) (due to recursion), Stable: ❌ No

Use Case:

Fastest sorting in practice

Commonly used in C++, Java (Arrays.sort for primitives)

General purpose array sorting*/
public class QuickSort {

    // 🔁 Function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 🔍 Partition the array using Lomuto scheme
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // ✅ Choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);  // 🔁 Move smaller element to left
            }
        }

        swap(arr, i + 1, high);  // ✅ Place pivot at correct position
        return i + 1;
    }

    // 🔁 Recursive Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);   // Left of pivot
            quickSort(arr, pi + 1, high);  // Right of pivot
        }
    }

    // 🖨 Print array elements
    public static void printArray(int[] arr) {
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔰 Main function
    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};  // 🧩 Fixed input
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 🚀 Sort using Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // 🖨 Print result
        printArray(arr);
    }
}

