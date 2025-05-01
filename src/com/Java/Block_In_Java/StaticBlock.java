package com.Java.Block_In_Java;

public class StaticBlock{
    static {
        System.out.println("Static block");
    }

    public StaticBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        StaticBlock obj = new StaticBlock();
    }
}
