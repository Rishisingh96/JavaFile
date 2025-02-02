package com.Java.MultiThreding.Deepak_sir;
//1.Join(): - if a thread wants to wati fo  another thread to complete its tsk than we should use join() method.
//2.real work example like Licence (t1--medical  ,t2---test Drive  , t3--office )
//3.Method: - a public final void join() throw  ex
//b.public final synchrozised void join(long ms)
//c.public final synchronized void join(long ms,int ns)

class Medical extends Thread{
    public void run(){
        try {
            System.out.println("Medical starts......");
            Thread.sleep(1000);
            System.out.println("Medical Completed.........");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class TestDriver extends Thread{
    public void run(){
        try {
            System.out.println("Test Driver starts...........");
            Thread.sleep(1000);
            System.out.println("Test Driver Completed........");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class OfficeSign extends Thread{
    public void run(){
        System.out.println("Office take the file....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Office works completed..........");
    }
}
public class JoinMethod extends Thread{
    static Thread mainThread;
        public void run() {
            try {
                mainThread.join();  // first run main thread ofter run child class
                for (int i = 1; i <= 5; i++) {
                    System.out.println("child thread : " + i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    public static void main(String[] args) throws InterruptedException {

            //for check main thread
     //   mainThread = Thread.currentThread();
     //   JoinMethod t = new JoinMethod();
//        t.start();


        Medical medical = new Medical();
        medical.start();

        medical.join();

        TestDriver testDriver = new TestDriver();
        testDriver.start();

        testDriver.join();

        OfficeSign officeSign = new OfficeSign();
        officeSign.start();

/*  Output -
Medical starts......
Medical Completed.........
Test Driver starts...........
Test Driver Completed........
Office take the file....
Office works completed..........*/

//        t.join();  // first run child thread ofter run main thread
       /* try {
            for (int i=1; i<=5;i++){
                System.out.println("main Thread : "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }*/
    }
}
