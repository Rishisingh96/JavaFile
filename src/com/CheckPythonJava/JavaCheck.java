package com.CheckPythonJava;

public class JavaCheck {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for(long i=0; i <= 100000000; i++){
            sum += i;
        }
        System.out.println("Sum of 1 to 100000000: " + sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Java : Execution Time in Millisecond "+(endTime-startTime)+"ms");
    }
}
