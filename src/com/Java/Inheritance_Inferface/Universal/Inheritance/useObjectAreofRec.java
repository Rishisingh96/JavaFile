
package com.Java.Inheritance_Inferface.Universal.Inheritance;


class Outer1{
    int h=10;
     class Inner{
         int w=40;
         void show(){
            
            int AofR = h*w;
            System.out.println("AofRectangle"+AofR);
//             System.out.println(h);
//               System.out.println(w);
        }
    }
}

public class useObjectAreofRec {
    public static void main(String args[]) {
        Outer1 obj = new Outer1();
        Outer1.Inner oi = obj.new Inner();
        oi.show();
    }
}
