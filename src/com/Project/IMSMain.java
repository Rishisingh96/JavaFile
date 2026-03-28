//package com.Project;
//
//import java.util.Scanner;
//
//public class IMSMain {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Inventory inventory = new Inventory();
//
//        while (true) {
//            System.out.println("\n===== Inventory Management System =====");
//            System.out.println("1. Add Product");
//            System.out.println("2. View Products");
//            System.out.println("3. Update Stock");
//            System.out.println("4. Sell Product");
//            System.out.println("5. Exit");
//            System.out.print("Choose option: ");
//
//            int choice = sc.nextInt();
//
//            switch (choice) {
//
//                case 1:
//                    System.out.print("Enter ID: ");
//                    int id = sc.nextInt();
//                    sc.nextLine(); // consume newline
//
//                    System.out.print("Enter Name: ");
//                    String name = sc.nextLine();
//
//                    System.out.print("Enter Price: ");
//                    double price = sc.nextDouble();
//
//                    System.out.print("Enter Quantity: ");
//                    int quantity = sc.nextInt();
//
//                    Product3 product = new Product3(id, name, price, quantity);
//                    inventory.addProduct(product);
//                    break;
//
//                case 2:
//                    inventory.viewProducts();
//                    break;
//
//                case 3:
//                    System.out.print("Enter Product ID: ");
//                    int updateId = sc.nextInt();
//                    System.out.print("Enter Quantity to Add: ");
//                    int addQty = sc.nextInt();
//                    inventory.updateStock(updateId, addQty);
//                    break;
//
//                case 4:
//                    System.out.print("Enter Product ID: ");
//                    int sellId = sc.nextInt();
//                    System.out.print("Enter Quantity to Sell: ");
//                    int sellQty = sc.nextInt();
//                    inventory.sellProduct(sellId, sellQty);
//                    break;
//
//                case 5:
//                    System.out.println("Exiting system...");
//                    System.exit(0);
//
//                default:
//                    System.out.println("Invalid choice!");
//            }
//        }
//    }
//}
