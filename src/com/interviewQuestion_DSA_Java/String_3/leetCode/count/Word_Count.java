package com.interviewQuestion_DSA_Java.String_3.leetCode.count;

public class Word_Count {
    public static int countWords(String str) {
        // Check if the string is empty or null
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more whitespace characters and count the resulting words
      //  String[] words = str.trim().split("\\s+");
        String[] words = str.split(" ");
        return words.length;
    }
    public static void main(String[] args) {
        String str2 = "Rishi singh";
        int count = countWords(str2);
        System.out.println("Total words: " + count);
    }
}
