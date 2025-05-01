package com.Java.InnerClass;

class Test {
    int x = 10; // Instance variable.
    static int y = 20; // Static variable.

    // Static nested class starts here.
    static class Nested {
        // static member.
        static int z = 50;

        static void m1() {
            // System.out.println("Value of x: " +x); // Compile time error because we cannot make a static reference to the non-static field x.
            System.out.println("Value of y: " + y);
            System.out.println("Value of z: " + z);
        }

        // Non-static member (Instance method) inside static nested class.
        void m2() {
            // System.out.println("Value of x: " +x); // Compile time error because we cannot make a static reference to the non-static field x.
            System.out.println("Value of y: " + y);
        }
    } // Ends here.

    // Normal inner class starts here.
    class Inner {
        // Non-static members.
        void m3() {
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + y);
            System.out.println("Value of z: " + Nested.z);
            Nested.m1();
            Nested n = new Nested();
            n.m2();
        }
    }
}
    public class staticNestedClass {
    public static void main(String[] args) {
        Test t = new Test();
        Test.Inner i = t.new Inner();
        i.m3();

    }
}
