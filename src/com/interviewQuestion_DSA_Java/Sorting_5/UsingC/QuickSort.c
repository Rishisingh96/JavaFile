#include <stdio.h>

// 🔁 Function to swap two elements
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// 🔍 Partition the array using Lomuto Partition Scheme
int partition(int arr[], int low, int high) {
    int pivot = arr[high];  // ✅ Choose the last element as pivot
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(&arr[i], &arr[j]);  // 🔁 Move smaller element to left
        }
    }

    swap(&arr[i + 1], &arr[high]);  // ✅ Place pivot at correct position
    return i + 1;
}

// 🔁 Recursive Quick Sort function
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);

        // Recursively sort elements before and after partition
        quickSort(arr, low, pi - 1);   // Left of pivot
        quickSort(arr, pi + 1, high);  // Right of pivot
    }
}

// 🖨 Function to print the array
void printArray(int arr[], int size) {
    printf("Array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// 🔰 Main function
int main() {
    int arr[] = {7, 11, 9, 2, 17, 4};  // 🧩 Input array
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("Original ");
    printArray(arr, size);

    // 🚀 Sort using Quick Sort
    quickSort(arr, 0, size - 1);

    printf("Sorted ");
    printArray(arr, size);

    return 0;
}
