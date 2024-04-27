package com.interviewQuestion_DSA_Java.Mathmatical_Basic_InterviewQ_1.SwappingWay;

public class using_Array {
    // Method to swap two integers
    public static void swap(int[] arr) {
        int z = arr[0];
        arr[0] = arr[1];
        arr[1] = z;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20}; // Declare and initialize an array with two integers
        System.out.println("Before swap");
        System.out.println("a = " + arr[0] + ", b = " + arr[1]); // Print values before swap

        // Call the swap method, passing the array by reference
        swap(arr);

        System.out.println("\nAfter swap");
        System.out.println("a = " + arr[0] + ", b = " + arr[1]); // Print values after swap
    }
}
/*
### Explanation with Comments:

1. **Method to Swap Integers**:
   - We define a method named `swap` that takes an array of integers as input.
   - Inside the method, we swap the elements of the array, effectively swapping the integers.
   - Note: In Java, arrays are objects, and when we pass an array to a method, we are passing a reference to the array object.

2. **Main Method**:
   - In the `main` method, we declare and initialize an array `arr` with two integers (`a` and `b`).
   - We print the values of `a` and `b` before swapping.

3. **Swap Operation**:
   - We call the `swap` method, passing the array `arr` as an argument. This effectively passes a reference to the array.

4. **Output**:
   - After calling the `swap` method, the values of `a` and `b` within the `arr` array have been swapped.
   - We print the values of `a` and `b` after swapping to verify the operation.

This Java code achieves similar functionality to passing variables by reference in C++. However, it uses arrays and array references instead of direct variable references.*/