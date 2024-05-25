package com.Java_8_17_21.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        //Q)Create a List and Filter all even numbers from List

        List<Integer> list1 = List.of(2,6,50,31,62,55,3,66);
      //  list1.add(45);  //UnsupportedOperationException , we can not add number is list
       // System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(42);
        list2.add(32);
        list2.add(52);
        list2.add(22);
        list2.add(72);

        List<Integer> list3 = Arrays.asList(23,45,65,323,54,64);

        //List1
        //without stream  // Old way , He is boiler plate code long code so we use Stream Api
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1){
            if(i%2 == 0){
                listEven.add(i);
            }
        }
//        System.out.println(list1);
//        System.out.println(listEven);


        //using stream
//        Stream<Integer> stream = list1.stream();  //alt + shift + Q = auto complete code
//        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(newList);

        //only one line
        List<Integer> newList2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList2);

        List<Integer> newList3 = list1.stream().filter(i -> i > 50).collect(Collectors.toList());
        System.out.println(newList3);


    }
}
