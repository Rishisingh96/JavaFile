#include <stdio.h>

// 🔁 Function to swap two integers
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// 🔍 Partition function for Quick Sort
// It places the pivot at the correct position
// and rearranges elements around it
int partition(int arr[], int low, int high) {
    int pivot = arr[high];  // ✅ Pivot element (last element)
    int i = low - 1;        // Index of smaller element

    // 🔁 Traverse from low to high - 1
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;                    // Increment index of smaller element
            swap(&arr[i], &arr[j]); // Swap with current element
        }
    }

    // 🔁 Swap pivot to the correct position
    swap(&arr[i + 1], &arr[high]);

    return (i + 1);  // Return partition index
}

// 🔁 Recursive Quick Sort function
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        // 🔹 Partition the array and get pivot index
        int pi = partition(arr, low, high);

        // 🔁 Recursively sort elements before and after pivot
        quickSort(arr, low, pi - 1);   // Left side
        quickSort(arr, pi + 1, high);  // Right side
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

    // 📥 Input number of elements
    printf("Enter number of elements: ");
    scanf("%d", &n);

    // 📥 Input array elements
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // 🚀 Call Quick Sort
    quickSort(arr, 0, n - 1);

    // 🖨 Print sorted array
    printArray(arr, n);

    return 0;
}
