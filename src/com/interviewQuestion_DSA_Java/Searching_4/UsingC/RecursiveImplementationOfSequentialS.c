#include <stdio.h>

int sequentialSearchRecursive(int arr[], int n, int key, int index) {
    if (index >= n) {
        return -1; // Base case: key not found
    }
    if (arr[index] == key) {
        return index; // Base case: key found
    }
    return sequentialSearchRecursive(arr, n, key, index + 1); // Recursive step
}

int main() {
    int arr[] = {10, 25, 30, 45, 50};
    int key = 30;
    int n = sizeof(arr) / sizeof(arr[0]);

    int result = sequentialSearchRecursive(arr, n, key, 0);
    if (result != -1)
        printf("Key found at index %d\n", result);
    else
        printf("Key not found in the array\n");

    return 0;
}
