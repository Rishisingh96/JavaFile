package com.Java_8_17_21.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate_Terminal_Operations {
    public static void main(String[] args) {
        // Example usage of the Stream API in Java
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use stream to filter even numbers and print them
        /*numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); // Print each even number*/

        // Use stream to calculate the sum of all numbers
     /*   int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum); // Print the sum of all numbers
*/
// INTERMEDIATE OPERATION EXAMPLE:
// - These are lazy and return a new Stream.
// - They are only executed when a terminal operation is applied.
        Stream<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)  // Intermediate: Filters even numbers
                .map(n -> n * 2);         // Intermediate: Doubles the filtered numbers

// TERMINAL OPERATION EXAMPLE:
// - This triggers the entire pipeline above.
// - Actually performs the computation and prints results.
        evenNumbers.forEach(System.out::println); // Terminal: Executes the stream

// Another Terminal Operation Example:
        Long count = numbers.stream()
                .filter(n -> n % 2 == 0) // Intermediate
                .count();                // Terminal: Returns count of even numbers
        System.out.println("Count: " + count);


    }

}
