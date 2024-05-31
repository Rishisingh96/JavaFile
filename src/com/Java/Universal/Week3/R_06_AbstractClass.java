package com.Java.Universal.Week3;

import java.util.Scanner;

abstract class Processor {
    protected int data;

    public Processor(int data) {
        this.data = data;
    }

    void showData() {
        System.out.println("Data value: " + data);
    }

    abstract void process();
}

class Factorial extends Processor {

    public Factorial(int data) {
        super(data);
    }

    @Override
    void process() {
        int fact = 1;
        for (int i = 1; i <= data; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + data + " is: " + fact);
    }
}

class Circle extends Processor {

    public Circle(int radius) {
        super(radius);
    }

    @Override
    void process() {
        double area = Math.PI * data * data;
        System.out.println("Area of circle with radius " + data + " is: " + area);
    }
}

public class R_06_AbstractClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a number \n1: Factorial \n2: Area of Circle");
        int choice = in.nextInt();

        System.out.println("Enter the data value:");
        int data = in.nextInt();

        Processor processor = null;
        switch (choice) {
            case 1:
                processor = new Factorial(data);
                break;
            case 2:
                processor = new Circle(data);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        processor.process();
        processor.showData();
    }
}
