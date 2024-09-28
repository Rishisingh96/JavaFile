package com.interviewQuestion_DSA_Java.String_3.leetCode;

public class LargestStringByLength {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mangoRaja", "banana"};

        // Initialize the largest string with the first element
        String largest = fruits[0];

        // Loop through the array starting from the first element
        for (int i = 1; i < fruits.length; i++) {
            // Compare lengths and update the largest string if current one is longer
            if (fruits[i].length() > largest.length()) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
