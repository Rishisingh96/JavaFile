package com.interviewQuestion_DSA_Java.Recursion_8;
/*
    Call Stack - memory
*/
public class Decreasing_Order {
    public static void main(String[] args) {
        int n= 10;
        printDec(n);
    }

    private static void printDec(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
}
//chatGPT
/*Certainly! Let's break down how the provided Java code uses recursion to print numbers from 10 to 1 in decreasing order.

### Understanding the Recursion Code

#### 1. Main Method
```java
public static void main(String[] args) {
    int n = 10;
    printDec(n);
}
```
- The `main` method initializes an integer variable `n` with the value `10`.
- Then, it calls the method `printDec` with the value of `n`.

#### 2. Recursive Method `printDec`
```java
private static void printDec(int n) {
    if (n == 1) {
        System.out.println(n);
        return;
    }
    System.out.println(n + " ");
    printDec(n - 1);
}
```
- The `printDec` method takes an integer parameter `n` representing the current number to print.
- It checks if `n` is equal to `1`. If so, it prints `1` and returns.
- Otherwise, it prints the current value of `n` followed by a space.
- Then, it calls itself recursively with the value `n - 1`.

### Execution Steps for Printing 1-10 in Decreasing Order

1. Initially, `printDec(10)` is called from the `main` method.
2. Inside `printDec(10)`:
   - Since `n` (which is 10) is not equal to 1, it prints `10` and calls `printDec(9)`.
3. Inside `printDec(9)`:
   - Since `n` (which is 9) is not equal to 1, it prints `9` and calls `printDec(8)`.
4. This process continues until `printDec(1)` is called:
   - Inside `printDec(1)`:
     - Since `n` (which is 1) is equal to 1, it prints `1` and returns.
5. As the recursive calls unwind, each number from `10` down to `1` is printed in decreasing order.

### Output
The output of the program will be:
```
10
9
8
7
6
5
4
3
2
1
```

### Conclusion
This recursion-based approach demonstrates how you can print numbers in decreasing order from 10 to 1 using a simple recursive method. Each recursive call reduces the value of `n` until it reaches 1, printing each value along the way.
*/