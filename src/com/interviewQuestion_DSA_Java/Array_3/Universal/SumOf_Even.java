package com.interviewQuestion_DSA_Java.Array_3.Universal;

public class SumOf_Even {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 2, 10, 39, 44};

        // Print all numbers in the array
        for(int element : arr){
            System.out.print(element+" ");
        }

        // Print even numbers in the array
        System.out.println("\nEven numbers in the array:");
        int sum =0;
        for(int element2 : arr){
            if(element2%2 ==0) {
                System.out.print(element2 + " ");
                sum = sum + element2;
            }
        }
        System.out.println("\nTotal sum of Even is :"+sum);
        System.out.println("Total array length " + arr.length);
    }
}
