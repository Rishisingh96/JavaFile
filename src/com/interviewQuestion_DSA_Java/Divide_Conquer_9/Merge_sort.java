package com.interviewQuestion_DSA_Java.Divide_Conquer_9;

public class Merge_sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to perform merge sort
    private static void mergeSort(int[] arr, int si, int ei) {
        // Base case: if start index is greater than or equal to end index, return
        if (si >= ei) {
            return;
        }

        // Calculate the middle index
        int mid = si + (ei - si) / 2;

        // Recursively sort the left and right halves
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    // Function to merge two sorted halves
    public static void merge(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store the merged result
        //left(0,3) =4 right(4,6) -> 6+0+1
        int temp[] = new int[ei - si + 1];
        int i = si;  // idx for 1 sorted part
        int j = mid + 1; //idx for 2nd sorted part
        int k = 0;  /// idx for temp;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
// Copy the remaining elements of the right half
        //for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
//for leftover elements of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
// Copy elements from temp back to arr
        //copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
//        int arr[] = {6,3,9,5,2,8,-2};
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);

    }
// time O(nlogn)
   // space O(n)

}
