package com.Java.MethodAndConstructor;

public class ConstructorWithArrayOfObjects {
    ConstructorWithArrayOfObjects(){
        System.out.println("Hello Java ! ");
    }
    public static void main(String[] args) {
        //Create an array object
        ConstructorWithArrayOfObjects[] h  = new ConstructorWithArrayOfObjects[4];

        for(int i=0; i<h.length; i++){
            h[i] = new ConstructorWithArrayOfObjects();
        }
    }
}
