#include <stdio.h>

// 🔁 Merge two sorted subarrays into one sorted array
void merge(int arr[], int left, int mid, int right) {
    int n1 = mid - left + 1;    // Size of left subarray
    int n2 = right - mid;       // Size of right subarray

    int L[n1], R[n2];           // Temporary arrays

    // Copy data to temp arrays L[] and R[]
    for (int i = 0; i < n1; i++)
        L[i] = arr[left + i];

    for (int j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = left;

    // Merge the temp arrays back into arr[]
    while (i < n1 && j < n2) {
        if (L[i] <= R[j])
            arr[k++] = L[i++];
        else
            arr[k++] = R[j++];
    }

    // Copy remaining elements of L[], if any
    while (i < n1)
        arr[k++] = L[i++];

    // Copy remaining elements of R[], if any
    while (j < n2)
        arr[k++] = R[j++];
}

// 🔁 Recursive Merge Sort function
void mergeSort(int arr[], int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;

        // Sort first and second halves
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // Merge the sorted halves
        merge(arr, left, mid, right);
    }
}

// 🖨 Function to print the array
void printArray(int arr[], int size) {
    printf("Array: ");
    for (int i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// 🔰 Main function
int main() {
    int arr[] = {7, 11, 9, 2, 17, 4};  // 🎯 Input array
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("Original ");
    printArray(arr, size);

    // 🚀 Apply Merge Sort
    mergeSort(arr, 0, size - 1);

    printf("Sorted ");
    printArray(arr, size);

    return 0;
}
