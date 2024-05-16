package com.Java.Universal.Week2;

import java.util.Scanner;

public class function_init_calcQ8 {
    private int radius;
    private float area;

    // Method to input radius from user
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius = scanner.nextInt();
    }

    // Method to calculate area
    public void calc() {
        area = 3.14f * radius * radius;
    }

    // Method to display area
    public void display() {
        System.out.println("The area of the circle is: " + area);
    }
    public static void main(String[] args) {
    function_init_calcQ8 obj = new function_init_calcQ8();
    obj.init();
    obj.calc();
    obj.display();
    }
}
/*8. Create a class to calculate Area of circle with one data member to store the
radius and another to store area value. Create following member methods :
1) init() : to input radius from user
2) calc() : to calculate area
3) display() : to display area
*/