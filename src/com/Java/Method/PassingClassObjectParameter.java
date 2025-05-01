package com.Java.Method;

// Class representing a Student
class student {
    // You can add student-related variables and methods here
}

// Class representing a Library
class Library {
    // You can add library-related variables and methods here
}

// Class representing an Admin
class Admin {
    // You can add admin-related variables and methods here
}

// Class representing an Employee
class Employee {
    // You can add employee-related variables and methods here
}

// Main class
public class PassingClassObjectParameter {

    // Instance method: Takes two objects (Student and Library) as parameters
    void m1(student s, Library l) {
        System.out.println("m1 is calling.");
    }

    // Static method: Takes Admin and Employee objects as parameters
    public static void m2(Admin a, Employee ep) {
        System.out.println("m2 is calling");
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {

        // Create an object of PassingClassObjectParameter to call non-static method m1
        PassingClassObjectParameter sc = new PassingClassObjectParameter();

        // Create objects of Student and Library
        student s = new student();     // (1)
        Library l = new Library();     // (2)

        // Call instance method m1 by passing Student and Library objects
        sc.m1(s, l);                   // (3)

        // You can also use: sc.m1(new Student(), new Library());

        // Create objects of Admin and Employee
        Admin a = new Admin();
        Employee ep1 = new Employee();

        // Call static method m2 by passing Admin and Employee objects
        PassingClassObjectParameter.m2(a, ep1);  // (4)

        // You can also use: PassingClassObjectParameter.m2(new Admin(), new Employee());
    }
}
