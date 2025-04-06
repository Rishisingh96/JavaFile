package com.Design_Patterns.Singleto_Design_Pattern;

public class ExampleE {
    public static void main(String[] args) {
        // Get singleton instance
        SamosE samosa1 = SamosE.INSTANCE;
        System.out.println("Samosa 1 hashcode: " + samosa1.hashCode());

        // Try to break Singleton using Reflection
        try {
            SamosE samosa2 = SamosE.class.newInstance();
            System.out.println("Samosa 2 hashcode: " + samosa2.hashCode());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
