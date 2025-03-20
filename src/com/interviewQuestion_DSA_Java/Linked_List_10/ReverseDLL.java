package com.interviewQuestion_DSA_Java.Linked_List_10;

public class ReverseDLL {
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

    //remove
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr.previous = next;

            prev = curr;
            curr = next;
        }
        head = prev;
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

    public static void main(String[] args) {

        ReverseDLL rdll = new ReverseDLL();
        rdll.addFirst(7);
        rdll.addFirst(5);
        rdll.addFirst(8);
        rdll.addFirst(4);

        rdll.print();
        rdll.reverse();
        rdll.print();

    }
}
