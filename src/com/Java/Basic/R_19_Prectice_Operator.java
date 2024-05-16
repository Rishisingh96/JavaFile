package com.Java.Basic;

import java.util.Scanner;

public class R_19_Prectice_Operator {
    public static void main(String[] args) {
        //find Maximum value using Java method - user defined method

        //=============================================
      //	Pre-increment Operator (Prefix) in Java
     //   int x = 2;
      //  int y = ++x;
        //System.out.println("x = " + x + ", " +" y = "+ y);
      //  System.out.println( "y = "+ y);
       // System.out.println("x = "+ x );

//================================================
    //	Post increment Operator (Postfix) in Java
        /*int x = 2;
        int y = x++;
        System.out.println("x = " +x+ ", " +"y = " +y);
        System.out.println("x = " +x);
        System.out.println("y = " +y);*/

        /*int x = 5;
        x = -5;
        System.out.println(x);
*/
//Program code 4:
       /* int i = 0;
        System.out.println(i); // Output 0
        System.out.println(++i); // Output 1, first increment the value of i and then displays it as 1.

        System.out.println(i); // Output 1, displays the value of i because i is already incremented, i.e. 1 at right-hand side.
        System.out.println(i++); // Output 1, first displays the value of i as 1 and then increment it.
        System.out.println(i); // Output 2, displays the incremented value of i, i.e. 2.
*/
    }

    public static class Getter_Setters {
        // Without getter and Setter we can access anywhere
        // Not a secure without getter and setter
        // Using getter and setter we can put exception

        /*   // Not a secure without getter and setter We can do access and change directly Access_Getter.java access directly
        reverse_of_number name;
        int rollNumber;
        public void displey(){
            System.out.println(this.name);
            System.out.println(this.rollNumber);
        }*/
    /*   private reverse_of_number name;
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
}
