package com.Java.MultiThreding.Universal;

class Student {
    String name;
    int rollno;
    int marks;

    public Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
    }
}

class Facalty {
    String name; 
    String NameofFild;
    String Address;

    public Facalty(String name, String nameofFild, String address) {
        this.name = name; 
        NameofFild = nameofFild;
        Address = address;
    }

    @Override
    public String toString() {
        return "Facalty [NameofFild=" + NameofFild + ", Address=" + Address + "]";
    }
}

public class classImplement {
    public static void main(String[] args) {
        Student s = new Student("Rishi", 32, 72);
        Facalty f = new Facalty("Raj", "C", "Indore, bholaram");

        Thread t1 = new Thread(() -> {
            System.out.println(s.toString());
        });

        Thread t2 = new Thread(() -> {
            System.out.println(f.toString());
        });

        t1.start();
        t2.start();
    }
}
