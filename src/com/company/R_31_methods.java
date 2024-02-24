package com.company;

public class R_31_methods {
    // Creating an instance method.
    void msg() {
        System.out.println("Instance method");
    }

    //Calling Static Method in Java
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x + y) * 5;
        }
        x = 34342;  // not effects because this is copy
    return z;
    }
     public static void main(String[] args){
        int a = 4;
        int b = 8;

        int c = logic(a,b);
        System.out.println(a +" " + b);  // if we do use string value than he will separate
         System.out.println(a +b);
         int a1 = 4;
         int b1 = 2;
        int d = logic(a1,b1);
          System.out.println(c);
          System.out.println(d);

         // Creating an object of class.
         R_31_methods t = new R_31_methods();
        // Call the method using reference variable t.
         t.msg();


     }
}
