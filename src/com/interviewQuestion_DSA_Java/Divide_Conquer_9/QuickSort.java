package com.interviewQuestion_DSA_Java.Divide_Conquer_9;

public class QuickSort {

    // Utility function to print an array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Recursive function to perform QuickSort
    public static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {
            // Partition the array and get the pivot index
            int pIdx = partition(arr, si, ei);
            // Recursively sort elements before and after the pivot
            quickSort(arr, si, pIdx - 1); // left
            quickSort(arr, pIdx + 1, ei); // right
        }
    }

    // Function to partition the array and return the pivot index
    public static int partition(int arr[], int si, int ei) {
        // Select the last element as pivot
        int pivot = arr[ei];
        // Initialize the index of smaller element
        int i = si - 1;

        // Iterate through the array from si to ei-1
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                // If current element is smaller than or equal to pivot,
                // swap arr[i] and arr[j]
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap arr[i+1] and arr[ei] (or pivot)
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        // Return the pivot index
        return i;
    }

    // Main function to test the QuickSort algorithm
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        // Call the quickSort function with initial parameters
        quickSort(arr, 0, arr.length - 1);
        // Print the sorted array
        printArr(arr);
    }
}
