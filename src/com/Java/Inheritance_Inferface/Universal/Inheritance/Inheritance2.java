package com.Java.Inheritance_Inferface.Universal.Inheritance;


class BasicMobile{
    void call(){
        System.out.println("Basic Calling.........");
    }
    void sms(){
        System.out.println("Basic Sending SMS.........");
    }
    void Display(){
        System.out.println("Basic Displaying.........");
    }
}
class SmartMobile extends BasicMobile1 {
    void net(){
        System.out.println("Mobile has Network.........");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        SmartMobile1 sm = new SmartMobile1();
        sm.call();
        sm.sms();
        sm.Display();
        sm.net();
    }
}
