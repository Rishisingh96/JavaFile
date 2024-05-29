package com.Collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Waysofcreatset {
    public static void main(String[] args) {
        //How many ways are there to initialize a Set ?

////        1) Using Anonymous Class
//        Set<String> set = new HashSet<String>()
//        {
//          add("California");
//          add("Rishi");
//          add("Durgesh");
//        };

//        2) Using instance of another Collection
        Set<String> secondw = new HashSet<>(Arrays.asList("Rishi", "Garima", "Durgesh"));
        secondw.forEach(e->{
            System.out.println(e);
        });
        //3) Using Stream of Java 8
        Set<String> set = Stream.of("Rishi", "Garima", "Durgesh").collect(Collectors.toCollection(HashSet::new));
        secondw.forEach(e->{
            System.out.println("\n"+e);
        });

        //4) Using Factory Method of Java 9
        Set<String> set1 = Set.of("Rishi", "Garima", "Durgesh");
        set1.forEach(i->{
            System.out.println(i);
        });
    }
}
