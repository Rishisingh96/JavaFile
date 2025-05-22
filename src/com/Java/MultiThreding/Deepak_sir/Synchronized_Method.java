package com.Java.MultiThreding.Deepak_sir;
class Table {
    void printTable(int n) // Here, the method is not synchronized.
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(n * i);
            try
            {
                Thread.sleep(400);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }}
}
class Thread1 extends Thread
{
    // Declaration of variable t of class type Table.
    Table1 t;
    // Declare one parameterized constructor and pass variable t as a parameter.
    Thread1(Table1 t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(2);
    }
}
class Thread2 extends Thread
{
    Table1 t;
    Thread2(Table1 t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(10);
    }
}

public class Synchronized_Method {
    public static void main(String[] args) {
        // Create an object of class Table.
        Table1 obj = new Table1();
        // Create an object of Thread1 class and pass obj as an argument to its constructor.
       Thread1 t1 = new Thread1(obj);
        // Create an object of Thread2 class and pass obj as an argument to its constructor.
        Thread2 t2 = new Thread2(obj);
        // Start both threads.
        t1.start();
        t2.start();

    }
}
