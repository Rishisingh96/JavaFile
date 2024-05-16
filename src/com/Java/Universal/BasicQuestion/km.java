package com.Java.Universal.BasicQuestion;//km to meter
//meter to km

class km {
    public static void main(String args[]) {
        // Convert kilometers to meters
        float km = 7.0f; 
        float m = km * 1000.0f; // Conversion: 1 km = 1000 m
        System.out.println("Your meter is: " + m);

        // Convert meters to kilometers
        float m1 = 2000.0f; 
        float km1 = m1 / 1000.0f; // Conversion: 1 m = 0.001 km
        System.out.println("Your kilometer is: " + km1);
    }
}