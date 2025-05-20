package com.Java.MultiThreding.Deepak_sir;
class Table1 {
    synchronized static void printTable(int x) // Here, static method is synchronized.
    {
        for(int i = 1; i <= 3; i++)
        {
            System.out.println(x * i);
            try
            {
                Thread.sleep(400);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            } }
    }
}
class Thread11 extends Thread {

    public void run()
    {
        Table1.printTable(2); // Calling synchronized static method using class name with passing argument 2.
    }
}
class Thread22 extends Thread {
    public void run()
    {
        Table1.printTable(10); // Calling synchronized static method using class name with passing argument 10.
    }
}

public class StaticSynchronize {
    public static void main(String[] args) {
        Thread11 t1 = new Thread11();
        Thread22 t2 = new Thread22();
        t1.start();
        t2.start();

    }
}
