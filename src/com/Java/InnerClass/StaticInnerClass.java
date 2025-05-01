package com.Java.InnerClass;

public class StaticInnerClass {
    // Static nested class starts here.
    static class B {
        public void m1() {
            System.out.println("Static nested class method");
        }
    } // Ends here.
    public static void main(String[] args) {
        // Since class B is a static nested class, not a regular inner class,
        // Therefore, the outer class object is not required.
        // You can directly create an object of static nested class like this.
        B b = new B();
        b.m1();
    }
}
