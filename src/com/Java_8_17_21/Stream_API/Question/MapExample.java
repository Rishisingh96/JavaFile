package com.Java_8_17_21.Stream_API.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream","Rishi","Salone");
        //convert eatch word integer
        words.stream()
                .map(String::length) // Maps each word to its length (integer)
                .forEach(System.out::println); //use method reference

    }
}
