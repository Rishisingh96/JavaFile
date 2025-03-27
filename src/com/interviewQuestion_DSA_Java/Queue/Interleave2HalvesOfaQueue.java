package com.interviewQuestion_DSA_Java.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Interleave2HalvesOfaQueue {
    // Method to interleave the two halves of a queue by AI (Artificial Intelligence) Generated
//    public static void interleave(Queue<Integer> q) {
//        if (q.size() % 2 != 0) {
//            System.out.println("Queue must have even number of elements");
//            return;
//        }
//
//        int n = q.size(); // Get the size of the queue
//        int half = n / 2; // Calculate the midpoint of the queue
//
//        Stack<Integer> s = new Stack<>(); // Stack to store the first half of the queue
//
//        // Push the first half of the queue into the stack
//        for (int i = 0; i < half; i++) {
//            s.push(q.poll());
//        }
//
//        // Enqueue back the elements from the stack to the queue
//        while (!s.isEmpty()) {
//            q.add(s.pop());
//        }
//
//        // Move the first half of the queue to the back of the queue
//        for (int i = 0; i < half; i++) {
//            q.add(q.poll());
//        }
//
//        // Push the first half of the queue into the stack again
//        for (int i = 0; i < half; i++) {
//            s.push(q.poll());
//        }
//
//        // Interleave the elements from the stack and the remaining queue
//        while (!s.isEmpty()) {
//            q.add(s.pop());
//            q.add(q.poll());
//        }
//    }

    // By Saradha mam
public static void interleave(Queue<Integer> q) {
    Queue<Integer> firstHalf = new LinkedList<>();
    int size = q.size();

    for(int i = 0; i<size/2; i++){
        firstHalf.add(q.remove());
    }

    while (!firstHalf.isEmpty()) {
        q.add(firstHalf.remove());
        q.add(q.remove());
    }
}

    // Main method to test the functionality
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // Create a new queue

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // Call the method to interleave the two halves of the queue
        interleave(q);

        // Print the interleaved queue
//        while (!q.isEmpty()) {
//            System.out.print(q.poll() + " ");
//        }
        //By Saradha mam
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
/*Let's dry-run the interleave(Queue<Integer> q) code with the input queue containing the elements:
q = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
(Size = 10)

Initial Setup
We create a new queue firstHalf to store the first half of q.

The size of q is 10, so we extract the first half (size / 2 = 10 / 2 = 5 elements) from q and put them into firstHalf.

Step 1: Extract the First Half of the Queue
We remove the first 5 elements from q and add them to firstHalf.

First iteration:
firstHalf = [1], q = [2, 3, 4, 5, 6, 7, 8, 9, 10]

Second iteration:
firstHalf = [1, 2], q = [3, 4, 5, 6, 7, 8, 9, 10]

Third iteration:
firstHalf = [1, 2, 3], q = [4, 5, 6, 7, 8, 9, 10]

Fourth iteration:
firstHalf = [1, 2, 3, 4], q = [5, 6, 7, 8, 9, 10]

Fifth iteration:
firstHalf = [1, 2, 3, 4, 5], q = [6, 7, 8, 9, 10]

Step 2: Interleave the Two Halves
Now, we enter the while loop where we interleave the elements from firstHalf and q.

First iteration:

Remove from firstHalf: 1

Add 1 to q: q = [6, 7, 8, 9, 10, 1]

Remove from q: 6

Add 6 to q: q = [7, 8, 9, 10, 1, 6]

Second iteration:

Remove from firstHalf: 2

Add 2 to q: q = [7, 8, 9, 10, 1, 6, 2]

Remove from q: 7

Add 7 to q: q = [8, 9, 10, 1, 6, 2, 7]

Third iteration:

Remove from firstHalf: 3

Add 3 to q: q = [8, 9, 10, 1, 6, 2, 7, 3]

Remove from q: 8

Add 8 to q: q = [9, 10, 1, 6, 2, 7, 3, 8]

Fourth iteration:

Remove from firstHalf: 4

Add 4 to q: q = [9, 10, 1, 6, 2, 7, 3, 8, 4]

Remove from q: 9

Add 9 to q: q = [10, 1, 6, 2, 7, 3, 8, 4, 9]

Fifth iteration:

Remove from firstHalf: 5

Add 5 to q: q = [10, 1, 6, 2, 7, 3, 8, 4, 9, 5]

Remove from q: 10

Add 10 to q: q = [1, 6, 2, 7, 3, 8, 4, 9, 5, 10]

Final Queue
After completing the interleaving process, the final state of the queue is:
q = [1, 6, 2, 7, 3, 8, 4, 9, 5, 10]

Output
The final interleaved queue is printed as:
1 6 2 7 3 8 4 9 5 10

Summary
The method splits the queue into two halves.

It interleaves them by alternating elements from the first and second halves, producing the final interleaved queue.*/