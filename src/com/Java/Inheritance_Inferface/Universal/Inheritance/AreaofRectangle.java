
package com.Java.Inheritance_Inferface.Universal.Inheritance;

class Outer{
    static int h=10;
    
     static class Inner{
         static int w=40;
         static int AofR;
         static void show(){
            
              AofR = h*w;
            System.out.println("AofRectangle = "+ AofR);
//             System.out.println(h);
//               System.out.println(w);
        }
    }
}

public class AreaofRectangle {

    public static void main(String args[]) {
      Outer.Inner.show();
    }
}
