package com.interviewQuestion_DSA_Java.Queue.BasicImplimentation;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrintUsingCollection {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Print the queue
        System.out.println(queue);
    }
}
