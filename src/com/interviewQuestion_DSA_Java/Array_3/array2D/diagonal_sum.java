package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class diagonal_sum {
    public static int digonalSum(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

        public static void main (String[]args){
            int matrix[][] = {  {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}};
            System.out.println(digonalSum(matrix));
        }
    }


/*👉 2D square matrix ke do diagonal hote hain:

Primary diagonal → i == j

Secondary diagonal → i + j == n - 1

Ab best optimized code likhte hain:

package com.interviewQuestion_DSA_Java.Array_3.array2D;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal (avoid double counting if n is odd)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Diagonal Sum = " + diagonalSum(matrix));
    }
}

✅ Why this is best?

Time Complexity → O(n) (only single loop)

Space Complexity → O(1)

Handles both primary + secondary diagonal

Avoids double counting center element in odd-sized matrix (e.g., 3x3, 5x5, etc.)*/