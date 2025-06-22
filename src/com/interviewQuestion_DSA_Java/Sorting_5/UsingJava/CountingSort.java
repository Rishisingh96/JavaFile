package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;
/*6️⃣ Counting Sort
All Cases: O(n + k)

Space: O(k), Stable: ✅ Yes

Use Case:

Jab input positive integers ho aur range chhoti ho

E.g. sorting grades, age, zip codes

Used as subroutine in Radix Sort*/
public class CountingSort {

    // 🚀 Function to perform Counting Sort
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // 🔍 Step 1: Find the maximum element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // 🔧 Step 2: Create count array
        int[] count = new int[max + 1];

        // 📊 Step 3: Store the frequency of each element
        for (int num : arr) {
            count[num]++;
        }

        // 🔁 Step 4: Rebuild the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // 🖨 Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔰 Main method (LeetCode-style)
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};  // 🎯 Sample input (non-negative integers)

        System.out.print("Original Array: ");
        printArray(arr);

        countingSort(arr);  // 🚀 Perform Counting Sort

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
/*📌 Time and Space Complexity:
Metric	Value
Time	O(n + k)
Space	O(k)
Stable	❌ (not by default)
Input Type	Non-negative integers with known max (k)

⚠️ Limitations:
Works only for non-negative integers.

Not efficient when max value is too large compared to array size.

Not good for floating point or negative numbers (unless modified).

✅ Use Case:
Frequency based sorting

Integer-only data (e.g. age, roll numbers, etc.)

Large size, small range (e.g. [0 to 100])*/
