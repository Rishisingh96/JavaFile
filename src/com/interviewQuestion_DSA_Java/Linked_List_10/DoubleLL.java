package com.interviewQuestion_DSA_Java.Linked_List_10;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(7);
        dll.addFirst(5);
        dll.addFirst(8);
        dll.addFirst(4);

        dll.print();
        System.out.println(dll.size);
    }
}
