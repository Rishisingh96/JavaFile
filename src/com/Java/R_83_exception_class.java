package com.Java;
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString ";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125 ";
    }
    @Override
    public String getMessage(){
        return "Make sure that value of age entered is correct";
    }
}
public class R_83_exception_class {
    public static void main(String[] args) {
        MaxAgeException x = new MaxAgeException();
        int a;
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter the number : ");
        System.out.println("Enter the age");
        x.getMessage();
        a=sc.nextInt();
        if(a<9){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
               System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
