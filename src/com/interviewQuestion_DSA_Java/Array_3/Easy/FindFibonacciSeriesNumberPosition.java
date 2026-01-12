package com.interviewQuestion_DSA_Java.Array_3.Easy;

import java.util.Scanner;

/**
 * Program: Find Fibonacci number at a given position
 * Example:
 * Input: 7
 * Output: Fibonacci number at position 7 is 8
 *
 * Series: 0 1 1 2 3 5 8 ...
 */
public class FindFibonacciSeriesNumberPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the position: ");
        int n = sc.nextInt();

        // Edge case handling
        if (n <= 0) {
            System.out.println("Position must be greater than 0");
            return;
        }

        // For position 1 and 2
        if (n == 1) {
            System.out.println("Fibonacci number at position 1 is: 0");
            return;
        }
        if (n == 2) {
            System.out.println("Fibonacci number at position 2 is: 1");
            return;
        }

        // Using array to store fibonacci values
        int[] fib = new int[n];
        fib[0] = 0; // first fibonacci number
        fib[1] = 1; // second fibonacci number

        // Generate fibonacci series up to n
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Output result
        System.out.println("Fibonacci number at position " + n + " is: " + fib[n - 1]);

        sc.close();
    }
}
