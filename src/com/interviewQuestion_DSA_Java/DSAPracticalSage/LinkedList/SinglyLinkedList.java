package com.interviewQuestion_DSA_Java.DSAPracticalSage.LinkedList;
import java.util.Scanner;

/*✅ Question 1.1 — Singly Linked List Operations in Java
Write a Java program that:

a) Creates a singly linked list of integers

b) Deletes a given integer from the list

c) Displays the contents of the list after deletion

🔸 👉 Complete Java Program with Comments
*/
// Node class to represent each element in the list
class Node {
    int data;       // Value stored in the node
    Node next;      // Reference to the next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    // Function to insert a node at the end of the list
    public static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);

        // If the list is empty
        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Function to delete a node by value
    public static Node deleteNode(Node head, int value) {
        // If list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }

        // If head needs to be deleted
        if (head.data == value) {
            return head.next;
        }

        Node current = head;
        Node previous = null;

        // Search for the node to delete
        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        // If value not found
        if (current == null) {
            System.out.println("Value " + value + " not found in the list.");
            return head;
        }

        // Unlink the node
        previous.next = current.next;
        return head;
    }

    // Function to display the list
    public static void displayList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n, value, delValue;

        System.out.print("Enter number of elements to insert: ");
        n = sc.nextInt();

        // Insert nodes
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            value = sc.nextInt();
            head = insertAtEnd(head, value);
        }

        // Display before deletion
        System.out.println("\nBefore Deletion:");
        displayList(head);

        // Delete a value
        System.out.print("\nEnter value to delete: ");
        delValue = sc.nextInt();
        head = deleteNode(head, delValue);

        // Display after deletion
        System.out.println("\nAfter Deletion:");
        displayList(head);
    }
}

/*Enter number of elements to insert: 5
Enter value 1: 10
Enter value 2: 20
Enter value 3: 30
Enter value 4: 40
Enter value 5: 50

Before Deletion:
Linked List: 10 -> 20 -> 30 -> 40 -> 50 -> NULL

Enter value to delete: 30

After Deletion:
Linked List: 10 -> 20 -> 40 -> 50 -> NULL
*/