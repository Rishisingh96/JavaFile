package com.interviewQuestion_DSA_Java.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNonRepeatingWord {

    // Method to print the first non-repeating character at every point in the input string
    public static void printNonRepeating(String str) {
        int[] freq = new int[26]; // Array to track frequency of characters from 'a' to 'z'
        Queue<Character> q = new LinkedList<>(); // Queue to keep track of character order

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++; // Update frequency of the current character

            // Remove characters from queue if they have repeated
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Print the first non-repeating character or -1 if all are repeating
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println(); // Move to the next line after completing the loop
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String str = "aabccxb"; // Input string to test
        printNonRepeating(str); // Call the method to print non-repeating characters
    }
}
/*Let's perform a dry run of your PrintNonRepeatingWord program, step by step, to understand its behavior deeply.

Input:
plaintext
Copy
Edit
str = "aabccxb"
The method printNonRepeating() will process the string one character at a time, keeping track of the frequency of each character and printing the first non-repeating character at each step. If there are no non-repeating characters, it will print -1.

Variables:
freq[]: This is an array of size 26 to track the frequency of characters from 'a' to 'z'. Initially, all elements are 0.

q: A queue to store characters in the order they appear in the string.

Dry Run:
Step 1: Process Character 'a'
i = 0, ch = 'a'

Add 'a' to the queue: q = ['a']

Update frequency: freq['a' - 'a']++ => freq[0]++ => freq = [1, 0, 0, ..., 0]

Since the frequency of 'a' is 1, print q.peek() which is 'a'.

Output:

plaintext
Copy
Edit
a
Step 2: Process Character 'a'
i = 1, ch = 'a'

Add 'a' to the queue: q = ['a', 'a']

Update frequency: freq['a' - 'a']++ => freq[0]++ => freq = [2, 0, 0, ..., 0]

The frequency of q.peek() ('a') is 2, so remove 'a' from the queue.

Now, q = ['a']. The frequency of the front ('a') is still 2, so remove it again.

Now, q = [], so print -1.

Output:

plaintext
Copy
Edit
a -1
Step 3: Process Character 'b'
i = 2, ch = 'b'

Add 'b' to the queue: q = ['b']

Update frequency: freq['b' - 'a']++ => freq[1]++ => freq = [2, 1, 0, ..., 0]

The frequency of q.peek() ('b') is 1, so print 'b'.

Output:

plaintext
Copy
Edit
a -1 b
Step 4: Process Character 'c'
i = 3, ch = 'c'

Add 'c' to the queue: q = ['b', 'c']

Update frequency: freq['c' - 'a']++ => freq[2]++ => freq = [2, 1, 1, ..., 0]

The frequency of q.peek() ('b') is 1, so print 'b'.

Output:

plaintext
Copy
Edit
a -1 b b
Step 5: Process Character 'c'
i = 4, ch = 'c'

Add 'c' to the queue: q = ['b', 'c', 'c']

Update frequency: freq['c' - 'a']++ => freq[2]++ => freq = [2, 1, 2, ..., 0]

The frequency of q.peek() ('b') is 1, so print 'b'.

Output:

plaintext
Copy
Edit
a -1 b b b
Step 6: Process Character 'x'
i = 5, ch = 'x'

Add 'x' to the queue: q = ['b', 'c', 'c', 'x']

Update frequency: freq['x' - 'a']++ => freq[23]++ => freq = [2, 1, 2, ..., 1, 0, 0]

The frequency of q.peek() ('b') is 1, so print 'b'.

Output:

plaintext
Copy
Edit
a -1 b b b b
Step 7: Process Character 'b'
i = 6, ch = 'b'

Add 'b' to the queue: q = ['b', 'c', 'c', 'x', 'b']

Update frequency: freq['b' - 'a']++ => freq[1]++ => freq = [2, 2, 2, ..., 1, 0, 0]

The frequency of q.peek() ('b') is now 2, so remove 'b' from the queue.

Now, q = ['c', 'c', 'x', 'b']. The frequency of the new front ('c') is also 2, so remove 'c'.

Now, q = ['c', 'x', 'b']. Remove the next 'c' as well (same frequency).

Now, q = ['x', 'b']. The frequency of 'x' is 1, so print 'x'.

Output:

plaintext
Copy
Edit
a -1 b b b b x
Final Output:
plaintext
Copy
Edit
a -1 b b b b x
Summary:
The code maintains a queue of characters, processing one character at a time.

It updates the frequency of each character and removes characters from the queue that have repeated.

If the queue is empty at any point, it prints -1 (indicating that no non-repeating characters are left).

The program efficiently keeps track of the first non-repeating character or outputs -1 when all characters are repeating.

This dry run helps ensure the correctness of your code by simulating the process step-by-step.*/