package com.Java_8_17_21.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //Stream API - collection process


        //1-blank stream
        Stream<Object> emptystream = Stream.empty();
        emptystream.forEach(e->{
            System.out.println(e);
        });
        //2- array, object, collection
        String names[] = {"Rishi","Durgesh","Rohan","Akash","Mohit"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.print(e+" ,");
        });
        //3
        Stream<Object> streamBuilder = Stream.builder().build();

        //2
        IntStream stream2 = Arrays.stream(new int[]{54, 2, 3, 223, 75, 33});
        stream2.forEach(e->{
            System.out.println(e);
        });

        //5 . List , Set       most important we can call directly
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(42);
        list2.add(32);
        list2.add(52);
        list2.add(22);
        list2.add(72);

        Stream<Integer> stream3 = list2.stream();  // object hai list2
        stream3.forEach(e->{
            System.out.println(e);
        });
    }
}
