package com.Java.DurgeshSir100DayCode;

public class TyeCatchFinally_Day29 {
    public static void main(String[] args) {
        System.out.println("Program Start");
        try{
            int result = 48/2;
            System.out.println(result);
            System.exit(10);
        }catch (Exception e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("resource cleanup");
        }
        System.out.println("Program Terminated..");

        //Interview Question : kis case mai Finally nahi chalega
        //JVM Exit : System.exit
        //JVM Crashes
        //Infinite Loop or Recursion
    }

}
