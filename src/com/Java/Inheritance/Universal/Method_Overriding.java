package com.Java.Inheritance.Universal;


class BasicMobile1 {
    void call(){
        System.out.println("Basic Calling.........");
    }
    void sms(){
        System.out.println("Basic Sending SMS.........");
    }
    void Display(){
        System.out.println("Basic small size screen Displaying.........");
    }
}
class SmartMobile1 extends BasicMobile1 {
    void net(){
        System.out.println("Mobile has Network.........");
    }
    void Display(){
        System.out.println("Smat Mobile large screen Displaying.........");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        BasicMobile1 bm = new BasicMobile1();
        System.out.println("For Basic Mobile");
        bm.call();
        bm.sms();
        bm.Display();
        // bm.net();  // not possible

        SmartMobile1 sm = new SmartMobile1();
        System.out.println("\nFor Smart Mobile");
        sm.call();
        sm.sms();
        sm.Display();
        sm.net();

    }
}
