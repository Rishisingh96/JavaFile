package com.interviewQuestion_DSA_Java.Array_3.Universal;

public class FindSecondBiggest {
    public static void main(String[] args) {

        int arr[] ={5,8,10,20,7,66,30,67};
        int max =0;
        int s_max = 1;
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>max){
                s_max = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>s_max){
                s_max = arr[i];
            }
        }
        System.out.println("\nBeggest number is : "+ max);
        System.out.println("second Biggest number is : "+s_max);
    }
}
