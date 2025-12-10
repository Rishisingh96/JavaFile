package com.interviewQuestion_DSA_Java.Array_3.Medium;

public class Max_SubArrayBruteForceA {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};

        int maxSum = Integer.MIN_VALUE;

        for (int st = 0; st < n; st++) {
            int currSum = 0;
            for (int end = st; end < n; end++) {
                currSum += arr[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.println("Max subarray sum = " + maxSum);
    }
}
