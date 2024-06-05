package com.interviewQuestion_DSA_Java.Array_3.Basic;

public class Minimum {
    public static void main(String[] args) {
        int arr[] = {6,23,7,9,34,65,2,1};
        int minimum =arr[0];
        for (int ele: arr){
            if(ele<minimum){
                minimum = ele;
            }
        }
        System.out.println(minimum);
    }
}
