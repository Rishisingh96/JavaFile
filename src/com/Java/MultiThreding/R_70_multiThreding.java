package com.Java.MultiThreding;

class Thread3 extends Thread {
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("My Coodking Thread is Running.");
            System.out.println(" I am happy!");
            i  = i+1;
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
public class R_70_multiThreding{
    public static void main(String args[]){
        Thread3 t1 = new Thread3();
        Thread4 t2 = new Thread4();
        t1.start();
        t2.start();
    }
}
