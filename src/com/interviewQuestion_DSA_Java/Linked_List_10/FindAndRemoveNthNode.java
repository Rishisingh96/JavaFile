package com.interviewQuestion_DSA_Java.Linked_List_10;

public class FindAndRemoveNthNode {

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

    public void deleteNthFromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head = head.next;
            return;
        }
        //size - n;
        int i=1;
        int iToFind = size-n;
        Node previous = head;
        while (i<iToFind){
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return;
    }

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

    public static void main(String args[]){
        // Step 1: Create an instance of AddFirst_Last
        FindAndRemoveNthNode li = new FindAndRemoveNthNode();
        li.addFirst(2); // Add 2
        li.addFirst(1); // Add
        li.addLast(3); // Add 3
        li.addLast(8); // Add 4
        li.addLast(10); // Add 4
        li.addMiddle(2, 9); // Add 9 at index 2
        li.print();         // Print: 1->2->9->3->4->null
        li.deleteNthFromEnd(3);
        li.print();
    }
}
