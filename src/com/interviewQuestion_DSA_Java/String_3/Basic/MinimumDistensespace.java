package com.interviewQuestion_DSA_Java.String_3.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDistensespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String st[] = new String[5];
//        for(int i=0; i<5; i++){
//            st[i] = sc.nextLine();
//        }
        String k[] = {"Rahul","Mohit","Rohit"};
        String s = "Mohitr";
       // System.out.println(Arrays.binarySearch(k,s));
        if(Arrays.binarySearch(k,s) ==1){
            System.out.println("Element found");
        }else {
            System.out.println("Element is wrong");
        }

//        for(String eme : k){
//            if(eme == s){
//                System.out.println("Element found");
//            }
//          //  System.out.println(eme);
//        }

    }
}
