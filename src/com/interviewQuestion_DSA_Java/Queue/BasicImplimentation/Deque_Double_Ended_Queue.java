package com.interviewQuestion_DSA_Java.Queue.BasicImplimentation;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Double_Ended_Queue {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addFirst(3); // 3 2 1
        deque.addLast(4); // 3 2 1 4
        deque.addLast(5); // 3 2 1 4 5
        System.out.println(deque);
        deque.removeFirst(); // 2 1 4 5

        System.out.println(deque);

        System.out.println("fist element: " + deque.getFirst());
        System.out.println("last element: " + deque.getLast());
    }
}
