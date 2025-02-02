package com.Java.MultiThreding.Deepak_sir;
// Synchronized Block Take less time
class BookThreadSeat2 {
    int total_seats = 10;
     void bookSeat(int seats){
         System.out.println("hi :" + Thread.currentThread().getName());
         System.out.println("hi :" + Thread.currentThread().getName());
         synchronized(this){
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
         System.out.println("hi :" + Thread.currentThread().getName());
         System.out.println("hi :" + Thread.currentThread().getName());
    }
}
public class MovieBookApp_SB_19 extends  Thread{
    static BookThreadSeat2 b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookThreadSeat2();
        MovieBookApp_SB_19 rishi  = new MovieBookApp_SB_19();
        rishi.seats = 7;
        rishi.start();

        MovieBookApp_SB_19 rishi2 = new MovieBookApp_SB_19();
        rishi2.seats = 6;
        rishi2.start();
    }
}
