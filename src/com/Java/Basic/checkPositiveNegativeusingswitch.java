package com.Java.Basic;

import java.util.Scanner;

public class checkPositiveNegativeusingswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        switch (Integer.signum(number)) {
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
            case 0:
                System.out.println("Positive");
                break;
        }
    }
}
//
/*Let's dry run the provided Java code with an example:

Example:
- User inputs: 5

1. The program prompts the user to enter a number.
2. User enters 5.
3. The program reads the input number as 5.
4. `Integer.signum(5)` returns 1 because 5 is positive.
5. The switch-case statement evaluates the value returned by `Integer.signum(5)`.
6. Since the value is 1, it matches the `case 1:` and prints "Positive".
7. Program execution ends.

Output:
```
Enter a number:
5
Positive
```

This demonstrates that the program correctly identifies the input number 5 as positive and prints "Positive" as the output.

`Integer.signum(int)` is a static method in Java's `Integer` class. It returns the signum function of the specified integer. The signum function returns:

- `-1` if the specified integer is negative,
- `0` if the specified integer is zero, and
- `1` if the specified integer is positive.

Here's how `Integer.signum(int)` works:
- If the specified integer is negative, it returns `-1`.
- If the specified integer is zero, it returns `0`.
- If the specified integer is positive, it returns `1`.

For example:
- `Integer.signum(-5)` will return `-1` because -5 is negative.
- `Integer.signum(0)` will return `0` because 0 is neither positive nor negative.
- `Integer.signum(5)` will return `1` because 5 is positive.
*/