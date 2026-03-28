package com.Project;

import java.util.*;

// ------------------- Product Class -------------------
class Product3 {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product3(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Price: " + price +
                ", Quantity: " + quantity;
    }
}

// ------------------- Inventory Class -------------------
class Inventory {

    private Map<Integer, Product3> products = new HashMap<>();

    // Add Product
    public void addProduct(Product3 product) {
        if (products.containsKey(product.getId())) {
            System.out.println("Product already exists!");
            return;
        }
        products.put(product.getId(), product);
        System.out.println("Product added successfully.");
    }
}


