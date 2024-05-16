package com.interviewQuestion_DSA_Java.Array_3.Universal;

import java.util.Arrays;

public class SortArrayWithoutSort {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 0, 1, 1, 2, 2, 0, 1, 2, 1, 0, 0, 1};

        // Count the occurrences of each element
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }

        // Reconstruct the array with sorted elements
        int index = 0;
        while (count0 -- > 0) {
            arr[index++] = 0;
        }
        while (count1-- > 0) {
            arr[index++] = 1;
        }
        while (count2-- > 0) {
            arr[index++] = 2;
        }

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
