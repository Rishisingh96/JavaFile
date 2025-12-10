package com.Java.Basic.Interview;

import java.util.Scanner;

public class EvenOddWithoutUsingPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Bitwise method
        if ((num & 1) == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        sc.close();
    }
}
