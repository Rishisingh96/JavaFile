package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;
/*7️⃣ Radix Sort
All Cases: O(n × d), where d = number of digits

Space: O(n + k), Stable: ✅ Yes

Use Case:

Jab input large ho but digit count kam ho

Works only for non-negative integers

Fastest in some digit-based sorting (like phone numbers, IDs)

*/
public class RadixSort {

    // 📦 Utility function to get the maximum value in the array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // 🔁 Counting Sort used by Radix Sort (based on digit)
    public static void countingSortByDigit(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];  // Digits 0-9

        // 📊 Count occurrences of digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }

        // 🔁 Cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 📥 Build the output array (Stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // 🔄 Copy output array to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // 🚀 Main Radix Sort function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);  // Find max to know number of digits

        // 🔄 Apply counting sort for each digit place
        for (int place = 1; max / place > 0; place *= 10) {
            countingSortByDigit(arr, place);
        }
    }

    // 🖨 Utility to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🔰 Main method
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.print("Original Array: ");
        printArray(arr);

        radixSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}

