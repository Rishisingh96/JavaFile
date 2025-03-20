package com.interviewQuestion_DSA_Java.Stack_12;

import java.util.Stack;

public class PushAtBottom {

    // Method to push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            System.out.println("Pushing " + data + " at the bottom");
            stack.push(data); // Pushing at the bottom (base case)
            return;
        }
        // Pop the top element
        int top = stack.pop();
        System.out.println("Popped " + top + " before pushing " + data);

        // Recursively call to push data at the bottom
        pushAtBottom(stack, data);

        // Push the previously popped element back
        System.out.println("Pushing " + top + " after pushing " + data);
        stack.push(top);
    }

    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> s = new Stack<>();

        // Push elements 2, 3, and 5 into the stack
        System.out.println("Pushing 2");
        s.push(2);
        System.out.println("Pushing 3");
        s.push(3);
        System.out.println("Pushing 5");
        s.push(5);

        // Call pushAtBottom to insert 4 at the bottom of the stack
        System.out.println("Before pushing 4 at the bottom");
        pushAtBottom(s, 4);

        // Print and pop elements from the stack
        System.out.println("Printing the stack after pushing 4 at the bottom:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
