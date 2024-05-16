package com.Java.Universal.Loop;

import java.util.Scanner;

public class prime_number {
    public static void Prime_number1Way(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){ //// A prime number has exactly two divisors: 1 and itself
            System.out.println("Your number is Prime");
        }
        else {
            System.out.println("Your number is not prime");
        }
    }
    public static boolean Prime_number2Way(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your value");
        int n = scanner.nextInt();
//        Prime_number1Way(n);

        if (Prime_number2Way(n)) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not Prime");
        }
        scanner.close(); // Remember to close the scanner
    }
}
