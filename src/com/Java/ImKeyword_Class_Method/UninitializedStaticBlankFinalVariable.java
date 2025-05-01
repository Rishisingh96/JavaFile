package com.Java.ImKeyword_Class_Method;
class FinalVar{
    // Declare a blank final instance variable.
    final int x;
    // Declare a static blank final variable.
    final static int a;

    FinalVar(){
        x = 20;
    }

    void displayValue(){
        System.out.println("Value of x: " +x);
    }
    // Declare a static block to initialize the final static variable.
    static {
        a = 30;
        System.out.println("Value of a : " + a);
    }

}
public class UninitializedStaticBlankFinalVariable {
    public static void main(String[] args) {
        // Create an object of the class.
        FinalVar fv = new FinalVar();

        // Call change() method using reference variable fv.
        fv.displayValue();

    }
}
