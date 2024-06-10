package com.Java.Exception_and_File_Handling.Universal;

import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of Array:");
        n = sc.nextInt();
        try{
            System.out.println("Element is "+arr[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is crossing the limit");
            // e.printStackTrace();
        }
        System.out.println("Thanks for using this program");
    }
}
