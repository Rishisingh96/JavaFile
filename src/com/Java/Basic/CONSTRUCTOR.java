package com.Java.Basic;

public class CONSTRUCTOR {

//    Copying values without constructor
    int id;
    String name;
    CONSTRUCTOR(int i,String n){
        id = i;
        name = n;
       }
       CONSTRUCTOR(){}
    void Display(){
        System.out.println(id +" "+ name);
    }
    //There are two types of Constructor

    // 1. No - argument or default constructor

    /*CONSTRUCTOR(){
        System.out.println("Default constructor");
    }*/


    // 2. Parameterized constructor
/*
    //Data Member
    reverse_of_number str;
    int a;
    //Parameterize Constructor
    CONSTRUCTOR(reverse_of_number s){
        str = s;
    }
    CONSTRUCTOR(int intger){
        a = intger;
    }
    public void show(){
        System.out.println(str);
    }
    public void show1(){
        System.out.println(a);
    }
*/
    //Java Copy Constructor
    // There is no copy constructor in Java. However , we can copy the values from one object to another like copy constructor in C++.
/*

    int id;
    reverse_of_number name;
    //Constructor to initialize integer and reverse_of_number
    CONSTRUCTOR(int i,reverse_of_number n){
        id = i;
        name = n;
    }


    //constructor to initialize another obj.
    CONSTRUCTOR(CONSTRUCTOR s){
        id = s.id;
        name = s.name;
    }
    void Display(){
        System.out.println(id + " " + name);
    }
*/

    // Constructor Overloading
    /*int id;
    reverse_of_number  name;
    int age;
    CONSTRUCTOR(int i,reverse_of_number n){
        id = i;
        name = n;

    }
    //Creating three ags constructor
    CONSTRUCTOR(int i, reverse_of_number n, int a){
        id = i;
        name = n;
        age = a;
    }
    void Display(){
        System.out.println(id +" "+ name +" "+age);
    }*/
    public static void main(String[] args) {
       // CONSTRUCTOR C=new CONSTRUCTOR();

        /*CONSTRUCTOR obj=new CONSTRUCTOR(" Parameterize Constructor ");
        CONSTRUCTOR o =new CONSTRUCTOR(10);
        obj.show();
        o.show1();*/

        // copy con
        /*CONSTRUCTOR s1 = new CONSTRUCTOR(111,"Rishi singh");
        CONSTRUCTOR s2 = new CONSTRUCTOR(s1);
        s1.Display();
        s2.Display();
        */
        // Constructor Overloading
/*
        CONSTRUCTOR s1 = new CONSTRUCTOR(111,"Constructor Overloading");
        CONSTRUCTOR s2 = new CONSTRUCTOR(233, "By Rishi", 25);
        s1.Display();
        s2.Display();
*/

        CONSTRUCTOR s1 = new CONSTRUCTOR(111,"Constructor ");
        CONSTRUCTOR s2 = new CONSTRUCTOR();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.Display();
        s2.Display();

    }
}
