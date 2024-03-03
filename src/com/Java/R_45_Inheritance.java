package com.Java;
class Base1{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }

}
class Derived1 extends Base1{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class R_45_Inheritance{
    public static void main(String[] args){
        // Creating an Object of basic calss
        Base1 b = new Base1();
        b.setX(4);
        System.out.println(b.getX());

// Creating an object of derived class
        Derived1 d = new Derived1();
        d.setY(43);
        System.out.println(d.getY());
    }
}