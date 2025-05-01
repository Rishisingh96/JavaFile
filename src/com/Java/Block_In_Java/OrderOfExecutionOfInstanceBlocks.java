package com.Java.Block_In_Java;
class MultipleIIB{
    MultipleIIB(){
        System.out.println("O-arg constructor");
    }
    MultipleIIB(int x){
        System.out.println("1-arg constructor");
    }
    {
        System.out.println("First IIB");
    }
    {
        System.out.println("Second IIB");
    }
}
public class OrderOfExecutionOfInstanceBlocks {
    public static void main(String[] args) {
        new MultipleIIB();
        new MultipleIIB(6);

    }
}
