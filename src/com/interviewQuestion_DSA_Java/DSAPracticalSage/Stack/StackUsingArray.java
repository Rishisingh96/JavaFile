package com.interviewQuestion_DSA_Java.DSAPracticalSage.Stack;

import java.util.Scanner;
/*
✅ Stack Operations Using Java (with Array)
✔️ Operations Covered:
push() – Insert element

pop() – Remove top element

peek() – View top element

isEmpty() – Check if stack is empty

isFull() – Check if stack is full

display() – Print stack contents

*/
public class StackUsingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor
    public StackUsingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Empty stack
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    // Pop operation
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
        } else {
            int popped = stackArray[top--];
            System.out.println("Popped element: " + popped);
        }
    }

    // Peek operation
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stackArray[top]);
        }
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackUsingArray stack = new StackUsingArray(5);

        int choice, value;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}


/*--- Stack Menu ---
1. Push
2. Pop
3. Peek
4. Display
5. Exit
Enter choice: 1
Enter value to push: 10
10 pushed to stack

Enter choice: 1
Enter value to push: 20
20 pushed to stack

Enter choice: 3
Top element: 20

Enter choice: 2
Popped element: 20

Enter choice: 4
Stack elements:
10
*/