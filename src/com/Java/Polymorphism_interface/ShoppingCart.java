package com.Java.Polymorphism_interface;
//Use Method Overloading Real Time Example
public class ShoppingCart {
    // Method to add items to the cart
    public void addItem(String itemName)
    {
        // Logic to add a single item to the cart.
        System.out.println(itemName + " added to the cart.");
    }
    // Overloaded method to add items with quantity.
    public void addItem(String itemName, int quantity)
    {
        // Logic to add multiple items with a specific quantity to the cart.
        System.out.println(quantity + " " + itemName + "s added to the cart.");
    }
    // Overloaded method to add items with quantity and price.
    public void addItem(String itemName, int quantity, double price)
    {
        // Logic to add items with quantity and price to the cart.
        double totalCost = quantity * price;
        System.out.println(quantity + " " + itemName + "s added to the cart. Total cost: $" + totalCost);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // Calling methods by passing argument values.
        cart.addItem("T-shirt");
        cart.addItem("Shoes", 2);
        cart.addItem("Sunglasses", 3, 25.99);

    }
}
