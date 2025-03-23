package com.interviewQuestion_DSA_Java.Queue;

import java.util.Scanner;

public class CircularQueueArrayUse {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if the queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add an element to the queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // If the queue is empty, initialize front to 0
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove an element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];
            // If there's only one element, reset the queue
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }

        // Display all elements in the queue
        public static void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: ");
            int i = front;
            while (i != rear) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % size;
            }
            System.out.print(arr[rear] + " "); // Print the rear element
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
