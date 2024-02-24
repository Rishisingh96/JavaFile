package com.company;

public class R_31_allMethod {

    //++++++++++++++++++++++++++++++++++++++++++++++++++++ Program code 4:
    // Instance area/non-static area.
// Declaration of instance variables.
   /* int p= 10;
    int q = 20;

    // Declaration of instance method.
    void add() {
        // Instance area/Non-static area.
        // Within instance area, we can directly call the instance variables from instance area (same area) without using object reference variable.
        System.out.println("First number a = " + p);
        System.out.println("Second number b = " + q);

        // logic of addition.
        int x = p + q;
        System.out.println("Addition of two numbers x = " + x); // directly called.
    }*/

//=====================================================
   /* int a = 40;
    int b = 50;
    void sub()
    {
        int y = a-b;
        System.out.println("Subtraction of two number y = " +y);
    }
    static void subtract()
    {
        // creating the object of the class within a static area to call instance members.
        R_31_allMethod st = new R_31_allMethod();
        st.sub();
    }*/

    //	How to Call Static Method from Main in Java
//++++++++++++++++++++++++++++++++++++++++++++++++++++ Program code 5:

    int a = 20; // Instance variable.
    // Declare static variables.
    static int c = 40;
    static int d = 50;
    // Instance method.
    void m1()
    {
        // We can call directly static variables from instance area (same area) without using class name.
        System.out.println("Third number c = " +c);
        System.out.println("Fourth number c = " +d);
    }

    // Static method
    static void multiply()
    {
        // Static area.
        // We cannot call directly instance members/non-static members in the static area.
        // System.out.println(x); // Invalid syntax.

        int mNum = c * d;
        System.out.println("Multiplication: " +mNum);
    }

    public static void main(String[] args) {
        // Static area.
        // Create an object of the class.
        R_31_allMethod ad = new R_31_allMethod();
// Since we are calling an instance method from instance area within the static area.
        // So, we will use object reference variable ad to call it.
//        ad.add();

//        subtract(); // calling static method.

        // Call static method using class name.
         //  R_31_allMethod.multiply();
    }
}