package com.interviewQuestion_DSA_Java.Array_3.Universal;

import java.util.Scanner;

public class Find_BiggestEven_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int arr[] = new int[5];
//        System.out.println("Enter your 5 number:");
//        for(int i=0; i<5; i++) {
//            arr[i] = in.nextInt();
//        }
        int arr[] ={ 34,22,65,44,20,67,5};
        int max =0,min =0;
        for(int elm : arr){
            if(elm%2==0){
                System.out.print(elm + " ");
                if(elm>max){
                    max = elm;
                }
                else{
                    min = elm;
                }
            }
        }
        System.out.print("\nBiggest number of Array Even is :" +max);
        System.out.print("\nMinimum number of Array Even is :" +min);
    }
}
