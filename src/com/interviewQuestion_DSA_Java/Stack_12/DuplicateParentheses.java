package com.interviewQuestion_DSA_Java.Stack_12;

import java.util.Stack;

public class DuplicateParentheses {
    // Function to check if a given string contains duplicate parentheses
    public static boolean isDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If closing parenthesis is found
            if (ch == ')') {
                int count = 0;

                // Check elements within the parenthesis
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                // If no element or only one element is between parentheses, it's a duplicate
                if (count < 1) {
                    return true; // Found duplicate parentheses
                }

                // Pop the opening parenthesis
                stack.pop();
            } else {
                // For opening parentheses or any other characters, push to stack
                stack.push(ch);
            }
        }

        // No duplicates found
        return false;
    }

    public static boolean isDuplicateO(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count =0;
                while (s.pop() != '('){
                    count++;
                }
                if (count<1){
                    return true; //duplicate
                }
            }else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Valid String
        String str1 = "(((a+b)))"; // Duplicate parentheses
        String str2 = "(a-b)";     // No duplicate parentheses
        String str3 = "(a+(b)/c)"; // No duplicate parentheses
        String str4 = "(((a+(b))))"; // Duplicate parentheses
        String str5 = "((a+b)+((c+d)))"; // No duplicate parentheses

        System.out.println("Test Case 1 (Expect true): " + isDuplicate(str1));
        System.out.println("Test Case 2 (Expect false): " + isDuplicate(str2));
        System.out.println("Test Case 3 (Expect false): " + isDuplicate(str3));
        System.out.println("Test Case 4 (Expect true): " + isDuplicate(str4));
        System.out.println("Test Case 5 (Expect false): " + isDuplicate(str5));
//        System.out.println(isDuplicateO(str));
    }
}
/*Let's dry run the isDuplicate() method step by step with the given input "(a-b)" to understand the flow.

Input: str2 = "(a-b)"
Step 1:
The string "(a-b)" is passed to the isDuplicate() method.
A stack s is initialized as an empty stack.
The string has 5 characters: (, a, -, b, ).
Step 2:
The loop starts iterating over each character in the string.
Iteration 1:

i = 0, ch = '('.
The character ( is pushed onto the stack.
Stack now: ['('].
Iteration 2:

i = 1, ch = 'a'.
The character a is pushed onto the stack.
Stack now: ['(', 'a'].
Iteration 3:

i = 2, ch = '-'.
The character - is pushed onto the stack.
Stack now: ['(', 'a', '-'].
Iteration 4:

i = 3, ch = 'b'.
The character b is pushed onto the stack.
Stack now: ['(', 'a', '-', 'b'].
Iteration 5 (Closing Parenthesis Detected):

i = 4, ch = ')'.

We encounter the closing parenthesis ).

Now, we enter the while loop to check for matching parentheses and see if any duplicate parentheses exist.

Inner loop (pop elements from stack until '(' is found):
First, pop b. count becomes 1.
Next, pop -. count becomes 2.
Then, pop a. count becomes 3.
Finally, we pop the opening (.
Since count = 3 (meaning three elements were between the parentheses), this is not a duplicate.

After this, the stack becomes empty.

Step 3:
The loop finishes iterating over the entire string.
Since we didn't find any duplicate parentheses, the method returns false.
Conclusion:
The output for isDuplicate("(a-b)") is false, meaning there are no duplicate parentheses in this input string.

Input: str = "(((a+b)))"
Let's dry run this string through isDuplicateO() for comparison.

Step-by-Step for "(((a+b)))" with isDuplicateO()
Stack Initialization: Empty stack s.
First Iteration: Push (, stack is ['('].
Second Iteration: Push (, stack is ['(', '('].
Third Iteration: Push (, stack is ['(', '(', '('].
Fourth Iteration: Push a, stack is ['(', '(', '(', 'a'].
Fifth Iteration: Push +, stack is ['(', '(', '(', 'a', '+'].
Sixth Iteration: Push b, stack is ['(', '(', '(', 'a', '+', 'b'].
Seventh Iteration: Closing ), pop characters. count = 2 (popped b, +, a), pop (, no duplicate.
Eighth Iteration: Closing ), pop characters. count = 0, this is a duplicate.
Since the second closing parenthesis detects duplicate parentheses (count < 1), it will return true.*/