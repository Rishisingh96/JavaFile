package com.Java.Universal.Advance_Java.Test;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Add elements to LinkedList
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(50);

        // 1) Demonstrate use of methods received by LinkedList from Queue interface
        Queue<Integer> queue = linkedList;
        System.out.println("Queue operations:");
        System.out.println("Element at front of queue (peek): " + queue.peek());
        queue.add(60);
        System.out.println("Queue after adding '60': " + queue);
        System.out.println("Removing element from queue (poll): " + queue.poll());
        System.out.println("Queue after polling: " + queue);

        // 2) Demonstrate use of methods received by LinkedList from Deque interface
        Deque<Integer> deque = linkedList;
        System.out.println("\nDeque operations:");
        deque.addFirst(5);
        System.out.println("Dequ adding 5 :" + deque);
        deque.addLast(90);
        System.out.println("deque ofter adding 90 :"+deque);
        System.out.println("removeFirst: " + deque.removeFirst());
        System.out.println("removeLast: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);

        // 3) Print elements of the linked list in reverse order
        System.out.println("\nElements in reverse order:");
        Collections.reverse(linkedList);
        for (Integer ele : linkedList){
            System.out.println(ele);
        }
        Collections.reverse(linkedList);

        // 4) Repeat an element in the linked list and then display index of the element's first and last occurrence
        linkedList.add(2, 100);
        System.out.println("\nLinkedList after adding 100 again: " + linkedList);
        int firstOcc = linkedList.indexOf(100);
        int lastOcc = linkedList.lastIndexOf(100);
        System.out.println("First occurrence of '100': " + firstOcc);
        System.out.println("Last occurrence of '100': " + lastOcc);

        // 5) Empty the contents of the linked list
//        linkedList.clear();
//        System.out.println("\nLinkedList after clearing: " + linkedList);
    }
}
