package com.Java.Universal.Advance_Java.week1;

import java.util.Map;
import java.util.TreeMap;

// Define the Student1 class
class Student1 implements Comparable<Student1> {
    private Integer rollno;
    private Character division;

    public Student1(Integer rollno, Character division) {
        this.rollno = rollno;
        this.division = division;
    }

    public Integer getRollno() {
        return rollno;
    }

    public Character getDivision() {
        return division;
    }

    @Override
    public int compareTo(Student1 other) {
        return this.rollno.compareTo(other.rollno);
    }

    @Override
    public String toString() {
        return "Rollno: " + rollno + ", Division: " + division;
    }

    @Override
    public int hashCode() {
        return rollno.hashCode() + division.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student1 student = (Student1) obj;
        return rollno.equals(student.rollno) && division.equals(student.division);
    }
}

public class R7_TreeMapOperations {
    public static void main(String[] args) {
        // Create a TreeMap where key is Student1 and value is String (Student's Name)
        TreeMap<Student1, String> treeMap = new TreeMap<>();

        // Store some key-value pair entries in the TreeMap
        treeMap.put(new Student1(101, 'A'), "Alice");
        treeMap.put(new Student1(102, 'B'), "Bob");
        treeMap.put(new Student1(103, 'A'), "Charlie");
        treeMap.put(new Student1(104, 'C'), "David");
        treeMap.put(new Student1(105, 'B'), "Eve");

        // Display list of all keys from the TreeMap
        System.out.println("List of all keys:");
        for (Student1 key : treeMap.keySet()) {
            System.out.println(key);
        }

        // The entries are already sorted based on rollno due to TreeMap's nature
        System.out.println("\nEntries sorted by rollno:");

        // Display list of all entries from the TreeMap
        System.out.println("List of all entries:");
        for (Map.Entry<Student1, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
