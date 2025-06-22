package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;
/*4️⃣ Merge Sort
All Cases: O(n log n)

Space: O(n), Stable: ✅ Yes

Use Case:

Jab stability chahiye

Linked list sorting*/
public class MergeSort {

    // 🔁 Merge two sorted subarrays into one sorted array
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // 🔁 Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // 🖨 Print array
    public static void printArray(int[] arr) {
        System.out.print("Sorted Array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // 🔰 Main method
    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};  // 🎯 Fixed input
        System.out.print("Original Array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        // 🚀 Apply Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        // 🖨 Print sorted array
        printArray(arr);
    }
}
/*
Large datasets ya external sorting (disk-based)
🧠 Summary Tips:
✅ Use Insertion Sort when array is mostly sorted.

✅ Use Merge Sort when stability is important or with linked lists.

✅ Use Quick Sort for general-purpose fast sorting (but not stable).

✅ Use Counting/Radix when data is digit-based or limited range.

✅ Use Heap Sort when memory is tight but O(n log n) performance is needed.
*/