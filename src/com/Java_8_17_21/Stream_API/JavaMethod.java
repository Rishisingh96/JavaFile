package com.Java_8_17_21.Stream_API;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaMethod {
    public static void main(String[] args) {
        //filter(Predicate)
        // check true and false check boolean value and return
            //boolean value function
       // e->{ return true and fales }
       // e->{ e>10}
        //map(function) // this is return a value
        /*
        * each element operation
        *
        * */

        //filter
        List<String> rishi = List.of("Aman", "Ankit", "Abikesh", "Rishi");
//        rishi.stream().filter(e->e.startsWith("A")).forEach(i->{  // Direct method forEach in one line
//            System.out.println(i);
//        });
        Set<String> object = rishi.stream().filter(e -> e.startsWith("A")).collect(Collectors.toSet());
        System.out.println(object);


        //map
        List<Integer> numbers = List.of(34, 4, 2, 5, 7, 4);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

        newNumbers.forEach(
                e->{
                    System.out.println(e);
                }
        );

        object.stream().forEach(System.out::println);

        //sort
        numbers.stream().sorted().forEach(System.out::println);

        //minumum
        //olde tech
//        Optional<Integer> integer = numbers.stream().min((x, y)->x.compareTo(y)).get().describeConstable();
//        System.out.println("minimum"+ integer);

        // Find the minimum value  new tech
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        // Check if a minimum value is present and print it
        min.ifPresent(value -> System.out.println("Minimum = " + value));

        Optional<Integer> mx = numbers.stream().max(Integer::compareTo);

        // Check if a minimum value is present and print it
        mx.ifPresent(value -> System.out.println("Minimum = " + value));

    }
}
