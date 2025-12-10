package com.interviewQuestion_DSA_Java.Array_3.Medium;

public class Print_SubarrayNormal {
    public static void main(String[] args) {

        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};

        for (int st = 0; st < n; st++) {
            for (int end = st; end < n; end++) {

                for (int i = st; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
