package com.Java.constructor;

class Test{
    String name;
    int age;
    // Private constructor declared
    private Test(String name, int age){
        this.name = name;
        this.age = age;
    }
}
// Here, we are creating a subclass of a superclass.
/*public class DisplayInfo extends Test {
    DisplayInfo() {
        super("John", 25);  // Compilation problem.
    }
}*/
public class PrivateConstructorExample {
    public static void main(String[] args) {
        // The following line will cause a compile-time error
        // because the constructor is private
//        Test obj = new Test("John", 25); //private
//        System.out.println("Name: " + obj.name + ", Age: " + obj.age);

    }
}
