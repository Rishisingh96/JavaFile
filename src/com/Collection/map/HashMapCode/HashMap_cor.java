package com.Collection.map.HashMapCode;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_cor {
    public static void main(String[] args) {
        HashMap<Integer, String> hs1 = new HashMap<>();
        // key depart_Name
        hs1.put(10,"TCS");
        hs1.put(20,"Computer Lab");
        hs1.put(30,"Electric lab");
        hs1.put(40,"Maniacal E");

        System.out.println("Enter your Department name  : ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        String key = hs1.get(v);

        HashMap<String, String> hs2 = new HashMap<>();
        //  depart_Name working Employee
        hs2.put("TCS","Rishi");
        hs2.put("Computer Lab","Mohit");
        hs2.put("Electric lab","Rohan");
        hs2.put("Maniacal E","Vijay");

        String value = "Department name is "+key+ " and Working people "+hs2.get(key);
        System.out.println(value);
    }
}
