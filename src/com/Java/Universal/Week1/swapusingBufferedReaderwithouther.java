package com.Java.Universal.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swapusingBufferedReaderwithouther {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Input first number
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(reader.readLine());

            // Input second number
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(reader.readLine());

            System.out.println("Before swapping:");
            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);

            // Swap numbers
          /*  int temp = num1;
            num1 = num2;
            num2 = temp;*/

            num1 = num1+ num2;
            num2 = num1- num2;
            num1 = num1 - num2;

            System.out.println("After swapping:");
            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);

        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input format: " + e.getMessage());
        }
    }
}
