package com.Java.Universal.Test;

public class Q_2 {
    public static void main(String[] args) throws InterruptedException {
        for(int i =3; i>=1; i--){
            for(int j =1; j<=i; j++){
                Thread.sleep(2000);
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
