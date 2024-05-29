package com.Collection;
import java.util.*;
public class CollectionList {
    public static void main(String[] args) {
        System.out.println("Welcome to code Java collection framework");
        /*
        Creating collection
        1> Type Safe - same type of elements(objects) are added to collection
        2>Un Type Safe - different types of elements can be added to collection
         */
        System.out.println("--------------TYPE SAFE ARRAYLIST-------------");
        //1. Type safe collection
        ArrayList<String> names = new ArrayList<String>();
        names.add("Rishi singh");
        names.add("Durgesh sir");
//        names.add(233); error because he is type safe
        names.add("Sitara");
        names.add("Roshni");
        names.add("Vandna");
        names.add("Vandna");

        System.out.println(names);  //[Rishi singh, Durgesh sir, Sitara, Roshni, Vandna, Vandna]

        //get method
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        //remove
        names.remove("Vandna");
        System.out.println(names);

        //size
        System.out.println("SIZE = " + names.size());

        // check item is there or not
        // Type ka equal method call karta hai cheking karne ke lie
        // Student
        System.out.println(names.contains("Durgesh kumar"));
        System.out.println(names.contains("Durgesh sir"));

        //check for empty
       System.out.println(names.isEmpty());

        //setting value..
         //names.set(2,"Harry");  // remove name and replace
        names.add(2,"Harry");
        System.out.println(names);

        //remove all elements
        //names.clear();


        System.out.println("\n--------------UN TYPE SAFE-------------");  // No matter datatype

        //un type safe
        LinkedList list = new LinkedList();
        list.add("Rishi");
        list.add(101);
        list.add(334.34);
        list.add(true);
        System.out.println(list);


        System.out.println("\n--------------VECTOR-------------");
        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("VECTOR "+ vector);

    }
}
