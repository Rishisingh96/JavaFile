package com.Java.Universal.Week3;
/*4. Create a class OneBHK with instance variable roomArea , hallArea and
price. a) Create default and parameterised constructor
b) method show() - to print OneBHK area information.
Create another class TwoBHK which has all the properties and behaviour of
OneBHK and a new instance variable room2Area
*/
class OneBHK{
    int roomArea;
    int hallArea;
    int Price;

    public OneBHK(int roomArea,int hallArea,int Price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.Price = Price;
    }

    public OneBHK() {}
    public void show(){
        System.out.println("RoomAre ="+roomArea+" "+"HallArea = "+hallArea+" "+"Price = "+Price+" ");
    }
}
class TwoBHK extends OneBHK{
    int room2Area;
    public TwoBHK(int roomArea,int hallArea,int Price,int room2Area){
        super(roomArea, hallArea, Price);  // this is simpal add all
       /* this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.Price = Price;*/
        this.room2Area= room2Area;
    }
    public void show(){
        System.out.println("\nWhen Room 2 add ");
        super.show();
       // System.out.print("RoomAre ="+roomArea+" "+"HallArea = "+hallArea+" "+"Price"+Price+" ");
        System.out.print("Room 2 Area = " +room2Area+" ");
    }
}
public class R_4_OneBHK {
    public static void main(String[] args) {
        OneBHK one = new OneBHK(15,15,2000000);
        TwoBHK two = new TwoBHK(12,12,7000000,20);
        one.show();
        two.show();
    }
}
