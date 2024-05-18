package com.Java.Universal.Constructor;

class RectangleBox1{
    int l, b;
    RectangleBox1(){
        l=10;
        b=20;
        System.out.println("Object Initialized .");
    }
    RectangleBox1(int l,int b){
        this.l = l;            // two Parameter
        this.b = b;
    }
    RectangleBox1(int l){  //Single parameter
        this.l = l;
        this.b = 20;
    }
    public RectangleBox1(RectangleBox1 obj){
        this.l = obj.l;
        this.b = obj.b;
    }

    void show(){
        System.out.println("L= "+ l +" B= "+b);
    }
}
public class Copy_Constructor {
    public static void main(String[] args) {
        RectangleBox1 Box1 = new RectangleBox1();
        RectangleBox1 Box2 = new RectangleBox1(100,900);
        RectangleBox1 Box3 = new RectangleBox1(Box2);

        Box1.show();
        Box2.show();
        Box3.show();

//        Box2  = 1000;
//        Box2  = 2000;
        System.out.println(Box1 == Box2);
        System.out.println(Box2 == Box3);
    }
}
