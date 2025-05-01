package com.Java.modifiers;

/*returnType methodName(datatype... varName) {
    // method body
}
*/

public class VarargsExample {
    // Method with varargs
    public static void sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Sum: " + total);
    }
    public static void main(String[] args) {
        // Calling method with different numbers of arguments
        sum(1, 2, 3);    // Sum: 6
        sum(10, 20);     // Sum: 30
        sum();           // Sum: 0 (no arguments passed)
    }
}
