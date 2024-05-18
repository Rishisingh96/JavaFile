package com.Java.Universal.Constructor;

class RectangleBox{
    int l, b;
    RectangleBox(){
        l=10;
        b=20;
        System.out.println("Object Initialized .");
    }
    RectangleBox(int l,int b){
        this.l = l;            // two Parameter
        this.b = b;
    }
    RectangleBox(int l){  //Single parameter
        this.l = l;
        this.b = 20;
    }
    void show(){
        System.out.println("L= "+ l +" B= "+b);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleBox Box1 = new RectangleBox();
        RectangleBox Box2 = new RectangleBox(100,900);
        RectangleBox Box3 = Box2;

        Box1.show();
        Box2.show();
        Box3.show();

//        Box2  = 1000;
//        Box2  = 2000;
        System.out.println(Box1 == Box2);
        System.out.println(Box2 == Box3);
    }
}
