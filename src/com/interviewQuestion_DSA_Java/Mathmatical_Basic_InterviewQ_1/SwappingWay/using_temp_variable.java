package com.interviewQuestion_DSA_Java.Mathmatical_Basic_InterviewQ_1.SwappingWay;

public class using_temp_variable {

    public static void swap_usingThird(int a,int b){

    }
    public static void main(String[] args) {
        int a = 10, b = 5;

        swap_usingThird(a,b);
    }
}
/*
Certainly! Here's how you can swap two numbers using a third variable (temp) in Java:

**Algorithm:**
1. Initialize three integer variables: `x`, `y`, and `temp`.
2. Assign the value of `x` to `temp`.
3. Assign the value of `y` to `x`.
4. Assign the value of `temp` (which holds the original value of `x`) to `y`.
5. Now, `x` and `y` have been swapped.

**Pseudo-code:**
```
// Function to swap two numbers using a third variable
function swapWithTemp(int x, int y) {
    // Declare a temporary variable
    int temp
    // Assign the value of x to temp
    temp = x
    // Assign the value of y to x
    x = y
    // Assign the value of temp to y
    y = temp
    // Printing the swapped values
    print("After Swapping: x = " + x + ", y = " + y)
}

// Example usage
function main() {
    // Initialize variables
    int x = 10, y = 5
    // Call the swap function
    swapWithTemp(x, y)
}
```

**Java Code:**
```java
// Function to swap two numbers using a third variable
public static void swapWithTemp(int x, int y) {
    // Declare a temporary variable
    int temp;
    // Assign the value of x to temp
    temp = x;
    // Assign the value of y to x
    x = y;
    // Assign the value of temp to y
    y = temp;
    // Printing the swapped values
    System.out.println("After Swapping: x = " + x + ", y = " + y);
}

// Example usage
public static void main(String[] args) {
    // Initialize variables
    int x = 10, y = 5;
    // Call the swap function
    swapWithTemp(x, y);
}
```

In this code, `x` and `y` are swapped using a third variable `temp`. The value of `x` is temporarily stored in `temp`, then `x` is assigned the value of `y`, and finally `y` is assigned the original value of `x` stored in `temp`.
*/