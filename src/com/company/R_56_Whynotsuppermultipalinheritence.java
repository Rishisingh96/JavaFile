package com.company;
    interface Bicycle1{
        int a = 45;
        void applyBrake(int decrement);
        void speedUp(int increment);
    }
    interface HornBicycle1{
        void blowHornk3g();
        void blowHornmhn();
    }
    class AvonCycle1 implements Bicycle1,HornBicycle1{

        void blowHorn(){
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

        // @Override
        public void blowHornk3g(){
            System.out.println("kabhi khusi kabhi gum pee peep.........");
        }
        //@Override error
        public void blowHornmhn(){
            System.out.println("Mai hoo na pro po");
        }

    }
public class R_56_Whynotsuppermultipalinheritence {
        public static void main(String rishi[]){
            AvonCycle1 cRishi = new AvonCycle1();
            cRishi.applyBrake(1);

            // You can create Properties in Interfaces
            System.out.println(cRishi.a);

            //  You cannot modify the properties in Interface as they are find
            //  cycleHarry.a =445;   // error
            System.out.println(cRishi.a);

             cRishi.blowHornmhn();
             cRishi.blowHornk3g();


        }
    }

