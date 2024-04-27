package com.interviewQuestion_DSA_Java.Recursion_8;
// Problem 6 - Check if a given array is sorted or Not.
public class Array_Sorted_not {
    private static boolean isSorted(int[] arr, int i) {
        if(i== arr.length-1){ // base case
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;

        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {1,2,4,5,3};
        int arr3[] = {1};
        System.out.println(isSorted(arr , 0));
        System.out.println(isSorted(arr2 , 0));
        System.out.println(isSorted(arr3 , 0));
    }


}
