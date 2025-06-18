package com.interviewQuestion_DSA_Java.DSAPracticalSage.Queue;

class DLLNode {
    int data;
    DLLNode prev, next;

    DLLNode(int data) {
        this.data = data;
    }
}

public class DEQueueUsingDoublyLinkedListO {
    DLLNode front = null, rear = null;

    // Insert at front
    public void insertFront(int data) {
        DLLNode newNode = new DLLNode(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    // Insert at rear
    public void insertRear(int data) {
        DLLNode newNode = new DLLNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    // Delete from front
    public void deleteFront() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted from front: " + front.data);
        front = front.next;
        if (front != null)
            front.prev = null;
        else
            rear = null;
    }

    // Delete from rear
    public void deleteRear() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted from rear: " + rear.data);
        rear = rear.prev;
        if (rear != null)
            rear.next = null;
        else
            front = null;
    }

    // Display
    public void display() {
        if (front == null) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.print("Deque: ");
        DLLNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DEQueueUsingDoublyLinkedListO dq = new DEQueueUsingDoublyLinkedListO();
        dq.insertFront(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertRear(25);
        dq.display();

        dq.deleteFront();
        dq.deleteRear();
        dq.display();
    }
}
