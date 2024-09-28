package com.Java.Universal.Advance_Java.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class R6_HashMapOperations {
    public static void main(String[] args) {
        // Create a HashMap where key is Integer and value is String
        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Store some key-value pair entries in the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(4, "Date");
        hashMap.put(5, "Elderberry");

        // Display list of all keys from the HashMap
        System.out.println("List of all keys: " + hashMap.keySet());

        // Display list of all entries from the HashMap
        System.out.println("List of all entries: " + hashMap.entrySet());

        // Ask for key, original value, and new value from the user
        System.out.print("Enter the key to replace the value: ");
        int keyToReplace = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the original value: ");
        String originalValue = scanner.nextLine();
        System.out.print("Enter the new value: ");
        String newValue = scanner.nextLine();

        // Check if the specified key already exists and replace the value if it does
        if (hashMap.containsKey(keyToReplace)) {
            if (hashMap.get(keyToReplace).equals(originalValue)) {
                hashMap.put(keyToReplace, newValue);
                System.out.println("Value replaced successfully.");
            } else {
                System.out.println("Original value does not match.");
            }
        } else {
            System.out.println("Key does not exist.");
        }

        // Display updated list of entries
        System.out.println("Updated list of entries: " + hashMap.entrySet());

        // Ask for key from the user to delete an entry
        System.out.print("Enter the key to delete the entry: ");
        int keyToDelete = scanner.nextInt();

        // Check if the specified key exists and delete the entry if it does
        if (hashMap.containsKey(keyToDelete)) {
            hashMap.remove(keyToDelete);
            System.out.println("Entry deleted successfully.");
        } else {
            System.out.println("Key does not exist.");
        }

        // Display updated list of entries
        System.out.println("Updated list of entries: " + hashMap.entrySet());

        // Ask for key and value from the user to delete an entry
        System.out.print("Enter the key to check and delete the entry: ");
        int keyToCheckAndDelete = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the value to check and delete the entry: ");
        String valueToCheckAndDelete = scanner.nextLine();

        // Check if the specified key and value exist and delete the entry if they do
        if (hashMap.containsKey(keyToCheckAndDelete) && hashMap.get(keyToCheckAndDelete).equals(valueToCheckAndDelete)) {
            hashMap.remove(keyToCheckAndDelete);
            System.out.println("Entry deleted successfully.");
        } else {
            System.out.println("Key or value does not exist.");
        }

        // Display updated list of entries
        System.out.println("Updated list of entries: " + hashMap.entrySet());

        scanner.close();
    }
}
/*List of all keys: [1, 2, 3, 4, 5]
List of all entries: [1=Apple, 2=Banana, 3=Cherry, 4=Date, 5=Elderberry]
Enter the key to replace the value: 3
Enter the original value: Cherry
Enter the new value: Cranberry
Value replaced successfully.
Updated list of entries: [1=Apple, 2=Banana, 3=Cranberry, 4=Date, 5=Elderberry]
Enter the key to delete the entry: 4
Entry deleted successfully.
Updated list of entries: [1=Apple, 2=Banana, 3=Cranberry, 5=Elderberry]
Enter the key to check and delete the entry: 2
Enter the value to check and delete the entry: Banana
Entry deleted successfully.
Updated list of entries: [1=Apple, 3=Cranberry, 5=Elderberry]
*/