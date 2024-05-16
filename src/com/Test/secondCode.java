package com.Test;

import java.util.Scanner;

public class secondCode {
    Scanner in = new Scanner(System.in);
    float radius, area;
    public void init(){
        System.out.println("Enter your radius: ");
        radius =in.nextFloat();
    }
    public void calc(){
        area = 3.14f*radius*radius;
    }
    public void display(){
        System.out.println(area);
    }
    public static void main(String[] args) {
        secondCode obj = new secondCode();
        obj.init();
        obj.calc();
        obj.display();
    }

}
/*. Create a class to calculate Area of circle with one data member to store the
radius and another to store area value. Create following member methods :
1) init() : to input radius from user
2) calc() : to calculate area
3) display() : to display area*/