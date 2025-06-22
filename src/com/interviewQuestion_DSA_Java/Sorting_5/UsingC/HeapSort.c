#include <stdio.h>

// 🔁 Function to heapify a subtree rooted at index i
void heapify(int arr[], int n, int i) {
    int largest = i;           // Initialize largest as root
    int left = 2 * i + 1;      // Left child index
    int right = 2 * i + 2;     // Right child index

    // 🔍 If left child is larger than root
    if (left < n && arr[left] > arr[largest])
        largest = left;

    // 🔍 If right child is larger than current largest
    if (right < n && arr[right] > arr[largest])
        largest = right;

    // 🔁 If root is not largest, swap and heapify
    if (largest != i) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;

        // 🔁 Heapify the affected subtree
        heapify(arr, n, largest);
    }
}

// 🚀 Main Heap Sort function
void heapSort(int arr[], int n) {
    // 🔧 Step 1: Build max heap (from bottom-up)
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    // 🌀 Step 2: Extract elements one by one
    for (int i = n - 1; i >= 0; i--) {
        // Swap root with current end
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // Call heapify on the reduced heap
        heapify(arr, i, 0);
    }
}

// 🖨 Print array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// 🔰 Main function
int main() {
    // 🎯 Fixed array input
    int arr[] = {7, 11, 9, 2, 17, 4};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original Array: ");
    printArray(arr, n);

    // 🚀 Sort the array
    heapSort(arr, n);

    printf("Sorted Array: ");
    printArray(arr, n);

    return 0;
}
