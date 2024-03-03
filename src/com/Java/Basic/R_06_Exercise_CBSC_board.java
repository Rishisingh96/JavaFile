package com.Java.Basic;
import java.util.Scanner;
public class R_06_Exercise_CBSC_board{
    public static void main(String[] args){
        Scanner st = new Scanner(System.in);

        System.out.println("Enter your Math marks : ");
        int Math = st.nextInt();
        System.out.println("Enter your Physics marks: ");
        int Physics = st.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int Chemistry = st.nextInt();
        System.out.println("Enter your Hind marks : ");
        int Hindi = st.nextInt();
        System.out.println("Enter your Social Science marks :");
        int sc = st.nextInt();
        float Percentage = ((Math+ Physics + Chemistry + Hindi + sc)/500.0f)*100;
        System.out.println(Percentage);
    }

}
