
package com.Java.Inheritance_Inferface.Universal.Inheritance;
 class Outer2{
    int a=10;
    class Inner{
        int b=40;
        void show(){
            System.out.println("B ="+b);
        }
    }
}
public class Nested_class {
    public static void main(String args[]) {
        Outer2 obj = new Outer2();
        Outer2.Inner oi = obj.new Inner();
        oi.show();
        
    }
}
