package com.interviewQuestion_DSA_Java.Array_3.Basic;

public class FindMaxMinOneFunc {
    public static int[] findMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min =arr[i];
            }
        }
        return new int[]{min,max};
    }

    public static void main(String[] args) {
        int arr[] = {2, 37, 23, 44, 76, 24};
        //find
        int[] ans = findMaxMin(arr);
        System.out.println("Min ="+ans[0]);
        System.out.println(STR."Max =\{ans[1]}");

    }
}
