package com.Java.MethodAndConstructor;

public class School
{
    // Declare instance variables.
    String scName;
    int estYear;
    // Constructor overloading begins from here.
// Create a non-parameterized constructor and initialize values.
// If we don't initialize values, default values null and 0 will print as output provided by default constructor.
    School()
    {
        scName = "RSVM";
        estYear = 1975;
    }
    // Create one parameter constructor and set the parameter name different from variable name.
// Because we are not using this reference.
    School(String name)
    {
        scName = name;
    }
    // Create two parameters constructor and set the name of parameters different from name of variables.
    School(String name, int year)
    {
        scName = name;
        estYear = year;
    }
    // Create an instance method to print output.
    void display()
    {
        System.out.println(scName+ " " +estYear);
    }
    // Main method declaration.
    public static void main(String[] args)
    {
// Create the first object with object reference variable sc.
        School sc = new School(); // calling non-parameterized constructor.
// Create second object with object reference variable sc1.
        School sc1 = new School("RSVM"); // calling one parameterized constructor.
// Create third object with object reference variable sc2.
        School sc2 = new School("RSVM",1975); // calling two parameterized constructor.
// Now call methods using reference variables sc, sc1 and sc2 one by one to print output.
        sc.display();
        sc1.display();
        sc2.display();
    }
}
