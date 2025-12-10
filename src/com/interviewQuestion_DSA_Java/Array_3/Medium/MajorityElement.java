package com.interviewQuestion_DSA_Java.Array_3.Medium;

import java.util.Arrays;

public class MajorityElement {
    //Brut Force Approach
    static int majorityElementBrutForce(int[] arr) {
        int n = arr.length;
       for(int i=0; i<n; i++){
           int count =0;
           for(int j=0; j<n; j++){
               if(arr[i]==arr[j]){
                   count++;
               }
           }
           if(count>n/2){
               return arr[i];
           }
       }
         return -1;
    }

    //Optimized Approach (Sorting)
    static int majorityElementOptimized(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int majorityElement = arr[n / 2];

        //After sorting the majority element will be at the middle index
        int count = 0;
        for (int num : arr) {
            if (num == majorityElement) {
                count++;
            }
        }
        if (count > n / 2) {
            return majorityElement;
        }
        return -1;
    }

    // Moore's Voting Algorithm
    static int majorityElement(int[] arr) {
        int n = arr.length;
        int ans = -1;  // to store potential majority element
        int freq = 0;

        // Phase 1: Find a ans for majority element
        for (int num : arr) {
            if (freq == 0) {
                ans = num;
            }
            if (num == ans) {
                freq++;
            } else {
                freq--;
            }
        }

        // Phase 2: Verify the ans
        freq = 0;
        for (int num : arr) {
            if (num == ans) {
                freq++;
            }
        }

        if (freq > n / 2) {
            return ans;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
//        System.out.println(STR."Majority Element Using Brut Force is: \{majorityElementBrutForce(arr)}");
//        System.out.println("Majority Element Using Optimized(Sorting approach) is: " + majorityElementOptimized(arr));
        System.out.println("Majority Element Using Moors voting approach is: " + majorityElement(arr));
    }
}
