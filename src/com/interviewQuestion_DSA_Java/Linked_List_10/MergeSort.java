package com.interviewQuestion_DSA_Java.Linked_List_10;

public class MergeSort {
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

    // Step 1 - Merge two sorted linked lists
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // Dummy node to help with merging
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next; // Return the merged list starting from the next node
    }

    // Step 2 - Find the middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Slow will point to the middle node
    }

    // Step 3 - Apply merge sort recursively
    public Node mergeSorts(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: If the list is empty or has one element
        }

        // Step 1 - Find mid
        Node mid = getMid(head);

        // Step 2 - Split the linked list into two halves
        Node rightHead = mid.next;
        mid.next = null; // Split the list into two halves
        Node newLeft = mergeSorts(head);
        Node newRight = mergeSorts(rightHead);

        // Step 3 - Merge the sorted halves
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSort list = new MergeSort();

        // Add elements to the linked list
        list.addFirst(1);
        list.addFirst(30);
        list.addFirst(3);
        list.addFirst(40);
        list.addFirst(5);

        System.out.println("Original list:");
        list.print();

        // Perform merge sort on the linked list
        head = list.mergeSorts(head);

        System.out.println("Sorted list:");
        list.print();
    }
}
/*Dry Run all code
ChatGPT said:
ChatGPT
Let's perform a dry run of your merge sort implementation on a linked list. Here's the dry run of your code using the following input:

Input Linked List: 5 -> 4 -> 3 -> 2 -> 1 -> null

Step-by-Step Dry Run:
Initialization:

We create a MergeSort instance.
Using the addFirst() method, we add elements 1, 2, 3, 4, 5 to the linked list. Since we are adding at the beginning each time, the final list becomes:
rust
Copy
Edit
5 -> 4 -> 3 -> 2 -> 1 -> null
Initial Call to mergeSorts():

We call mergeSorts(head) where head points to 5.

Current list: 5 -> 4 -> 3 -> 2 -> 1 -> null

First Split:
Finding Midpoint (getMid()):

Start with slow = 5, fast = 4.

Move slow and fast: slow = 4, fast = 2.

Move again: slow = 3, fast = null.

Midpoint found at node 3.

Split into Two Halves:

Left half: 5 -> 4 -> 3 -> null
Right half: 2 -> 1 -> null
Recursive Calls on Each Half:

Left Half (5 -> 4 -> 3):
Finding Midpoint for Left Half (getMid()):

Start with slow = 5, fast = 4.

Move slow and fast: slow = 4, fast = null.

Midpoint found at node 4.

Split Left Half:

Left sub-half: 5 -> 4 -> null
Right sub-half: 3 -> null
Recursive Calls on Each Sub-Half:

Sub-Half (5 -> 4):
Finding Midpoint for Sub-Half (getMid()):

Start with slow = 5, fast = 4.
Midpoint found at node 5.
Split Sub-Half:

Left: 5 -> null
Right: 4 -> null
Base Case for Sub-Half:

Since both left and right halves have only one element, they are already sorted.
Merge Left Sub-Half (merge()):

Merge 5 and 4:
Compare: 4 <= 5, so merged list becomes: 4 -> 5 -> null.
Right Sub-Half (3 -> null):
Base Case for Right Sub-Half:

List contains one element (3), so it is already sorted.
Merge Left Half (merge()):

Merge 4 -> 5 and 3:
Compare: 3 <= 4, merged list becomes: 3 -> 4 -> 5 -> null.
Right Half (2 -> 1):
Finding Midpoint for Right Half (getMid()):

Start with slow = 2, fast = 1.
Midpoint found at node 2.
Split Right Half:

Left: 2 -> null
Right: 1 -> null
Base Case for Right Half:

Since both left and right halves have only one element, they are already sorted.
Merge Right Half (merge()):

Merge 2 and 1:
Compare: 1 <= 2, merged list becomes: 1 -> 2 -> null.
Final Merge:
Merge Full List (merge()):
Merge 3 -> 4 -> 5 and 1 -> 2:
Compare: 1 <= 3, merged list becomes: 1.
Compare: 2 <= 3, merged list becomes: 1 -> 2.
Compare: 3 <= 4, merged list becomes: 1 -> 2 -> 3.
Compare: 4 <= 5, merged list becomes: 1 -> 2 -> 3 -> 4.
Append remaining node: 1 -> 2 -> 3 -> 4 -> 5.
Final Output:
The sorted linked list is: 1 -> 2 -> 3 -> 4 -> 5 -> null.

Conclusion:
The code correctly sorts the input linked list using the merge sort algorithm, and each step (splitting, recursive sorting, and merging) follows the intended logic.*/