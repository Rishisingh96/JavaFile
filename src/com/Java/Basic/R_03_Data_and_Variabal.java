package com.Java.Basic;
import java.util.Scanner;
public class R_03_Data_and_Variabal{

    //final class R_03_Data_and_Variabal{
        public static void main(String[] arg){
            //int p, i,n,SI;
            System.out.println("Enter your number :\nprincpal(p) \n rate(I) \ntime(N)\n");
            Scanner a = new Scanner(System.in);
            int p = a.nextInt();
            int i = a.nextInt();
            int n = a.nextInt();
            int  SI = (p*i*n)/100;
            System.out.println("SI");
        }
    }
