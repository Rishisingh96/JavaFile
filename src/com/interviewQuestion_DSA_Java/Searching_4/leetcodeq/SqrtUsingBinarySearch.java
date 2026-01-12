package com.interviewQuestion_DSA_Java.Searching_4.leetcodeq;
public class SqrtUsingBinarySearch {

    public static void main(String[] args) {

        int x = 80;

        SqrtUsingBinarySearch obj = new SqrtUsingBinarySearch();
        int result = obj.mySqrt(x);

        System.out.println("Square root of " + x + " is : " + result);
    }

    public int mySqrt(int x) {

        // Base case
        if (x < 2)
            return x;

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // To avoid overflow: mid * mid
            if (mid == x / mid) {
                return mid;
            }
            else if (mid < x / mid) {
                ans = mid;          // store possible answer
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;   // floor value of sqrt
    }
}
