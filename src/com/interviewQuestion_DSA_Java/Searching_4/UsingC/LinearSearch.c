
#include <stdio.h>

/*
1. Linear Search
Time Complexity:
🔸 Best Case: O(1)
🔸 Worst Case: O(n)

Use Case:
🔹 Jab array unsorted ho
🔹 Jab array chhota ho (sorting costly ho)
🔹 Jab "mil gaya ya nahi" check karna ho (not index-wise access)
*/

// 🔍 Function to perform linear search
int linearSearch(int arr[], int size, int key) {
    // 🔁 Traverse the array
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            return i; // ✅ Key found at index i
        }
    }
    return -1; // ❌ Key not found
}

// 🔰 Main function
int main() {
    // 📥 Sample array and key
    int arr[] = {4, 7, 6, 8, 11, 10, 14, 18};
    int key = 8;
    int size = sizeof(arr) / sizeof(arr[0]);

    // 🔍 Call search function
    int index = linearSearch(arr, size, key);

    // 🖨 Print result
    if (index != -1) {
        printf("Key found at index: %d\n", index);
    } else {
        printf("Key not found in the array.\n");
    }

    return 0;
}

