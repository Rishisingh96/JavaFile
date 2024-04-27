package com.interviewQuestion_DSA_Java.Searching_4;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = {13,15,18,20,33,40,42,45,48,51,57,60};
        int size = arr.length; // Corrected size to actual array length
        int k = 20;
        boolean found = false; // Added a flag to track whether element is found or not
        for (int i = 0; i < size; i++) {
            if (arr[i] == k) {
                found = true;
                break; // No need to continue searching if element is found
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
