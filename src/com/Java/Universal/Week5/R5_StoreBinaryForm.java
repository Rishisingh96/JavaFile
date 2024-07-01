package com.Java.Universal.Week5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Item implements Serializable {
    public static final long serialVersionUID = 1L;

    String itemName;
    int price;
    int quantity;

    public Item(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}

public class R5_StoreBinaryForm {
    public static void main(String[] args) {
        Item[] items = {
                new Item("Laptop", 1000, 2),
                new Item("Mouse", 20, 5),
                new Item("Keyboard", 50, 3)
        };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("shopping.dat"))) {
            for (Item item : items) {
                out.writeObject(item);
            }
            System.out.println("Serialized data is saved in shopping.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
