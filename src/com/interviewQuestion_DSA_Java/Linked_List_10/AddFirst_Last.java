package com.interviewQuestion_DSA_Java.Linked_List_10;

// Define the main class
public class AddFirst_Last {                //0(n) time complexity 
    // Nested static Node class to represent each element in the linked list
    public static class Node {
        int data;  // Data stored in the node
        Node next; // Pointer to the next node in the list

        // Constructor to initialize a node with given data
        public Node(int data){
            this.data = data;
            this.next = null; // Next is initially null as it's a single node
        }
    }

    public static Node head; // Head pointer for the start of the list
    public static Node tail; // Tail pointer for the end of the list

    // Method to add a new node at the beginning of the list
    public void addFirst(int data){
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);

        // If the list is empty (head is null)
        if(head == null){
            head = tail = newNode; // Set both head and tail to the new node
            return; // Exit the method as the new node is now the only node
        }

        // Step 2: Link the new node's next to the current head
        newNode.next = head;

        // Step 3: Update the head to point to the new node
        head = newNode;
    }

    // Method to add a new node at the end of the list
    public void addLast(int data){
        // Step 1: Create a new node with the given data
        Node newNode = new Node(data);

        // If the list is empty (head is null)
        if(head == null){
            head = tail = newNode; // Set both head and tail to the new node
            return; // Exit the method as the new node is now the only node
        }

        // Step 2: Link the current tail node to the new node
        tail.next = newNode;

        // Step 3: Update the tail to point to the new node
        tail = newNode;
    }

    // Method to print the entire linked list
    public void print(){
        // If the list is empty, print a message and return
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head; // Temporary node to traverse the list
        // Loop through each node until reaching the end of the list
        while (temp != null){
            // Print the data in the current node followed by an arrow
            System.out.print(temp.data + "->");
            temp = temp.next; // Move to the next node
        }
        // Print "null" at the end to signify the end of the list
        System.out.println("null");
    }

    // Main method to test adding nodes to the list
    public static void main(String[] args) {
        // Create an instance of AddFirst_Last
        AddFirst_Last li = new AddFirst_Last();

        li.print(); // Print the list (should be empty initially)
        li.addFirst(1); // Add 1 at the beginning of the list
        li.print(); // Print the list (output should show 1)

        li.addFirst(2); // Add 2 at the beginning of the list
        li.print(); // Print the list (output should show 2->1)

        li.addLast(3); // Add 3 at the end of the list
        li.print(); // Print the list (output should show 2->1->3)

        li.addLast(4); // Add 4 at the end of the list
        li.print(); // Print the list (output should show 2->1->3->4)
    }
}
