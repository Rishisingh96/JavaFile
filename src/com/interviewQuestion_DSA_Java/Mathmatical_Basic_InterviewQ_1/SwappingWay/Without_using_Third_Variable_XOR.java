package com.interviewQuestion_DSA_Java.Mathmatical_Basic_InterviewQ_1.SwappingWay;

public class Without_using_Third_Variable_XOR {
    public static void main(String[] args) {
        int x = 10, y = 5;
        // Swapping using XOR bitwise operator
        x = x ^ y; // x now contains the XOR of original x and y
        y = x ^ y; // y now contains the original x (because x ^ y ^ y = x)
        x = x ^ y; // x now contains the original y (because x ^ y ^ x = y)
//          Printing the swapped values
         System.out.println("After Swapping: x = " + x + ", y = " + y);

        /*
        x = 10^5; = 15
        y =15^5 ; = 10
        x =15^10 = 5
        */


//       int  a = 10^5;
//        System.out.println(a);
    }
}

/*Here's the equivalent Java code along with comments explaining each part of the code:

```java
public class Main {
    public static void main(String[] args) {
        int x = 10, y = 5;

        // Swapping using XOR bitwise operator
        x = x ^ y; // x now contains the XOR of original x and y
        y = x ^ y; // y now contains the original x (because x ^ y ^ y = x)
        x = x ^ y; // x now contains the original y (because x ^ y ^ x = y)

        // Printing the swapped values
        System.out.println("After Swapping: x = " + x + ", y = " + y);
    }
}
```

### Explanation with Comments:

1. **Variable Initialization**:
   - Initialize two integer variables `x` and `y` with values 10 and 5 respectively.

2. **Swapping using XOR**:
   - `x = x ^ y;` - Perform bitwise XOR operation between `x` and `y` and assign the result to `x`. Now `x` contains the XOR of original `x` and `y`.
   - `y = x ^ y;` - Perform bitwise XOR operation between updated `x` and original `y` and assign the result to `y`. Now `y` contains the original value of `x` (before swapping).
   - `x = x ^ y;` - Perform bitwise XOR operation between updated `x` (which contains the XOR of original `x` and `y`) and updated `y` (which contains the original value of `x`). Assign the result to `x`. Now `x` contains the original value of `y` (before swapping).

3. **Output**:
   - Print the swapped values of `x` and `y` using `System.out.println()`.

This code swaps the values of `x` and `y` without using a temporary variable, using the XOR bitwise operator technique.*/
/*
Certainly! Here's the algorithm and pseudo-code for swapping two variables using the XOR bitwise operator in Java:

Algorithm:
1. Initialize two variables, let's say `x` and `y`, with the values to be swapped.
2. Perform XOR operation between `x` and `y` and store the result in `x`.
3. Perform XOR operation between `x` and `y` and store the result in `y`.
4. Perform XOR operation between `x` and `y` and store the result in `x`.
5. Now, `x` and `y` have been swapped.

Pseudo-code:
```java
// Function to swap two numbers using XOR bitwise operator
public static void swapUsingXOR(int x, int y) {
    // Swapping using XOR bitwise operator
    x = x ^ y; // Step 2: x now contains the XOR of original x and y
    y = x ^ y; // Step 3: y now contains the original x
    x = x ^ y; // Step 4: x now contains the original y
    // Printing the swapped values
    System.out.println("After Swapping: x = " + x + ", y = " + y);
}

// Example usage
public static void main(String[] args) {
    // Initialize variables
    int x = 10, y = 5;
    // Call the swap function
    swapUsingXOR(x, y);
}
```

This algorithm and pseudo-code demonstrate how to swap two variables `x` and `y` using the XOR bitwise operator without using a temporary variable in Java.

*/