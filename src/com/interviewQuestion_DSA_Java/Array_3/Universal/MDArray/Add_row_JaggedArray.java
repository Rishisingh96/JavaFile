package com.interviewQuestion_DSA_Java.Array_3.Universal.MDArray;

public class Add_row_JaggedArray {
    public static void main(String[] args) {
        int a[][] ={
                {2, 4, 5, 6, 8, 9},
                {3,5,7,6},
                {3,7},
                {4,9,1,4,6}
        };
        int totalSum = 0;
        for(int column[]: a){
            int rowSum = 0; // Reset sum for each row
            for(int row : column){
                System.out.print(row + " ");
                rowSum += row; // Add current element to row sum
                totalSum += row; // Add current element to total sum
            }
            System.out.print(" total is : " + rowSum + " ");
            System.out.println(" ");
        }
        System.out.println("\ntotal is : " + totalSum);
        System.out.println("Size of array is : " + a.length);
        System.out.println("Size of array row 1 is : " + a[0].length);
        System.out.println("Size of array row 2 is : " + a[1].length);
        System.out.println("Size of array row 3 is : " + a[2].length);
        System.out.println("Size of array row 4 is : " + a[3].length);
    }
}

/*Sure, let's dry run the provided code:

1. **Array Initialization**:
   - `int a[][]` is a 2D array declaration.
   - It's initialized with 4 rows.
   - Each row has a different number of columns.

2. **Looping through the Array**:
   - The outer loop iterates through each row (`int column[]: a`).
   - The inner loop iterates through each element in the current row (`int row : column`).

3. **Printing Array Elements**:
   - The inner loop prints each element of the array followed by a space.
   - After printing all elements of a row, it prints the sum of the row.
   - This process continues for all rows.

4. **Calculating Total Sum**:
   - As each element is processed in the inner loop, its value is added to both the row sum and the total sum.

5. **Displaying Array Information**:
   - After iterating through all rows, it prints the total sum of all elements in the array.
   - It also prints the sizes of each row.

6. **Output**:
   - The program displays each element of the array row-wise, along with the sum of each row.
   - Finally, it shows the total sum of all elements and the sizes of each row.

Would you like to visualize any specific part of the dry run?
*/