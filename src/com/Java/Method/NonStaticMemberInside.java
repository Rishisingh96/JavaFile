package com.Java.Method;


public class NonStaticMemberInside {
        // Non-static (instance) variable
        int instanceVar = 10;

        // Static method
        public static void show() {
//             Cannot do this directly: System.out.println(instanceVar); ❌
         //   System.out.println(instanceVar); // ❌
            // Correct way: create object
            NonStaticMemberInside obj = new NonStaticMemberInside();
            System.out.println("Accessing instance variable from static method: " + obj.instanceVar);
        }
        public static void main(String[] args) {
            // Calling static method
            show();
        }
    }
