package com.Java.InnerClass;

public class MemberInnerClass {
    // Member Inner Class
    class Inner {
        void display() {
            System.out.println("This is a member inner class.");
        }
    }
    public static void main(String[] args) {
        //Static area of outer class
        System.out.println("Outer class main method.");

        // Create an instance of the outer class
        MemberInnerClass outer = new MemberInnerClass();

        // Create an instance of the inner class
        MemberInnerClass.Inner inner = outer.new Inner();
        // Call the method of the inner class
        inner.display(); // Output: This is a member inner class.

    }
}
