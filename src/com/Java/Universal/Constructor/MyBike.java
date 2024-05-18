package com.Java.Universal.Constructor;
class Bike{
    String model;
     static int count=0;
    void show(){
        System.out.println("Model :"+ model);
    }
    Bike(String model){
        this.model = model;
        count++;
    }
}
public class MyBike {
    public static void main(String[] args) {
        Bike B1 = new Bike("ABC");
        Bike B2 = new Bike("XYZ");
        Bike B3 = new Bike("LMN");

        B1.show();
        B2.show();
        B3.show();
        System.out.println("Total Object created: "+Bike.count);
    }
}
