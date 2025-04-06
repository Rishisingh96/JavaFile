package com.interviewQuestion_DSA_Java.Array_3.array2D;

/*
    ❓ Question:
    Write a program to rotate a square 2D array (NxN) by 90 degrees clockwise **in-place**.

    🔁 Rotation Example (90 degrees clockwise):

    Input:
    1 2 3
    4 5 6
    7 8 9

    Output:
    7 4 1
    8 5 2
    9 6 3

    👉 Constraints:
    - The matrix must be a square matrix (same number of rows and columns)
    - Do not use extra space for another matrix
*/

public class Rotated2DArray {

    // ✅ Method to rotate the matrix by 90 degrees clockwise in-place
    public void rotate(int[][] matrix) {
        int l = 0;                      // Left index (starting column of layer)
        int r = matrix.length - 1;      // Right index (ending column of layer)

        // 🧠 Process layers from outer to inner
        while (l < r) {
            for (int i = 0; i < r - l; i++) {
                int top = l;            // Top row index
                int bottom = r;         // Bottom row index

                // 💡 Perform 4-way element swap
                int topLeft = matrix[top][l + i];

                // 🔄 Rotating clockwise:
                // left → top
                matrix[top][l + i] = matrix[bottom - i][l];

                // bottom → left
                matrix[bottom - i][l] = matrix[bottom][r - i];

                // right → bottom
                matrix[bottom][r - i] = matrix[top + i][r];

                // top → right
                matrix[top + i][r] = topLeft;
            }
            l++;    // Move to next inner layer
            r--;
        }
    }

    public static void main(String[] args) {
        // 🎯 Example usage of rotate method
        Rotated2DArray rotated2DArray = new Rotated2DArray();

        // 🔢 Square matrix input
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 🚀 Rotate the matrix
        rotated2DArray.rotate(matrix);

        // 📄 Print rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*Absolutely, Rishi! Let's go through a deep dry run of your program line by line using the 3x3 matrix:

✅ Matrix Before Rotation:
Copy
Edit
1 2 3
4 5 6
7 8 9
We’ll walk through each important line in the rotate() method and trace the values with variable values. The matrix is square (3x3), so .length = 3.

🔁 Step-by-Step Dry Run of rotate():
Step 1: Initialization
java
Copy
Edit
int l = 0;
int r = matrix.length - 1;  // r = 2
l = 0 → first layer index (left)

r = 2 → last layer index (right)

We now process the matrix layer by layer. Since 3x3 has only 1 outer layer, this loop will run once for l = 0, r = 2.

🧠 First Layer: l = 0, r = 2
java
Copy
Edit
while (l < r) // 0 < 2 → true
Loop 1: i = 0
java
Copy
Edit
int top = l;        // top = 0
int bottom = r;     // bottom = 2
Now we perform 4 swaps (clockwise) using 4 corner values:

Step 1: Save top-left
java
Copy
Edit
int topLeft = matrix[0][0]; // topLeft = 1
Step 2: left → top
java
Copy
Edit
matrix[0][0] = matrix[2][0]; // matrix[0][0] = 7
Step 3: bottom → left
java
Copy
Edit
matrix[2][0] = matrix[2][2]; // matrix[2][0] = 9
Step 4: right → bottom
java
Copy
Edit
matrix[2][2] = matrix[0][2]; // matrix[2][2] = 3
Step 5: top → right
java
Copy
Edit
matrix[0][2] = topLeft;      // matrix[0][2] = 1
✅ After this iteration, matrix looks like:

Copy
Edit
7 2 1
4 5 6
9 8 3
Loop 2: i = 1
java
Copy
Edit
int topLeft = matrix[0][1];  // topLeft = 2
Step 1: left → top
java
Copy
Edit
matrix[0][1] = matrix[1][0]; // matrix[0][1] = 4
Step 2: bottom → left
java
Copy
Edit
matrix[1][0] = matrix[2][1]; // matrix[1][0] = 8
Step 3: right → bottom
java
Copy
Edit
matrix[2][1] = matrix[1][2]; // matrix[2][1] = 6
Step 4: top → right
java
Copy
Edit
matrix[1][2] = topLeft;      // matrix[1][2] = 2
✅ After second iteration:

Copy
Edit
7 4 1
8 5 2
9 6 3
🧠 Layer Completed
Now we move inward:

java
Copy
Edit
l++; // l = 1
r--; // r = 1
Since l < r is now 1 < 1 → false, the while loop ends.

✅ Final Rotated Matrix (Printed in main()):
Copy
Edit
7 4 1
8 5 2
9 6 3
🔄 Summary of Element Rotations:
From	To	Value
[2][0] → [0][0]	7
[2][2] → [2][0]	9
[0][2] → [2][2]	3
[0][0] → [0][2]	1
And then:

From	To	Value
[1][0] → [0][1]	4
[2][1] → [1][0]	8
[1][2] → [2][1]	6
[0][1] → [1][2]	2
🧠 Concept Used:
Matrix rotation by 90° clockwise is like rotating the elements in groups of 4 (corners) layer by layer.

A 3x3 matrix has only 1 layer (outer border).

Elements are rotated in-place without using any extra array.

If you'd like, I can draw the rotation using diagrams for better visual understanding too. Want that?*/