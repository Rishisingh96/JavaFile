package com.interviewQuestion_DSA_Java.Sorting_5.UsingJava;

/*8️⃣ Heap Sort
All Cases: O(n log n)

Space: O(1), Stable: ❌ No

Use Case:

Jab in-place sorting chahiye

Consistent performance without worst case degradation

Used in priority queues, scheduling

*/
public class HeapSort {

    // 🔁 Heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;         // Initialize largest as root
        int left = 2 * i + 1;    // Left child
        int right = 2 * i + 2;   // Right child

        // 🔍 If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 🔍 If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 🔄 If largest is not root, swap and heapify again
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // 🔁 Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // 🚀 Main Heap Sort function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 🔧 Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 🌀 Step 2: Extract elements one by one from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // 🖨 Print array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // 🔰 Main method
    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 2, 17, 4};  // 🎯 Fixed input

        System.out.print("Original Array: ");
        printArray(arr);

        // 🚀 Sort using Heap Sort
        heapSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}

