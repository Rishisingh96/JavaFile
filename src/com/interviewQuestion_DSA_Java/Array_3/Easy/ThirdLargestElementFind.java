package com.interviewQuestion_DSA_Java.Array_3.Easy;

import java.util.TreeSet;

public class ThirdLargestElementFind {

    // ---------------- METHOD 1 ----------------
    // Best Method (GFG + LeetCode Compatible)
    public static int thirdMax1(int[] nums) {
        Integer first = null, second = null, third = null;

        for (int x : nums) {

            // Skip duplicates
            if ((first != null && x == first) ||
                    (second != null && x == second) ||
                    (third != null && x == third)) {
                continue;
            }

            // Update first, second, third
            if (first == null || x > first) {
                third = second;
                second = first;
                first = x;
            }
            else if (second == null || x > second) {
                third = second;
                second = x;
            }
            else if (third == null || x > third) {
                third = x;
            }
        }

        // If third does NOT exist → return first (largest)
        return (third == null) ? first : third;
    }


    // ---------------- METHOD 2 ----------------
    // Using TreeSet (Auto Sorted + Distinct)
    public static int thirdMax2(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num); // distinct add

            // Keep only 3 largest numbers
            if (set.size() > 3) {
                set.pollFirst(); // remove smallest
            }
        }

        // If exactly 3 distinct → smallest is 3rd largest
        if (set.size() == 3) return set.first();

        // Otherwise return largest
        return set.last();
    }


    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};

        System.out.println("Method 1 (GFG + LeetCode): " + thirdMax1(arr));
        System.out.println("Method 2 (Using TreeSet):  " + thirdMax2(arr));

        // Expected Output:
        // Method 1 (GFG + LeetCode): 14
        // Method 2 (Using TreeSet):  14
    }
}
