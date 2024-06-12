package com.Java.MultiThreding;


//using Extending the Thread class
class Thread3 extends Thread {
    public void run(){
        int i=0;
        int count = 0;
        while(i<500){
            System.out.println(STR."My Coodking Thread is Running.\{count}");
            System.out.println(" I am happy!");
            i  = i+1;
            count++;
        }
    }
}
class Thread4 extends Thread {
    int i=0;
    public void run(){
        while(i<500){
            System.out.println("Thread 2 is chatting with her gf");
            System.out.println("I am sad!");
            i = i+1;
        }
    }
}
public class R_70_multiThreading {
    public static void main(String args[]){
        Thread3 t1 = new Thread3();
        Thread4 t2 = new Thread4();
        t1.start();
        t2.start();
    }
}
