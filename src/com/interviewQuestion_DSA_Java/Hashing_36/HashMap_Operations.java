package com.interviewQuestion_DSA_Java.Hashing_36;

import java.util.HashMap;

public class HashMap_Operations {
    public static void main(String[] args) {
        //----------------------------------------------------------------------------------------------
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //----------------------------------------------------------------------------------------------
        //Insert
        hm.put("India", 146);
        hm.put("China", 141);
        hm.put("US", 60);
        hm.put("US", 34);

        System.out.println(hm);

        //----------------------------------------------------------------------------------------------
        //Get - O(1)
        int papulation = hm.get("India");
        System.out.println(papulation);

        System.out.println(hm.get("US"));
        System.out.println(hm.get("Indonasia"));

        //----------------------------------------------------------------------------------------------
        //ContainsKey -o(1)
        System.out.println(hm.containsKey("India"));  //true
        System.out.println(hm.containsKey("Indonasia")); //false

        //----------------------------------------------------------------------------------------------
        //Remove
        System.out.println(hm.remove("US"));
//        System.out.println(hm);

        //----------------------------------------------------------------------------------------------
        //Size
        System.out.println(hm.size()); //3

        //----------------------------------------------------------------------------------------------
        //IsEmpty
        hm.clear();
        System.out.println(hm.isEmpty()); //false
    }


}
