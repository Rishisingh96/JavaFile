package com.interviewQuestion_DSA_Java.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
//            s.push(q.remove())
            s.push(q.poll());
        }
        while(!s.isEmpty()){
           q.add(s.pop());
        }
    }
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
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
        reverse(q);
      //  System.out.println(q);

        //print
        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }
}
//Dry Run
/*Let's dry run the given code step by step. The code aims to reverse the elements of a queue using a stack.

Initial Queue:
Queue: 1 2 3 4 5 6 7 8 9 10

Step-by-Step Dry Run:
Queue Initialization:

A LinkedList queue is initialized with elements 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.

Method Call:

The reverse(Queue<Integer> q) method is called with this queue.

Stack Initialization:

A Stack<Integer> s is initialized as an empty stack.

First Loop (while (!q.isEmpty())):

This loop transfers all the elements from the queue to the stack.

Iteration 1:

q.poll() removes and returns 1 from the queue.

s.push(1) pushes 1 onto the stack.

Queue: 2 3 4 5 6 7 8 9 10

Stack: 1

Iteration 2:

q.poll() removes and returns 2.

s.push(2) pushes 2 onto the stack.

Queue: 3 4 5 6 7 8 9 10

Stack: 1 2

Iteration 3:

q.poll() removes 3.

s.push(3) pushes 3 onto the stack.

Queue: 4 5 6 7 8 9 10

Stack: 1 2 3

Iteration 4:

q.poll() removes 4.

s.push(4) pushes 4 onto the stack.

Queue: 5 6 7 8 9 10

Stack: 1 2 3 4

Iteration 5:

q.poll() removes 5.

s.push(5) pushes 5 onto the stack.

Queue: 6 7 8 9 10

Stack: 1 2 3 4 5

Iteration 6:

q.poll() removes 6.

s.push(6) pushes 6 onto the stack.

Queue: 7 8 9 10

Stack: 1 2 3 4 5 6

Iteration 7:

q.poll() removes 7.

s.push(7) pushes 7 onto the stack.

Queue: 8 9 10

Stack: 1 2 3 4 5 6 7

Iteration 8:

q.poll() removes 8.

s.push(8) pushes 8 onto the stack.

Queue: 9 10

Stack: 1 2 3 4 5 6 7 8

Iteration 9:

q.poll() removes 9.

s.push(9) pushes 9 onto the stack.

Queue: 10

Stack: 1 2 3 4 5 6 7 8 9

Iteration 10:

q.poll() removes 10.

s.push(10) pushes 10 onto the stack.

Queue: empty

Stack: 1 2 3 4 5 6 7 8 9 10

Now, the queue is empty, and the stack contains all the elements from the queue in the same order.

Second Loop (while (!s.isEmpty())):

This loop transfers all the elements from the stack back to the queue. Since a stack is LIFO (Last In, First Out), this will reverse the order of elements.

Iteration 1:

s.pop() removes 10 from the stack.

q.add(10) adds 10 back to the queue.

Stack: 1 2 3 4 5 6 7 8 9

Queue: 10

Iteration 2:

s.pop() removes 9.

q.add(9) adds 9 to the queue.

Stack: 1 2 3 4 5 6 7 8

Queue: 10 9

Iteration 3:

s.pop() removes 8.

q.add(8) adds 8 to the queue.

Stack: 1 2 3 4 5 6 7

Queue: 10 9 8

Iteration 4:

s.pop() removes 7.

q.add(7) adds 7 to the queue.

Stack: 1 2 3 4 5 6

Queue: 10 9 8 7

Iteration 5:

s.pop() removes 6.

q.add(6) adds 6 to the queue.

Stack: 1 2 3 4 5

Queue: 10 9 8 7 6

Iteration 6:

s.pop() removes 5.

q.add(5) adds 5 to the queue.

Stack: 1 2 3 4

Queue: 10 9 8 7 6 5

Iteration 7:

s.pop() removes 4.

q.add(4) adds 4 to the queue.

Stack: 1 2 3

Queue: 10 9 8 7 6 5 4

Iteration 8:

s.pop() removes 3.

q.add(3) adds 3 to the queue.

Stack: 1 2

Queue: 10 9 8 7 6 5 4 3

Iteration 9:

s.pop() removes 2.

q.add(2) adds 2 to the queue.

Stack: 1

Queue: 10 9 8 7 6 5 4 3 2

Iteration 10:

s.pop() removes 1.

q.add(1) adds 1 to the queue.

Stack: empty

Queue: 10 9 8 7 6 5 4 3 2 1

Now, the queue is completely reversed, and the stack is empty.

Final Output:

The main method prints the elements of the queue using a while loop.

It prints the elements: 10 9 8 7 6 5 4 3 2 1, which is the reverse of the original queue.

Final State:
Queue (Reversed): 10 9 8 7 6 5 4 3 2 1

Stack: empty

Output:
Copy
Edit
10 9 8 7 6 5 4 3 2 1







*/
