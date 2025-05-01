package com.Java.Block_In_Java;


public class LocalBlock {
    public void methodwithInnerblock(){
// Outer block starts here with opening braces.
        int x = 20;
        System.out.println(" Outer block");

        { // Inner or local block starts here with next opening braces.
            int y = 30;
            System.out.println("Inner block");
        } // Inner block ends here.
    } // Outer block ends here.

    public static void main(String[] args) {
        LocalBlock localBlock = new LocalBlock();
        localBlock.methodwithInnerblock();
    }
}
