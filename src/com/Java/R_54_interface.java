package com.Java;
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
    class AvonCycle implements Bicycle,HornBicycle{
         public void blowHorn(){
                System.out.println("Pee pee poo poo");
         }
         @Override
         public void applyBrake(int decrement) {
                System.out.println("Applying Break");
         }

        // @Override
         public void speedUp(int incremetn){
             System.out.println("Applying SpeedUp");
         }

        @Override
        public void blowHornk3g() {
            System.out.println("kabhi khusi kabhi gum pee peep.........");

        }
        @Override
        public void blowHornmhn(){
            System.out.println("Mai hoo na pro po");
        }
}

public class R_54_interface {
    public static void main(String rishi[]){
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);

        // You can create Properties in Interfaces
        System.out.println(cycleHarry.a);

       //  You cannot modify the properties in Interface as they are find
       //  cycleHarry.a =445;   // error
        System.out.println(cycleHarry.a);

         cycleHarry . blowHornk3g();
         cycleHarry.blowHornmhn();

    }
}
