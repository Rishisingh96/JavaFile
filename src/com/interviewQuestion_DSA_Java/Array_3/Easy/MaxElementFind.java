package com.interviewQuestion_DSA_Java.Array_3.Easy;

public class MaxElementFind {
    static void main() {
        int arr[] = {6,23,7,9,34,65,2,4};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
