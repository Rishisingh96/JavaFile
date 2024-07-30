package com.Java.Universal.Advance_Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Mobile {
    private int price;
    private String maker;

    public Mobile(int price, String maker) {
        this.price = price;
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public String getMaker() {
        return maker;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "price=" + price +
                ", maker='" + maker + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile = (Mobile) o;
        return price == mobile.price && maker.equals(mobile.maker);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(price);
        result = 31 * result + maker.hashCode();
        return result;
    }
}

public class R4_HashSetCode {
    public static void main(String[] args) {
        // Create a HashSet of Mobile type
        Set<Mobile> mobileSet = new HashSet<>();

        // Add Mobile objects to the HashSet
        mobileSet.add(new Mobile(500, "Samsung"));
        mobileSet.add(new Mobile(700, "Apple"));
        mobileSet.add(new Mobile(300, "Nokia"));
        mobileSet.add(new Mobile(500, "Samsung")); // Duplicate object, should not be added

        // Print the contents of the HashSet
        System.out.println("Mobile Set: " + mobileSet);

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // 2. Ask for mobile price from user and display the mobile's price and maker
        System.out.print("Enter mobile price to search: ");
        int searchPrice = scanner.nextInt();

        boolean found = false;
        for (Mobile mobile : mobileSet) {
            if (mobile.getPrice() == searchPrice) {
                System.out.println("Mobile found: " + mobile);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No mobile found with the price: " + searchPrice);
        }

        // 4. Ask for mobile maker from user and delete that Mobile object from the HashSet
        System.out.print("Enter mobile maker to delete: ");
        String searchMaker = scanner.next();

        Iterator<Mobile> iterator = mobileSet.iterator();
        found = false;
        while (iterator.hasNext()) {
            Mobile mobile = iterator.next();
            if (mobile.getMaker().equalsIgnoreCase(searchMaker)) {
                iterator.remove();
                System.out.println("Mobile with maker '" + searchMaker + "' has been deleted.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No mobile found with maker: " + searchMaker);
        }
        // Print the contents of the HashSet after deletion
        System.out.println("Mobile Set after deletion: " + mobileSet);

        // Close the scanner
        scanner.close();
    }
}
