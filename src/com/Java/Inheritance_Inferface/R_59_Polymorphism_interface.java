package com.Java.Inheritance_Inferface;

interface MyCamera2{
        void takeSnap();
        void recordVideo();
private void greet(){
        System.out.println("Good Morning...");
        }
default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k........");
        }
        }
interface MyWifi2{
    String[] getNetworks();
    void cannecteToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void picCall(){
        System.out.println("Connecting.......");
    }
}
class MySmartPhone2 extends MyCellPhone implements MyWifi2,MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap..");
    }
    public void recordVideo(){
        System.out.println("Taking snap........");
    }
    //    public void record4kVideo(){                  // if we take method than first time print this method
//        System.out.println("Taking snap and recording in 4k.");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks.");
        String[] networkList = {"Harry","Prashanth","Anjali5G"};
        return networkList;
    }

    @Override
    public void cannecteToNetwork(String network) {
        System.out.println("Connecting to" +network);
    }

    public void sampleMeth1(){
        System.out.println("My name is Rishi singh");
    }
}
public class R_59_Polymorphism_interface {
    public static void main(String rishi[]){
        // This is a smartphone but , use it as a camera
        MyCamera2 cam1 = new MySmartPhone2();
//        cam1.getClass();  ---> Not allowed
//        cam1.sampleMeth();  ---> Not allowed

            cam1.record4kVideo();
            MySmartPhone2 s= new MySmartPhone2();
           // s.sampleMeht1();
            s.recordVideo();
            s.getNetworks();
            s.callNumber(454);
    }
}
