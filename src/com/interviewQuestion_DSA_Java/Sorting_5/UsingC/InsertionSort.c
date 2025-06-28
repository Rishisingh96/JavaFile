#include <stdio.h>

// Function to perform insertion sort
void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i];   // Element to insert
        int j = i - 1;

        // Shift elements greater than key to one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
}

// Function to print array
void printArray(int arr[], int n) {
    printf("Sorted Array: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// Main function (with input)
int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];  // Variable Length Array (VLA)

    printf("Enter %d integers:\n", n);
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    insertionSort(arr, n);
    printArray(arr, n);

    return 0;
}

/*
Enter number of elements: 6
Enter 6 integers:
9 4 5 2 8 1
Sorted Array: 1 2 4 5 8 9
*/