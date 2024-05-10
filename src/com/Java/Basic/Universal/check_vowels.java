package com.Java.Basic.Universal;

import java.util.Scanner;

public class check_vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter only Character who want to check vowels or not:");
        char ch = in.next().charAt(0);
        if(ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U'){
            System.out.println("Given number is vowels.");
        }
        else {
            System.out.println("not Vowels.");
        }

    }
}
