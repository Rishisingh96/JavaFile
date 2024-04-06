package com.interviewQuestion_DSA_Java.Mathmatical_Basic_1;

import java.util.Scanner;

public class Armstrong {
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        if (Armstrong_number(n)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        System.out.println("Enter your 1 number : ");
        int y = sc.nextInt();

        System.out.println("Enter your second number : ");
        int x = sc.nextInt();
        System.out.println(add(y,x));
    }

    private static int add(int f, int z) {
        return f+z;

    }

    public static boolean Armstrong_number(int n) {
        int r, temp;
        temp = n;

        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        return temp == sum;
    }

}
//chatGPT
/*Let's delve into the Armstrong number program in Java, step by step, using an example.

### Example: Checking if 153 is an Armstrong Number

#### Step 1: Understanding Armstrong Number
An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

#### Step 2: Input from User
```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number : ");
int n = sc.nextInt();
```
In this example, let's assume the user inputs `153`.

#### Step 3: Method `Armstrong_number(int n)`
```java
public static boolean Armstrong_number(int n) {
    int r, temp;
    temp = n;

    while (n > 0) {
        r = n % 10;
        sum = sum + (r * r * r);
        n = n / 10;
    }

    return temp == sum;
}
```
This method takes an integer `n` as input and calculates whether `n` is an Armstrong number. Let's break it down:

- `temp = n`: We store the original value of `n` in `temp` variable for later comparison.
- `while (n > 0)`: We loop through each digit of `n`.
- `r = n % 10`: We extract the last digit of `n` using the modulo operator `%`.
- `sum = sum + (r * r * r)`: We cube the digit `r` and add it to `sum`.
- `n = n / 10`: We remove the last digit from `n`.
- Finally, we return `true` if `temp` (the original number) is equal to `sum`, indicating `n` is an Armstrong number.

#### Step 4: Main Method
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number : ");
    int n = sc.nextInt();

    if (Armstrong_number(n)) {
        System.out.println("Armstrong number");
    } else {
        System.out.println("Not an Armstrong number");
    }
}
```
In the `main` method, we take the input from the user, call the `Armstrong_number` method with the input, and print whether the input number is an Armstrong number or not based on the return value.

#### Step 5: Running the Program
If the user inputs `153`, the program will perform the following calculations:
- `1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153`
- Since `153` equals the sum of its own digits each raised to the power of the number of digits, it's an Armstrong number.
- Therefore, the output will be: "Armstrong number"

This example demonstrates how the Java program checks whether a number is an Armstrong number or not.
*/

/*
Let's check whether the number 55 is an Armstrong number using the provided Java program.

### Example: Checking if 55 is an Armstrong Number

#### Step 1: Understanding Armstrong Number
An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

#### Step 2: Input from User
```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number : ");
int n = sc.nextInt();
```
In this example, we want to check whether 55 is an Armstrong number.

#### Step 3: Method `Armstrong_number(int n)`
```java
public static boolean Armstrong_number(int n) {
    int r, temp;
    temp = n;

    while (n > 0) {
        r = n % 10;
        sum = sum + (r * r * r);
        n = n / 10;
    }

    return temp == sum;
}
```
This method takes an integer `n` as input and calculates whether `n` is an Armstrong number.

#### Step 4: Main Method
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number : ");
    int n = sc.nextInt();

    if (Armstrong_number(n)) {
        System.out.println("Armstrong number");
    } else {
        System.out.println("Not an Armstrong number");
    }
}
```
In the `main` method, we take the input from the user, call the `Armstrong_number` method with the input, and print whether the input number is an Armstrong number or not based on the return value.

#### Step 5: Running the Program with 55
If we input `55`, the program will perform the following calculations:
- `5^3 + 5^3 = 125 + 125 = 250`
- Since `250` is not equal to `55`, `55` is not an Armstrong number.
- Therefore, the output will be: "Not an Armstrong number"

This example demonstrates that the number `55` is not an Armstrong number.
 */