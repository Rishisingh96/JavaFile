package com.Java.Question;

import java.util.Scanner;

public class sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
        int sum = 0;
        int temp = n;

        while(temp != 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println(sum);
    }
}
