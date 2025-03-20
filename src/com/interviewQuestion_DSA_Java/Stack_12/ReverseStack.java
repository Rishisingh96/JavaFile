package com.interviewQuestion_DSA_Java.Stack_12;

import java.util.Stack;

public class ReverseStack {
    // Push an element to the bottom of the stack
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    // Reverse the stack recursively
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    // Print the stack without modifying it
    public static void printStack(Stack<Integer> s) {
        for (int element : s) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(5);

        System.out.println("Before Reverse:");
        printStack(s);

        reverseStack(s);

        System.out.println("After Reverse:");
        printStack(s);
    }
}
