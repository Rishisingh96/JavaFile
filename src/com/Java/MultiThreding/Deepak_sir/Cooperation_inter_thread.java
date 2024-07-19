package com.Java.MultiThreding.Deepak_sir;

class TotalEarning extends Thread {
    int total = 0;

    public void run() {
        // without using synchronized output show total = 0
        /*for(int i=1; i<=0; i++){
            total = total+100;
        }*/
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notify();
        }
    }
}

public class Cooperation_inter_thread {
    /*can be achieved by following methods of Object class
     * 1. wait()
     * 2.notify()
     * 3.notifyAll()*/

    public static void main(String[] args) throws InterruptedException {
        TotalEarning totalEarning = new TotalEarning();
        totalEarning.start();

        // following code execute before executed run method so we use wait method
        // System.out.println("Total earning : "+ totalEarning.total + "Rs" );
        synchronized (totalEarning) {
            totalEarning.wait();
            System.out.println(STR."Total earning : \{totalEarning.total} Rs");
        }
    }
}
