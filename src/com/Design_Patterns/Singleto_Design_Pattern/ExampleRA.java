package com.Design_Patterns.Singleto_Design_Pattern;
import java.lang.reflect.Constructor;

public class ExampleRA {
    public static void main(String[] args) {
        try {
            // Get singleton instance
            SamosaRA samosa1 = SamosaRA.getSamosa();
            System.out.println("Samosa 1 hashcode: " + samosa1.hashCode());

            // Try to break Singleton using Reflection
            Constructor<SamosaRA> constructor = SamosaRA.class.getDeclaredConstructor();
            constructor.setAccessible(true); // Break encapsulation

            // This should throw an exception
            SamosaRA samosa2 = constructor.newInstance();
            System.out.println("Samosa 2 hashcode: " + samosa2.hashCode());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
