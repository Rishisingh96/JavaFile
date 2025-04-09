package com.Java.OOPs;
// Anonymous object example
class Car{
    String name = "Renault";
    void Start(){
        System.out.println("Car is starting");
    }
    void Stop(){
        System.out.println("Car is stopping");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        //Calling variable using anonymous object
        System.out.println("Car name is: " + new Car().name);

        //Calling method using anonymous object
        new Car().Start();
        new Car().Stop();
    }
}
