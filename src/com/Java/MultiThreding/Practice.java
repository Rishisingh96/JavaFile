package com.Java.MultiThreding;
//Using Thread class
class MyThread211 implements Runnable{
    public void run(){

//       for(int i=1; i<=30; i++){
//           System.out.println("Thread 1 is running...."+i);
//       }
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
class MyThread212 implements Runnable{
    int i=0;
    public void run(){

//        for (int i=1; i<=30; i++){
//            System.out.println("Thread 2 is running...."+i);
//
//        }(
        while(i<500){
            System.out.println("Thread 2 is chatting with her gf");
            System.out.println("I am sad!");
            i = i+1;
        }
    }
}
public class Practice {
    public static void main(String[] args){
        MyThread211 thread1 = new MyThread211();
        Thread t1 = new Thread(thread1);
        MyThread212 thread2 = new MyThread212();
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}
