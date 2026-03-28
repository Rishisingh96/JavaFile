package com.Java.loop;

public class IsPalendrom {
    public static void main(String[] args) {   // EDIT: return type void kiya
        int x = 121;

        // EDIT: negative number palindrome nahi hota
        if (x < 0) {
            System.out.println(false);
            return;   // EDIT: sirf return; (no boolean)
        }

        int rev = 0;
        int temp = x;
        boolean isPalindrome = false;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        if (rev == temp) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        System.out.println(isPalindrome);
    }
}