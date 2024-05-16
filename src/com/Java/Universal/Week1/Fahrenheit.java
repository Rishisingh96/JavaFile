package com.Java.Universal.Week1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float celsius, fahrenheit;
        // Prompt user to enter temperature in Celsius
        System.out.println("Enter temperature in Celsius: ");
         celsius = in.nextFloat();


        // Convert Celsius to Fahrenheit
        fahrenheit = (float) ((9.0 / 5.0) * celsius + 32);

        // Display the converted temperature
        System.out.println("Temperature in Fahrenheit: "+ fahrenheit);
    }

}
