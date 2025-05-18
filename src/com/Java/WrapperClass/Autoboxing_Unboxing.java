package com.Java.WrapperClass;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        // Autoboxing: converting primitive to wrapper class
        int primitiveInt = 5;
        Integer wrapperInt = primitiveInt; // Autoboxing
        Integer i = Integer.valueOf(primitiveInt); // Another way to autobox  // Here, we are converting int into Integer explicitly.
        System.out.println("Autoboxed Integer: " + wrapperInt);
        System.out.println("Autoboxed Integer using valueOf: " + i);

        // Unboxing: converting wrapper class to primitive
        Integer anotherWrapperInt = 10;
        int unboxedInt = anotherWrapperInt; // Unboxing
        System.out.println("Unboxed Integer: " + unboxedInt);

        // Using a wrapper class in a collection
        java.util.List<Integer> list = new java.util.ArrayList<>();
        list.add(wrapperInt); // Autoboxing when adding to the list
        System.out.println("List after adding an Integer: " + list);

    }
}
