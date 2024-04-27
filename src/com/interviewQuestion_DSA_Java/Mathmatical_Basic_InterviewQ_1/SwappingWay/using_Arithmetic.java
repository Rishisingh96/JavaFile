package com.interviewQuestion_DSA_Java.Mathmatical_Basic_InterviewQ_1.SwappingWay;

public class using_Arithmetic {
    public static void main(String[] args) {
        int x = 7, y = 3;

        // Printing values before swapping
        System.out.println("Before swapping:");
        System.out.println("x = " + x + "\t" + "y = " + y);

        // Swapping without using a temporary variable
        x = x + y; // Add x and y and assign it to x
        y = x - y; // Subtract y from the updated x and assign it to y (this is now the original value of x)
        x = x - y; // Subtract the updated y from the updated x and assign it to x (this is now the original value of y)

        // Printing values after swapping
        System.out.println("After swapping:");
        System.out.println("x = " + x + "\t" + "y = " + y);
    }
}
