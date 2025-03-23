package com.interviewQuestion_DSA_Java.Queue;

import java.util.Scanner;

public class ArrayImplementation {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add an element to the queue
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // Remove an element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = arr[0];
            // Shift elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--; // Update rear after removing the element
            return front;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }

        // Display all elements in the queue
        public static void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        // Switch-case for queue operations
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an operation: 1-Add, 2-Remove, 3-Peek, 4-Display, 5-Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add operation
                    System.out.print("Enter a number to add: ");
                    int num = sc.nextInt();
                    q.add(num);
                    break;
                case 2: // Remove operation
                    int removed = q.remove();
                    if (removed != -1) {
                        System.out.println("Removed: " + removed);
                    }
                    break;
                case 3: // Peek operation
                    int peek = q.peek();
                    if (peek != -1) {
                        System.out.println("Front of the queue: " + peek);
                    }
                    break;
                case 4: // Display operation
                    q.display();
                    break;
                case 5: // Exit
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
