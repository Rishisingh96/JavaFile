package com.Java.MultiThreding.Deepak_sir;

 class A {
    int i;
    synchronized void deliver(int i)
    {
        this.i = i;
        System.out.println("Data Delivered: " +i);
    }
    synchronized int receive()
    {
        System.out.println("Data Received: " + i);
        return i;
    }
}
class T1 extends Thread
{
    A obj;
    T1(A obj)
    {
        this.obj = obj;
    }
    public void run()
    {
        for(int j = 1; j <= 5; j++){
            obj.deliver(j);
        }
    }
}
class T2 extends Thread
{
    A obj;
    T2(A obj)
    {
        this.obj = obj;
    }
    public void run()
    {
        for(int k = 0; k <= 5; k++){
            obj.receive();
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        A obj = new A();
        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);
        t1.start();
        t2.start();
    }
}
