package com.interviewQuestion_DSA_Java.Searching_4.leetcodeq;

public class SearchInsertInIndex {

    static int searchInsert(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = arr.length;   // default insert position

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;     // exact index found
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                ans = mid;      // possible insert position
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 4, 6, 8, 10, 14, 16, 18};
        int target = 5;

        int result = searchInsert(nums, target);
        System.out.println("Index is : " + result);
    }
}
