package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class PrintRowIndexWithMax {
    private static void printRowIndexWithMax(int[][] arr) {
        int index = -1, sum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            if(rowSum > sum) {
                sum = rowSum;
                index = i;
            }
        }
        System.out.println("Row index with maximum sum: " + index);
    }

    static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
     printRowIndexWithMax(arr);

    }


}
