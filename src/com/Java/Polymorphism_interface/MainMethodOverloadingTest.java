package com.Java.Polymorphism_interface;

public class MainMethodOverloadingTest
{
    public static void main(String[] args)
    {
        System.out.println("main(String[] args)");
        main();
    }
    public static void main()
    {
        System.out.println("main without args");
    }
    public static void main(String args)
    {
        System.out.println("main with string args");
    }
}

