package com.Java.loop;

public class NumberP {

    // Method to print increasing number pattern
    // For example: n = 3, num = 1
    // Output:
    // 1
    // 2 3 4
    // 5 6 7 8 9

    public static void Number1(int n, int num) {
        for (int i = 1; i <= n; i++) {
            int count = 2 * i - 1;
            for (int j = 1; j <= count; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Method to print reverse number triangle
    // For example: n = 5
    // Output:
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void ReversNumberPA(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line
        }
    }
    public static void ReversNumberPD(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line
        }
    }

    // Main method to test both patterns
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1; // Starting number

        NumberP p = new NumberP(); // Create object

        // Print increasing number pattern
        p.Number1(n, num);

        System.out.println(); // Add space between patterns

        // Print reverse number triangle
        //  p.ReversNumberPA(n);
        p.ReversNumberPD(n);
    }
}
