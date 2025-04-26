package com.interviewQuestion_DSA_Java.Array_3.leetCode;
public class R_01_Roted_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int start = 0;
        int last = arr.length - 1;
        int temp;

        while (start < last) {
            temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;

        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
