package com.interviewQuestion_DSA_Java.Queue;

import java.util.Scanner;

public class UsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class QueueLL {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;  // Use logical '&&'
        }

        // Add a new element to the queue
        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove an element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;

            if (tail == head) { // Single element in the queue
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // Peek at the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        // Display all elements in the queue
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            System.out.println("Queue elements:");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation: 1-Add, 2-Remove, 3-Peek, 4-Display, 5-Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number to add:");
                    int num = sc.nextInt();
                    q.add(num);
                    break;
                case 2:
                    int removedElement = q.remove();
                    if (removedElement != -1) {
                        System.out.println("Removed: " + removedElement);
                    }
                    break;
                case 3:
                    int peekElement = q.peek();
                    if (peekElement != -1) {
                        System.out.println("Front of the queue: " + peekElement);
                    }
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }

        // Test with some queue operations
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println("Peek: " + q.peek());
            q.remove();
        }
    }
}
