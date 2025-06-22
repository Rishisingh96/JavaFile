package com.interviewQuestion_DSA_Java.Searching_4.SearchingUsingJava;

public class Binary_Search {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Fix: Avoid overflow

            // comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int numbers[] = { 2, 4, 8, 9, 10,11, 12, 14 };
        int numbers[] = { 1,3,5,7,9 };
        int key = 7;
        System.out.println("index for key is: " + binarySearch(numbers, key));
    }
}
//Now the Arrays.sort(numbers) line ensures that the array is sorted before applying the binary search. This should resolve any issues related to the input array not being sorted.

/*The code provided is already applying binary search correctly on a sorted array, so there is no need to worry about sorting the array in this specific example. Since the array in the current code is { 1, 3, 5, 7, 9 }, it is already sorted, and binary search will work directly.

Let's do a quick dry run of the binary search for this array and key 7 to ensure it works as expected.

Input:
Array: { 1, 3, 5, 7, 9 }
Key: 7
Dry Run:
Initial Setup:

start = 0
end = 4 (length of array - 1)
Array: { 1, 3, 5, 7, 9 }
First Iteration:

Calculate mid = start + (end - start) / 2 = 0 + (4 - 0) / 2 = 2
mid = 2
numbers[mid] = numbers[2] = 5
Comparison:

numbers[mid] = 5, which is less than key = 7
Move to the right half of the array, so set start = mid + 1 = 2 + 1 = 3
Second Iteration:

start = 3, end = 4
Calculate mid = start + (end - start) / 2 = 3 + (4 - 3) / 2 = 3
mid = 3
numbers[mid] = numbers[3] = 7
Comparison:

numbers[mid] = 7, which is equal to key = 7
We found the key, so return mid = 3.
Output:
The index of the key 7 is 3.
Result:
The program will print:
vbnet
Copy code
index for key is: 3
Clarification on the Comment:
The comment Arrays.sort(numbers) in the code was meant to indicate that binary search only works on sorted arrays. However, in your example, the array is already sorted, so no explicit sorting is necessary before applying the binary search. If you had an unsorted array, you would need to sort it using Arrays.sort(numbers) before calling the binarySearch method.*/