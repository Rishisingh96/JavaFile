package com.interviewQuestion_DSA_Java.Queue.Question;
import java.util.Deque;
import java.util.LinkedList;

public class StackAndQueueUsingDeque {
   static class Stack{
       Deque<Integer> deque = new LinkedList<>();
       public void push(int data) {
           deque.addLast(data); // or deque.offerLast(data);
       }
       public int pop() {
           return deque.removeLast(); // or deque.pollLast();
       }
       public int peek(){
           return deque.getLast(); // or deque.peekLast();
       }
    }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();
        public void add(int data) {
            deque.addLast(data); // or deque.offerLast(data);
        }
        public int remove() {
            return deque.removeFirst(); // or deque.pollFirst();
        }
        public int peek() {
            return deque.getFirst(); // or deque.peek       }
        }
    }
        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            System.out.println("Peek = " + s.peek());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());

            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println("Peek = " + q.peek());
            System.out.println(q.remove());
            System.out.println(q.remove());
            System.out.println(q.remove());
        }
    }
