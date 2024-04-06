package com.interviewQuestion_DSA_Java.Recursion_8;

import java.util.Scanner;
/*
fac
* */
public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        n = sc.nextInt();
        int factorial = factorialNumber(n);  // Function calling
        int factorial1 = factorial_saradhaMam(n);  // Function calling
        System.out.println("Factorial = " + factorial);
        System.out.println("Factorial = " + factorial1);
    }

    public static int factorialNumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive call to calculate factorial
            return n * factorialNumber(n - 1);
        }
    }
    public static int factorial_saradhaMam(int n){
        if(n==0){
            return 1;
        }
        int fac1 =factorial_saradhaMam(n-1);
        int fact = n*factorial_saradhaMam(n-1);
        return fact;
    }
}
// CHATGPT CODE explain 3/27/2024
/*
Let's go through the factorial calculation program using recursion in Java step by step, using an example where we calculate the factorial of a number, say 5.

### Example: Calculating Factorial of 5

#### Step 1: Input from User
```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number:");
int n = sc.nextInt();
```
In this example, we'll take `n` as 5.

#### Step 2: Method `factorialNumber(int n)`
```java
public static int factorialNumber(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorialNumber(n - 1);
    }
}
```
This method calculates the factorial of a given number `n` using recursion. Let's break it down:

- Base Case: If `n` is 0 or 1, the factorial is 1, so we return 1.
- Recursive Case: Otherwise, we return `n` multiplied by the factorial of `(n - 1)`.

#### Step 3: Main Method
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    int n = sc.nextInt();
    int factorial = factorialNumber(n);  // Function calling
    System.out.println("Factorial = " + factorial);
}
```
In the `main` method, we take the input from the user, call the `factorialNumber` method with the input, and print the factorial of the input number.

#### Step 4: Running the Program with 5
If we input `5`, the program will perform the following calculations:
- `factorial(5) = 5 * factorial(4)`
- `factorial(4) = 4 * factorial(3)`
- `factorial(3) = 3 * factorial(2)`
- `factorial(2) = 2 * factorial(1)`
- `factorial(1) = 1`
- `factorial(2) = 2 * 1 = 2`
- `factorial(3) = 3 * 2 = 6`
- `factorial(4) = 4 * 6 = 24`
- `factorial(5) = 5 * 24 = 120`

So, the factorial of 5 is 120.

#### Step 5: Output
The program will print:
```
Factorial = 120
```

This example demonstrates how the Java program calculates the factorial of a number using recursion.
*/