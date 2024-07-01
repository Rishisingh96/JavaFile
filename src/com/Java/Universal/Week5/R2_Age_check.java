package com.Java.Universal.Week5;
// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Worker class with parameterized constructor and age check
class Worker {
    int workerId;
    String name;
    int age;

    public Worker(int workerId, String name, int age) {
        this.workerId = workerId;
        this.name = name;
        this.age = age;
    }

    // Method to check the worker's age
    public void checkAge() throws InvalidAgeException {
        if (age < 16) {
            throw new InvalidAgeException("Invalid Age For Worker");
        } else {
            System.out.println("Valid age");
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Main class to test the functionality
public class R2_Age_check {
    public static void main(String[] args) {
        try {
            Worker worker = new Worker(123, "Rishi Singh", 4);
            System.out.println(worker.toString());
            worker.checkAge();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
