package com.DayOfproblem.April;

/*
✅ DSA Challenge 1 (Easy) – Arrays
Problem:
Find the maximum difference between any two elements in an array such that the larger element comes after the smaller one.

Example:
Input:  [2, 3, 10, 6, 4, 8, 1]
Output: 8 (10 - 2)
*/

public class FindDifferenceBetweenTwoNumber {

    // 🔴 Brute-force Approach: O(n^2)
    public static void maximumDifference1(int[] arr) {
        int maxDiff = Integer.MIN_VALUE;

        // Compare every pair (i, j) such that j > i
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int diff = arr[j] - arr[i];         // Difference between larger and smaller
                    maxDiff = Math.max(maxDiff, diff);  // Update maxDiff if new diff is greater
                }
            }
        }

        System.out.println("Brute Force - Maximum Difference: " + maxDiff);
    }

    // ✅ Optimized Approach: O(n)
    public static void maximumDifference2(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int minElement = arr[0];                  // Store minimum element found so far
        int maxDiff = arr[1] - arr[0];            // Initialize maxDiff with first two elements

        for (int i = 1; i < arr.length; i++) {
            int currentDiff = arr[i] - minElement;           // Calculate current difference
            maxDiff = Math.max(maxDiff, currentDiff);        // Update maxDiff if it's greater
            minElement = Math.min(minElement, arr[i]);       // Update minElement if a smaller one is found
        }

        System.out.println("Optimized - Maximum Difference: " + maxDiff);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        // You can call both for testing
        maximumDifference1(arr); // Brute-force
        maximumDifference2(arr); // Optimized
    }
}
/*Sure bhai! 💡 Let’s do a deep line-by-line dry run of both methods (maximumDifference1 and maximumDifference2) using this input:

java
Copy
Edit
int[] arr = {2, 3, 10, 6, 4, 8, 1};
🔴 1. Brute-Force Method Dry Run – maximumDifference1()
java
Copy
Edit
int maxDiff = Integer.MIN_VALUE; // maxDiff = -∞ (used to track max difference)
Now we start two nested loops:

Loop 1 → i = 0 to n-2, Loop 2 → j = i+1 to n-1
Step-by-step:
Outer Loop i = 0, arr[i] = 2
j = 1: arr[1] = 3 > 2 ⇒ diff = 1 → maxDiff = max(-∞, 1) = 1

j = 2: arr[2] = 10 > 2 ⇒ diff = 8 → maxDiff = max(1, 8) = 8

j = 3: arr[3] = 6 > 2 ⇒ diff = 4 → maxDiff = 8

j = 4: arr[4] = 4 > 2 ⇒ diff = 2 → maxDiff = 8

j = 5: arr[5] = 8 > 2 ⇒ diff = 6 → maxDiff = 8

j = 6: arr[6] = 1 ❌ not > 2 → skip

Outer Loop i = 1, arr[i] = 3
j = 2: 10 > 3 ⇒ diff = 7 → maxDiff = 8

j = 3: 6 > 3 ⇒ diff = 3 → maxDiff = 8

j = 4: 4 > 3 ⇒ diff = 1 → maxDiff = 8

j = 5: 8 > 3 ⇒ diff = 5 → maxDiff = 8

j = 6: 1 ❌ not > 3 → skip

i = 2, arr[i] = 10
All elements after 10 are smaller → No update to maxDiff

i = 3, arr[i] = 6
j = 4: 4 ❌ not > 6

j = 5: 8 > 6 ⇒ diff = 2 → maxDiff = 8

j = 6: 1 ❌ not > 6

i = 4, arr[i] = 4
j = 5: 8 > 4 ⇒ diff = 4 → maxDiff = 8

j = 6: 1 ❌ not > 4

i = 5, arr[i] = 8, j = 6: 1 ❌ not > 8
✅ Final Output:
java
Copy
Edit
Brute Force - Maximum Difference: 8
🕒 Time Complexity: O(n²)

✅ 2. Optimized Method Dry Run – maximumDifference2()
java
Copy
Edit
int minElement = arr[0];    // minElement = 2
int maxDiff = arr[1] - arr[0]; // maxDiff = 3 - 2 = 1
Start i = 1 to n-1 loop

Step-by-step:
i = 1
arr[1] = 3

currentDiff = 3 - 2 = 1

maxDiff = max(1, 1) = 1

minElement = min(2, 3) = 2 ✅

i = 2
arr[2] = 10

currentDiff = 10 - 2 = 8 ✅

maxDiff = max(1, 8) = 8 ✅

minElement = min(2, 10) = 2 ✅

i = 3
arr[3] = 6

currentDiff = 6 - 2 = 4

maxDiff = max(8, 4) = 8

minElement = min(2, 6) = 2

i = 4
arr[4] = 4

currentDiff = 4 - 2 = 2

maxDiff = 8

minElement = 2

i = 5
arr[5] = 8

currentDiff = 8 - 2 = 6

maxDiff = 8

minElement = 2

i = 6
arr[6] = 1

currentDiff = 1 - 2 = -1 ❌

maxDiff = 8

minElement = min(2, 1) = 1 ✅ (updated for future elements)

✅ Final Output:
java
Copy
Edit
Optimized - Maximum Difference: 8
🕒 Time Complexity: O(n)
🧠 Space Complexity: O(1)

🔁 Summary of Differences:

Feature	Brute-force	Optimized
Time Complexity	O(n²)	✅ O(n)
Compares all pairs	Yes	No, only current vs min element
Space Complexity	O(1)	O(1)
Use in Interviews	Good for naive explanation	✅ Best for optimal solution
Let me know if you want this dry run written as notes or want to continue to DSA Day 2 challenge 🔥
Just say: Bhai DSA Day 2 de 🙌*/