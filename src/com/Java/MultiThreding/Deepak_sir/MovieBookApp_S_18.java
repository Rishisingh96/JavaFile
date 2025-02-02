package com.Java.MultiThreding.Deepak_sir;

class BookThreadSeat1 {
    int total_seats = 10;
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
public class MovieBookApp_S_18 extends  Thread{
    static BookThreadSeat1 b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookThreadSeat1();
        MovieBookApp_S_18 rishi  = new MovieBookApp_S_18();
        rishi.seats = 7;
        rishi.start();

        MovieBookApp_S_18 rishi2 = new MovieBookApp_S_18();
        rishi2.seats = 6;
        rishi2.start();
    }
}
