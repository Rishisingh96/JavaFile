package com.Java.Universal.Week4;

import java.util.Scanner;

class Calculate{

   static int reverse(int a){
       int rev =0 , temp = a;
        while (a!=0){
            int mod = a%10;
            rev = (rev*10)+mod;
             a = a/10;
        }
        return rev;
    }
    static int square(int a){
        int square = a*a;
    return square;
    }
    static double half_of_number(int n){
       double half_of_number = n/2.0;
        return half_of_number;
    }
    static void process(int a , int choice){
       switch (choice){
           case 1:
               System.out.println("Reverse of the number : " + reverse(a));
               break;
           case 2:
               System.out.println("Square of the number : " + square(a));
               break;
           case 3:
               System.out.println("Half of the number: " + half_of_number(a));
               break;
           default:
               System.out.println("Invalid choice.");
       }
    }
}
public class R_4_Calculate_choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Reverse the number");
        System.out.println("2. Square of the number");
        System.out.println("3. Half of the number");
        int choice = scanner.nextInt();

        Calculate.process(a,choice);
    }
}
