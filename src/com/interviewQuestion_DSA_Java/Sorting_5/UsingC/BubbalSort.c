#include <stdio.h>

// 🖨 Function to print array elements
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d\t", arr[i]);
    }
    printf("\n");
}

// 🔁 Optimized Bubble Sort Function
void bubbleSort(int arr[], int size) {
    int i, j;
    int swapped;

    // 🌀 Outer loop for passes
    for (i = 0; i < size - 1; i++) {
        swapped = 0;

        // 🔄 Inner loop for comparisons
        for (j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // 🔃 Swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swapped = 1;
            }
        }

        // ✅ If no swaps occurred, array is already sorted
        if (swapped == 0)
            break;
    }
}

// 🔰 Main function
int main() {
    int arr[] = {7, 11, 9, 2, 17, 4};
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("Before Sorting:\n");
    printArray(arr, size);

    bubbleSort(arr, size);

    printf("After Sorting:\n");
    printArray(arr, size);

    return 0;
}
