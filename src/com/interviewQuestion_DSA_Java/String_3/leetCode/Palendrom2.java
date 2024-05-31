package com.interviewQuestion_DSA_Java.String_3.leetCode;

public class Palendrom2 {
    public static void main(String[] args) {
        String str = "madam";
        char[] charArray = str.toCharArray();
        boolean isPalindrome = true;

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
