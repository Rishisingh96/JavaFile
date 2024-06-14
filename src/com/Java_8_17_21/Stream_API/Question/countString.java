package com.Java_8_17_21.Stream_API.Question;

import java.util.stream.Stream;

public class countString {
    public static void main(String[] args) {
        Stream.of("Cognizant", "Infosys", "Amdocs")
                .map(s -> s.length())
                .reduce(0, Integer::sum);

    }
}
