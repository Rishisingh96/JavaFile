package com.Collection;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;
public class Getter_Setters {
    // Without getter and Setter we can access anywhere
    // Not a secure without getter and setter
    // Using getter and setter we can put exception

    /*   // Not a secure without getter and setter We can do access and change directly Access_Getter.java access directly
    String name;
    int rollNumber;
    public void displey(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }*/
/*   private String name;
    private int rollNumber;
    public void displey(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }*/

    // Use getter and S
    private String name ;
    private int rollNumber;

    Scanner n = new Scanner(System.in);
    // Getter
    public String getName(){
        return this.name;
    }
    public void setName(){
        System.out.println("Enter your number");
        name = n.nextLine();
// Q you write a logic to print invalid input when we enter a number
       /* if(number == name){
            throw new IllegalArgumentException("Invalid Input");
        }*/
        //this.name = name;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;

    }
    public void setRollNumber(int rollNumber) {
        if(rollNumber <= 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        this.rollNumber = rollNumber;
    }
    public void displey(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
    }
}
