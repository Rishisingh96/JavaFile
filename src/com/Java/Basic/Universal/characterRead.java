package com.Java.Basic.Universal;

import java.util.Scanner;

public class characterRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your name: ");
//        String name = scanner.next();

        System.out.println("Enter your full number: ");
        String name2 =scanner.nextLine();

//        System.out.println("Hello my name is " +name);  // Enter your name: Rishi singh ,Hello my name is Rishi
//        System.out.println("Hello my full name is " +name2); //Enter your name: Rishi singh ,Hello my name is Rishi singh
        System.out.println("Only R print = " +name2.charAt(0));
    }
}
