package com.Java.Universal.Week5;

import java.io.*;

public class R6_ObjectInput {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("shopping.dat"))) {
            int totalMoneySpent = 0;
            Item item;

            while (true) {
                try {
                    item = (Item) in.readObject();
                    totalMoneySpent += item.getTotalPrice();
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }

            System.out.println("Total money spent on all shopping items: " + totalMoneySpent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//Total money spent on all shopping items: 2250