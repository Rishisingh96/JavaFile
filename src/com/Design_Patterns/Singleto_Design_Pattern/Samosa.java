package com.Design_Patterns.Singleto_Design_Pattern;

public class Samosa {
    private static Samosa samosa;

    //Constructor
    private Samosa() {
    }
    //Lazy way to create a singleton class , When we call this method then it will create object of this class
    public static Samosa getSamosa() {
       //object of this class , When we call this method then it will create object of this class
       /* if (samosa == null){
            samosa= new Samosa();
        }*/
        //Synchronized Way to create a singleton class , When we call this method then it will
        if (samosa == null){
            synchronized (Samosa.class) { //lock the class , so that only one thread can access this class
              if (samosa == null){
                  samosa = new Samosa(); //create object of this class
              }
            }
        }
        return samosa;
    }
}
