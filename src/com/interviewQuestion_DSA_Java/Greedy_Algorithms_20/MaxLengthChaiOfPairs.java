package com.interviewQuestion_DSA_Java.Greedy_Algorithms_20;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChaiOfPairs {
    public static void main(String[] args) {
//        int pairs[][] = { { 5, 24 }, { 15, 25 }, { 27, 40 }, { 50, 60 } };
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 },{50, 90} };

        // Sorting based on the first element of each pair
        // Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(pairs, Comparator.comparingDouble(a->a[1]));

        // Printing sorted 2D array using deepToString()
        System.out.println("Sorted 2D array:Using deepToString()");
        System.out.println(Arrays.deepToString(pairs));

        // Printing sorted 2D array using for loop
        System.out.println("Sorted 2D array:Using for loop");
        try {
            for(int[] p : pairs){
                System.out.println(Arrays.toString(p));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //main Login of MaxLengthChainOfPairs
        int chainLen = 1;
        int chainEnd = pairs[0][1]; //Last selected pair end // chainEnd = 24

        for(int i=1; i<pairs.length; i++){
           if(pairs[i][0] > chainEnd){
               chainLen++;
               chainEnd = pairs[i][1];
           }
        }
        System.out.println("Maximum Length Chain of Pairs: "+chainLen);
    }
}
/*Dry Run and Deep Explanation of MaxLengthChaiOfPairs
The goal of this program is to find the Maximum Length Chain of Pairs using a Greedy Algorithm approach.

A pair is defined as {start, end}, and the chain is formed if the start of a pair is greater than the end of the previous selected pair.

Step-by-Step Execution (Dry Run)
Input:
java
Copy
Edit
int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90} };
Each row represents a pair {start, end}.

Step 1: Sorting the Pairs
java
Copy
Edit
Arrays.sort(pairs, Comparator.comparingDouble(a -> a[1]));
🔹 Sorting Condition:

The array is sorted based on the second element (end) of each pair in ascending order.

This helps in selecting the earliest finishing pair first (Greedy Approach).

Sorted Output:
Copy
Edit
{5, 24}
{5, 28}
{27, 40}
{39, 60}
{50, 90}
Step 2: Printing the Sorted Array
java
Copy
Edit
System.out.println(Arrays.deepToString(pairs));
🔹 Output:

css
Copy
Edit
[[5, 24], [5, 28], [27, 40], [39, 60], [50, 90]]
Step 3: Maximum Length Chain Calculation
java
Copy
Edit
int chainLen = 1; // Initially selecting the first pair
int chainEnd = pairs[0][1]; // Last selected pair's end value
🔹 Initial Values:

chainLen = 1 (We select the first pair {5,24})

chainEnd = 24 (End of first pair)

Step 4: Iterating Over the Sorted Pairs
java
Copy
Edit
for (int i = 1; i < pairs.length; i++) {
    if (pairs[i][0] > chainEnd) { // If start of new pair > last chain end
        chainLen++; // Increment the chain count
        chainEnd = pairs[i][1]; // Update the chainEnd
    }
}
Iteration	Pair {start, end}	Condition (start > chainEnd)	Action	Updated Chain Length (chainLen)	Updated chainEnd
1	{5, 28}	5 > 24 ❌ (No)	Skip	1	24
2	{27, 40}	27 > 24 ✅ (Yes)	Add to Chain	2	40
3	{39, 60}	39 > 40 ❌ (No)	Skip	2	40
4	{50, 90}	50 > 40 ✅ (Yes)	Add to Chain	3	90
Final Output
java
Copy
Edit
System.out.println("Maximum Length Chain of Pairs: " + chainLen);
🔹 Final Value of chainLen = 3

Output:

yaml
Copy
Edit
Maximum Length Chain of Pairs: 3
Summary of Greedy Approach
Sort pairs based on the end value (ascending order).

Initialize the first pair in the chain (chainLen = 1).

Iterate through the pairs:

If a new pair's start is greater than the end of the last selected pair, add it to the chain.

Update chainLen and chainEnd accordingly.

Return the maximum chain length.

Time Complexity Analysis
Sorting Step: O(N log N) (Using Arrays.sort)

Iteration Step: O(N)

Total Complexity: O(N log N)

Key Takeaways
✔ Sorting by the ending time ensures we can fit the maximum number of non-overlapping pairs.
✔ Greedy selection of the earliest finishing pair ensures we leave room for more chains.
✔ Efficient solution with O(N log N) complexity using sorting + iteration.

This is a classic Greedy Algorithm problem similar to Activity Selection in scheduling tasks! 🚀 Let me know if you need more clarifications! 😊*/