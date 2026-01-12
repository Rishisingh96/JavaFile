package com.interviewQuestion_DSA_Java.Array_3.Easy;

import java.util.Arrays;
import java.util.TreeSet;

public class SecondMaxElementFind {
    // All methods to find Second Largest Element in ONE class

        // ---------------- METHOD 1: Two Pass ----------------
        // Time: O(n), Space: O(1)
        // First find largest, then second largest
        public int secondLargestTwoPass(int[] arr) {
            int largest = -1, second = -1;

            // find largest
            for (int x : arr) {
                if (x > largest) {
                    largest = x;
                }
            }

            // find second largest
            for (int x : arr) {
                if (x != largest && x > second) {
                    second = x;
                }
            }
            return second;
        }

        // ---------------- METHOD 2: Single Pass (BEST) ----------------
        // Time: O(n), Space: O(1)
        // Update largest and second together
        public int secondLargestSinglePass(int[] arr) {
            int largest = -1, second = -1;

            for (int x : arr) {
                if (x > largest) {
                    second = largest;
                    largest = x;
                } else if (x < largest && x > second) {
                    second = x;
                }
            }
            return second;
        }

        // ---------------- METHOD 3: Sorting ----------------
        // Time: O(n log n), Space: O(1)
        public int secondLargestSorting(int[] arr) {
            Arrays.sort(arr);
            int n = arr.length;

            // move from end to find first different element
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] != arr[n - 1]) {
                    return arr[i];
                }
            }
            return -1;
        }

        // ---------------- METHOD 4: Using Set ----------------
        // Time: O(n log n), Space: O(n)
        // Removes duplicates automatically
        public int secondLargestUsingSet(int[] arr) {
            TreeSet<Integer> set = new TreeSet<>();

            for (int x : arr) {
                set.add(x);
            }

            // if less than 2 unique elements
            if (set.size() < 2) return -1;

            // get second largest
            return set.lower(set.last());
        }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        SecondMaxElementFind sol = new SecondMaxElementFind();

        int[] arr = {4, 7, 2, 7, 5, 6, 3, 8, 8, 1};

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Second Largest (Two Pass): " + sol.secondLargestTwoPass(arr));
        System.out.println("Second Largest (Single Pass): " + sol.secondLargestSinglePass(arr));
        System.out.println("Second Largest (Sorting): " + sol.secondLargestSorting(arr));
        System.out.println("Second Largest (Using Set): " + sol.secondLargestUsingSet(arr));
    }

}
