package com.Practice;

public class AccessModifier {
    class B {
        private void display() {
            System.out.println("Private access modifier example.");
        }

        public void views() {
            System.out.println("Public access modifier example.");
        }

        protected void show() {
            System.out.println("Protected access modifier example.");
        }

        void info() {
            System.out.println("Default access modifier example.");
        }
    }
    static void main() {
        AccessModifier outer = new AccessModifier();
        B bInstance = outer.new B();

        // Accessing methods with different access modifiers
        bInstance.display();  // Private method, accessible within the same class
        bInstance.views();    // Public method, accessible from anywhere
        bInstance.show();     // Protected method, accessible within the same package and subclasses
        bInstance.info();     // Default method, accessible within the same package
    }


}
