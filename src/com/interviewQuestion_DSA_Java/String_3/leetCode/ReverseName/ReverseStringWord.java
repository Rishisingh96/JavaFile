package com.interviewQuestion_DSA_Java.String_3.leetCode.ReverseName;

public class ReverseStringWord {

    // Function to reverse each word in the string while preserving word order
    public static String reverseEachWord(String input) {
        String[] words = input.split(" ");  // Split the string by spaces
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            reversedString.append(sb.reverse().toString()).append(" ");
        }

        return reversedString.toString().trim();  // Remove the trailing space
    }

    public static void main(String[] args) {
        String original = "Rishi singh";

        // Calling the reverseEachWord function
        String reversed = reverseEachWord(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
