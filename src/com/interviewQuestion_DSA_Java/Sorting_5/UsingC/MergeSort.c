#include <stdio.h>

// 🔁 Function to merge two sorted subarrays into one sorted array
// Subarray 1: arr[left..mid]
// Subarray 2: arr[mid+1..right]
void merge(int arr[], int left, int mid, int right) {
    int i, j, k;

    // 🔸 Size of two subarrays
    int n1 = mid - left + 1;
    int n2 = right - mid;

    // 🔸 Temporary arrays to hold data
    int L[n1], R[n2];

    // 🔸 Copy data to temp arrays L[] and R[]
    for (i = 0; i < n1; i++)
        L[i] = arr[left + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];

    // 🔁 Merge the temp arrays back into arr[left..right]
    i = 0;         // Index for L[]
    j = 0;         // Index for R[]
    k = left;      // Index for merged array

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k++] = L[i++];
        } else {
            arr[k++] = R[j++];
        }
    }

    // 🔁 Copy remaining elements of L[], if any
    while (i < n1) {
        arr[k++] = L[i++];
    }

    // 🔁 Copy remaining elements of R[], if any
    while (j < n2) {
        arr[k++] = R[j++];
    }
}

// 🔁 Recursive function to divide the array and sort it
void mergeSort(int arr[], int left, int right) {
    if (left < right) {
        // 🔹 Find the middle point
        int mid = left + (right - left) / 2;

        // 🔹 Recursively sort both halves
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // 🔹 Merge sorted halves
        merge(arr, left, mid, right);
    }
}

// 🖨 Function to print the array
void printArray(int arr[], int n) {
    printf("Sorted Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// 🔰 Main function
int main() {
    int arr[100], n;

    // 📥 Input array size
    printf("Enter number of elements: ");
    scanf("%d", &n);

    // 📥 Input array elements
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // 🚀 Call merge sort
    mergeSort(arr, 0, n - 1);

    // 🖨 Print the sorted array
    printArray(arr, n);

    return 0;
}
