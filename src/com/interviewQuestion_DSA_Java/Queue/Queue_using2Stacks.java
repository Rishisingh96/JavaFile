package com.interviewQuestion_DSA_Java.Queue;

import java.util.Stack;

public class Queue_using2Stacks {
    // Custom Queue class using two stacks
    static class MyQueue {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        // Check if queue is empty
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add element to queue
        public void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // Push the new data onto s1
            s1.push(data);
            // Move elements back to s1 from s2
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove element from queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }

        // Peek the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
