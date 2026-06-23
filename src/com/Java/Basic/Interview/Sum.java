package com.Java.Basic.Interview;

public class Sum {
   int a;
   int b;
   Sum(){
       a=50;
       b=20;
   }
   void display(){
       int sum = a+b;
       System.out.println("Sum of two numbers:" + sum);
   }
    static void main() {
        Sum sm = new Sum();
        sm.display();
    }
}
