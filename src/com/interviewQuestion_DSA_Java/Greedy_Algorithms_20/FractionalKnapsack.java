package com.interviewQuestion_DSA_Java.Greedy_Algorithms_20;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        //oth col => idx; 1st col => ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        //ascending order
//        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));
//        System.out.println(ratio);
//        Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));
        Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));
        System.out.println(ratio);
        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { //include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                //include fraction of item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum value we can obtain = " + finalVal);
    }
}

/*
Let's perform a detailed dry run of the FractionalKnapsack program step by step. The program implements the Fractional Knapsack problem using the greedy algorithm. The goal is to maximize the total value of the items in the knapsack by potentially including fractions of items when the capacity isn't sufficient to include the whole item.

Problem Setup:
We have the following:

Values (val) of the items: {60, 100, 120}

Weights (weight) of the items: {10, 20, 30}

Capacity (W) of the knapsack: 50 units

The Objective:
We need to maximize the value that can be included in the knapsack, potentially by including fractions of items if necessary.

Dry Run:
Step 1: Initialize the value and weight arrays.
java
Copy
Edit
int val[] = {60, 100, 120};
int weight[] = {10, 20, 30};
int W = 50;
This initializes:

val[] = {60, 100, 120} → values of 3 items.

weight[] = {10, 20, 30} → corresponding weights of the items.

W = 50 → total capacity of the knapsack.

Step 2: Calculate value-to-weight ratio for each item.
java
Copy
Edit
double ratio[][] = new double[val.length][2];
This creates a 2D array ratio[][] of size 3 × 2, where:

Column 0 (ratio[i][0]) will store the index of the item.

Column 1 (ratio[i][1]) will store the value-to-weight ratio of the item.

Next, we populate the ratio array by calculating the value-to-weight ratio for each item.

java
Copy
Edit
for (int i = 0; i < val.length; i++) {
    ratio[i][0] = i;
    ratio[i][1] = val[i] / (double) weight[i];
}
Let's calculate the value-to-weight ratio for each item:

For the first item (index 0):
ratio
[
0
]
[
1
]
=
60
10
=
6.0
ratio[0][1]=
10
60
​
 =6.0
ratio
[
0
]
[
0
]
=
0
ratio[0][0]=0 (stores the index).

For the second item (index 1):
ratio
[
1
]
[
1
]
=
100
20
=
5.0
ratio[1][1]=
20
100
​
 =5.0
ratio
[
1
]
[
0
]
=
1
ratio[1][0]=1.

For the third item (index 2):
ratio
[
2
]
[
1
]
=
120
30
=
4.0
ratio[2][1]=
30
120
​
 =4.0
ratio
[
2
]
[
0
]
=
2
ratio[2][0]=2.

So after this loop, the ratio array looks like this:

plaintext
Copy
Edit
ratio = {
  {0, 6.0},
  {1, 5.0},
  {2, 4.0}
}
Step 3: Sort the items based on the value-to-weight ratio (descending order).
java
Copy
Edit
Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));
This sorts the ratio[][] array in ascending order based on the value-to-weight ratio (a[1]). After sorting, the array becomes:

plaintext
Copy
Edit
ratio = {
  {2, 4.0},
  {1, 5.0},
  {0, 6.0}
}
To process in descending order, we iterate in reverse in the next step.

Step 4: Initialize the knapsack and compute the maximum value.
java
Copy
Edit
int capacity = W;   // capacity = 50
int finalVal = 0;   // finalVal = 0 (initial value)
Here, we initialize capacity to the total capacity of the knapsack (50), and finalVal to store the maximum value we can accumulate in the knapsack.

Step 5: Loop through the items and select them based on their value-to-weight ratio.
java
Copy
Edit
for (int i = ratio.length - 1; i >= 0; i--) {
This loop processes the items in descending order of the value-to-weight ratio (from the highest ratio to the lowest).

First Iteration (i = 2):

java
Copy
Edit
int idx = (int) ratio[i][0];  // idx = 0 (index of item with ratio 6.0)
The item with index 0 has the highest value-to-weight ratio (6.0).

The weight of this item is weight[0] = 10.

Since the current capacity (50) is greater than the item's weight (10), we include the full item:

java
Copy
Edit
if (capacity >= weight[idx]) {
    finalVal += val[idx];   // finalVal += 60 (full value of item 0)
    capacity -= weight[idx];   // capacity -= 10 (remaining capacity = 40)
}
After this iteration:

finalVal = 60

capacity = 40

Second Iteration (i = 1):

java
Copy
Edit
int idx = (int) ratio[i][0];  // idx = 1 (index of item with ratio 5.0)
The item with index 1 has the next highest value-to-weight ratio (5.0).

The weight of this item is weight[1] = 20.

Since the current capacity (40) is greater than the item's weight (20), we include the full item:

java
Copy
Edit
if (capacity >= weight[idx]) {
    finalVal += val[idx];   // finalVal += 100 (full value of item 1)
    capacity -= weight[idx];   // capacity -= 20 (remaining capacity = 20)
}
After this iteration:

finalVal = 160

capacity = 20

Third Iteration (i = 0):

java
Copy
Edit
int idx = (int) ratio[i][0];  // idx = 2 (index of item with ratio 4.0)
The item with index 2 has the next highest value-to-weight ratio (4.0).

The weight of this item is weight[2] = 30.

Since the current capacity (20) is less than the item's weight (30), we include a fraction of this item:

java
Copy
Edit
else {
    finalVal += (ratio[i][1] * capacity);   // finalVal += (4.0 * 20) = 80
    capacity = 0;   // capacity is now 0
    break;   // knapsack is full, exit loop
}
After this iteration:

finalVal = 240

capacity = 0 (the knapsack is full)

Step 6: Output the result.
java
Copy
Edit
System.out.println("Maximum value we can obtain = " + finalVal);
The final output will be:

plaintext
Copy
Edit
Maximum value we can obtain = 240
Conclusion:
The maximum value we can obtain from the items in the knapsack is 240.

We included the full first two items and a fraction of the third item (two-thirds of it).

This completes the dry run for the Fractional Knapsack problem.
*/
