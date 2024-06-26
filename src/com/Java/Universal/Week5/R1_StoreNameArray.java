package com.Java.Universal.Week5;

import java.util.Scanner;

public class R1_StoreNameArray {
    public static void main(String[] args) {
        // Store all weekdays in the array
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day index (0-6) to print the corresponding weekday:");

        try {
            int dayIndex = scanner.nextInt();
            // Print the corresponding day name
            System.out.println(daysOfWeek[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case when the index is out of the valid range
            System.out.println("Invalid index. Please enter a number between 0 and 6.");
        } finally {
            // Close the scanner object
            scanner.close();
        }

        /* for(String string : st){  //String Index out of Box
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(string.charAt(n));
            System.out.println(string.length());
        }*/
    }
}
