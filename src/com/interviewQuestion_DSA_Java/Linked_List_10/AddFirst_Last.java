package com.interviewQuestion_DSA_Java.Linked_List_10;

public class AddFirst_Last {


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
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);

        // Step 2: Check if the list is empty
        if (head == null) {
            head = tail = newNode; // Both head and tail point to the new node
        } else {
            // Step 3: Link the new node to the current head
            newNode.next = head;

            // Step 4: Update the head to the new node
            head = newNode;
        }

        // Step 5: Increment the size of the linked list
        size++;
    }

    // Method to add a node at the end of the linked list
    public void addLast(int data) {
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);

        // Step 2: Check if the list is empty
        if (head == null) {
            head = tail = newNode; // Both head and tail point to the new node
        } else {
            // Step 3: Link the current tail's next to the new node
            tail.next = newNode;

            // Step 4: Update the tail to the new node
            tail = newNode;
        }

        // Step 5: Increment the size of the linked list
        size++;
    }

    // Method to add a node at a specific index in the linked list
    public void addMiddle(int idx, int data) {
        // Step 1: Check if the index is out of bounds
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Step 2: Handle adding at the beginning
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // Step 3: Handle adding at the end
        if (idx == size) {
            addLast(data);
            return;
        }

        // Step 4: Traverse the list to find the node before the given index
        Node newNode = new Node(data);
        Node temp = head; // Start from the head
        int i = 0;        // Initialize a counter

        // Move to the node at (idx - 1)
        while (i < idx - 1) {
            temp = temp.next; // Move to the next node
            i++;
        }

        // Step 5: Insert the new node in the middle
        newNode.next = temp.next; // Link the new node to the next node
        temp.next = newNode;     // Link the previous node to the new node

        // Step 6: Increment the size of the linked list
        size++;
    }

    // Method to print the entire linked list
    public void print() {
        // Step 1: Check if the list is empty
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        // Step 2: Use a temporary pointer to traverse the list
        Node temp = head; // Start from the head
        while (temp != null) {
            System.out.print(temp.data + "->"); // Print the data
            temp = temp.next;                  // Move to the next node
        }

        // Step 3: Print null to indicate the end of the list
        System.out.println("null");
    }

    // Main method to test the linked list methods
    public static void main(String[] args) {
        // Step 1: Create an instance of AddFirst_Last
        AddFirst_Last li = new AddFirst_Last();

        // Step 2: Test the print method (empty list)
        li.print();

        // Step 3: Add elements to the beginning of the list
        li.addFirst(2); // Add 2
        li.print();     // Print: 2->null

        li.addFirst(1); // Add 1
        li.print();     // Print: 1->2->null

        // Step 4: Add elements to the end of the list
        li.addLast(3); // Add 3
        li.print();    // Print: 1->2->3->null

        li.addLast(4); // Add 4
        li.print();    // Print: 1->2->3->4->null

        // Step 5: Add an element in the middle of the list
        li.addMiddle(2, 9); // Add 9 at index 2
        li.print();         // Print: 1->2->9->3->4->null


        // Step 6: Print the size of the linked list
        System.out.println("Size of the linked list: " + li.size); // Output: 5

    }
}
