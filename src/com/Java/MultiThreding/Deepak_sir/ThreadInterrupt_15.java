package com.Java.MultiThreding.Deepak_sir;
/*
1. Use - it is used to interrupt an executing thread
2. interrupt() method will only works when their thread is in sleeping or waiting state
(seep(), or wai() )
3. If a thread is not in sleeping or waiting state then calling an interrupt() method will perform normal behavior.
4. When we use a interrupt() method if throws an exception InterruptedException
5. Syntext = public void interrupt() { -- }

*/

public class ThreadInterrupt_15 extends Thread{
    public void run(){
        try {
            for (int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread interrupt");
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        ThreadInterrupt_15 t = new ThreadInterrupt_15();
        t.start();
    }
}
