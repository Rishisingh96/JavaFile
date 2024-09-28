package com.Java.Universal.Advance_Java.week1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

public class R5_TreeSetExample {
    public static void main(String[] args) {
        Set<Voter> voterSet = new TreeSet<>();

        // Adding Voter objects to the TreeSet
        voterSet.add(new Voter(25, "Alice"));
        voterSet.add(new Voter(30, "Bob"));
        voterSet.add(new Voter(22, "Charlie"));
        voterSet.add(new Voter(25, "David")); // Same age as Alice, different name

        // Display the TreeSet
        System.out.println("TreeSet of Voters: " + voterSet);

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // 2. Ask for age and display Voter's details
        System.out.print("Enter age of Voter to search: ");
        int searchAge = scanner.nextInt();
        AtomicBoolean found = new AtomicBoolean(false);

        for (Voter voter : voterSet) {
            if (voter.getAge() == searchAge) {
                System.out.println("Voter found: " + voter);
                found.set(true);
            }
        }
        if (!found.get()) {
            System.out.println("No Voter found with age: " + searchAge);
        }

        // 3. Ask for Voter's name and delete Voter object(s)
        System.out.print("Enter name of Voter to delete: ");
        String searchName = scanner.next();

        // Use an iterator to avoid ConcurrentModificationException
        found.set(false);
        voterSet.removeIf(voter -> {
            if (voter.getName().equalsIgnoreCase(searchName)) {
                found.set(true);
                return true;
            }
            return false;
        });

        if (found.get()) {
            System.out.println("Voter(s) with name '" + searchName + "' have been deleted.");
        } else {
            System.out.println("No Voter found with name: " + searchName);
        }

        // Display the TreeSet after deletion
        System.out.println("TreeSet after deletion: " + voterSet);

        // Close the scanner
        scanner.close();
    }
}
/*TreeSet of Voters: [Voter{age=22, name='Charlie'}, Voter{age=25, name='Alice'}, Voter{age=30, name='Bob'}]
Enter age of Voter to search: 25
Voter found: Voter{age=25, name='Alice'}
Enter name of Voter to delete: Bob
Voter(s) with name 'Bob' have been deleted.
TreeSet after deletion: [Voter{age=22, name='Charlie'}, Voter{age=25, name='Alice'}]
*/