package com.Java_8_17_21.lamdaExpresstion.functionalInterface;
@FunctionalInterface    //he check only one interface alluvial
public interface MyInter {

    public abstract void sayHello();

//    public abstract void How();   //if we use 2 time abstracter than throw error than
    // he is not functional Interface
}

//there are multipart ways to create functional interface
// 1 -> Create separate class and implements this interface
// 2-> anonymous class for implementing interface
// 3-> Lambda Expression
