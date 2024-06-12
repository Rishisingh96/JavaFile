package com.Java.MultiThreding.Universal;

class Move_Ticket{
    int total_seat = 100;
    synchronized void purchase(int seat_book){
        if(total_seat>=seat_book){
            System.out.println("Ticket Booked successfully.......");
            total_seat = total_seat - seat_book;
            System.out.println(STR."Available seat : \{total_seat}");
        }
        else {

            System.out.println("seat can not book..");
            System.out.println(STR."seat Available = \{total_seat}");
        }
    }
}
public class Ticket_Booking extends Thread {
    static Move_Ticket S;
    int demand;
    public void run(){
        S.purchase(demand);
    }
    public static void main(String[] args) {
        S = new Move_Ticket();
        Ticket_Booking lg = new Ticket_Booking();
        lg.demand = 70;
        lg.start();

        Ticket_Booking tata = new Ticket_Booking();
        tata.demand = 10;
        tata.start();

        Ticket_Booking bata = new Ticket_Booking();
        bata.demand = 70;
        bata.start();
    }
}
