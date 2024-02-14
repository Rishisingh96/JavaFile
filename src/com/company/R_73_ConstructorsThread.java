package com.company;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("I am a Thread");
            i++;
        }
    }
}
public class R_73_ConstructorsThread {
    public static void main(String args[]){
        MyThr t1 = new MyThr("Rishi");
        MyThr t2 = new MyThr("Rishi singh");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is "+t1.getId());
        System.out.println("The id of the thread t is "+t1.getName());
        System.out.println("The id of the thread t is "+t2.getId());
        System.out.println("The id of the thread t is "+t2.getName());
    }
}
