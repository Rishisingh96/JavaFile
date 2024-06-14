package com.Java_8_17_21.Stream_API.Question;

import java.util.stream.Stream;

public class first {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .flatMap(n -> Stream.of(n, n * 2))
                .forEach(System.out::print);
    }
}
