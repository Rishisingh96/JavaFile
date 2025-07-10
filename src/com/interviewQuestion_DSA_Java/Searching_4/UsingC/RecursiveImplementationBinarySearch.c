#include <stdio.h>
int binarySearchRecursive(int arr[], int low, int high, int key) {
    if (low > high)
        return -1; // Base case: key not found
int mid = (low + high) / 2;
if (arr[mid] == key)
        return mid;
    else if (key < arr[mid])
        return binarySearchRecursive(arr, low, mid - 1, key);
    else
        return binarySearchRecursive(arr, mid + 1, high, key);
}
int main() {
    int arr[] = {5, 15, 25, 35, 45};
    int key = 25;
    int n = sizeof(arr) / sizeof(arr[0]);
int result = binarySearchRecursive(arr, 0, n - 1, key);
    if (result != -1)
        printf("Key found at index %d\n", result);
    else
        printf("Key not found in the array\n");
return 0;
}
