package com.interviewQuestion_DSA_Java.Stack_12;

import java.util.ArrayList;

public class StackUseArrayList {
    static class Stack {
        // Use generics with ArrayList
        static ArrayList<Integer> list = new ArrayList<>();

        // Check if the stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push an element onto the stack
        public static void push(int data) {
            list.add(data);
        }

        // Pop an element from the stack
        public static int pop() {
            if (isEmpty()) {
                return -1; // Return -1 if stack is empty
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek at the top element without removing it
        public static int peek() {
            if (isEmpty()) {
                return -1; // Return -1 if stack is empty
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(6);

        // Print and pop elements until the stack is empty
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Peek and print the top element
            s.pop();                      // Remove the top element
        }
    }
}
