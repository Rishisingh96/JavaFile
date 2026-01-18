package com.interviewQuestion_DSA_Java.Searching_4.leetcodeq;

public class SearchInRotatedArray {
    static int SearchElement(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            //I find my element
            if (nums[mid] == target)
                return mid;

                //Left side is sorted
            else if (nums[mid] >= nums[0]) {
                //Check if target lies in left side
                if (nums[start] <= target && nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            //Right side is sorted
            else {
                //Check if target lies in right side
                if (nums[mid] < target && nums[end] >= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    static void main() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = SearchElement(nums, target);

        System.out.println("Minimum element in rotated sorted array is : " + result);
    }
}
