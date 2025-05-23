package com.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitialization {

    public static void main(String[] args) {

        // 1️⃣ Using Arrays.asList()
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        System.out.println("1. Using Arrays.asList():");
        for (String lang : list1) {
            System.out.println("- " + lang);
        }

        // ------------------------------------------------------

        // 2️⃣ Using normal way (adding one by one)
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("HTML");
        list2.add("CSS");
        list2.add("JavaScript");
        System.out.println("\n2. Using normal way (add elements one by one):");
        for (String tech : list2) {
            System.out.println("- " + tech);
        }

        // ------------------------------------------------------

        // 3️⃣ Using Anonymous Inner Class
        ArrayList<String> list3 = new ArrayList<String>() {{
            add("Spring");
            add("Hibernate");
            add("Microservices");
        }};
        System.out.println("\n3. Using Anonymous Inner Class:");
        for (String framework : list3) {
            System.out.println("- " + framework);
        }

        // ------------------------------------------------------

        // BONUS: Printing all lists together
        System.out.println("\n✅ Summary:");
        System.out.println("Languages: " + list1);
        System.out.println("Web Tech: " + list2);
        System.out.println("Frameworks: " + list3);
    }
}

