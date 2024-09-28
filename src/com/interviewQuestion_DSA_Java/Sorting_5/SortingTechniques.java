package com.interviewQuestion_DSA_Java.Sorting_5;

import java.util.Arrays;

public class SortingTechniques {

    // Display the array
    public static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    // Bubble Sort
    // Time Complexity: O(n^2) in worst and average case, O(n) in best case (when the array is already sorted)
    public static int bubbleSort(int[] arr) {
        int size = arr.length;
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return 0;
    }

    // Selection Sort
    // Time Complexity: O(n^2) for all cases (best, average, and worst)
    public static void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    // Time Complexity: O(n^2) in worst and average case, O(n) in best case (when the array is already sorted)
    public static void insertionSort(int[] arr) {
        int size = arr.length;
        for(int i=1; i<size; i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    // Merge Sort
    // Time Complexity: O(n log n) for all cases
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        // Merge the temp arrays back into arr[left..right]
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] and R[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort
    // Time Complexity: O(n log n) on average, O(n^2) in worst case
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 3, 4, 9, 20};
        int size = arr.length;

        System.out.println("Before sorting:");
        display(arr);

        // Uncomment the sorting technique you want to use

        // Bubble Sort
     //    bubbleSort(arr);

        // Selection Sort
        // selectionSort(arr);

        // Insertion Sort
         insertionSort(arr);

        // Merge Sort
        // mergeSort(arr, 0, size - 1);

        // Quick Sort
     //   quickSort(arr, 0, size - 1);

        System.out.println("After sorting:");
        display(arr);
    }
}

