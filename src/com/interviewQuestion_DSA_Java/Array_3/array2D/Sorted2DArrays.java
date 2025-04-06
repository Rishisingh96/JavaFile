package com.interviewQuestion_DSA_Java.Array_3.array2D;

import java.util.Arrays;
import java.util.Comparator;

public class Sorted2DArrays {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // 1. Sort by First Column (Ascending Order)
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        System.out.println("Sorted by first column (Ascending):");
        print2DArray(pairs);

        // 2. Sort by First Column (Descending Order)
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        System.out.println("Sorted by first column (Descending):");
        print2DArray(pairs);

        // 3. Sort by Second Column (Ascending Order)
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        System.out.println("Sorted by second column (Ascending):");
        print2DArray(pairs);

        // 4. Sort by Second Column (Descending Order)
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[1], a[1]));
        System.out.println("Sorted by second column (Descending):");
        print2DArray(pairs);

        // 5. Sort by Row Sum (Ascending Order)
        Arrays.sort(pairs, Comparator.comparingInt(a -> (a[0] + a[1])));
        System.out.println("Sorted by row sum (Ascending):");
        print2DArray(pairs);

        // 6. Sort by Row Sum (Descending Order)
        Arrays.sort(pairs, (a, b) -> Integer.compare((b[0] + b[1]), (a[0] + a[1])));
        System.out.println("Sorted by row sum (Descending):");
        print2DArray(pairs);
    }

    // Method to print a 2D array
    private static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
