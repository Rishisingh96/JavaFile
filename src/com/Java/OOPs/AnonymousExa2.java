package com.Java.OOPs;

public class AnonymousExa2 {
    public class Calculation {
        // Declare an instance variable.
        int a;

        // Declare one parameter constructor.
        Calculation(int p) {
            a = p;
        }

        // Declare instance methods.
        void area() {
            int area = a * a;
            System.out.println("Area of square: " + area);
        }

        void perimeter(int b) {
            int peri = 4 * b;
            System.out.println("Perimeter of square: " + peri);
        }
    }
        public void main(String[] args) {
//      Create anonymous objects.
            new Calculation(50).area();
            new Calculation(10).perimeter(100);
            new Calculation(20).area();
            new Calculation(30).perimeter(200);
        }
    }
