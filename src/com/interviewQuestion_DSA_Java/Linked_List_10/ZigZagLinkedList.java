package com.interviewQuestion_DSA_Java.Linked_List_10;

public class ZigZagLinkedList {

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

    //
    public void zigZag(){
        //find mid

        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != slow){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        //reverse 2nd half
        Node current = mid.next;
        mid.next = null;
        Node previous = null;
        Node next;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        Node left = head;
        Node right = previous;
        Node nextL , nextR;

        //alt merge - zig-zag merge
        while (left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }


    public static void main(String[] args) {
        ZigZagLinkedList list = new ZigZagLinkedList();

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

        list.zigZag();
        list.print();
    }
}
