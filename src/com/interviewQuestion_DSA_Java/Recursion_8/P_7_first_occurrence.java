package com.interviewQuestion_DSA_Java.Recursion_8;


//Problem 7 -


public class P_7_first_occurrence {
    public static int firstOccurence(int arr[],int key,int i){
       if(i == arr.length){
           return -1;
       }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,5,7,4,7,9,5};
        System.out.println(firstOccurence(arr,5,0));
    }
}
