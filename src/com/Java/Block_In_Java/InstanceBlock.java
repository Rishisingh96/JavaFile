package com.Java.Block_In_Java;

class Test{
    Test(){
        System.out.println("O-args Constructor");
    }
    {
        System.out.println("Instance Block....");
    }
}
public class InstanceBlock {
    public static void main(String[] args) {
        Test t = new Test();

        new Test();
    }

}
