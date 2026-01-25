package com.interviewQuestion_DSA_Java.Searching_4.TwoSum;

import java.util.Arrays;

public class PairWithGivenDifference {

    private static int findPairsWithGivenDifference(int[] arr, int diff) {

        Arrays.sort(arr);   // Step 1: sort array

        int start = 0;
        int end = 1;
        int n = arr.length;

        while (start < n && end < n) {

            if (start != end && arr[end] - arr[start] == diff) {
                return 1;   // pair found
            }
            else if (arr[end] - arr[start] < diff) {
                end++;      // difference chhota → bada number chahiye
            }
            else {
                start++;    // difference bada → chhota number chahiye
            }
        }
        return 0;           // no such pair
    }

    public static void main(String[] args) {

        int[] arr = {5, 20, 3, 2, 50, 80};
        int diff = 78;

        int result = findPairsWithGivenDifference(arr, diff);

        if (result == 1) {
            System.out.println("Pair with given difference exists");
        } else {
            System.out.println("No pair with given difference");
        }
    }
}
