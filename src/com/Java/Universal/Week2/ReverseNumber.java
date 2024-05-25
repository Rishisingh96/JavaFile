package com.Java.Universal.Week2;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int reverse=0,n;
        System.out.println("Enter your number:");
        n = in.nextInt();
        int temp = n;

        while(n!=0){   // or (n>0)
            int rem = n%10;
            reverse = (reverse*10)+rem;
            n = n/10;
        }
        System.out.println("your original number is "+temp);
        System.out.println("Your Reverse number is "+reverse);
    }
}
