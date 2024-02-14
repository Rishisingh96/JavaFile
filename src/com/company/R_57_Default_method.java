package com.company;
interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void cannecteToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void picCall(){
        System.out.println("Connecting.......");
    }
}
    class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
}

public class R_57_Default_method {
   public static void main(String args[]){
//        System.out.println("Hellow word...");
    MySmartPhone ms = new MySmartPhone();
    ms.record4kVideo();
    String[] ar = ms.getNetworks();
    for(String item:ar){
        System.out.println(item);
       // ms.greet();     //greet()' has private access in 'com.company.MyCamera'
        }
    }
}
