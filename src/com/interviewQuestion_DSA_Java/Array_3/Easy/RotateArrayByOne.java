package com.interviewQuestion_DSA_Java.Array_3.Easy;

/**
 * Program: Rotate Array by One Position (Right Rotation)
 * Example:
 * Input  : [2, 7, 4, 11, 5, 8]
 * Output : [8, 2, 7, 4, 11, 5]
 */
public class RotateArrayByOne {

    /**
     * Rotates the array to the right by one position
     * @param arr input array
     */
    static void rotateByOne(int[] arr) {

        // Edge case: empty or single element array
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        // Store last element
        int last = arr[n - 1];

        // Shift elements one position to the right
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        // Place last element at first position
        arr[0] = last;
    }

    /**
     * Displays array elements
     */
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 11, 5, 8};

        System.out.println("Before Rotation:");
        display(arr);

        rotateByOne(arr);

        System.out.println("\nAfter Rotation:");
        display(arr);
    }
}
