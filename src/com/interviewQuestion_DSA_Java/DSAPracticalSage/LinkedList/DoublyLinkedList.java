package com.interviewQuestion_DSA_Java.DSAPracticalSage.LinkedList;

import java.util.Scanner;
/*✅ Question 1.2 — Doubly Linked List Operations in Java
Write a Java program that:

a) Creates a doubly linked list of integers

b) Deletes a given integer from the doubly linked list

c) Displays the contents of the list after deletion
*/


// Node class for Doubly Linked List
class DNode {
    int data;          // Data in node
    DNode prev, next;  // Pointers to previous and next node

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    // Function to insert node at the end
    public static DNode insertAtEnd(DNode head, int value) {
        DNode newNode = new DNode(value);

        if (head == null) {
            return newNode;
        }

        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Function to delete a node by value
    public static DNode deleteNode(DNode head, int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }

        DNode current = head;

        // If head needs to be deleted
        if (current.data == value) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        // Traverse to find the node
        while (current != null && current.data != value) {
            current = current.next;
        }

        // Value not found
        if (current == null) {
            System.out.println("Value " + value + " not found.");
            return head;
        }

        // If it's a middle or last node
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        return head;
    }

    // Function to display the list
    public static void displayList(DNode head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Doubly Linked List (Forward): ");
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DNode head = null;
        int n, value, delValue;

        System.out.print("Enter number of elements to insert: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            value = sc.nextInt();
            head = insertAtEnd(head, value);
        }

        // Before deletion
        System.out.println("\nBefore Deletion:");
        displayList(head);

        System.out.print("\nEnter value to delete: ");
        delValue = sc.nextInt();
        head = deleteNode(head, delValue);

        // After deletion
        System.out.println("\nAfter Deletion:");
        displayList(head);
    }
}

/*Enter number of elements to insert: 4
Enter value 1: 10
Enter value 2: 20
Enter value 3: 30
Enter value 4: 40

Before Deletion:
Doubly Linked List (Forward): 10 <-> 20 <-> 30 <-> 40 <-> NULL

Enter value to delete: 30

After Deletion:
Doubly Linked List (Forward): 10 <-> 20 <-> 40 <-> NULL
*/