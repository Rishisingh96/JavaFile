package com.Collection.set;
import java.util.*;
import java.util.Set;

public class Store_Element_in_Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(42);
        set.add(11);
        set.add(80);
        set.add(30);
        set.add(50);

//        set.toArray();
        int big = 0 ;
        for(Integer element : set){
            if(element>big){
                big = element;
            }
        }
        System.out.println(big);
    }
}
