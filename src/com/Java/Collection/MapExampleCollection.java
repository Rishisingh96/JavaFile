package com.Java.Collection;
import java.util.HashMap;
public class MapExampleCollection {
    public static void main(String args[]){
        System.out.println("\n+++++++++++Map++++++++++++++++");

        System.out.println("++++++++++++++++HASHMAP++++++++++++++=");
        HashMap<String,Integer> courses = new HashMap<>();
        //adding elements
        courses.put("Core Java",4000);
        courses.put("Basic Python",3500);
        courses.put("Spring",8000);
        courses.put("Android",4000); //Remove because duplicate
        courses.put("Android",6000);
        courses.put("PHP",3000);
        System.out.println(courses);
        System.out.println("\n++++++++++++++++++++++++");
        courses.forEach((e1,e2)->{
            System.out.println(e1 +"=>" +e2);
        });

        System.out.println("\n==================");
        courses.forEach((key,value)->{
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
            System.out.println();
        });
        System.out.println("\n++++++++++++++++++++++++++++++++++++++");
        //entry set
        //key set
        System.out.println(courses.get("Core Java"));

        System.out.println("\n\n++++++++++++LinkedHasMap+++++++++++++++");

        System.out.println("\n++++++++++++SortedMap+++++++++++++++");

        System.out.println("\n+++++++++++++TreeMap++++++++++++++");

    }
}
