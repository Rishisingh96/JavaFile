package com.Java.Exception_Handling.Universal;

//class InvalidAegException extends Exception {  //Throwable
class InvalidAegException extends Throwable {  //Throwable
    public void aboveAge(){
            System.out.println("Invalid Input..........");
    }
    public void showMsg(){
        System.out.println("You are under 18.............");
    }
    public void show(){
        System.out.println("Not allowed to vote...........");
        System.out.println("Try ofter 18 ");
    }
}
