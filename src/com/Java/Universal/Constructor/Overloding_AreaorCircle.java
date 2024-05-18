package com.Java.Universal.Constructor;


public class Overloding_AreaorCircle {

    static void Area(float r){
        double AofC =  3.14f * r*r;
        System.out.println(AofC);
    }
//    static double Area(float r){
//        double Square = r*r;
//        return Square;
////        System.out.println(Square);
//    }
     static boolean Area(float base, float height){
//   (area of a triangle)     A = 1/2 × b × h.  //base, height  0.5
        float AofTriangle = 0.5f * base*height;
         System.out.println("Area of Triangle is "+AofTriangle);
         return false;
     }
    static int Area(int length, int width){
//        Area of a Rectangle = (Length × Width)
        int AofRectangle = length*width;
        return AofRectangle;
    }

    public static void main(String[] args) {

//        Area(8);
//        Area(8.0);
//        float pai = 3.14f;
//        System.out.println("Area of circle : "+Area(pai, 8));
//        Area(23.3f, 8.2f);
//        System.out.println("Area of Rectangle : "+ Area(22, 34));
    }
}
