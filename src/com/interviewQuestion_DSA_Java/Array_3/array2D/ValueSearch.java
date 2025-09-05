package com.interviewQuestion_DSA_Java.Array_3.array2D;

import java.util.Scanner;

public class ValueSearch {

    // Method to input matrix values
    public static int[][] inputMatrix(int rows, int cols, Scanner sc) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix is:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Method to search key
    public static boolean searchKey(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("✅ Found " + key + " at position (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("❌ Key " + key + " not found in the matrix.");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Input matrix
        int[][] matrix = inputMatrix(rows, cols, sc);

        // Step 3: Print matrix
        printMatrix(matrix);

        // Step 4: Input key
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        // Step 5: Search key
        searchKey(matrix, key);

        sc.close();
    }
}
