#include <stdio.h>

// 🔍 Function to perform binary search
int binarySearch(int arr[], int size, int key) {
    int start = 0, end = size - 1;

    while (start <= end) {
        // ✅ To avoid integer overflow
        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid;  // Key found
        } else if (arr[mid] < key) {
            start = mid + 1;  // Search right half
        } else {
            end = mid - 1;    // Search left half
        }
    }

    return -1;  // Key not found
}

// 🧪 Main function to test binary search
int main() {
    // 🔢 Sorted input array
    int arr[] = {1, 3, 5, 7, 9};
    int size = sizeof(arr) / sizeof(arr[0]);
    int key = 7;

    // 🚀 Perform binary search
    int index = binarySearch(arr, size, key);

    // 📢 Print result
    if (index != -1) {
        printf("Index for key %d is: %d\n", key, index);
    } else {
        printf("Key not found in array.\n");
    }

    return 0;
}
