package com.interviewQuestion_DSA_Java.Array_3.Medium;

public class Max_SubarrayKadanesAlgo {
   
   // ---------  kadans Algorith ------------------time complexity = O(n)----------------------------------------------

    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int val : nums) {
            currSum += val;                    // add current value
            maxSum = Math.max(currSum, maxSum); // update maxSum first

            if (currSum < 0) {                 // if current sum becomes negative
                currSum = 0;                   // reset to 0
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Max_SubarrayKadanesAlgo s = new Max_SubarrayKadanesAlgo();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum = " + s.maxSubArray(nums));
    }
}
