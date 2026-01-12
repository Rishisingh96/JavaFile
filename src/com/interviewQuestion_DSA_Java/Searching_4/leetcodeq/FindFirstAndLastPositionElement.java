package com.interviewQuestion_DSA_Java.Searching_4.leetcodeq;

import java.util.Arrays;

public class FindFirstAndLastPositionElement {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        FindFirstAndLastPositionElement obj = new FindFirstAndLastPositionElement();
        int[] result = obj.searchRange(nums, target);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("First and Last Position: " + Arrays.toString(result));
    }

    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int first = -1;
        int last = -1;

        // -------- Find First Occurrence --------
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;   // move left
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // -------- Find Last Occurrence --------
        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;   // move right
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // -------- Return Answer --------
        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = last;

        return ans;
    }
}
