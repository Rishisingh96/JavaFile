package com.Java.MultiThreding.Deepak_sir;
//1. Yield():- which stops the current executing thread and give a chance to other threads for execution
// Example real word where we use Yield method
//3.working - Java 5 : internally it used sleep()
//java 6 : Thread provides the hint to the thread scheduler , then it depend on thread schedular to accept on ignore the hint
//4. Method - public static native void yield();
//5.Output may (vary) different
public class YieldMethod extends Thread{
    public void run(){

        //Thread.yield(); // if I want to run main ofter run run() method
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
    public static void main(String[] args) {
        YieldMethod t = new YieldMethod();
        t.start();
        Thread.yield();
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);

        }
    }
}
