package com.Java.loop;

import java.util.Scanner;

public class FindLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int n = num;

        int largest = 0;

        while (n>0) {
            int digit = n % 10;
            if(digit>largest){
                largest = digit;
            }
            n=n/10;
        }
        System.out.println("Largest digit in " + num + "=" + largest);
    }
}
