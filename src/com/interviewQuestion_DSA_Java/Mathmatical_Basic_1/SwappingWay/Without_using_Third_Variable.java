package com.interviewQuestion_DSA_Java.Mathmatical_Basic_1.SwappingWay;

public class Without_using_Third_Variable {
    public static void main(String[] args) {
        int x = 10, y = 5;
        // Swapping using XOR bitwise operator
        x = x ^ y; // x now contains the XOR of original x and y
        y = x ^ y; // y now contains the original x (because x ^ y ^ y = x)
        x = x ^ y; // x now contains the original y (because x ^ y ^ x = y)

        // Printing the swapped values
        System.out.println("After Swapping: x = " + x + ", y = " + y);
    }
}/*Here's the equivalent Java code along with comments explaining each part of the code:

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
