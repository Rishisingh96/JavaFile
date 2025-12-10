package com.Project;

import java.util.ArrayList;
import java.util.Scanner;


class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}

// Main class for Inventory Management
public class InventoryManagementSystem {
     static ArrayList<Product> inventory = new ArrayList<>();
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== INVENTORY MANAGEMENT SYSTEM ======");
            System.out.println("1- Add Product");
            System.out.println("2- Update Product Quantity");
            System.out.println("3- Remove Product");
            System.out.println("4- View All Products");
            System.out.println("5- Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    viewProducts();
                    break;
                case 5:
                    System.out.println("Exiting system... ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Product newProduct = new Product(id, name, quantity, price);
        inventory.add(newProduct);
        System.out.println("Product added successfully..");
    }


    private static void updateQuantity() {
        System.out.print("Enter Product ID to update quantity: ");
        int id = sc.nextInt();

        for (Product product : inventory) {
            if (product.getId() == id) {
                System.out.print("Enter new quantity: ");
                int newQuantity = sc.nextInt();
                product.setQuantity(newQuantity);
                System.out.println(" Quantity updated successfully.");
                return;
            }
        }
        System.out.println("Product not found these id");
    }


    private static void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = sc.nextInt();

        for (Product product : inventory) {
            if (product.getId() == id) {
                inventory.remove(product);
                System.out.println("Product removed successfully.....");
                return;
            }
        }
        System.out.println("Product not found you id....");
    }


    private static void viewProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty...");
        } else {
            System.out.println("\n INVENTORY LIST ");

            for (Product product : inventory) {
                System.out.println(product);
            }
        }
    }
}
