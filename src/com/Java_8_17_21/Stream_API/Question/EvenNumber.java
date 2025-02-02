package com.Java_8_17_21.Stream_API.Question;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> even = Arrays.asList(1,4,8,5,10,11,22,33);
        List<Integer> even2 = new ArrayList<>(Arrays.asList(1,4,8,5,10,11,22,33));
        Stream<String> even3 = Stream.of("Rishi", "Rohan","Akansha","Sohan");
        Stream<Integer> even4 = Stream.of(3,5,6,1,12,54,22,33);
        //Filter out
        //1 Way
//        even.stream()
//                .filter(n->(n%2==0))
//                .forEach(System.out::println);

        //2nd Way
//                List<Integer> evenn = even.stream()
//                .filter(n->(n%2==0))
//                .collect(Collectors.toList());
//        System.out.println(evenn);

       // even.stream().forEach(n -> System.out.println((n%2==0) ? "Even":"Odd"));
        //2nd Way
      /*  even.forEach(n ->{
            if(n%2==0){
                System.out.println(n);
            }
        });

        even4.forEach(n ->{
            if(n%2==0){
                System.out.println(n);
            }
        });*/


        //3rd way
     /*   for(Integer evenN : even){
           if(evenN%2==0){
               System.out.println(evenN);
           }
        }*/

        //4rth way using Iterator
       /* Iterator<Integer> iterator = even.iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if(n%2==0){
                System.out.println(n);
            }
        }*/

        //way 5 using removeIf()
        even2.removeIf(n->n%2==0);  // remove even number
        even2.forEach(System.out::println);
        //Find the sum

        }
}
