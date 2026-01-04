package com.interviewQuestion_DSA_Java.Array_3.Medium;

public class SlidingWindowTechMaxSumSubArray {
    static int maxSumSubarray(int[] arr, int w) {
        int n = arr.length;

        if (arr == null || n < w) {
            return -1;
        }
        //step 1 : sum of first window
        int current = 0;
        for(int i=0; i<w; i++){
            current += arr[i];
        }
        int maxx = current;

        //step 2 : slide the window
        for(int i=1; i<=n-w; i++){
            current = current - arr[i-1] + arr[i + w -1];
            maxx = Math.max(maxx,current);
        }
        return maxx;
    }
    static void main() {
       //Maximum sum of any subarray of size w
//        int arr[] = {3,8,2,5,7,6,12};
        int arr[] = {5,2,-1,0,3};
        int w = 3;
        System.out.println(maxSumSubarray(arr,w));
    }
}
