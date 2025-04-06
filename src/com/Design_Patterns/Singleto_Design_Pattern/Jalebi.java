package com.Design_Patterns.Singleto_Design_Pattern;

public class Jalebi {
    //Eager way to create a singleton class , Already created object of this class
    private static Jalebi Jalebi =new Jalebi();

    public static Jalebi getJalebi() {
        return Jalebi;
    }
}
