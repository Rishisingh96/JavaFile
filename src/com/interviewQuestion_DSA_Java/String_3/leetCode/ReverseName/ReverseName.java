package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

import java.util.Scanner;

public class ReverseName {

    // Method to reverse a string
    public static String reverse(String str) {
        // Convert the string to a character array
        char[] st = str.toCharArray();
        int start = 0;
        int end = st.length - 1;
        char temp;

        // Loop to swap characters from the start and end until the middle is reached
        while (start < end) {
            // Swap characters
            temp = st[start];
            st[start] = st[end];
            st[end] = temp;
            start++;
            end--;
        }

        // Convert the character array back to a string and return it
        return new String(st);
    }

    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);

        // Read the input from the user
        String input = scanner.nextLine();

        // Call the reverse method with the input string
        String reversedName = reverse(input);

        // Print the reversed name
        System.out.println("Your reversed name is: " + reversedName);
    }
}
