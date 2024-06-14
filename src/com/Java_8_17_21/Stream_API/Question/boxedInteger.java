package com.Java_8_17_21.Stream_API.Question;

import java.util.stream.Stream;

public class boxedInteger {
    public static void main(String[] args) {
        Stream.of("java", "python", "react")
                .flatMap(s -> s.chars().boxed())
                .forEach(System.out::print);
//10697118971121211161041111101141019799116
//
    }
}
