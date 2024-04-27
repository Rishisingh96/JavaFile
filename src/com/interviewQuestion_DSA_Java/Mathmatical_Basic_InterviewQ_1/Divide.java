package com.interviewQuestion_DSA_Java.Mathmatical_Basic_InterviewQ_1;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        System.out.println("Enter the value that your want to skip");
        Scanner scanner = new Scanner(System.in);
        // Taking input for the number of elements to print
        int p = scanner.nextInt();
        int count = 0;
        int n = 0;
        // Loop until 'p' elements are printed

        while (count < p) {
            // Generating elements based on the formula 5 * n + 3
            int ele = 5 * n + 3;
            // Checking if the element is divisible by 7
            if (ele % 7 == 0) {
                // If divisible by 7, move to the next iteration
                n++;
                continue;
            } else {
                // If not divisible by 7, print the element and increment the count
                count++;
                System.out.print(ele + " ");
            }
            // Move to the next value of 'n'
            n++;
        }
    }
}


/*The given program aims to find and print the first `p` numbers that meet certain conditions. Here's an explanation of the program:

1. **Input**:
   - The program takes an integer `p` as input, which represents the number of elements to be printed.

2. **Initialization**:
   - Two integer variables `count` and `n` are initialized to 0.
   - `count` is used to keep track of how many numbers have been printed.
   - `n` is used in a loop to generate candidate numbers.

3. **Loop**:
   - The program enters a `while` loop that continues until `count` reaches the value of `p`.
   - Inside the loop, a number `ele` is generated using the formula `5 * n + 3`.

4. **Condition Check**:
   - The program checks if the generated number `ele` is divisible by 7 using the condition `if (ele % 7 == 0)`.
   - If `ele` is divisible by 7, the program skips printing it and increments `n` to move to the next candidate number.
   - If `ele` is not divisible by 7, the program prints it, increments `count` to track the number of printed elements, and moves to the next candidate number.

5. **Output**:
   - The program prints the numbers that satisfy the conditions until `count` reaches the value of `p`.

6. **Termination**:
   - Once `count` reaches the value of `p`, the loop terminates, and the program ends.

Essentially, the program generates numbers of the form `5 * n + 3`, skips those divisible by 7, and prints the rest until `p` such numbers are printed.*/