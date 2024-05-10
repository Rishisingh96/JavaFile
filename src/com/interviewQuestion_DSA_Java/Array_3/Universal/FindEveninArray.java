package com.interviewQuestion_DSA_Java.Array_3.Universal;

public class FindEveninArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 2, 10, 39, 44};

        // Print all numbers in the array
        System.out.println("All numbers in the array:");
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
        //or
        //using For-Each loop
        for(int element : arr){
            System.out.print(element+" ");
        }

        // Print even numbers in the array
        System.out.println("\nEven numbers in the array:");
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 == 0){
//                System.out.print(arr[i] + " ");
//            }
//        }
        //or using For-Each
        for(int element : arr){
            if(element%2 ==0)
                System.out.print(element+" ");
        }
    }
}
