package com.interviewQuestion_DSA_Java.Mathmatical_Basic_1;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

     /*   // Call the square function and store the result
        double result = square(number);

        // Output the result
        System.out.println("Square of " + number + " is: " + result);
        */
        System.out.println("Square of " + number + " is: " + square(number));

        scanner.close();
    }

    // Function to calculate the square of a number
    public static double square(double num) {
        return num * num;
    }
}
