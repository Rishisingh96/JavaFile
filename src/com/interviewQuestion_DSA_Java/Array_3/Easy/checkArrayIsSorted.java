package com.interviewQuestion_DSA_Java.Array_3.Easy;

public class checkArrayIsSorted {
    static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    static void main() {
//        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9};
        int arr[] = {1, 2, 4, 5, 3, 7, 8, 9};
        if (isSorted(arr)) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
