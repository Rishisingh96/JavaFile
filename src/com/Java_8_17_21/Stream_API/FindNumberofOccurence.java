package com.Java_8_17_21.Stream_API;

import java.util.Arrays;
import java.util.List;

public class FindNumberofOccurence {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
        String word = "java";
        long count = strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(w -> w.equals(word))
                .count();
        System.out.println("Occurrences of \"" + word + "\": " + count);

    }
}
