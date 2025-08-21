package com.Java_8_17_21.Java5;

// Example of Generic Class + Generic Method
public class GenericExample {

    // -----------------------
    // 1. Generic Class
    // -----------------------
    // <T> is a type parameter, T can be replaced by any type (Integer, String, Double, etc.)
    static class Box<T> {
        private T value;

        // Constructor
        public Box(T value) {
            this.value = value;
        }

        // Getter
        public T getValue() {
            return value;
        }

        // Setter
        public void setValue(T value) {
            this.value = value;
        }
    }

    // -----------------------
    // 2. Generic Method
    // -----------------------
    // <E> means this method can work with any type (independent of class generic type T)
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // -----------------------
    // 3. Main Method
    // -----------------------
    public static void main(String[] args) {
        // Using Generic Class
        Box<Integer> intBox = new Box<>(100);     // Box of Integer
        Box<String> strBox = new Box<>("Hello"); // Box of String

        System.out.println("Integer Value from Box: " + intBox.getValue());
        System.out.println("String Value from Box: " + strBox.getValue());

        // Using Generic Method
        Integer[] intArray = {10, 20, 30, 40, 50};
        String[] strArray = {"Java", "Generics", "Example"};

        System.out.println("\nPrinting Integer Array using Generic Method:");
        printArray(intArray);

        System.out.println("\nPrinting String Array using Generic Method:");
        printArray(strArray);
    }
}

