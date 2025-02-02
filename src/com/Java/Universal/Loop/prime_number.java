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

    private static void Prime_number3rdWay(int n) {
        int count=0;
        for (int i=2; i<=n/2; i++){
            if(n%i == 0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("%d is a prime number");
        }
        else{
            System.out.println("%d is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your value");
        int n = scanner.nextInt();
//        Prime_number1Way(n);
        Prime_number3rdWay(n);
      /*  if (Prime_number2Way(n)) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not Prime");
        }
        scanner.close(); // Remember to close the scanner
    */
    }
}
