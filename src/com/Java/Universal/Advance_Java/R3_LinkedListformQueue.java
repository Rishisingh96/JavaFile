package com.Java.Universal.Advance_Java;

import java.util.*;

public class R3_LinkedListformQueue {
        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();

            // Add elements to LinkedList
            linkedList.add("Apple");
            linkedList.add("Banana");
            linkedList.add("Cherry");
            linkedList.add("Date");
            linkedList.add("Elderberry");

            // 1) Demonstrate use of methods received by LinkedList from Queue interface
            Queue<String> queue = linkedList;
            System.out.println("Queue operations:");
            System.out.println("Element at front of queue (peek): " + queue.peek());
            queue.add("Fig");
            System.out.println("Queue after adding 'Fig': " + queue);
            System.out.println("Removing element from queue (poll): " + queue.poll());
            System.out.println("Queue after polling: " + queue);

            // 2) Demonstrate use of methods received by LinkedList from Deque interface
            Deque<String> deque = linkedList;
            System.out.println("\nDeque operations:");
            deque.addFirst("Grape");
            System.out.println("Deque after adding 'Grape' at the front: " + deque);
            deque.addLast("Honeydew");
            System.out.println("Deque after adding 'Honeydew' at the end: " + deque);
            System.out.println("Removing first element from deque (removeFirst): " + deque.removeFirst());
            System.out.println("Removing last element from deque (removeLast): " + deque.removeLast());
            System.out.println("Deque after removals: " + deque);

            // 3) Print elements of the linked list in reverse order
            System.out.println("\nElements in reverse order:");
            Collections.reverse(linkedList);
            for (String element : linkedList) {
                System.out.println(element);
            }
            Collections.reverse(linkedList); // Reversing it back to original

            // 4) Repeat an element in the linked list and then display index of the element's first and last occurrence
            linkedList.add(2, "Banana");
            System.out.println("\nLinkedList after adding 'Banana' again: " + linkedList);
            int firstOccurrence = linkedList.indexOf("Banana");
            int lastOccurrence = linkedList.lastIndexOf("Banana");
            System.out.println("First occurrence of 'Banana': " + firstOccurrence);
            System.out.println("Last occurrence of 'Banana': " + lastOccurrence);

            // 5) Empty the contents of the linked list
            linkedList.clear();
            System.out.println("\nLinkedList after clearing: " + linkedList);
        }
}


//    public static void main(String[] args) {
//        // Create a LinkedList of Integer type
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        // 1. Demonstrate use of methods from Queue interface
//        Queue<Integer> queue = linkedList;
//
//        // Add elements to the LinkedList using Queue methods
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        System.out.println("LinkedList after adding elements (Queue methods): " + linkedList);
//
//        // Retrieve and remove the head of the queue
//        int removedElement = queue.remove();  //10
//        System.out.println("Removed element: " + removedElement);
//        System.out.println("LinkedList after removal (Queue methods): " + linkedList);
//
//        // Retrieve the head of the queue without removing it
//        int headElement = queue.element();
//        System.out.println("Head element: " + headElement);
//
//        // Retrieve and remove the head of the queue, or return null if the queue is empty
//        queue.poll();
//        System.out.println("LinkedList after poll (Queue methods): " + linkedList);
//
//        // Retrieve, but do not remove, the head of the queue, or return null if the queue is empty
//        Integer peekedElement = queue.peek();
//        System.out.println("Peeked element: " + peekedElement);
//
//        // Offer elements to the LinkedList using Queue methods
//        queue.offer(40);
//        queue.offer(50);
//        System.out.println("LinkedList after offer (Queue methods): " + linkedList);
//
//        // 2. Demonstrate use of methods from Deque interface
//        Deque<Integer> deque = linkedList;
//
//        // Add elements to the beginning and end of the deque
//        deque.addFirst(5);
//        deque.addLast(60);
//        System.out.println("LinkedList after adding elements (Deque methods): " + linkedList);
//
//        // Remove elements from the beginning and end of the deque
//        int firstElement = deque.removeFirst();
//        int lastElement = deque.removeLast();
//        System.out.println("Removed first element: " + firstElement);
//        System.out.println("Removed last element: " + lastElement);
//        System.out.println("LinkedList after removing elements (Deque methods): " + linkedList);
//
//        // Retrieve, but do not remove, the first and last elements
//        Integer firstPeeked = deque.peekFirst();
//        Integer lastPeeked = deque.peekLast();
//        System.out.println("Peeked first element: " + firstPeeked);
//        System.out.println("Peeked last element: " + lastPeeked);
//
//        // 3. Print elements of the LinkedList in reverse order
//        System.out.println("LinkedList in reverse order:");
//        ListIterator<Integer> iterator = linkedList.listIterator(linkedList.size());
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//
//        // 4. Repeat an element and display its first and last occurrence index
//        linkedList.add(30);
//        linkedList.add(10); // Repeating element
//        System.out.println("LinkedList after adding duplicate elements: " + linkedList);
//
//        int firstOccurrenceIndex = linkedList.indexOf(10);
//        int lastOccurrenceIndex = linkedList.lastIndexOf(10);
//        System.out.println("First occurrence index of 10: " + firstOccurrenceIndex);
//        System.out.println("Last occurrence index of 10: " + lastOccurrenceIndex);
//
//        // 5. Empty the contents of the LinkedList
//        linkedList.clear();
//        System.out.println("LinkedList after clearing: " + linkedList);
//    }
//}
/*Explanation:
Queue Interface Methods:

add(E e): Adds an element to the end of the queue.
remove(): Removes and returns the head of the queue.
element(): Retrieves, but does not remove, the head of the queue.
poll(): Retrieves and removes the head of the queue, or returns null if empty.
peek(): Retrieves, but does not remove, the head of the queue, or returns null if empty.
offer(E e): Adds an element to the end of the queue.
Deque Interface Methods:

addFirst(E e): Adds an element to the beginning of the deque.
addLast(E e): Adds an element to the end of the deque.
removeFirst(): Removes and returns the first element of the deque.
removeLast(): Removes and returns the last element of the deque.
peekFirst(): Retrieves, but does not remove, the first element of the deque.
peekLast(): Retrieves, but does not remove, the last element of the deque.
Print Elements in Reverse Order:

Using a ListIterator initialized at the end of the list to traverse backward.
Repeat an Element:

Adds duplicate elements and finds the first and last occurrence indexes using indexOf and lastIndexOf.
Empty the LinkedList:

Uses clear() to remove all elements from the list.
This program demonstrates a variety of operations on a LinkedList and shows the results of each operation.*/