package com.Java.Block_In_Java;

//Case 1
class AB{
    //Case 1
   /* static void m1(){
        System.out.println("m1-AB");
    }*/

    //Case 2
   /* void m1(){
        System.out.println("m1-AB");
    }*/

    //Case 3
    static void m1(){
        System.out.println("m1-AB");
    }
}
class ABC extends AB{
    //Case 1
   /* protected void m1(){  // overridden method is static
        System.out.println("m1-ABC");
    }*/

    //Case 2
  /*  static void m1(){   //overriding method is static
        System.out.println("m1-ABC");
    }*/

//    Case3
    static void m1() {
        System.out.println("m1-ABC");
    }
}
public class TryToOverrideStaticMethod {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.m1();
    }
}

