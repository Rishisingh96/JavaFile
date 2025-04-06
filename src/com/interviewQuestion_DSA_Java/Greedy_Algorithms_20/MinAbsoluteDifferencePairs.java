package com.interviewQuestion_DSA_Java.Greedy_Algorithms_20;

import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
//        int A[] = {1,2,3};
//        int B[] = {2,1,3};

        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A); //1,4,7,8
        Arrays.sort(B); //2,3,5,6
        //1+1+2+2 = 6

        int minDiff = 0;

        for(int i = 0; i<A.length; i++){
           minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum Absolute Difference between two arrays is: "+minDiff);
    }
}
/*Explanation and Dry Run of MinAbsoluteDifferencePairs
The goal of this program is to find the minimum absolute difference between two arrays by forming pairs optimally. The greedy strategy involves sorting both arrays and pairing corresponding elements.

Step-by-Step Execution (Dry Run)
Input:
java
Copy
Edit
int A[] = {4, 1, 8, 7};
int B[] = {2, 3, 6, 5};
Step 1: Sorting Both Arrays
java
Copy
Edit
Arrays.sort(A);
Arrays.sort(B);
🔹 Sorted Arrays:

ini
Copy
Edit
A = {1, 4, 7, 8}
B = {2, 3, 5, 6}
Sorting ensures that the smallest element in one array is paired with the smallest in the other to minimize differences.

Step 2: Calculating the Minimum Absolute Difference
java
Copy
Edit
int minDiff = 0;
for (int i = 0; i < A.length; i++) {
    minDiff += Math.abs(A[i] - B[i]);
}
Iteration-wise Calculation:
| Iteration | A[i] | B[i] | |A[i] - B[i]| | minDiff (cumulative) | |-------------|--------|--------|---------------|----------------------| | 1 | 1 | 2 | |1 - 2| = 1 | 0 + 1 = 1 | | 2 | 4 | 3 | |4 - 3| = 1 | 1 + 1 = 2 | | 3 | 7 | 5 | |7 - 5| = 2 | 2 + 2 = 4 | | 4 | 8 | 6 | |8 - 6| = 2 | 4 + 2 = 6 |

Step 3: Printing the Result
java
Copy
Edit
System.out.println("Minimum Absolute Difference between two arrays is: " + minDiff);
🔹 Output:

pgsql
Copy
Edit
Minimum Absolute Difference between two arrays is: 6
Time Complexity Analysis
Sorting Step: O(N log N) (for both arrays)

Iteration Step: O(N)

Total Complexity: O(N log N)

Key Takeaways
✔ Sorting ensures that differences are minimized at every step.
✔ Greedy pairing strategy works optimally for minimum absolute difference.
✔ Efficient O(N log N) solution using sorting + iteration.

This approach is commonly used in array pairing problems and greedy algorithms. 🚀 Let me know if you need further clarification! 😊*/