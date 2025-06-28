#include <stdio.h>

// ✅ Function to perform Selection Sort
void selectionSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;  // Assume the current element is the smallest

        // 🔍 Find index of minimum element in the unsorted part
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;  // Update minIndex if smaller element found
            }
        }

        // 🔁 Swap the found minimum element with current element
        if (minIndex != i) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

// ✅ Function to print the array
void printArray(int arr[], int n) {
    printf("Sorted Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// ✅ Main function
int main() {
    int arr[100], n;

    // 🔹 Get the number of elements
    printf("Enter number of elements: ");
    scanf("%d", &n);

    // 🔹 Input elements into the array
    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // 🔧 Call sorting function
    selectionSort(arr, n);

    // ✅ Print the sorted array
    printArray(arr, n);

    return 0;
}
/*
Enter number of elements: 5
Enter 5 integers:
44 22 99 11 66

Sorted Array: 11 22 44 66 99
*/