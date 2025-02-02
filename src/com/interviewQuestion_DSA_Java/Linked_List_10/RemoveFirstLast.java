package com.interviewQuestion_DSA_Java.Linked_List_10;

public class RemoveFirstLast {

    // Define the Node class to represent each element in the linked list
    public static class Node {
        int data;  // Data stored in the node
        Node next; // Pointer to the next node in the list

        // Constructor to initialize the node with the given data
        public Node(int data) {
            this.data = data;
            this.next = null; // Initially, the next pointer is null
        }
    }

    public static Node head; // Pointer to the first node of the linked list
    public static Node tail; // Pointer to the last node of the linked list
    public static int size = 0; // Variable to track the size of the linked list

    // Method to add a node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Method to add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Method to add a node at a specific index in the linked list
    public void addMiddle(int idx, int data) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Method to remove the first node of the linked list
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Method to remove the last node of the linked list
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Method to remove a node at a specific index in the linked list
    public int removeMiddle(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (idx == 0) {
            return removeFirst();
        }
        if (idx == size - 1) {
            return removeLast();
        }
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // Method to print the entire linked list
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list methods
    public static void main(String[] args) {
        RemoveFirstLast li = new RemoveFirstLast();

        // Adding elements to the linked list
        li.addFirst(2);
        li.addFirst(1);
        li.addLast(3);
        li.addLast(4);
        li.addMiddle(2, 9); // Adding 9 at index 2
        li.print(); // 1->2->9->3->4->null

        // Removing elements
        System.out.println("Removed first: " + li.removeFirst()); // Removes 1
        li.print(); // 2->9->3->4->null

        System.out.println("Removed last: " + li.removeLast()); // Removes 4
        li.print(); // 2->9->3->null

        System.out.println("Removed middle at index 1: " + li.removeMiddle(1)); // Removes 9
        li.print(); // 2->3->null

        // Final size of the linked list
        System.out.println("Size of the linked list: " + li.size); // Output: 2
    }
}
