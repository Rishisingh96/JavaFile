package com.interviewQuestion_DSA_Java.Stack_12;

public class StackUseLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        // Check if the stack is empty
        public static boolean isEmpty(){
            return head == null;
        }

        // Push: Add data to the top of the stack
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop: Remove data from the top of the stack
        public static int pop(){
            if(isEmpty()){
                return -1; // Return -1 if the stack is empty
            }
            int top = head.data; // Get the top element
            head = head.next;    // Remove the top element by pointing to the next node
            return top;          // Return the popped element
        }

        // Peek: Return the top element without removing it
        public static int peek(){
            if(isEmpty()){
                return -1; // Return -1 if the stack is empty
            }
            return head.data; // Return the top element
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        // Push elements into the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(6);

        // While the stack is not empty, print the top element and pop it
        while(!s.isEmpty()){
            System.out.println(s.peek()); // Print the top element
            s.pop();                      // Remove the top element
        }
    }
}
