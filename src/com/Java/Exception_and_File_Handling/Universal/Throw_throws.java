package com.Java.Exception_and_File_Handling.Universal;

//class InvalidAegException extends Exception {  //Throwable
//        public void showMsg(){
//            System.out.println("You are under 18.............");
//        }
//        public void show(){
//            System.out.println("Not allowed to vote...........");
//            System.out.println("Try ofter 18 ");
//        }
//}
public class Throw_throws {   //User define Exception
    public static void main(String[] args) {
        try {
            checkAge(4);
        }catch (InvalidAegException e){
            e.aboveAge();
            e.showMsg();
            e.show();
        }
    }

     static void checkAge(int age) throws InvalidAegException {
        if(age>=18  && age<=150)
            System.out.println("You are eligible for vote. ");
        else if (age>=150) {
            System.out.println("Your age is above 150. Please Enter right age .");
        } else
          throw new InvalidAegException();

    }
}
