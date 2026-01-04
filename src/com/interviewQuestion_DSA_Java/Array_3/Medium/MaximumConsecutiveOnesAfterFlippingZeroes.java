package com.interviewQuestion_DSA_Java.Array_3.Medium;

public class MaximumConsecutiveOnesAfterFlippingZeroes {
    //Using Native Approach Exploring the Subarrays
    static int maxOnes(int[] arr, int k) {
        int res = 0;
        //Exploring all subarrays
        for (int i = 0; i < arr.length; i++) {
            //Counter for zeroes in current subarray
            int cnt = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    cnt++;
                }
                if (cnt <= k) {
                    res = Math.max(res, j - i + 1);
                }
            }

        }
        return res;
    }

    //Using Optimal Approach - Sliding Window Technique
    static int maxOnesOptimal(int[] arr, int k) {
        int res = 0;
        int start = 0;
        int end = 0;
        //Counter to keep track of zeroes in current window
        int cnt = 0;
        while (end < arr.length) {
            if(arr[end] == 0) {
                cnt++;
            }
            //Shrink the window from the start
            while (cnt > k) {
                if (arr[start] == 0) {
                    cnt--;
        }
                start++;
            }
            //Update the result
            res = Math.max(res, end - start + 1);
            end++;
        }

            return res;

    }
    static void main() {
        int[] arr = {1,0,0,1,1,0,1,0,1,1,1};
        int k = 2;
        System.out.println("Maximum consecutive 1's after flipping ");
//        System.out.println(maxOnes(arr, k));
        System.out.println(maxOnesOptimal(arr, k));
    }
}
