package com.Java;

public class R_85_finallyBlock {
    public static int greet(){
        try{
            int a = 15;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {       // if we not user finally block than not execute Cleaning up reso..
            System.out.println("Cleaning up resources .......This is the end of this function");
       }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 7;
        int b= 9;
        while (true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b = " +b);
            }
            --b;
        }

        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("yes theis is finally ");
        }
    }
}
