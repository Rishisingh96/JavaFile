package com.Java.MultiThreding.Deepak_sir;

class BookThreadSeat{
    int total_seats = 10;
    void bookSeat(int seats){
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
public class MovieBookApp_W_Syn_17 extends  Thread{
    static BookThreadSeat2 b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookThreadSeat2();
        MovieBookApp_W_Syn_17 rishi  = new MovieBookApp_W_Syn_17();
        rishi.seats = 7;
        rishi.start();

        MovieBookApp_W_Syn_17 rishi2 = new MovieBookApp_W_Syn_17();
        rishi2.seats = 6;
        rishi2.start();
    }
}
