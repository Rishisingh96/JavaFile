package com.Java.Universal.Week2;
import java.util.Arrays;
public class SortArrayDescendingO {
    public static void main(String[] args) {
        int arr[] = {2,5,1,6,3,8,4,9};

        for (int ele: arr){
            System.out.print(ele + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nsorting Array is :");
        for(int i= arr.length-1; i>0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
