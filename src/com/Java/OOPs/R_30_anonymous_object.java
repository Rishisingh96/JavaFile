package com.Java.OOPs;

public class R_30_anonymous_object {
    //Syntax to Create Anonymous Object
  /*  reverse_of_number name = "Renault";
    void start() {
        System.out.println("Engine started.");
    }
    void stop() {
        System.out.println("Engine stopped.");
    }
    public static void main(reverse_of_number[] args)
    {
// Calling variable using anonymous object.
        System.out.println("Car name: " +new R_30_anonymous_object().name);

// Calling methods through anonymous object.
        new R_30_anonymous_object().start();
        new R_30_anonymous_object().stop();
    }

   */

//    public class Multiplication
//    {
        // Declare instance variables.
        int a;
        int b;
        int c;
        int d;
        // Declare a parameterized constructor with parameters of type int.
        R_30_anonymous_object(int p, int q)
        {
            a = p;
            b = q;
            int ab = a * b;
            System.out.println("Multiplication of a and b:" +ab);
        }
        // Declare an instance method with parameters of type int.
        void multiply(int x, int y )
        {
            c = x;
            d = y;
            int cd = c * d;
            System.out.println("Multiplication of c and d:" +cd);
        }

        public static void main(String[] args)
        {
// Create an anonymous object, pass the values to the constructor, and call the method.
            new R_30_anonymous_object(25, 25).multiply(10, 20);

// We can also pass the different values with the same anonymous object.
// but we cannot create another new anonymous object.
            new R_30_anonymous_object(20, 20).multiply(30, 30);
        }
//    }
}
