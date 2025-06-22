package com.interviewQuestion_DSA_Java.Searching_4.SearchingUsingJava;

/*1. Linear Search
Time Complexity:

Best Case: O(1)

Worst Case: O(n)

Use Case:

Jab array unsorted ho

Ya chhota array ho jisme sorting ka faayda nahi

Jab index ya position important nahi, sirf "mil gaya" check karna ho

*/

public class Linear_Search {

    /**
     * Searches for the key in the given array
     * @param arr The array to search
     * @param key The element to find
     * @return Index of the key if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int key) {
        // 🔁 Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // ✅ Key found at index i
            }
        }
        return -1; // ❌ Key not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 6, 8, 11, 10, 14, 18}; // 📥 Sample array
        int key = 8;                              // 🔎 Target value

        int index = linearSearch(arr, key);       // 🔍 Search for key

        // 🖨 Print result
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
