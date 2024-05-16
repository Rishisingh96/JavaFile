package com.Java.Universal.Week2;
import java.util.Scanner;
public class Matrices3x3_Q7 {
    // Function to input a 3x3 matrix
    public static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Row %d: ", i + 1);
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to print a 3x3 matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to multiply two 3x3 matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];


        System.out.println("Enter the elements of the first matrix:");
        inputMatrix(matrix1);

        System.out.println("\nEnter the elements of the second matrix:");
        inputMatrix(matrix2);

        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        System.out.println("\nResult of multiplication:");
        printMatrix(multiplicationResult);
    }
}

/*
Sure, let's dry run the `multiplyMatrices` method:

1. Initialize a 3x3 array called `result` to store the result of the matrix multiplication.
2. Start two nested loops iterating through rows and columns of the `result` array.
   - The outer loop (`i`) iterates through the rows.
   - The inner loop (`j`) iterates through the columns.
3. For each element in the `result` array:
   - Initialize the current element to 0.
   - Start another loop (`k`) to iterate through the common dimension of the matrices (3 in this case).
   - Multiply the corresponding elements of the `matrix1` row `i` and `matrix2` column `k`, and add the result to the current element of `result[i][j]`.
4. Once all elements of `result` are computed, return the resulting 3x3 array.

Let's apply this logic step by step:

- `result[0][0]` calculation:
  - `result[0][0] = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0] + matrix1[0][2] * matrix2[2][0]`
  - `result[0][0] = (1 * 4) + (2 * 7) + (3 * 10) = 4 + 14 + 30 = 48`

- Similarly, calculate `result[0][1]`, `result[0][2]`, `result[1][0]`, `result[1][1]`, `result[1][2]`, `result[2][0]`, `result[2][1]`, and `result[2][2]`.

Here's the resulting `result` array:

```
48  54  60
111 126 141
174 198 222
```

This array represents the result of multiplying the two input matrices `matrix1` and `matrix2`.
*/
