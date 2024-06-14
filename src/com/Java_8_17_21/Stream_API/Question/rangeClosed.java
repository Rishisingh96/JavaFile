package com.Java_8_17_21.Stream_API.Question;

import java.util.stream.IntStream;

public class rangeClosed {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::print);
    }
}
