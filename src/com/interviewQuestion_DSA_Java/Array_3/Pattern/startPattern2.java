package com.interviewQuestion_DSA_Java.Array_3.Pattern;

import java.util.Scanner;

public class startPattern2 {
    public static void main(String arg[]){
        int n;
        System.out.println("Enter your number :");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        for(int i = 1; i<=n; i++){
            for( int j =1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
