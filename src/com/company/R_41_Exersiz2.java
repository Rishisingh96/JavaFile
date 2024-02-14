package com.company;
//import java.util.math.h;
// problem 1
class Cylender{
    private int radius;
    private int hight;
    public int A;
    double pai = 3.14;
    public int gettersr(){
        return radius;
    }
    // The radius of a cylinder(r) = root(V/pai *h)
    public void setterr(int r){
        radius = r;
    }
    public int getters(){
        return hight;
    }
    public void setter(int h){
            hight = h;
    }
    public int surfacearea(){
        return A;
    }
//    public void settersurfaceA(int A){            // This is use When A is private
//        A = A;                                // A is pubic so acces anyone;
//    }
//    public int valumeofArea(){
//
//    }
}
// Problem 2
public class R_41_Exersiz2 {
    public static void main(String arg[]){
        // problem 1
        Cylender rishi = new Cylender();
        rishi.setter(20);
        rishi.setterr(30);
        System.out.println("The radius is = "+ rishi.gettersr());
        System.out.println("The hight is = "+ rishi.getters() );

    // problem 2
        rishi.A = 4;   // public
        System.out.println(rishi.surfacearea());
    }
}
