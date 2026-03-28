package com.interviewQuestion_DSA_Java.String_3.CoderArmy;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestPalendrom {
 public static int longestPalindrome(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        // Frequency count
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                lower[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                upper[c - 'A']++;
            }
        }

        int count = 0;
        boolean odd = false;

        // Calculate length
        for (int i = 0; i < 26; i++) {
            if (lower[i] % 2 == 0) {
                count += lower[i];
            } else {
                count += lower[i] - 1;
                odd = true;
            }

            if (upper[i] % 2 == 0) {
                count += upper[i];
            } else {
                count += upper[i] - 1;
                odd = true;
            }
        }

        // Add one odd character in center
        if (odd) count++;

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = longestPalindrome(s);
        System.out.println("Longest Palindrome Length = " + result);

        sc.close();
    }
}
