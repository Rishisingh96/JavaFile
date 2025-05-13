package com.interviewQuestion_DSA_Java.Heap_18;

import java.util.*;

public class Classroom {
    // Priority Queue is a data structure that stores elements in a way that allows for efficient retrieval of the highest (or lowest) priority element.
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank; //ascending order
        }
    }
    public static void main(String[] args) {
        //1 , 2, 3,4,5
//        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(new Student("A", 4)); //O(log n)
        priorityQueue.add(new Student("B", 5));
        priorityQueue.add(new Student("C", 2));
        priorityQueue.add(new Student("D", 12));

        while (!priorityQueue.isEmpty()) {
         //   System.out.println(priorityQueue.peek()); //O(1)
            System.out.println(priorityQueue.peek().name + " -> " + priorityQueue.peek().rank); //O(1)
            priorityQueue.poll(); //O(log n)
        }
    }
}
