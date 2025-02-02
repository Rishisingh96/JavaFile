package com.Java.MultiThreding.Deepak_sir;

class BookThreadSeat3 {
    int total_seats = 20;
    synchronized void bookSeat(int seats){
        if(total_seats>=seats){
            System.out.println(seats + " seats booked successfully..");
            total_seats = total_seats - seats;
            System.out.println(seats + " Seats Left....");
        }
        else {
            System.out.println("Sorry seats cannot be booked.....!!");
            System.out.println("Seats Left : "+ total_seats);
        }
    }
}
class MyThread1 extends Thread {
    BookThreadSeat3 b;
    int seats ;

    public MyThread1(BookThreadSeat3 b, int seats) {
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}
class MyThread2 extends Thread {
    BookThreadSeat3 b;
    int seats ;

    public MyThread2(BookThreadSeat3 b, int seats) {
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookSeat(seats);
    }
}
public class MovieBookApp_SS_20 extends Thread{

    public static void main(String[] args) {
       BookThreadSeat3 bs = new BookThreadSeat3();

       MyThread1 thread1 = new MyThread1(bs,7);
       thread1.start();

       MyThread2 thread2 = new MyThread2(bs,6);
       thread2.start();

       //-------------------

        MyThread1 t1 = new MyThread1(bs,5);
        t1.start();

        MyThread2 t2 = new MyThread2(bs,9);
        t2.start();

    }
}
