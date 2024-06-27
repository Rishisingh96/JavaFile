package com.Collection.Queue_Stack;

import java.util.*;

public class AddTwoQueue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>();
        queue1.add(10);
        queue1.add(40);
        queue1.add(20);
        queue1.add(50);

        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.add(60);
        queue2.add(70);
        queue2.add(100);
        queue2.add(50);
        queue2.add(80);

        Stack<Integer> stack = new Stack<>();
        while (!queue1.isEmpty()) {
            stack.push(queue1.poll());
        }

        while (!queue2.isEmpty()) {
            stack.push(queue2.poll());
        }

        // Print the elements of the stack
        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
