package com.Design_Patterns.Singleto_Design_Pattern;

public class Example {
    public static void main(String[] args) {
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode() + " " );
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode() + " " );
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode() + " " );
        Samosa samosa3 = Samosa.getSamosa();
        System.out.println(samosa3.hashCode() + " " );

        //For Jalebi
        System.out.println("For Jalebi " + Jalebi.getJalebi().hashCode() + " " );
        System.out.println("For Jalebi " + Jalebi.getJalebi().hashCode() + " " );
    }
}
