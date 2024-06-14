package com.Java_8_17_21.Stream_API;
import java.util.Arrays;
public class RemoveDuplicateValuefromArray {
    public static void main(String[] args) {
                Integer[] array = {5, 10, 3, 7, 2, 10, 5};
                Integer[] distinct = Arrays.stream(array)
                        .distinct()
                        .toArray(Integer[]::new);
                System.out.println("Distinct elements: " + Arrays.toString(distinct));
    }
}
//Distinct elements: [5, 10, 3, 7, 2]