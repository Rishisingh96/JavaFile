package com.interviewQuestion_DSA_Java.Array_3.Easy;

public class MinimumElementFind {
    public static void main(String[] args) {
        int arr[] = {6,23,7,9,34,65,2,1};
        int min =arr[0];
        for (int ele: arr){
            if(ele<min){
                min = ele;
            }
        }
        System.out.println(min);
    }
}
