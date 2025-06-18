package com.interviewQuestion_DSA_Java.DSAPracticalSage.Queue;
/*✅ Question 3.1 — Double Ended Queue (Deque) in Java
📌 i) DEQueue Using Array
📌 ii) DEQueue Using Doubly Linked List*/
public class DEQueueUsingArray {
    private int[] deque;
    private int front, rear, size, capacity;

    public DEQueueUsingArray(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    // Insert at front
    public void insertFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) { // Empty deque
            front = rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }

        deque[front] = item;
        size++;
    }

    // Insert at rear
    public void insertRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }

        deque[rear] = item;
        size++;
    }

    // Delete from front
    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted from front: " + deque[front]);

        if (front == rear) {
            front = rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
    }

    // Delete from rear
    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted from rear: " + deque[rear]);

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
    }

    // Display elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.print("Deque: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        DEQueueUsingArray dq = new DEQueueUsingArray(5);
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.display();

        dq.deleteRear();
        dq.deleteFront();
        dq.display();
    }
}
