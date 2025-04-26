package com.Java.MethodAndConstructor;

public class ReturnCurrentObject {
    ReturnCurrentObject collegeName(){
        System.out.println("IIT-ISM is the best Engineering college in India.");
        // Create an object of the class.
        ReturnCurrentObject cg = new ReturnCurrentObject(); // using first approach. 
        return cg;
    }
    ReturnCurrentObject estYear(){
        System.out.println("IIT-ISM was established in 1926");
        return this;  // using 2nd approach.
    }
    public static void main(String[] args) {
        ReturnCurrentObject currentObject = new ReturnCurrentObject();
        ReturnCurrentObject currentObjectName = currentObject.collegeName();
        System.out.println(currentObjectName);

        ReturnCurrentObject eYear = currentObject.estYear();
        System.out.println(eYear);
    }
}
