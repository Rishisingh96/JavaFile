package com.interviewQuestion_DSA_Java.Array_3.Easy;

import java.util.*;

public class FindMissingNumber {

    // ==================================================
    // 1️⃣ BRUTE FORCE METHOD
    // ==================================================
    // Time: O(n^2), Space: O(1)
    static int missingBruteForce(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }

    // ==================================================
    // 2️⃣ SORTING METHOD
    // ==================================================
    // Time: O(n log n), Space: O(1)
    static int missingUsingSorting(int[] arr, int n) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return n;
    }

    // ==================================================
    // 3️⃣ SUM FORMULA METHOD (BEST & SIMPLE)
    // ==================================================
    // Time: O(n), Space: O(1)
    static int missingUsingSum(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr)
            actualSum += num;

        return expectedSum - actualSum;
    }

    // ==================================================
    // 4️⃣ XOR METHOD (INTERVIEW FAVORITE)
    // ==================================================
    // Time: O(n), Space: O(1)
    static int missingUsingXOR(int[] arr, int n) {
        int xorAll = 0;

        // XOR of 1 to n
        for (int i = 1; i <= n; i++)
            xorAll ^= i;

        // XOR of array elements
        for (int num : arr)
            xorAll ^= num;

        return xorAll;
    }

    // ==================================================
    // 5️⃣ HASHING METHOD
    // ==================================================
    // Time: O(n), Space: O(n)
    static int missingUsingHashing(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];

        for (int num : arr)
            present[num] = true;

        for (int i = 1; i <= n; i++) {
            if (!present[i])
                return i;
        }
        return -1;
    }

    // ==================================================
    // 🔥 MAIN METHOD (TEST ALL)
    // ==================================================
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        System.out.println("Brute Force     : " + missingBruteForce(arr, n));
        System.out.println("Sorting         : " + missingUsingSorting(arr, n));
        System.out.println("Sum Formula     : " + missingUsingSum(arr, n));
        System.out.println("XOR Method      : " + missingUsingXOR(arr, n));
        System.out.println("Hashing Method  : " + missingUsingHashing(arr, n));
    }
}
